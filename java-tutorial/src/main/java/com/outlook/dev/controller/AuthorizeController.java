package com.outlook.dev.controller;

import java.io.IOException;
import java.util.UUID;
import com.outlook.dev.auth.CSVReader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.JsonArray;
import com.outlook.dev.auth.AuthHelper;
import com.outlook.dev.auth.IdToken;
import com.outlook.dev.auth.TokenResponse;
import com.outlook.dev.service.OutlookService;
import com.outlook.dev.service.OutlookServiceBuilder;
import com.outlook.dev.service.OutlookUser;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Controller
public class AuthorizeController {

	@RequestMapping(value="/authorize", method=RequestMethod.POST)
	public String authorize(@RequestParam("code") String code,@RequestParam("id_token") String idToken,
			@RequestParam("state") UUID state,HttpServletRequest request) 
	{
		JsonArray JsonArrayOfCSVFileObjects=null;
		JSONObject EventDetailsObject=new JSONObject();
		CSVReader csvreader=new CSVReader();
		JsonArrayOfCSVFileObjects=csvreader.ConvertingCSVtoJSON();
		System.out.println(JsonArrayOfCSVFileObjects);
		for(int i=0;i<JsonArrayOfCSVFileObjects.size();i++) {
			
			System.out.println("THE JSON RESPONSE IS "+JsonArrayOfCSVFileObjects.get(i));
		}
		
		// Get the expected state value from the session
		HttpSession session = request.getSession();
		UUID expectedState = (UUID) session.getAttribute("expected_state");
		UUID expectedNonce = (UUID) session.getAttribute("expected_nonce");
		session.removeAttribute("expected_state");
		session.removeAttribute("expected_nonce");
		
		// Make sure that the state query parameter returned matches
		// the expected state
		if (state.equals(expectedState)) {
			IdToken idTokenObj = IdToken.parseEncodedToken(idToken, expectedNonce.toString());
			if (idTokenObj != null) {
				TokenResponse tokenResponse = AuthHelper.getTokenFromAuthCode(code, idTokenObj.getTenantId());
				session.setAttribute("tokens", tokenResponse);
				session.setAttribute("userConnected", true);
				session.setAttribute("userName", idTokenObj.getName());
				session.setAttribute("userTenantId", idTokenObj.getTenantId());
				// Get user info
				OutlookService outlookService = OutlookServiceBuilder.getOutlookService(tokenResponse.getAccessToken(), null);
				OutlookUser user;
				/*try {
					user = outlookService.getCurrentUser().execute().body();
					session.setAttribute("userEmail", user.getMail());
				} catch (IOException e) {
					session.setAttribute("error", e.getMessage());
				}*/
				
				System.out.println(tokenResponse);
				String accesstoken=tokenResponse.getAccessToken();
				System.out.println( "Hello World!" );
				System.out.println(accesstoken);

		        OkHttpClient client = new OkHttpClient();
		    	
		    	String message;
		    	JSONObject json = new JSONObject();
		    	JSONObject Body=new JSONObject();
		    	JSONObject Start=new JSONObject();
		    	JSONObject End=new JSONObject();
		    	
		    	Body.put("ContentType","HTML");
		    	Body.put("Content","Rest API" );
		    	Start.put("DateTime","2018-11-2T18:00:00");
		    	Start.put("TimeZone","Pacific Standard Time");
		    	End.put("DateTime", "2018-11-2T19:00:00");
		    	End.put("TimeZone","Pacific Standard Time");
		    	json.put("Subject", "Discuss about rest api");
		    	json.put("Body", Body);
		    	json.put("Start",Start);
		    	json.put("End", End);
		    	JSONArray attendees = new JSONArray();
		    	JSONObject EmailAddress = new JSONObject();
		    	JSONObject obj=new JSONObject();
		    	EmailAddress.put("Address","tejaswini.golusula@fmc-na.com");
		    	EmailAddress.put("Name", "Tejaswini Golusula");
		    	obj.put("EmailAddress", EmailAddress);
		    	obj.put("Type","Required");
		    	attendees.add(obj);
		    	json.put("Attendees", attendees);
		    	
		    	message = json.toString();
		    	System.out.println(message);
		    	String message3="{\"Subject\":\"Discuss Rest API\",\"Body\":{\"ContentType\":\"HTML\",\"Content\":\"I think about requirements\"},\"Start\":{\"DateTime\":\"2018-11-06T18:00:00\",\"TimeZone\":\"Pacific Standard Time\"},\"End\":{\"DateTime\":\"2018-11-06T19:00:00\",\"TimeZone\":\"Pacific Standard Time\"},\"Attendees\":[{\"EmailAddress\":{\"Address\":\"tejaswini.golusula@fmcna.com\",\"Name\":\"Tejaswini G\"},\"Type\":\"Required\"}]}";

		    	JSONObject getcalendersrequest= new JSONObject();
		    	getcalendersrequest.put("name", "Teja");
		    	String getcalendersrequeststring;
		    	//getcalendersrequeststring=getcalendersrequest.toString();
		    	getcalendersrequeststring="{"
		    			+"\"name\":\"Dmantz\""
		    			+ "}";
		    	System.out.println(getcalendersrequeststring);
		    	/*RequestBody formBody = new FormBody.Builder()
		    	        .add("message", message)
		    	        .build();
		    	
		    	String message2="{"
		    			+ "\"Subject\": \"Discuss the Calendar REST API\","
		    			+ "\"Body\": {"
		    			+ " \"ContentType\": \"HTML\","
		    			+ " \"Content\": \"I think it will meet our requirements!\""
		    			+ "},"
		    			+ "\"Start\": {"
		    			+ "\"DateTime\": \"2018-11-02T18:00:00\","
		    			+ "   \"TimeZone\": \"Pacific Standard Time\""
		    			+ "},"
		    			+ "\"End\": {"
		    			+ "\"DateTime\": \"2018-11-02T19:00:00\","
		    			+ "   \"TimeZone\": \"Pacific Standard Time\""
		    			+ "},"
		    			+ "\"Attendees\": ["
		    			+ " {"
		    			+ "   \"EmailAddress\": {"
		    			+ "     \"Address\": \"tejaswini.golusula@fmc-na.com\","
		    			+ "     \"Name\": \"Tejaswini Golusula\""
		    			+ "   },"
		    			+ "   \"Type\": \"Required\""
		    			+ " }"
		    			+ "]"
		    			+ "}";
		    	System.out.println(message2);*/
		    	
		    	MediaType JSON = MediaType.parse("application/json; charset=utf-8");
		    	RequestBody reqBody = RequestBody.create(JSON,message3); 
		    	
		    	Request requesttoapi = new Request.Builder()
		    			.addHeader("Authorization", String.format("Bearer %s", accesstoken))
						.addHeader("Content-type", "application/json")
		    	        .url("https://graph.microsoft.com/v1.0/me/events")
		    	        .post(reqBody)
		    	        .build();

		    	try {
		    	    Response response = client.newCall(requesttoapi).execute();
		    	    System.out.println("response is: "+response);

		    	    // Do something with the response.
		    	} catch (IOException e) {
		    	    e.printStackTrace();
		    	}
			} 
			else 
			{
				session.setAttribute("error", "ID token failed validation.");
			}
		} else 
		{
			session.setAttribute("error", "Unexpected state returned from authority.");
		}
		return "redirect:/mail.html";
	}
	

	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/index.html";
	}
}
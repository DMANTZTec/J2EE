package com.dmantz.teja;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        OkHttpClient client = new OkHttpClient();
    	
    	String message;
    	JSONObject json = new JSONObject();
    	JSONObject Body=new JSONObject();
    	JSONObject Start=new JSONObject();
    	JSONObject End=new JSONObject();
    	
    	Body.put("ContentType","this is content type");
    	Body.put("Content","content" );
    	Start.put("DateTime","2018-10-20T18:00:00");
    	Start.put("TimeZone","Pacific Standard Time");
    	End.put("DateTime", "2018-10-20T19:00:00");
    	End.put("TimeZone","Pacific Standard Time");
    	json.put("subject", "Discuss the rest calender");
    	json.put("Body", Body);
    	json.put("Start",Start);
    	json.put("End", End);
    	
    	JSONArray attendees = new JSONArray();
    	JSONObject EmailAddress = new JSONObject();
    	JSONObject obj=new JSONObject();
    	EmailAddress.put("Address","tejaswini.golusula@fmc-na.com");
    	EmailAddress.put("Name", "Tejaswini Golusula");
    	obj.put("EmailAddress", EmailAddress);
    	obj.put("Type","required");

    	attendees.put(obj);
    	json.put("attendees", attendees);
    	
    	//json.put("course", array);

    	message = json.toString();
    	System.out.println(message);

    	RequestBody formBody = new FormBody.Builder()
    	        .add("message", message)
    	        .build();
    	Request request = new Request.Builder()
    	        .url("https://outlook.office.com/api/v2.0/me/events")
    	        .post(formBody)
    	        .build();

    	try {
    	    Response response = client.newCall(request).execute();
    	    System.out.println(response);

    	    // Do something with the response.
    	} catch (IOException e) {
    	    e.printStackTrace();
    	}
    }
}

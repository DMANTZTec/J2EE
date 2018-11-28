package com.outlook.dev.auth;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class CSVReader {
    public static JsonArray jsonArray=null;

	public static void main(String[] args) {
		CSVReader csvreader=new CSVReader();
		csvreader.ConvertingCSVtoJSON();
	}
	public static JsonArray ConvertingCSVtoJSON() {
		String csvFile = "C:\\TEJA_WS\\OutlookAPI_WS\\example.csv";
        String line = "";
        String cvsSplitBy = ",";
        int linenumber=0;
        JSONArray arrayofobjects=new JSONArray();
        String data1=new String();
       File output =new File("C:\\TEJA_WS\\OutlookAPI_WS\\jsonoutput.txt");
		ArrayList<CSVReadAfterResponse> csvReadAfterResponseList = null;
        CSVReadAfterResponse csvReadAfterResponse = null;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        	
            while ((line = br.readLine()) != null) {
            	
				csvReadAfterResponse = new CSVReadAfterResponse();
				csvReadAfterResponseList = new ArrayList<>();
				
				Body body = new Body();
				Start start = new Start();
				End end = new End();
				ArrayList<Attendees> attendeeslist=new ArrayList<>();
				Attendees attendees = new Attendees();
				EmailAddress emailAddress = new EmailAddress();
				
                String[] example = line.split(cvsSplitBy);
				csvReadAfterResponse.setSubject(example[0]);
				body.setContentType(example[1]);
				body.setContent(example[2]);
				start.setDateTime(example[3]);
				start.setTimeZone(example[4]);
				end.setDateTime(example[5]);
				end.setTimeZone(example[6]);
				emailAddress.setAddress(example[7]);
				emailAddress.setName(example[8]);
				attendees.setEmailAddress(emailAddress);
				attendees.setType(example[9]);
				attendeeslist.add(attendees);
				csvReadAfterResponse.setAttendees(attendeeslist);
				csvReadAfterResponse.setBody(body);
				csvReadAfterResponse.setStart(start);
				csvReadAfterResponse.setEnd(end);
				csvReadAfterResponseList.add(csvReadAfterResponse);
				if(linenumber>0) {
					arrayofobjects.add(csvReadAfterResponse);
				}
				linenumber++;
            }
				
            Gson gson = new Gson();
            String data = gson.toJson(csvReadAfterResponseList);
            data1 = gson.toJson(arrayofobjects);
            JSONObject jsonobject=new JSONObject();
           	FileWriter fileWriter = new FileWriter(output);
			fileWriter.write(data);
			fileWriter.flush();
			fileWriter.close();
           
            jsonArray = new JsonParser().parse(data1).getAsJsonArray();
            
			System.out.println("THE JSON RESPONSE IS "+jsonArray);
			for(int i=0;i<jsonArray.size();i++) {
				System.out.println("THE JSON RESPONSE IS "+jsonArray.get(i));
			}
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
		return jsonArray;

	}

}



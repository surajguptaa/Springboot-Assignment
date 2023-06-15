package org.example;


import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

        URL url = null;
        HttpURLConnection connection = null;
        int responseCode = 0;
        String urlString = "https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current_weather=true&hourly=temperature_2m,relativehumidity_2m,windspeed_10m";

//        Creating the URL
        try {
            url = new URL(urlString);
        } catch (MalformedURLException e) {
            System.out.println("Problem in URL");
        }

//        Connection

        try {
            connection = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            System.out.println("connection not found");
        }

        // get the response code
        try {
            responseCode = connection.getResponseCode();
        } catch (IOException e) {
            System.out.println("connection not found");
        }

//        Extraction of ByteCode into Json format

        BufferedReader byteCode = null;
        StringBuilder APIData = new StringBuilder();
        String readline = null;

        if(responseCode == 200){
            try {
                byteCode = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//                StringBuilder apiData = new StringBuilder();
                while((readline = byteCode.readLine()) != null){
                    APIData.append(readline);
                }
            } catch (IOException e) {
                System.out.println("Data does not found");
            }

            JSONObject jsonAPIResponse = new JSONObject(APIData.toString());


            System.out.println(jsonAPIResponse.get("latitude"));
            System.out.println(jsonAPIResponse.get("longitude"));
            System.out.println(jsonAPIResponse.get("generationtime_ms"));
            System.out.println(jsonAPIResponse.get("utc_offset_seconds"));
            System.out.println(jsonAPIResponse.get("timezone_abbreviation"));
            System.out.println(jsonAPIResponse.get("elevation"));
            System.out.println(jsonAPIResponse.get("current_weather"));

        }
        else
            System.out.println("Something went wrong!!");

//        System.out.println(APIData);
    }
}
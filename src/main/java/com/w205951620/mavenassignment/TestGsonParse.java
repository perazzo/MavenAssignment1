/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.w205951620.mavenassignment;

import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;

/**
 *
 * @author Perazzo
 */
public class TestGsonParse {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.w3schools.com/angular/customers.php");
        InputStreamReader reader = new InputStreamReader(url.openStream());
        JsonData data = new Gson().fromJson(reader, JsonData.class);

        for (Map<String, String> record : data.records) {
            // using the deserialized object
            System.out.println(record);
        }
        
    }
        
    private class JsonData {
        Map<String, String> records[];
    }
}

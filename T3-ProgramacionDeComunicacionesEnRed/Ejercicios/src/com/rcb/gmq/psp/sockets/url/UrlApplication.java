package com.rcb.gmq.psp.sockets.url;

import sun.net.www.protocol.http.HttpURLConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlApplication {

    public static void main(String ... args) throws IOException {

        URL url = new URL("http://www.google.com");
        InputStream inputStream = (InputStream) url.getContent();

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String inputLine = "";
        while ((inputLine = reader.readLine()) != null) {
            System.out.println(inputLine+"\n");
        }
        reader.close();
    }
}

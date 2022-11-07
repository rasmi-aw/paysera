package utils;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author Abdelwadoud Rasmi
 * Executes the http request and return a
 */
public class Request {
    private String url;

    //private constructor
    private Request(String url) {
        this.url = url;
    }

    /**
     * method constructor
     */
    public static Request get(String url) {
        return new Request(url);
    }

    /**
     * Send a request and retrieve the response
     */
    public String sendRequest() {
        HttpURLConnection connection;
        try {
            connection = ((HttpURLConnection) new URL(url).openConnection());
            int code = connection.getResponseCode();
            System.out.println("code, " + code);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {

        }
        return null;
    }


}

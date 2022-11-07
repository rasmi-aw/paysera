package utils;

import java.net.HttpURLConnection;

/**
 * @author Abdelwadoud Rasmi
 * Executes the http request and return a
 */
public class Request {
    private HttpURLConnection connection;

    //private constructor
    private Request(String url) {
    }

    public Request get(String url) {
        return new Request(url);
    }
}

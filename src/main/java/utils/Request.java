package utils;

import params.Param;
import params.checkout.*;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

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
    public String sendRequest(AcceptURL acceptURL,
                              Amount amount,
                              CallbackURL callbackURL,
                              CancelURL cancelURL,
                              Country country,
                              Currency currency,
                              OrderId orderId,
                              ProjectId projectId,
                              ProjectPassword password,
                              Test test,
                              Version version,
                              List<Param> params) {
        HttpURLConnection connection;
        //
        try {
            //Building request param
            String encodedParams = ParamsBuilder
                    .get()
                    .addAll(params)
                    .setAcceptUrl(acceptURL)
                    .setAmount(amount)
                    .setCallbackUrl(callbackURL)
                    .setCancelUrl(cancelURL)
                    .setCountry(country)
                    .setCurrency(currency)
                    .setOrderId(orderId)
                    .setProjectId(projectId)
                    .setProjectPassword(password)
                    .setTests(test)
                    .setVersion(version)
                    .getBase64String();
            //
            connection = ((HttpURLConnection) new URL(url + encodedParams).openConnection());
            int code = connection.getResponseCode();
            System.out.println("code, " + code + connection.getResponseMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {

        }
        return null;
    }


}

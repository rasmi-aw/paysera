import params.Param;
import params.checkout.*;
import utils.Request;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abdelwadoud Rasmi
 * This is a config file for the library
 */
public class Paysera {
    public static void main(String[] args) {
        send(send());    }

    public static final void send(String acceptURL,
                                  String amount,
                                  String callbackURL,
                                  String cancelURL,
                                  String country,
                                  String currency,
                                  String orderId,
                                  String projectId,
                                  String projectPassword,
                                  String test,
                                  String version,
                                  List<Param> otherParams) {


        Request
                .get(Config.CHECKOUT_URL)
                .sendRequest(new AcceptURL("","",false), amount, callbackURL, cancelURL, country, currency, orderId, projectId, projectPassword, test, version, otherParams);
    }
}

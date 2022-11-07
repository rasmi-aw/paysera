package params.checkout;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import params.Param;

/**
 * @author Abdelwadoud Rasmi
 * <p>
 * Full address (URL), to which a seller will get information about performed payment.
 * Script must return text "OK". Only then our system will register, that information about the payment has been received.
 * <p>
 * If there is no answer "OK", the message will be sent 4 times (when we get it, after an hour,
 * after three hours and after 24 hours).
 */
@AllArgsConstructor
@NoArgsConstructor
public class CallbackURL extends Param {

    @Override
    public String name() {
        return "callbackurl";
    }

    @Override
    public boolean isValid() {
        return getValue() != null && !getValue().isEmpty() && getValue().length() <= 255;
    }
}

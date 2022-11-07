package params.checkout;

import lombok.NoArgsConstructor;
import params.Param;

/**
 * @author Abdelwadoud Rasmi
 * <p>
 * Full address (URL), to which the client is redirected after a successful payment.
 */
@NoArgsConstructor
public class AcceptURL extends Param {

    public AcceptURL(String value) {
        super(value);
    }

    @Override
    public String name() {
        return "accepturl";
    }

    @Override
    public boolean isValid() {
        return getValue() != null && !getValue().isEmpty() && getValue().length() <= 255;
    }
}

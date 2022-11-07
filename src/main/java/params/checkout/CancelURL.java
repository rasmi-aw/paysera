package params.checkout;

import lombok.AllArgsConstructor;
import params.Param;

/**
 * @author Abdelwadoud Rasmi
 * <p>
 * Full address (URL), to which the client is redirected after he clicks the link to return to the shop.
 */
@AllArgsConstructor
public class CancelURL extends Param {

    @Override
    public String name() {
        return "cancelurl";
    }

    @Override
    public boolean isValid() {
        return getValue() != null && !getValue().isEmpty() && getValue().length() <= 255;
    }
}

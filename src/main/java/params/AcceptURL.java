package params;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Abdelwadoud Rasmi
 * <p>
 * Full address (URL), to which the client is redirected after a successful payment.
 */
@AllArgsConstructor
@NoArgsConstructor
public class AcceptURL extends Param {

    @Override
    String name() {
        return "accepturl";
    }

    @Override
    boolean isValid() {
        return getValue() != null && !getValue().isEmpty() && getValue().length() <= 255;
    }
}

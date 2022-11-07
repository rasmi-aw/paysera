package params.checkout;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import params.Param;

/**
 * @author Abdelwadoud Rasmi
 * The currency you want to send money in
 */
@AllArgsConstructor
@NoArgsConstructor
public class Currency extends Param {

    @Override
    public String name() {
        return "currency";
    }

    @Override
    public boolean isValid() {
        return getValue() != null && !getValue().isEmpty();
    }
}
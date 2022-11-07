package params.checkout;

import lombok.NoArgsConstructor;
import params.Param;

/**
 * @author Abdelwadoud Rasmi
 * The currency you want to send money in
 */
@NoArgsConstructor
public class Currency extends Param {

    public Currency(String value) {
        super(value);
    }

    @Override
    public String name() {
        return "currency";
    }

    @Override
    public boolean isValid() {
        return getValue() != null && !getValue().isEmpty();
    }
}
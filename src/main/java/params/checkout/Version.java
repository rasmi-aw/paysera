package params.checkout;

import lombok.AllArgsConstructor;
import params.Param;

/**
 * @author Abdelwadoud Rasmi
 * The version number of Paysera system specification (API)
 */
@AllArgsConstructor
public class Version extends Param {

    @Override
    public String name() {
        return "version";
    }

    @Override
    public boolean isValid() {
        return getValue() != null && !getValue().isEmpty() && getValue().length() <= 9;
    }
}

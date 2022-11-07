package params.checkout;

import lombok.NoArgsConstructor;
import params.Param;

/**
 * @author Abdelwadoud Rasmi
 * The version number of Paysera system specification (API)
 */
@NoArgsConstructor
public class Version extends Param {

    public Version(String value) {
        super(value);
    }

    @Override
    public String name() {
        return "version";
    }

    @Override
    public boolean isValid() {
        return getValue() != null && !getValue().isEmpty() && getValue().length() <= 9;
    }
}

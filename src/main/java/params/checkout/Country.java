package params.checkout;

import lombok.NoArgsConstructor;
import params.Param;

/**
 * @author Abdelwadoud Rasmi
 * The country you're sending money from
 */
@NoArgsConstructor
public class Country extends Param {

    public Country(String value) {
        super(value);
    }

    @Override
    public String name() {
        return "country";
    }

    @Override
    public boolean isValid() {
        return getValue() != null && !getValue().isEmpty();
    }
}
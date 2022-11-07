package params.checkout;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import params.Param;

/**
 * @author Abdelwadoud Rasmi
 * The country you're sending money from
 */
@AllArgsConstructor
@NoArgsConstructor
public class Country extends Param {

    @Override
    public String name() {
        return "country";
    }

    @Override
    public boolean isValid() {
        return getValue() != null && !getValue().isEmpty();
    }
}
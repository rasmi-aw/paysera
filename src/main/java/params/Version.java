package params;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Abdelwadoud Rasmi
 * The version number of Paysera system specification (API)
 */
@AllArgsConstructor
@NoArgsConstructor
public class Version extends Param {


    @Override
    String name() {
        return "version";
    }

    @Override
    boolean isValid() {
        return getValue() != null && !getValue().isEmpty() && getValue().length() <= 9;
    }
}

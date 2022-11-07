package params.checkout;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import params.Param;

/**
 * @author Abdelwadoud Rasmi
 * If this is a test request or not
 */
@AllArgsConstructor
@NoArgsConstructor
public class Test extends Param {

    @Override
    public String name() {
        return "test";
    }

    @Override
    public boolean isValid() {
        return getValue() != null && !getValue().isEmpty() && Integer.valueOf(getValue()) > -1;
    }
}

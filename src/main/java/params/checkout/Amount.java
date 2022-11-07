package params.checkout;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import params.Param;

/**
 * @author Abdelwadoud Rasmi
 * The amount you want to send
 */
@AllArgsConstructor
public class Amount extends Param {

    @Override
    public String name() {
        return "amount";
    }

    @Override
    public boolean isValid() {
        return getValue() != null && !getValue().isEmpty() && Double.valueOf(getValue()) > 0;
    }
}

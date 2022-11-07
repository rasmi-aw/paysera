package params.checkout;

import lombok.NoArgsConstructor;
import params.Param;

/**
 * @author Abdelwadoud Rasmi
 * The amount you want to send
 */
@NoArgsConstructor
public class Amount extends Param {

    public Amount(String value) {
        super(value);
    }

    @Override
    public String name() {
        return "amount";
    }

    @Override
    public boolean isValid() {
        return getValue() != null && !getValue().isEmpty() && Double.valueOf(getValue()) > 0;
    }
}

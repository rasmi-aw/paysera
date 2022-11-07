package params.checkout;

import lombok.NoArgsConstructor;
import params.Param;

/**
 * @author Abdelwadoud Rasmi
 * Order unique id from your system
 */
@NoArgsConstructor
public class OrderId extends Param {

    public OrderId(String value) {
        super(value);
    }

    @Override
    public String name() {
        return "orderid";
    }

    @Override
    public boolean isValid() {
        return getValue() != null && !getValue().isEmpty() && getValue().length() <= 40;
    }
}

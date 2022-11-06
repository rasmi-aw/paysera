package params;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Abdelwadoud Rasmi
 * Order unique id from your system
 */
@AllArgsConstructor
@NoArgsConstructor
public class OrderId extends Param {

    @Override
    public String name() {
        return "orderid";
    }

    @Override
    public boolean isRequired() {
        return true;
    }

    @Override
    public boolean isValid() {
        return getValue() != null && !getValue().isEmpty() && getValue().length() <= 40;
    }
}

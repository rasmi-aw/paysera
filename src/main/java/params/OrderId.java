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
    String name() {
        return "orderid";
    }

    @Override
    boolean isValid() {
        return getValue() != null && !getValue().isEmpty() && getValue().length() <= 40;
    }
}

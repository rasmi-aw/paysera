package params.checkout;

import lombok.AllArgsConstructor;
import params.Param;

/**
 * @author Abdelwadoud Rasmi
 * Project unique id from your paysera project
 */
@AllArgsConstructor
public class ProjectId extends Param {

    @Override
    public String name() {
        return "projectid";
    }

    @Override
    public boolean isValid() {
        return getValue() != null && !getValue().isEmpty() && getValue().length() <= 11;
    }
}

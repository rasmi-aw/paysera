package params.checkout;

import lombok.NoArgsConstructor;
import params.Param;

/**
 * @author Abdelwadoud Rasmi
 * Project unique id from your paysera project
 */
@NoArgsConstructor
public class ProjectId extends Param {

    public ProjectId(String value) {
        super(value);
    }

    @Override
    public String name() {
        return "projectid";
    }

    @Override
    public boolean isValid() {
        return getValue() != null && !getValue().isEmpty() && getValue().length() <= 11;
    }
}

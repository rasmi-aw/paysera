package params.checkout;

import lombok.NoArgsConstructor;
import params.Param;


/**
 * @author Abdelwadoud Rasmi
 * Project password from your paysera project
 */
@NoArgsConstructor
public class ProjectPassword  extends Param {

    public ProjectPassword(String value) {
        super(value);
    }

    @Override
    public String name() {
        return "sign_password";
    }

    @Override
    public boolean isValid() {
        return getValue() != null && !getValue().isEmpty();
    }
}

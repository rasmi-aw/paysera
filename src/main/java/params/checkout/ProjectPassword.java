package params.checkout;

import lombok.AllArgsConstructor;
import params.Param;


/**
 * @author Abdelwadoud Rasmi
 * Project password from your paysera project
 */
@AllArgsConstructor
public class ProjectPassword  extends Param {

    @Override
    public String name() {
        return "sign_password";
    }

    @Override
    public boolean isValid() {
        return getValue() != null && !getValue().isEmpty();
    }
}

package params;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Abdelwadoud Rasmi
 * Project unique id from your paysera project
 */
@AllArgsConstructor
@NoArgsConstructor
public class ProjectId extends Param {

    @Override
    public String name() {
        return "projectid";
    }

    @Override
    public boolean isRequired() {
        return true;
    }

    @Override
    public boolean isValid() {
        return getValue() != null && getValue().isEmpty() && getValue().length() <= 11;
    }
}

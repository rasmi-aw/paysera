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
    String name() {
        return "projectid";
    }

    @Override
    boolean isValid() {
        return getValue() != null && getValue().isEmpty() && getValue().length() <= 11;
    }
}

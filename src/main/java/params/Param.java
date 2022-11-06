package params;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Abdelwadoud Rasmi
 * A param model
 */
@AllArgsConstructor
@NoArgsConstructor
public abstract class Param {

    @Getter
    @Setter
    private String value;

    /**
     * Param name, and it has to be different from a param to another
     */
    abstract String name();

    /**
     * To check if the param value is valid or not (length, format etc...)
     */
    abstract boolean isValid();

    @Override
    public String toString() {
        return name().trim() + "=" + value.trim();
    }
}

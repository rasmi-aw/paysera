package params;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Random;

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

    @Getter
    @Setter
    private boolean required = true;

    /**
     * Param name, and it has to be different from a param to another
     */
    public abstract String name();

    /**
     * To check if the param value is valid or not (length, format etc...)
     */
    public abstract boolean isValid();


    @Override
    public String toString() {
        return name().trim() + "=" + value.trim();
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null &&
                obj instanceof Param &&
                ((Param) obj).name().equals(name());
    }

    @Override
    public int hashCode() {
        return name().length() * 3 + value.length() * 2 + new Random().nextInt();
    }
}

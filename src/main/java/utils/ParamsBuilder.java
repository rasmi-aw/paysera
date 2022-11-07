package utils;

import lombok.Getter;
import params.*;
import params.checkout.*;

import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Abdelwadoud Rasmi
 * A builder class to generate encoded params
 */
public class ParamsBuilder {

    @Getter
    private Set<Param> params;

    private ParamsBuilder() {
        params = new HashSet<>();
    }

    /**
     * Get builder instance
     */
    public static final ParamsBuilder get() {
        return new ParamsBuilder();
    }

    /**
     * Add param to the list of params
     */
    public final ParamsBuilder add(Param param) {
        if (param != null && param.isValid()) {
            params.remove(param);
            params.add(param);
        }
        return this;
    }

    public final ParamsBuilder addAll(List<Param> params) {
        if (params != null) {
            params.forEach(param -> {
                add(param);
            });
        }
        return this;
    }

    public final ParamsBuilder setAcceptUrl(AcceptURL acceptURL) {
        add(acceptURL);
        return this;
    }

    public final ParamsBuilder setAmount(Amount amount) {
        add(amount);
        return this;
    }

    public final ParamsBuilder setCallbackUrl(CallbackURL callbackUrl) {
        add(callbackUrl);
        return this;
    }

    public final ParamsBuilder setCancelUrl(CancelURL cancelUrl) {
        add(cancelUrl);
        return this;
    }

    public final ParamsBuilder setCountry(Country country) {
        add(country);
        return this;
    }

    public final ParamsBuilder setCurrency(Currency currency) {
        add(currency);
        return this;
    }

    public final ParamsBuilder setOrderId(OrderId orderId) {
        add(orderId);
        return this;
    }

    public final ParamsBuilder setProjectId(ProjectId projectId) {
        add(projectId);
        return this;
    }

    public final ParamsBuilder setProjectPassword(ProjectPassword password) {
        add(password);
        return this;
    }

    public final ParamsBuilder setTests(Test test) {
        add(test);
        return this;
    }

    public final ParamsBuilder setVersion(Version version) {
        add(version);
        return this;
    }

    /**
     * converts all the valid params into a string encoded in base 64
     */
    public String getBase64String() {
        StringBuilder sb = new StringBuilder();
        params.forEach(p -> {
            if (p.isValid())
                sb.append(p + "&");
        });
        //
        return Base64
                .getEncoder()
                .encodeToString(sb.substring(0, sb.length() - 1).getBytes())
                .replace("/", "_")
                .replace("+", "-");
    }
}

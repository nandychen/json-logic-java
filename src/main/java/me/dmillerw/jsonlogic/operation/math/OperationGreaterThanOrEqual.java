package me.dmillerw.jsonlogic.operation.math;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import me.dmillerw.jsonlogic.operation.base.TwoArgOperation;

/**
 * @author dmillerw
 */
public class OperationGreaterThanOrEqual extends TwoArgOperation {

    @Override
    public JsonElement apply(JsonElement data, JsonElement arg1, JsonElement arg2) {
        return new JsonPrimitive(arg1.getAsDouble() >= arg2.getAsDouble());
    }
}


package week4.day2.servicenow.pojos;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class CreateIncident {

    private Result__1 result;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public Result__1 getResult() {
        return result;
    }

    public void setResult(Result__1 result) {
        this.result = result;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

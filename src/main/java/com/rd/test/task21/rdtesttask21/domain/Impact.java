
package com.rd.test.task21.rdtesttask21.domain;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "baseMetricV2",
    "baseMetricV3"
})
@Generated("jsonschema2pojo")
public class Impact {

    @JsonProperty("baseMetricV2")
    private BaseMetricV2 baseMetricV2;
    @JsonProperty("baseMetricV3")
    private BaseMetricV3 baseMetricV3;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("baseMetricV2")
    public BaseMetricV2 getBaseMetricV2() {
        return baseMetricV2;
    }

    @JsonProperty("baseMetricV2")
    public void setBaseMetricV2(BaseMetricV2 baseMetricV2) {
        this.baseMetricV2 = baseMetricV2;
    }

    @JsonProperty("baseMetricV3")
    public BaseMetricV3 getBaseMetricV3() {
        return baseMetricV3;
    }

    @JsonProperty("baseMetricV3")
    public void setBaseMetricV3(BaseMetricV3 baseMetricV3) {
        this.baseMetricV3 = baseMetricV3;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Impact.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("baseMetricV2");
        sb.append('=');
        sb.append(((this.baseMetricV2 == null)?"<null>":this.baseMetricV2));
        sb.append(',');
        sb.append("baseMetricV3");
        sb.append('=');
        sb.append(((this.baseMetricV3 == null)?"<null>":this.baseMetricV3));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.baseMetricV2 == null)? 0 :this.baseMetricV2 .hashCode()));
        result = ((result* 31)+((this.baseMetricV3 == null)? 0 :this.baseMetricV3 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Impact) == false) {
            return false;
        }
        Impact rhs = ((Impact) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.baseMetricV2 == rhs.baseMetricV2)||((this.baseMetricV2 != null)&&this.baseMetricV2 .equals(rhs.baseMetricV2))))&&((this.baseMetricV3 == rhs.baseMetricV3)||((this.baseMetricV3 != null)&&this.baseMetricV3 .equals(rhs.baseMetricV3))));
    }

}

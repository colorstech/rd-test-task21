
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
    "version",
    "vectorString",
    "accessVector",
    "accessComplexity",
    "authentication",
    "confidentialityImpact",
    "integrityImpact",
    "availabilityImpact",
    "baseScore"
})
@Generated("jsonschema2pojo")
public class CvssV2 {

    @JsonProperty("version")
    private String version;
    @JsonProperty("vectorString")
    private String vectorString;
    @JsonProperty("accessVector")
    private String accessVector;
    @JsonProperty("accessComplexity")
    private String accessComplexity;
    @JsonProperty("authentication")
    private String authentication;
    @JsonProperty("confidentialityImpact")
    private String confidentialityImpact;
    @JsonProperty("integrityImpact")
    private String integrityImpact;
    @JsonProperty("availabilityImpact")
    private String availabilityImpact;
    @JsonProperty("baseScore")
    private Double baseScore;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("vectorString")
    public String getVectorString() {
        return vectorString;
    }

    @JsonProperty("vectorString")
    public void setVectorString(String vectorString) {
        this.vectorString = vectorString;
    }

    @JsonProperty("accessVector")
    public String getAccessVector() {
        return accessVector;
    }

    @JsonProperty("accessVector")
    public void setAccessVector(String accessVector) {
        this.accessVector = accessVector;
    }

    @JsonProperty("accessComplexity")
    public String getAccessComplexity() {
        return accessComplexity;
    }

    @JsonProperty("accessComplexity")
    public void setAccessComplexity(String accessComplexity) {
        this.accessComplexity = accessComplexity;
    }

    @JsonProperty("authentication")
    public String getAuthentication() {
        return authentication;
    }

    @JsonProperty("authentication")
    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    @JsonProperty("confidentialityImpact")
    public String getConfidentialityImpact() {
        return confidentialityImpact;
    }

    @JsonProperty("confidentialityImpact")
    public void setConfidentialityImpact(String confidentialityImpact) {
        this.confidentialityImpact = confidentialityImpact;
    }

    @JsonProperty("integrityImpact")
    public String getIntegrityImpact() {
        return integrityImpact;
    }

    @JsonProperty("integrityImpact")
    public void setIntegrityImpact(String integrityImpact) {
        this.integrityImpact = integrityImpact;
    }

    @JsonProperty("availabilityImpact")
    public String getAvailabilityImpact() {
        return availabilityImpact;
    }

    @JsonProperty("availabilityImpact")
    public void setAvailabilityImpact(String availabilityImpact) {
        this.availabilityImpact = availabilityImpact;
    }

    @JsonProperty("baseScore")
    public Double getBaseScore() {
        return baseScore;
    }

    @JsonProperty("baseScore")
    public void setBaseScore(Double baseScore) {
        this.baseScore = baseScore;
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
        sb.append(CvssV2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("vectorString");
        sb.append('=');
        sb.append(((this.vectorString == null)?"<null>":this.vectorString));
        sb.append(',');
        sb.append("accessVector");
        sb.append('=');
        sb.append(((this.accessVector == null)?"<null>":this.accessVector));
        sb.append(',');
        sb.append("accessComplexity");
        sb.append('=');
        sb.append(((this.accessComplexity == null)?"<null>":this.accessComplexity));
        sb.append(',');
        sb.append("authentication");
        sb.append('=');
        sb.append(((this.authentication == null)?"<null>":this.authentication));
        sb.append(',');
        sb.append("confidentialityImpact");
        sb.append('=');
        sb.append(((this.confidentialityImpact == null)?"<null>":this.confidentialityImpact));
        sb.append(',');
        sb.append("integrityImpact");
        sb.append('=');
        sb.append(((this.integrityImpact == null)?"<null>":this.integrityImpact));
        sb.append(',');
        sb.append("availabilityImpact");
        sb.append('=');
        sb.append(((this.availabilityImpact == null)?"<null>":this.availabilityImpact));
        sb.append(',');
        sb.append("baseScore");
        sb.append('=');
        sb.append(((this.baseScore == null)?"<null>":this.baseScore));
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
        result = ((result* 31)+((this.accessComplexity == null)? 0 :this.accessComplexity.hashCode()));
        result = ((result* 31)+((this.confidentialityImpact == null)? 0 :this.confidentialityImpact.hashCode()));
        result = ((result* 31)+((this.availabilityImpact == null)? 0 :this.availabilityImpact.hashCode()));
        result = ((result* 31)+((this.integrityImpact == null)? 0 :this.integrityImpact.hashCode()));
        result = ((result* 31)+((this.baseScore == null)? 0 :this.baseScore.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vectorString == null)? 0 :this.vectorString.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.accessVector == null)? 0 :this.accessVector.hashCode()));
        result = ((result* 31)+((this.authentication == null)? 0 :this.authentication.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CvssV2) == false) {
            return false;
        }
        CvssV2 rhs = ((CvssV2) other);
        return (((((((((((this.accessComplexity == rhs.accessComplexity)||((this.accessComplexity!= null)&&this.accessComplexity.equals(rhs.accessComplexity)))&&((this.confidentialityImpact == rhs.confidentialityImpact)||((this.confidentialityImpact!= null)&&this.confidentialityImpact.equals(rhs.confidentialityImpact))))&&((this.availabilityImpact == rhs.availabilityImpact)||((this.availabilityImpact!= null)&&this.availabilityImpact.equals(rhs.availabilityImpact))))&&((this.integrityImpact == rhs.integrityImpact)||((this.integrityImpact!= null)&&this.integrityImpact.equals(rhs.integrityImpact))))&&((this.baseScore == rhs.baseScore)||((this.baseScore!= null)&&this.baseScore.equals(rhs.baseScore))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vectorString == rhs.vectorString)||((this.vectorString!= null)&&this.vectorString.equals(rhs.vectorString))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.accessVector == rhs.accessVector)||((this.accessVector!= null)&&this.accessVector.equals(rhs.accessVector))))&&((this.authentication == rhs.authentication)||((this.authentication!= null)&&this.authentication.equals(rhs.authentication))));
    }

}

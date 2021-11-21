
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
    "vulnerable",
    "cpe23Uri",
    "versionEndExcluding",
    "versionStartIncluding",
    "versionEndIncluding"
})
@Generated("jsonschema2pojo")
public class CpeMatch {

    @JsonProperty("vulnerable")
    private Boolean vulnerable;
    @JsonProperty("cpe23Uri")
    private String cpe23Uri;
    @JsonProperty("versionEndExcluding")
    private String versionEndExcluding;
    @JsonProperty("versionStartIncluding")
    private String versionStartIncluding;
    @JsonProperty("versionEndIncluding")
    private String versionEndIncluding;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("vulnerable")
    public Boolean getVulnerable() {
        return vulnerable;
    }

    @JsonProperty("vulnerable")
    public void setVulnerable(Boolean vulnerable) {
        this.vulnerable = vulnerable;
    }

    @JsonProperty("cpe23Uri")
    public String getCpe23Uri() {
        return cpe23Uri;
    }

    @JsonProperty("cpe23Uri")
    public void setCpe23Uri(String cpe23Uri) {
        this.cpe23Uri = cpe23Uri;
    }

    @JsonProperty("versionEndExcluding")
    public String getVersionEndExcluding() {
        return versionEndExcluding;
    }

    @JsonProperty("versionEndExcluding")
    public void setVersionEndExcluding(String versionEndExcluding) {
        this.versionEndExcluding = versionEndExcluding;
    }

    @JsonProperty("versionStartIncluding")
    public String getVersionStartIncluding() {
        return versionStartIncluding;
    }

    @JsonProperty("versionStartIncluding")
    public void setVersionStartIncluding(String versionStartIncluding) {
        this.versionStartIncluding = versionStartIncluding;
    }

    @JsonProperty("versionEndIncluding")
    public String getVersionEndIncluding() {
        return versionEndIncluding;
    }

    @JsonProperty("versionEndIncluding")
    public void setVersionEndIncluding(String versionEndIncluding) {
        this.versionEndIncluding = versionEndIncluding;
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
        sb.append(CpeMatch.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vulnerable");
        sb.append('=');
        sb.append(((this.vulnerable == null)?"<null>":this.vulnerable));
        sb.append(',');
        sb.append("cpe23Uri");
        sb.append('=');
        sb.append(((this.cpe23Uri == null)?"<null>":this.cpe23Uri));
        sb.append(',');
        sb.append("versionEndExcluding");
        sb.append('=');
        sb.append(((this.versionEndExcluding == null)?"<null>":this.versionEndExcluding));
        sb.append(',');
        sb.append("versionStartIncluding");
        sb.append('=');
        sb.append(((this.versionStartIncluding == null)?"<null>":this.versionStartIncluding));
        sb.append(',');
        sb.append("versionEndIncluding");
        sb.append('=');
        sb.append(((this.versionEndIncluding == null)?"<null>":this.versionEndIncluding));
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
        result = ((result* 31)+((this.vulnerable == null)? 0 :this.vulnerable.hashCode()));
        result = ((result* 31)+((this.cpe23Uri == null)? 0 :this.cpe23Uri.hashCode()));
        result = ((result* 31)+((this.versionEndExcluding == null)? 0 :this.versionEndExcluding.hashCode()));
        result = ((result* 31)+((this.versionEndIncluding == null)? 0 :this.versionEndIncluding.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.versionStartIncluding == null)? 0 :this.versionStartIncluding.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CpeMatch) == false) {
            return false;
        }
        CpeMatch rhs = ((CpeMatch) other);
        return (((((((this.vulnerable == rhs.vulnerable)||((this.vulnerable!= null)&&this.vulnerable.equals(rhs.vulnerable)))&&((this.cpe23Uri == rhs.cpe23Uri)||((this.cpe23Uri!= null)&&this.cpe23Uri.equals(rhs.cpe23Uri))))&&((this.versionEndExcluding == rhs.versionEndExcluding)||((this.versionEndExcluding!= null)&&this.versionEndExcluding.equals(rhs.versionEndExcluding))))&&((this.versionEndIncluding == rhs.versionEndIncluding)||((this.versionEndIncluding!= null)&&this.versionEndIncluding.equals(rhs.versionEndIncluding))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.versionStartIncluding == rhs.versionStartIncluding)||((this.versionStartIncluding!= null)&&this.versionStartIncluding.equals(rhs.versionStartIncluding))));
    }

}

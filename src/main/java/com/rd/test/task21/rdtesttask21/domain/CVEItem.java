
package com.rd.test.task21.rdtesttask21.domain;

import java.util.Date;
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
    "cve",
    "configurations",
    "impact",
    "publishedDate",
    "lastModifiedDate"
})
@Generated("jsonschema2pojo")
public class CVEItem {

    @JsonProperty("cve")
    private Cve__1 cve;
    @JsonProperty("configurations")
    private Configurations configurations;
    @JsonProperty("impact")
    private Impact impact;
    @JsonProperty("publishedDate")
    private Date publishedDate;
    @JsonProperty("lastModifiedDate")
    private String lastModifiedDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cve")
    public Cve__1 getCve() {
        return cve;
    }

    @JsonProperty("cve")
    public void setCve(Cve__1 cve) {
        this.cve = cve;
    }

    @JsonProperty("configurations")
    public Configurations getConfigurations() {
        return configurations;
    }

    @JsonProperty("configurations")
    public void setConfigurations(Configurations configurations) {
        this.configurations = configurations;
    }

    @JsonProperty("impact")
    public Impact getImpact() {
        return impact;
    }

    @JsonProperty("impact")
    public void setImpact(Impact impact) {
        this.impact = impact;
    }

    @JsonProperty("publishedDate")
    public Date getPublishedDate() {
        return publishedDate;
    }

    @JsonProperty("publishedDate")
    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    @JsonProperty("lastModifiedDate")
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    @JsonProperty("lastModifiedDate")
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
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
        sb.append(CVEItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cve");
        sb.append('=');
        sb.append(((this.cve == null)?"<null>":this.cve));
        sb.append(',');
        sb.append("configurations");
        sb.append('=');
        sb.append(((this.configurations == null)?"<null>":this.configurations));
        sb.append(',');
        sb.append("impact");
        sb.append('=');
        sb.append(((this.impact == null)?"<null>":this.impact));
        sb.append(',');
        sb.append("publishedDate");
        sb.append('=');
        sb.append(((this.publishedDate == null)?"<null>":this.publishedDate));
        sb.append(',');
        sb.append("lastModifiedDate");
        sb.append('=');
        sb.append(((this.lastModifiedDate == null)?"<null>":this.lastModifiedDate));
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
        result = ((result* 31)+((this.cve == null)? 0 :this.cve.hashCode()));
        result = ((result* 31)+((this.lastModifiedDate == null)? 0 :this.lastModifiedDate.hashCode()));
        result = ((result* 31)+((this.configurations == null)? 0 :this.configurations.hashCode()));
        result = ((result* 31)+((this.impact == null)? 0 :this.impact.hashCode()));
        result = ((result* 31)+((this.publishedDate == null)? 0 :this.publishedDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CVEItem) == false) {
            return false;
        }
        CVEItem rhs = ((CVEItem) other);
        return (((((((this.cve == rhs.cve)||((this.cve!= null)&&this.cve.equals(rhs.cve)))&&((this.lastModifiedDate == rhs.lastModifiedDate)||((this.lastModifiedDate!= null)&&this.lastModifiedDate.equals(rhs.lastModifiedDate))))&&((this.configurations == rhs.configurations)||((this.configurations!= null)&&this.configurations.equals(rhs.configurations))))&&((this.impact == rhs.impact)||((this.impact!= null)&&this.impact.equals(rhs.impact))))&&((this.publishedDate == rhs.publishedDate)||((this.publishedDate!= null)&&this.publishedDate.equals(rhs.publishedDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}

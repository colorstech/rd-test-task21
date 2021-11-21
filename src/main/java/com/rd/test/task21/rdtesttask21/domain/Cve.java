
package com.rd.test.task21.rdtesttask21.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "CVE_data_type",
    "CVE_data_format",
    "CVE_data_version",
    "CVE_data_numberOfCVEs",
    "CVE_data_timestamp",
    "CVE_Items"
})
@Generated("jsonschema2pojo")
public class Cve {

	@JsonProperty("CVE_data_type")
    private String cVEDataType;
    @JsonProperty("CVE_data_format")
    private String cVEDataFormat;
    @JsonProperty("CVE_data_version")
    private String cVEDataVersion;
    @JsonProperty("CVE_data_numberOfCVEs")
    private String cVEDataNumberOfCVEs;
    @JsonProperty("CVE_data_timestamp")
    private String cVEDataTimestamp;
    @JsonProperty("CVE_Items")
    private List<CVEItem> cVEItems = new ArrayList<CVEItem>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CVE_data_type")
    public String getCVEDataType() {
        return cVEDataType;
    }

    @JsonProperty("CVE_data_type")
    public void setCVEDataType(String cVEDataType) {
        this.cVEDataType = cVEDataType;
    }

    @JsonProperty("CVE_data_format")
    public String getCVEDataFormat() {
        return cVEDataFormat;
    }

    @JsonProperty("CVE_data_format")
    public void setCVEDataFormat(String cVEDataFormat) {
        this.cVEDataFormat = cVEDataFormat;
    }

    @JsonProperty("CVE_data_version")
    public String getCVEDataVersion() {
        return cVEDataVersion;
    }

    @JsonProperty("CVE_data_version")
    public void setCVEDataVersion(String cVEDataVersion) {
        this.cVEDataVersion = cVEDataVersion;
    }

    @JsonProperty("CVE_data_numberOfCVEs")
    public String getCVEDataNumberOfCVEs() {
        return cVEDataNumberOfCVEs;
    }

    @JsonProperty("CVE_data_numberOfCVEs")
    public void setCVEDataNumberOfCVEs(String cVEDataNumberOfCVEs) {
        this.cVEDataNumberOfCVEs = cVEDataNumberOfCVEs;
    }

    @JsonProperty("CVE_data_timestamp")
    public String getCVEDataTimestamp() {
        return cVEDataTimestamp;
    }

    @JsonProperty("CVE_data_timestamp")
    public void setCVEDataTimestamp(String cVEDataTimestamp) {
        this.cVEDataTimestamp = cVEDataTimestamp;
    }

    @JsonProperty("CVE_Items")
    public List<CVEItem> getCVEItems() {
        return cVEItems;
    }

    @JsonProperty("CVE_Items")
    public void setCVEItems(List<CVEItem> cVEItems) {
        this.cVEItems = cVEItems;
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
        sb.append(Cve.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cVEDataType");
        sb.append('=');
        sb.append(((this.cVEDataType == null)?"<null>":this.cVEDataType));
        sb.append(',');
        sb.append("cVEDataFormat");
        sb.append('=');
        sb.append(((this.cVEDataFormat == null)?"<null>":this.cVEDataFormat));
        sb.append(',');
        sb.append("cVEDataVersion");
        sb.append('=');
        sb.append(((this.cVEDataVersion == null)?"<null>":this.cVEDataVersion));
        sb.append(',');
        sb.append("cVEDataNumberOfCVEs");
        sb.append('=');
        sb.append(((this.cVEDataNumberOfCVEs == null)?"<null>":this.cVEDataNumberOfCVEs));
        sb.append(',');
        sb.append("cVEDataTimestamp");
        sb.append('=');
        sb.append(((this.cVEDataTimestamp == null)?"<null>":this.cVEDataTimestamp));
        sb.append(',');
        sb.append("cVEItems");
        sb.append('=');
        sb.append(((this.cVEItems == null)?"<null>":this.cVEItems));
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
        result = ((result* 31)+((this.cVEDataNumberOfCVEs == null)? 0 :this.cVEDataNumberOfCVEs.hashCode()));
        result = ((result* 31)+((this.cVEDataFormat == null)? 0 :this.cVEDataFormat.hashCode()));
        result = ((result* 31)+((this.cVEDataTimestamp == null)? 0 :this.cVEDataTimestamp.hashCode()));
        result = ((result* 31)+((this.cVEDataType == null)? 0 :this.cVEDataType.hashCode()));
        result = ((result* 31)+((this.cVEItems == null)? 0 :this.cVEItems.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cVEDataVersion == null)? 0 :this.cVEDataVersion.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cve) == false) {
            return false;
        }
        Cve rhs = ((Cve) other);
        return ((((((((this.cVEDataNumberOfCVEs == rhs.cVEDataNumberOfCVEs)||((this.cVEDataNumberOfCVEs!= null)&&this.cVEDataNumberOfCVEs.equals(rhs.cVEDataNumberOfCVEs)))&&((this.cVEDataFormat == rhs.cVEDataFormat)||((this.cVEDataFormat!= null)&&this.cVEDataFormat.equals(rhs.cVEDataFormat))))&&((this.cVEDataTimestamp == rhs.cVEDataTimestamp)||((this.cVEDataTimestamp!= null)&&this.cVEDataTimestamp.equals(rhs.cVEDataTimestamp))))&&((this.cVEDataType == rhs.cVEDataType)||((this.cVEDataType!= null)&&this.cVEDataType.equals(rhs.cVEDataType))))&&((this.cVEItems == rhs.cVEItems)||((this.cVEItems!= null)&&this.cVEItems.equals(rhs.cVEItems))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cVEDataVersion == rhs.cVEDataVersion)||((this.cVEDataVersion!= null)&&this.cVEDataVersion.equals(rhs.cVEDataVersion))));
    }

}

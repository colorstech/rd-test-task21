
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
    "data_type",
    "data_format",
    "data_version",
    "CVE_data_meta",
    "problemtype",
    "references",
    "description"
})
@Generated("jsonschema2pojo")
public class Cve__1 {

    @JsonProperty("data_type")
    private String dataType;
    @JsonProperty("data_format")
    private String dataFormat;
    @JsonProperty("data_version")
    private String dataVersion;
    @JsonProperty("CVE_data_meta")
    private CVEDataMeta cVEDataMeta;
    @JsonProperty("problemtype")
    private Problemtype problemtype;
    @JsonProperty("references")
    private References references;
    @JsonProperty("description")
    private Description__1 description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("data_type")
    public String getDataType() {
        return dataType;
    }

    @JsonProperty("data_type")
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @JsonProperty("data_format")
    public String getDataFormat() {
        return dataFormat;
    }

    @JsonProperty("data_format")
    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    @JsonProperty("data_version")
    public String getDataVersion() {
        return dataVersion;
    }

    @JsonProperty("data_version")
    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    @JsonProperty("CVE_data_meta")
    public CVEDataMeta getCVEDataMeta() {
        return cVEDataMeta;
    }

    @JsonProperty("CVE_data_meta")
    public void setCVEDataMeta(CVEDataMeta cVEDataMeta) {
        this.cVEDataMeta = cVEDataMeta;
    }

    @JsonProperty("problemtype")
    public Problemtype getProblemtype() {
        return problemtype;
    }

    @JsonProperty("problemtype")
    public void setProblemtype(Problemtype problemtype) {
        this.problemtype = problemtype;
    }

    @JsonProperty("references")
    public References getReferences() {
        return references;
    }

    @JsonProperty("references")
    public void setReferences(References references) {
        this.references = references;
    }

    @JsonProperty("description")
    public Description__1 getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Description__1 description) {
        this.description = description;
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
        sb.append(Cve__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dataType");
        sb.append('=');
        sb.append(((this.dataType == null)?"<null>":this.dataType));
        sb.append(',');
        sb.append("dataFormat");
        sb.append('=');
        sb.append(((this.dataFormat == null)?"<null>":this.dataFormat));
        sb.append(',');
        sb.append("dataVersion");
        sb.append('=');
        sb.append(((this.dataVersion == null)?"<null>":this.dataVersion));
        sb.append(',');
        sb.append("cVEDataMeta");
        sb.append('=');
        sb.append(((this.cVEDataMeta == null)?"<null>":this.cVEDataMeta));
        sb.append(',');
        sb.append("problemtype");
        sb.append('=');
        sb.append(((this.problemtype == null)?"<null>":this.problemtype));
        sb.append(',');
        sb.append("references");
        sb.append('=');
        sb.append(((this.references == null)?"<null>":this.references));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
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
        result = ((result* 31)+((this.references == null)? 0 :this.references.hashCode()));
        result = ((result* 31)+((this.dataVersion == null)? 0 :this.dataVersion.hashCode()));
        result = ((result* 31)+((this.dataFormat == null)? 0 :this.dataFormat.hashCode()));
        result = ((result* 31)+((this.dataType == null)? 0 :this.dataType.hashCode()));
        result = ((result* 31)+((this.cVEDataMeta == null)? 0 :this.cVEDataMeta.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.problemtype == null)? 0 :this.problemtype.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cve__1) == false) {
            return false;
        }
        Cve__1 rhs = ((Cve__1) other);
        return (((((((((this.references == rhs.references)||((this.references!= null)&&this.references.equals(rhs.references)))&&((this.dataVersion == rhs.dataVersion)||((this.dataVersion!= null)&&this.dataVersion.equals(rhs.dataVersion))))&&((this.dataFormat == rhs.dataFormat)||((this.dataFormat!= null)&&this.dataFormat.equals(rhs.dataFormat))))&&((this.dataType == rhs.dataType)||((this.dataType!= null)&&this.dataType.equals(rhs.dataType))))&&((this.cVEDataMeta == rhs.cVEDataMeta)||((this.cVEDataMeta!= null)&&this.cVEDataMeta.equals(rhs.cVEDataMeta))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.problemtype == rhs.problemtype)||((this.problemtype!= null)&&this.problemtype.equals(rhs.problemtype))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}

/**
 * Table automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.airtable;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class Table {
    private String id;
    private String primaryFieldId;
    private String name;
    private String description;
    private List<Field> fields;
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }
    @JsonGetter("id")
    public String getId() {
        return this.id;
    }
    @JsonSetter("primaryFieldId")
    public void setPrimaryFieldId(String primaryFieldId) {
        this.primaryFieldId = primaryFieldId;
    }
    @JsonGetter("primaryFieldId")
    public String getPrimaryFieldId() {
        return this.primaryFieldId;
    }
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }
    @JsonGetter("description")
    public String getDescription() {
        return this.description;
    }
    @JsonSetter("fields")
    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
    @JsonGetter("fields")
    public List<Field> getFields() {
        return this.fields;
    }
}

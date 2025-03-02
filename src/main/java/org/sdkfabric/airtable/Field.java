/**
 * Field automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.airtable;

import com.fasterxml.jackson.annotation.*;

public class Field {
    private String id;
    private String type;
    private String name;
    private String description;
    private FieldOptions options;

    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonGetter("id")
    public String getId() {
        return this.id;
    }

    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonGetter("type")
    public String getType() {
        return this.type;
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

    @JsonSetter("options")
    public void setOptions(FieldOptions options) {
        this.options = options;
    }

    @JsonGetter("options")
    public FieldOptions getOptions() {
        return this.options;
    }
}


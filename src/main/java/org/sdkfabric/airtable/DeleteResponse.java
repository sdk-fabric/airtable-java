/**
 * DeleteResponse automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.airtable;

import com.fasterxml.jackson.annotation.*;

public class DeleteResponse {
    private Boolean deleted;
    private String id;

    @JsonSetter("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @JsonGetter("deleted")
    public Boolean getDeleted() {
        return this.deleted;
    }

    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonGetter("id")
    public String getId() {
        return this.id;
    }
}


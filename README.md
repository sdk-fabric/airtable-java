
# airtable-java

This [SDK](https://github.com/sdk-fabric/airtable-java) is managed by the [SDK Fabric](https://sdk-fabric.org/) project, a global infrastructure to
automatically generate SDKs for every API.

You can find more information about this SDK at [TypeHub](https://typehub.cloud/):
https://app.typehub.cloud/d/sdkfabric/airtable

## Usage

```java
import org.sdkfabric.airtable.Client;

Client client = Client::build("[access_token]");

// Retrieve the user's ID.
User response = client.meta().getWhoami();

// List records in a table.
Record_Collection response = client.records().getAll("baseId", "tableIdOrName", "timeZone", "userLocale", 1, 1, "offset", "view", "sort", "filterByFormula", "cellFormat", "fields", true, "recordMetadata");

// Retrieve a single record.
Record response = client.records().get("baseId", "tableIdOrName", "recordId");

// Creates multiple records.
Record_Collection response = client.records().create("baseId", "tableIdOrName", new Record_Collection());

// Updates a single record.
Record response = client.records().replace("baseId", "tableIdOrName", "recordId", new Record());

// Updates up to 10 records, or upserts them when performUpsert is set.
Bulk_Update_Response response = client.records().replaceAll("baseId", "tableIdOrName", new Bulk_Update_Request());

// Updates a single record.
Record response = client.records().update("baseId", "tableIdOrName", "recordId", new Record());

// Updates up to 10 records, or upserts them when performUpsert is set.
Bulk_Update_Response response = client.records().updateAll("baseId", "tableIdOrName", new Bulk_Update_Request());

// Deletes a single record.
Delete_Response response = client.records().delete("baseId", "tableIdOrName", "recordId");

// Creates a new column and returns the schema for the newly created column.
Field response = client.fields().create("baseId", "tableId", new Field());

// Updates the name and/or description of a field.
Field response = client.fields().update("baseId", "tableId", "columnId", new Field());

// Creates a new table and returns the schema for the newly created table.
Table response = client.tables().create("baseId", new Table());

// Updates the name and/or description of a table.
Table response = client.tables().update("baseId", "tableIdOrName", new Table());

// Returns a list of comments for the record from newest to oldest.
Comment_Collection response = client.comments().getAll("baseId", "tableIdOrName", "recordId");

// Creates a comment on a record.
Comment response = client.comments().create("baseId", "tableIdOrName", "recordId", new Comment());

// Updates a comment on a record.
Comment response = client.comments().update("baseId", "tableIdOrName", "recordId", "rowCommentId", new Comment());

// Deletes a comment from a record.
Delete_Response response = client.comments().delete("baseId", "tableIdOrName", "recordId", "rowCommentId");
```

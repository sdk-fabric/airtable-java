
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
User response = client.meta().getwhoami();

// List records in a table.
RecordCollection response = client.records().getall("baseId", "tableIdOrName", "timeZone", "userLocale", 1, 1, "offset", "view", "sort", "filterByFormula", "cellFormat", "fields", true, "recordMetadata");

// Retrieve a single record.
Record response = client.records().get("baseId", "tableIdOrName", "recordId");

// Creates multiple records.
RecordCollection response = client.records().create("baseId", "tableIdOrName", new RecordCollection());

// Updates a single record.
Record response = client.records().replace("baseId", "tableIdOrName", "recordId", new Record());

// Updates up to 10 records, or upserts them when performUpsert is set.
BulkUpdateResponse response = client.records().replaceall("baseId", "tableIdOrName", new BulkUpdateRequest());

// Updates a single record.
Record response = client.records().update("baseId", "tableIdOrName", "recordId", new Record());

// Updates up to 10 records, or upserts them when performUpsert is set.
BulkUpdateResponse response = client.records().updateall("baseId", "tableIdOrName", new BulkUpdateRequest());

// Deletes a single record.
DeleteResponse response = client.records().delete("baseId", "tableIdOrName", "recordId");

// Creates a new column and returns the schema for the newly created column.
Field response = client.fields().create("baseId", "tableId", new Field());

// Updates the name and/or description of a field.
Field response = client.fields().update("baseId", "tableId", "columnId", new Field());

// Creates a new table and returns the schema for the newly created table.
Table response = client.tables().create("baseId", new Table());

// Updates the name and/or description of a table.
Table response = client.tables().update("baseId", "tableIdOrName", new Table());

// Returns a list of comments for the record from newest to oldest.
CommentCollection response = client.comments().getall("baseId", "tableIdOrName", "recordId");

// Creates a comment on a record.
Comment response = client.comments().create("baseId", "tableIdOrName", "recordId", new Comment());

// Updates a comment on a record.
Comment response = client.comments().update("baseId", "tableIdOrName", "recordId", "rowCommentId", new Comment());

// Deletes a comment from a record.
DeleteResponse response = client.comments().delete("baseId", "tableIdOrName", "recordId", "rowCommentId");
```

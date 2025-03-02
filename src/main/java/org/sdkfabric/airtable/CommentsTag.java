/**
 * CommentsTag automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.airtable;

import app.sdkgen.client.Exception.ClientException;
import app.sdkgen.client.Exception.UnknownStatusCodeException;
import app.sdkgen.client.Parser;
import app.sdkgen.client.TagAbstract;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.*;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.io.entity.*;
import org.apache.hc.core5.net.URIBuilder;
import org.apache.hc.core5.net.URLEncodedUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommentsTag extends TagAbstract {
    public CommentsTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }


    /**
     * Returns a list of comments for the record from newest to oldest.
     */
    public CommentCollection getAll(String baseId, String tableIdOrName, String recordId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("baseId", baseId);
            pathParams.put("tableIdOrName", tableIdOrName);
            pathParams.put("recordId", recordId);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/v0/:baseId/:tableIdOrName/:recordId/comments", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());


            return this.httpClient.execute(request, response -> {
                if (response.getCode() >= 200 && response.getCode() <= 299) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommentCollection>(){});

                    return data;
                }

                var statusCode = response.getCode();
                if (statusCode >= 0 && statusCode <= 999) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<Error>(){});

                    throw new ErrorException(data);
                }

                throw new UnknownStatusCodeException("The server returned an unknown status code: " + statusCode);
            });
        } catch (ClientException e) {
            throw e;
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    /**
     * Creates a comment on a record. User mentioned is supported.
     */
    public Comment create(String baseId, String tableIdOrName, String recordId, Comment payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("baseId", baseId);
            pathParams.put("tableIdOrName", tableIdOrName);
            pathParams.put("recordId", recordId);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/v0/:baseId/:tableIdOrName/:recordId/comments", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpPost request = new HttpPost(builder.build());
            request.setEntity(new StringEntity(this.objectMapper.writeValueAsString(payload), ContentType.APPLICATION_JSON));

            request.setHeader("Content-Type", "application/json");

            return this.httpClient.execute(request, response -> {
                if (response.getCode() >= 200 && response.getCode() <= 299) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<Comment>(){});

                    return data;
                }

                var statusCode = response.getCode();
                if (statusCode >= 0 && statusCode <= 999) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<Error>(){});

                    throw new ErrorException(data);
                }

                throw new UnknownStatusCodeException("The server returned an unknown status code: " + statusCode);
            });
        } catch (ClientException e) {
            throw e;
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    /**
     * Updates a comment on a record. API users can only update comments they have created. User mentioned is supported.
     */
    public Comment update(String baseId, String tableIdOrName, String recordId, String rowCommentId, Comment payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("baseId", baseId);
            pathParams.put("tableIdOrName", tableIdOrName);
            pathParams.put("recordId", recordId);
            pathParams.put("rowCommentId", rowCommentId);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/v0/:baseId/:tableIdOrName/:recordId/comments/:rowCommentId", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpPatch request = new HttpPatch(builder.build());
            request.setEntity(new StringEntity(this.objectMapper.writeValueAsString(payload), ContentType.APPLICATION_JSON));

            request.setHeader("Content-Type", "application/json");

            return this.httpClient.execute(request, response -> {
                if (response.getCode() >= 200 && response.getCode() <= 299) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<Comment>(){});

                    return data;
                }

                var statusCode = response.getCode();
                if (statusCode >= 0 && statusCode <= 999) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<Error>(){});

                    throw new ErrorException(data);
                }

                throw new UnknownStatusCodeException("The server returned an unknown status code: " + statusCode);
            });
        } catch (ClientException e) {
            throw e;
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    /**
     * Deletes a comment from a record. Non-admin API users can only delete comments they have created. Enterprise Admins can delete any comment from a record.
     */
    public DeleteResponse delete(String baseId, String tableIdOrName, String recordId, String rowCommentId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("baseId", baseId);
            pathParams.put("tableIdOrName", tableIdOrName);
            pathParams.put("recordId", recordId);
            pathParams.put("rowCommentId", rowCommentId);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/v0/:baseId/:tableIdOrName/:recordId/comments/:rowCommentId", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpDelete request = new HttpDelete(builder.build());


            return this.httpClient.execute(request, response -> {
                if (response.getCode() >= 200 && response.getCode() <= 299) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<DeleteResponse>(){});

                    return data;
                }

                var statusCode = response.getCode();
                if (statusCode >= 0 && statusCode <= 999) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<Error>(){});

                    throw new ErrorException(data);
                }

                throw new UnknownStatusCodeException("The server returned an unknown status code: " + statusCode);
            });
        } catch (ClientException e) {
            throw e;
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }



}

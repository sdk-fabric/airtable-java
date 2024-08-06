/**
 * TablesTag automatically generated by SDKgen please do not edit this file manually
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
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.net.URIBuilder;

import java.io.IOException;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TablesTag extends TagAbstract {
    public TablesTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }


    /**
     * Creates a new table and returns the schema for the newly created table.
     */
    public Table create(String baseId, Table payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("baseId", baseId);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/v0/meta/bases/:baseId/tables", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpPost request = new HttpPost(builder.build());
            request.addHeader("Content-Type", "application/json");
            request.setEntity(new StringEntity(this.objectMapper.writeValueAsString(payload), ContentType.APPLICATION_JSON));

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, new TypeReference<Table>(){});
            }

            switch (resp.code) {
                case 400:
                    throw new ErrorException(this.parser.parse(resp.payload, new TypeReference<Error>(){}));
                case 403:
                    throw new ErrorException(this.parser.parse(resp.payload, new TypeReference<Error>(){}));
                case 404:
                    throw new ErrorException(this.parser.parse(resp.payload, new TypeReference<Error>(){}));
                case 500:
                    throw new ErrorException(this.parser.parse(resp.payload, new TypeReference<Error>(){}));
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    public Table update(String baseId, String tableIdOrName, Table payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("baseId", baseId);
            pathParams.put("tableIdOrName", tableIdOrName);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/v0/meta/bases/:baseId/tables/:tableIdOrName", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpPatch request = new HttpPatch(builder.build());
            request.addHeader("Content-Type", "application/json");
            request.setEntity(new StringEntity(this.objectMapper.writeValueAsString(payload), ContentType.APPLICATION_JSON));

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, new TypeReference<Table>(){});
            }

            switch (resp.code) {
                case 400:
                    throw new ErrorException(this.parser.parse(resp.payload, new TypeReference<Error>(){}));
                case 403:
                    throw new ErrorException(this.parser.parse(resp.payload, new TypeReference<Error>(){}));
                case 404:
                    throw new ErrorException(this.parser.parse(resp.payload, new TypeReference<Error>(){}));
                case 500:
                    throw new ErrorException(this.parser.parse(resp.payload, new TypeReference<Error>(){}));
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }


}
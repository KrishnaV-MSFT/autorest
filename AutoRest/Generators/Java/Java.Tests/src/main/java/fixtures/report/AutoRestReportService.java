/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.report;

import java.util.List;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import com.microsoft.rest.AutoRestBaseUrl;
import com.microsoft.rest.serializer.JacksonMapperAdapter;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.report.models.ErrorException;
import java.io.IOException;
import java.util.Map;

/**
 * The interface for AutoRestReportService class.
 */
public interface AutoRestReportService {
    /**
     * Gets the URL used as the base for all cloud service requests.
     *
     * @return the BaseUrl object.
     */
    AutoRestBaseUrl getBaseUrl();

    /**
     * Gets the adapter for {@link com.fasterxml.jackson.databind.ObjectMapper} for serialization
     * and deserialization operations..
     *
     * @return the adapter.
     */
    JacksonMapperAdapter getMapperAdapter();

    /**
     * Get test coverage report.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Map&lt;String, Integer&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Map<String, Integer>> getReport() throws ErrorException, IOException;

    /**
     * Get test coverage report.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getReportAsync(final ServiceCallback<Map<String, Integer>> serviceCallback) throws IllegalArgumentException;

}

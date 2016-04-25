/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.url;

import java.util.List;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import com.microsoft.rest.AutoRestBaseUrl;
import com.microsoft.rest.serializer.JacksonMapperAdapter;

/**
 * The interface for AutoRestUrlTestService class.
 */
public interface AutoRestUrlTestService {
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
     * Gets A string value 'globalItemStringPath' that appears in the path.
     *
     * @return the globalStringPath value.
     */
    String getGlobalStringPath();

    /**
     * Sets A string value 'globalItemStringPath' that appears in the path.
     *
     * @param globalStringPath the globalStringPath value.
     */
    void setGlobalStringPath(String globalStringPath);

    /**
     * Gets should contain value null.
     *
     * @return the globalStringQuery value.
     */
    String getGlobalStringQuery();

    /**
     * Sets should contain value null.
     *
     * @param globalStringQuery the globalStringQuery value.
     */
    void setGlobalStringQuery(String globalStringQuery);

    /**
     * Gets the Paths object to access its operations.
     * @return the Paths object.
     */
    Paths paths();

    /**
     * Gets the Queries object to access its operations.
     * @return the Queries object.
     */
    Queries queries();

    /**
     * Gets the PathItems object to access its operations.
     * @return the PathItems object.
     */
    PathItems pathItems();

}

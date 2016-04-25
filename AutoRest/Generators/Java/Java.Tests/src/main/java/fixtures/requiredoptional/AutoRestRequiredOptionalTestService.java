/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.requiredoptional;

import java.util.List;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import com.microsoft.rest.AutoRestBaseUrl;
import com.microsoft.rest.serializer.JacksonMapperAdapter;

/**
 * The interface for AutoRestRequiredOptionalTestService class.
 */
public interface AutoRestRequiredOptionalTestService {
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
     * Gets number of items to skip.
     *
     * @return the requiredGlobalPath value.
     */
    String getRequiredGlobalPath();

    /**
     * Sets number of items to skip.
     *
     * @param requiredGlobalPath the requiredGlobalPath value.
     */
    void setRequiredGlobalPath(String requiredGlobalPath);

    /**
     * Gets number of items to skip.
     *
     * @return the requiredGlobalQuery value.
     */
    String getRequiredGlobalQuery();

    /**
     * Sets number of items to skip.
     *
     * @param requiredGlobalQuery the requiredGlobalQuery value.
     */
    void setRequiredGlobalQuery(String requiredGlobalQuery);

    /**
     * Gets number of items to skip.
     *
     * @return the optionalGlobalQuery value.
     */
    int getOptionalGlobalQuery();

    /**
     * Sets number of items to skip.
     *
     * @param optionalGlobalQuery the optionalGlobalQuery value.
     */
    void setOptionalGlobalQuery(int optionalGlobalQuery);

    /**
     * Gets the Implicits object to access its operations.
     * @return the Implicits object.
     */
    Implicits implicits();

    /**
     * Gets the Explicits object to access its operations.
     * @return the Explicits object.
     */
    Explicits explicits();

}

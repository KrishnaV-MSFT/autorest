/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureparametergrouping.implementation.api;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;

/**
 * An instance of this class provides access to all the operations defined
 * in ParameterGroupings.
 */
public final class ParameterGroupingsInner {
    /** The Retrofit service to perform REST calls. */
    private ParameterGroupingsService service;
    /** The service client containing this operation class. */
    private AutoRestParameterGroupingTestServiceImpl client;

    /**
     * Initializes an instance of ParameterGroupingsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ParameterGroupingsInner(Retrofit retrofit, AutoRestParameterGroupingTestServiceImpl client) {
        this.service = retrofit.create(ParameterGroupingsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ParameterGroupings to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ParameterGroupingsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("parameterGrouping/postRequired/{path}")
        Call<ResponseBody> postRequired(@Path("path") String path, @Header("accept-language") String acceptLanguage, @Body int body, @Header("customHeader") String customHeader, @Query("query") Integer query, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("parameterGrouping/postOptional")
        Call<ResponseBody> postOptional(@Header("accept-language") String acceptLanguage, @Header("customHeader") String customHeader, @Query("query") Integer query, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("parameterGrouping/postMultipleParameterGroups")
        Call<ResponseBody> postMultiParamGroups(@Header("accept-language") String acceptLanguage, @Header("header-one") String headerOne, @Query("query-one") Integer queryOne, @Header("header-two") String headerTwo, @Query("query-two") Integer queryTwo, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("parameterGrouping/sharedParameterGroupObject")
        Call<ResponseBody> postSharedParameterGroupObject(@Header("accept-language") String acceptLanguage, @Header("header-one") String headerOne, @Query("query-one") Integer queryOne, @Header("User-Agent") String userAgent);

    }

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> postRequired(ParameterGroupingPostRequiredParametersInner parameterGroupingPostRequiredParameters) throws ErrorException, IOException, IllegalArgumentException {
        if (parameterGroupingPostRequiredParameters == null) {
            throw new IllegalArgumentException("Parameter parameterGroupingPostRequiredParameters is required and cannot be null.");
        }
        Validator.validate(parameterGroupingPostRequiredParameters);
        int body = parameterGroupingPostRequiredParameters.body();
        String customHeader = parameterGroupingPostRequiredParameters.customHeader();
        Integer query = parameterGroupingPostRequiredParameters.query();
        String path = parameterGroupingPostRequiredParameters.path();
        Call<ResponseBody> call = service.postRequired(path, this.client.acceptLanguage(), body, customHeader, query, this.client.userAgent());
        return postRequiredDelegate(call.execute());
    }

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall postRequiredAsync(ParameterGroupingPostRequiredParametersInner parameterGroupingPostRequiredParameters, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (parameterGroupingPostRequiredParameters == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter parameterGroupingPostRequiredParameters is required and cannot be null."));
            return null;
        }
        Validator.validate(parameterGroupingPostRequiredParameters, serviceCallback);
        int body = parameterGroupingPostRequiredParameters.body();
        String customHeader = parameterGroupingPostRequiredParameters.customHeader();
        Integer query = parameterGroupingPostRequiredParameters.query();
        String path = parameterGroupingPostRequiredParameters.path();
        Call<ResponseBody> call = service.postRequired(path, this.client.acceptLanguage(), body, customHeader, query, this.client.userAgent());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postRequiredDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> postRequiredDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> postOptional() throws ErrorException, IOException {
        final ParameterGroupingPostOptionalParametersInner parameterGroupingPostOptionalParameters = null;
        String customHeader = null;
        Integer query = null;
        Call<ResponseBody> call = service.postOptional(this.client.acceptLanguage(), customHeader, query, this.client.userAgent());
        return postOptionalDelegate(call.execute());
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall postOptionalAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        final ParameterGroupingPostOptionalParametersInner parameterGroupingPostOptionalParameters = null;
        String customHeader = null;
        Integer query = null;
        Call<ResponseBody> call = service.postOptional(this.client.acceptLanguage(), customHeader, query, this.client.userAgent());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postOptionalDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> postOptional(ParameterGroupingPostOptionalParametersInner parameterGroupingPostOptionalParameters) throws ErrorException, IOException {
        Validator.validate(parameterGroupingPostOptionalParameters);
        String customHeader = null;
        if (parameterGroupingPostOptionalParameters != null) {
            customHeader = parameterGroupingPostOptionalParameters.customHeader();
        }
        Integer query = null;
        if (parameterGroupingPostOptionalParameters != null) {
            query = parameterGroupingPostOptionalParameters.query();
        }
        Call<ResponseBody> call = service.postOptional(this.client.acceptLanguage(), customHeader, query, this.client.userAgent());
        return postOptionalDelegate(call.execute());
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall postOptionalAsync(ParameterGroupingPostOptionalParametersInner parameterGroupingPostOptionalParameters, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Validator.validate(parameterGroupingPostOptionalParameters, serviceCallback);
        String customHeader = null;
        if (parameterGroupingPostOptionalParameters != null) {
            customHeader = parameterGroupingPostOptionalParameters.customHeader();
        }
        Integer query = null;
        if (parameterGroupingPostOptionalParameters != null) {
            query = parameterGroupingPostOptionalParameters.query();
        }
        Call<ResponseBody> call = service.postOptional(this.client.acceptLanguage(), customHeader, query, this.client.userAgent());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postOptionalDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> postOptionalDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> postMultiParamGroups() throws ErrorException, IOException {
        final FirstParameterGroupInner firstParameterGroup = null;
        final ParameterGroupingPostMultiParamGroupsSecondParamGroupInner parameterGroupingPostMultiParamGroupsSecondParamGroup = null;
        String headerOne = null;
        Integer queryOne = null;
        String headerTwo = null;
        Integer queryTwo = null;
        Call<ResponseBody> call = service.postMultiParamGroups(this.client.acceptLanguage(), headerOne, queryOne, headerTwo, queryTwo, this.client.userAgent());
        return postMultiParamGroupsDelegate(call.execute());
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall postMultiParamGroupsAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        final FirstParameterGroupInner firstParameterGroup = null;
        final ParameterGroupingPostMultiParamGroupsSecondParamGroupInner parameterGroupingPostMultiParamGroupsSecondParamGroup = null;
        String headerOne = null;
        Integer queryOne = null;
        String headerTwo = null;
        Integer queryTwo = null;
        Call<ResponseBody> call = service.postMultiParamGroups(this.client.acceptLanguage(), headerOne, queryOne, headerTwo, queryTwo, this.client.userAgent());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postMultiParamGroupsDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> postMultiParamGroups(FirstParameterGroupInner firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroupInner parameterGroupingPostMultiParamGroupsSecondParamGroup) throws ErrorException, IOException {
        Validator.validate(firstParameterGroup);
        Validator.validate(parameterGroupingPostMultiParamGroupsSecondParamGroup);
        String headerOne = null;
        if (firstParameterGroup != null) {
            headerOne = firstParameterGroup.headerOne();
        }
        Integer queryOne = null;
        if (firstParameterGroup != null) {
            queryOne = firstParameterGroup.queryOne();
        }
        String headerTwo = null;
        if (parameterGroupingPostMultiParamGroupsSecondParamGroup != null) {
            headerTwo = parameterGroupingPostMultiParamGroupsSecondParamGroup.headerTwo();
        }
        Integer queryTwo = null;
        if (parameterGroupingPostMultiParamGroupsSecondParamGroup != null) {
            queryTwo = parameterGroupingPostMultiParamGroupsSecondParamGroup.queryTwo();
        }
        Call<ResponseBody> call = service.postMultiParamGroups(this.client.acceptLanguage(), headerOne, queryOne, headerTwo, queryTwo, this.client.userAgent());
        return postMultiParamGroupsDelegate(call.execute());
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall postMultiParamGroupsAsync(FirstParameterGroupInner firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroupInner parameterGroupingPostMultiParamGroupsSecondParamGroup, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Validator.validate(firstParameterGroup, serviceCallback);
        Validator.validate(parameterGroupingPostMultiParamGroupsSecondParamGroup, serviceCallback);
        String headerOne = null;
        if (firstParameterGroup != null) {
            headerOne = firstParameterGroup.headerOne();
        }
        Integer queryOne = null;
        if (firstParameterGroup != null) {
            queryOne = firstParameterGroup.queryOne();
        }
        String headerTwo = null;
        if (parameterGroupingPostMultiParamGroupsSecondParamGroup != null) {
            headerTwo = parameterGroupingPostMultiParamGroupsSecondParamGroup.headerTwo();
        }
        Integer queryTwo = null;
        if (parameterGroupingPostMultiParamGroupsSecondParamGroup != null) {
            queryTwo = parameterGroupingPostMultiParamGroupsSecondParamGroup.queryTwo();
        }
        Call<ResponseBody> call = service.postMultiParamGroups(this.client.acceptLanguage(), headerOne, queryOne, headerTwo, queryTwo, this.client.userAgent());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postMultiParamGroupsDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> postMultiParamGroupsDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> postSharedParameterGroupObject() throws ErrorException, IOException {
        final FirstParameterGroupInner firstParameterGroup = null;
        String headerOne = null;
        Integer queryOne = null;
        Call<ResponseBody> call = service.postSharedParameterGroupObject(this.client.acceptLanguage(), headerOne, queryOne, this.client.userAgent());
        return postSharedParameterGroupObjectDelegate(call.execute());
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall postSharedParameterGroupObjectAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        final FirstParameterGroupInner firstParameterGroup = null;
        String headerOne = null;
        Integer queryOne = null;
        Call<ResponseBody> call = service.postSharedParameterGroupObject(this.client.acceptLanguage(), headerOne, queryOne, this.client.userAgent());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postSharedParameterGroupObjectDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> postSharedParameterGroupObject(FirstParameterGroupInner firstParameterGroup) throws ErrorException, IOException {
        Validator.validate(firstParameterGroup);
        String headerOne = null;
        if (firstParameterGroup != null) {
            headerOne = firstParameterGroup.headerOne();
        }
        Integer queryOne = null;
        if (firstParameterGroup != null) {
            queryOne = firstParameterGroup.queryOne();
        }
        Call<ResponseBody> call = service.postSharedParameterGroupObject(this.client.acceptLanguage(), headerOne, queryOne, this.client.userAgent());
        return postSharedParameterGroupObjectDelegate(call.execute());
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall postSharedParameterGroupObjectAsync(FirstParameterGroupInner firstParameterGroup, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Validator.validate(firstParameterGroup, serviceCallback);
        String headerOne = null;
        if (firstParameterGroup != null) {
            headerOne = firstParameterGroup.headerOne();
        }
        Integer queryOne = null;
        if (firstParameterGroup != null) {
            queryOne = firstParameterGroup.queryOne();
        }
        Call<ResponseBody> call = service.postSharedParameterGroupObject(this.client.acceptLanguage(), headerOne, queryOne, this.client.userAgent());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postSharedParameterGroupObjectDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> postSharedParameterGroupObjectDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}

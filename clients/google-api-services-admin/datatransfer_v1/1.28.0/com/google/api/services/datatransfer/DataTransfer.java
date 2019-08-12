/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.datatransfer;

/**
 * Service definition for DataTransfer (datatransfer_v1).
 *
 * <p>
 * Transfers user data from one user to another.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/admin-sdk/data-transfer/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link DataTransferRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class DataTransfer extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.28.0 of the Admin Data Transfer API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://www.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "admin/datatransfer/v1/";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch/admin/datatransfer_v1";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public DataTransfer(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  DataTransfer(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Applications collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code DataTransfer admin = new DataTransfer(...);}
   *   {@code DataTransfer.Applications.List request = admin.applications().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Applications applications() {
    return new Applications();
  }

  /**
   * The "applications" collection of methods.
   */
  public class Applications {

    /**
     * Retrieves information about an application for the given application ID.
     *
     * Create a request for the method "applications.get".
     *
     * This request holds the parameters needed by the admin server.  After setting any optional
     * parameters, call the {@link Get#execute()} method to invoke the remote operation.
     *
     * @param applicationId ID of the application resource to be retrieved.
     * @return the request
     */
    public Get get(java.lang.Long applicationId) throws java.io.IOException {
      Get result = new Get(applicationId);
      initialize(result);
      return result;
    }

    public class Get extends DataTransferRequest<com.google.api.services.datatransfer.model.Application> {

      private static final String REST_PATH = "applications/{applicationId}";

      /**
       * Retrieves information about an application for the given application ID.
       *
       * Create a request for the method "applications.get".
       *
       * This request holds the parameters needed by the the admin server.  After setting any optional
       * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
       * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
       * called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param applicationId ID of the application resource to be retrieved.
       * @since 1.13
       */
      protected Get(java.lang.Long applicationId) {
        super(DataTransfer.this, "GET", REST_PATH, null, com.google.api.services.datatransfer.model.Application.class);
        this.applicationId = com.google.api.client.util.Preconditions.checkNotNull(applicationId, "Required parameter applicationId must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public Get setAlt(java.lang.String alt) {
        return (Get) super.setAlt(alt);
      }

      @Override
      public Get setFields(java.lang.String fields) {
        return (Get) super.setFields(fields);
      }

      @Override
      public Get setKey(java.lang.String key) {
        return (Get) super.setKey(key);
      }

      @Override
      public Get setOauthToken(java.lang.String oauthToken) {
        return (Get) super.setOauthToken(oauthToken);
      }

      @Override
      public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Get) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Get setQuotaUser(java.lang.String quotaUser) {
        return (Get) super.setQuotaUser(quotaUser);
      }

      @Override
      public Get setUserIp(java.lang.String userIp) {
        return (Get) super.setUserIp(userIp);
      }

      /** ID of the application resource to be retrieved. */
      @com.google.api.client.util.Key
      private java.lang.Long applicationId;

      /** ID of the application resource to be retrieved.
       */
      public java.lang.Long getApplicationId() {
        return applicationId;
      }

      /** ID of the application resource to be retrieved. */
      public Get setApplicationId(java.lang.Long applicationId) {
        this.applicationId = applicationId;
        return this;
      }

      @Override
      public Get set(String parameterName, Object value) {
        return (Get) super.set(parameterName, value);
      }
    }
    /**
     * Lists the applications available for data transfer for a customer.
     *
     * Create a request for the method "applications.list".
     *
     * This request holds the parameters needed by the admin server.  After setting any optional
     * parameters, call the {@link List#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public List list() throws java.io.IOException {
      List result = new List();
      initialize(result);
      return result;
    }

    public class List extends DataTransferRequest<com.google.api.services.datatransfer.model.ApplicationsListResponse> {

      private static final String REST_PATH = "applications";

      /**
       * Lists the applications available for data transfer for a customer.
       *
       * Create a request for the method "applications.list".
       *
       * This request holds the parameters needed by the the admin server.  After setting any optional
       * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
       * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
       * called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected List() {
        super(DataTransfer.this, "GET", REST_PATH, null, com.google.api.services.datatransfer.model.ApplicationsListResponse.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public List setAlt(java.lang.String alt) {
        return (List) super.setAlt(alt);
      }

      @Override
      public List setFields(java.lang.String fields) {
        return (List) super.setFields(fields);
      }

      @Override
      public List setKey(java.lang.String key) {
        return (List) super.setKey(key);
      }

      @Override
      public List setOauthToken(java.lang.String oauthToken) {
        return (List) super.setOauthToken(oauthToken);
      }

      @Override
      public List setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (List) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public List setQuotaUser(java.lang.String quotaUser) {
        return (List) super.setQuotaUser(quotaUser);
      }

      @Override
      public List setUserIp(java.lang.String userIp) {
        return (List) super.setUserIp(userIp);
      }

      /** Immutable ID of the Google Apps account. */
      @com.google.api.client.util.Key
      private java.lang.String customerId;

      /** Immutable ID of the Google Apps account.
       */
      public java.lang.String getCustomerId() {
        return customerId;
      }

      /** Immutable ID of the Google Apps account. */
      public List setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
        return this;
      }

      /** Maximum number of results to return. Default is 100. */
      @com.google.api.client.util.Key
      private java.lang.Integer maxResults;

      /** Maximum number of results to return. Default is 100.

     [minimum: 1] [maximum: 500]
       */
      public java.lang.Integer getMaxResults() {
        return maxResults;
      }

      /** Maximum number of results to return. Default is 100. */
      public List setMaxResults(java.lang.Integer maxResults) {
        this.maxResults = maxResults;
        return this;
      }

      /** Token to specify next page in the list. */
      @com.google.api.client.util.Key
      private java.lang.String pageToken;

      /** Token to specify next page in the list.
       */
      public java.lang.String getPageToken() {
        return pageToken;
      }

      /** Token to specify next page in the list. */
      public List setPageToken(java.lang.String pageToken) {
        this.pageToken = pageToken;
        return this;
      }

      @Override
      public List set(String parameterName, Object value) {
        return (List) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the Transfers collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code DataTransfer admin = new DataTransfer(...);}
   *   {@code DataTransfer.Transfers.List request = admin.transfers().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Transfers transfers() {
    return new Transfers();
  }

  /**
   * The "transfers" collection of methods.
   */
  public class Transfers {

    /**
     * Retrieves a data transfer request by its resource ID.
     *
     * Create a request for the method "transfers.get".
     *
     * This request holds the parameters needed by the admin server.  After setting any optional
     * parameters, call the {@link Get#execute()} method to invoke the remote operation.
     *
     * @param dataTransferId ID of the resource to be retrieved. This is returned in the response from the insert method.
     * @return the request
     */
    public Get get(java.lang.String dataTransferId) throws java.io.IOException {
      Get result = new Get(dataTransferId);
      initialize(result);
      return result;
    }

    public class Get extends DataTransferRequest<com.google.api.services.datatransfer.model.DataTransfer> {

      private static final String REST_PATH = "transfers/{dataTransferId}";

      /**
       * Retrieves a data transfer request by its resource ID.
       *
       * Create a request for the method "transfers.get".
       *
       * This request holds the parameters needed by the the admin server.  After setting any optional
       * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
       * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
       * called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param dataTransferId ID of the resource to be retrieved. This is returned in the response from the insert method.
       * @since 1.13
       */
      protected Get(java.lang.String dataTransferId) {
        super(DataTransfer.this, "GET", REST_PATH, null, com.google.api.services.datatransfer.model.DataTransfer.class);
        this.dataTransferId = com.google.api.client.util.Preconditions.checkNotNull(dataTransferId, "Required parameter dataTransferId must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public Get setAlt(java.lang.String alt) {
        return (Get) super.setAlt(alt);
      }

      @Override
      public Get setFields(java.lang.String fields) {
        return (Get) super.setFields(fields);
      }

      @Override
      public Get setKey(java.lang.String key) {
        return (Get) super.setKey(key);
      }

      @Override
      public Get setOauthToken(java.lang.String oauthToken) {
        return (Get) super.setOauthToken(oauthToken);
      }

      @Override
      public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Get) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Get setQuotaUser(java.lang.String quotaUser) {
        return (Get) super.setQuotaUser(quotaUser);
      }

      @Override
      public Get setUserIp(java.lang.String userIp) {
        return (Get) super.setUserIp(userIp);
      }

      /**
       * ID of the resource to be retrieved. This is returned in the response from the insert
       * method.
       */
      @com.google.api.client.util.Key
      private java.lang.String dataTransferId;

      /** ID of the resource to be retrieved. This is returned in the response from the insert method.
       */
      public java.lang.String getDataTransferId() {
        return dataTransferId;
      }

      /**
       * ID of the resource to be retrieved. This is returned in the response from the insert
       * method.
       */
      public Get setDataTransferId(java.lang.String dataTransferId) {
        this.dataTransferId = dataTransferId;
        return this;
      }

      @Override
      public Get set(String parameterName, Object value) {
        return (Get) super.set(parameterName, value);
      }
    }
    /**
     * Inserts a data transfer request.
     *
     * Create a request for the method "transfers.insert".
     *
     * This request holds the parameters needed by the admin server.  After setting any optional
     * parameters, call the {@link Insert#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.datatransfer.model.DataTransfer}
     * @return the request
     */
    public Insert insert(com.google.api.services.datatransfer.model.DataTransfer content) throws java.io.IOException {
      Insert result = new Insert(content);
      initialize(result);
      return result;
    }

    public class Insert extends DataTransferRequest<com.google.api.services.datatransfer.model.DataTransfer> {

      private static final String REST_PATH = "transfers";

      /**
       * Inserts a data transfer request.
       *
       * Create a request for the method "transfers.insert".
       *
       * This request holds the parameters needed by the the admin server.  After setting any optional
       * parameters, call the {@link Insert#execute()} method to invoke the remote operation. <p> {@link
       * Insert#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.datatransfer.model.DataTransfer}
       * @since 1.13
       */
      protected Insert(com.google.api.services.datatransfer.model.DataTransfer content) {
        super(DataTransfer.this, "POST", REST_PATH, content, com.google.api.services.datatransfer.model.DataTransfer.class);
      }

      @Override
      public Insert setAlt(java.lang.String alt) {
        return (Insert) super.setAlt(alt);
      }

      @Override
      public Insert setFields(java.lang.String fields) {
        return (Insert) super.setFields(fields);
      }

      @Override
      public Insert setKey(java.lang.String key) {
        return (Insert) super.setKey(key);
      }

      @Override
      public Insert setOauthToken(java.lang.String oauthToken) {
        return (Insert) super.setOauthToken(oauthToken);
      }

      @Override
      public Insert setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Insert) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Insert setQuotaUser(java.lang.String quotaUser) {
        return (Insert) super.setQuotaUser(quotaUser);
      }

      @Override
      public Insert setUserIp(java.lang.String userIp) {
        return (Insert) super.setUserIp(userIp);
      }

      @Override
      public Insert set(String parameterName, Object value) {
        return (Insert) super.set(parameterName, value);
      }
    }
    /**
     * Lists the transfers for a customer by source user, destination user, or status.
     *
     * Create a request for the method "transfers.list".
     *
     * This request holds the parameters needed by the admin server.  After setting any optional
     * parameters, call the {@link List#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public List list() throws java.io.IOException {
      List result = new List();
      initialize(result);
      return result;
    }

    public class List extends DataTransferRequest<com.google.api.services.datatransfer.model.DataTransfersListResponse> {

      private static final String REST_PATH = "transfers";

      /**
       * Lists the transfers for a customer by source user, destination user, or status.
       *
       * Create a request for the method "transfers.list".
       *
       * This request holds the parameters needed by the the admin server.  After setting any optional
       * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
       * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
       * called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected List() {
        super(DataTransfer.this, "GET", REST_PATH, null, com.google.api.services.datatransfer.model.DataTransfersListResponse.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public List setAlt(java.lang.String alt) {
        return (List) super.setAlt(alt);
      }

      @Override
      public List setFields(java.lang.String fields) {
        return (List) super.setFields(fields);
      }

      @Override
      public List setKey(java.lang.String key) {
        return (List) super.setKey(key);
      }

      @Override
      public List setOauthToken(java.lang.String oauthToken) {
        return (List) super.setOauthToken(oauthToken);
      }

      @Override
      public List setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (List) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public List setQuotaUser(java.lang.String quotaUser) {
        return (List) super.setQuotaUser(quotaUser);
      }

      @Override
      public List setUserIp(java.lang.String userIp) {
        return (List) super.setUserIp(userIp);
      }

      /** Immutable ID of the Google Apps account. */
      @com.google.api.client.util.Key
      private java.lang.String customerId;

      /** Immutable ID of the Google Apps account.
       */
      public java.lang.String getCustomerId() {
        return customerId;
      }

      /** Immutable ID of the Google Apps account. */
      public List setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
        return this;
      }

      /** Maximum number of results to return. Default is 100. */
      @com.google.api.client.util.Key
      private java.lang.Integer maxResults;

      /** Maximum number of results to return. Default is 100.

     [minimum: 1] [maximum: 500]
       */
      public java.lang.Integer getMaxResults() {
        return maxResults;
      }

      /** Maximum number of results to return. Default is 100. */
      public List setMaxResults(java.lang.Integer maxResults) {
        this.maxResults = maxResults;
        return this;
      }

      /** Destination user's profile ID. */
      @com.google.api.client.util.Key
      private java.lang.String newOwnerUserId;

      /** Destination user's profile ID.
       */
      public java.lang.String getNewOwnerUserId() {
        return newOwnerUserId;
      }

      /** Destination user's profile ID. */
      public List setNewOwnerUserId(java.lang.String newOwnerUserId) {
        this.newOwnerUserId = newOwnerUserId;
        return this;
      }

      /** Source user's profile ID. */
      @com.google.api.client.util.Key
      private java.lang.String oldOwnerUserId;

      /** Source user's profile ID.
       */
      public java.lang.String getOldOwnerUserId() {
        return oldOwnerUserId;
      }

      /** Source user's profile ID. */
      public List setOldOwnerUserId(java.lang.String oldOwnerUserId) {
        this.oldOwnerUserId = oldOwnerUserId;
        return this;
      }

      /** Token to specify the next page in the list. */
      @com.google.api.client.util.Key
      private java.lang.String pageToken;

      /** Token to specify the next page in the list.
       */
      public java.lang.String getPageToken() {
        return pageToken;
      }

      /** Token to specify the next page in the list. */
      public List setPageToken(java.lang.String pageToken) {
        this.pageToken = pageToken;
        return this;
      }

      /** Status of the transfer. */
      @com.google.api.client.util.Key
      private java.lang.String status;

      /** Status of the transfer.
       */
      public java.lang.String getStatus() {
        return status;
      }

      /** Status of the transfer. */
      public List setStatus(java.lang.String status) {
        this.status = status;
        return this;
      }

      @Override
      public List set(String parameterName, Object value) {
        return (List) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link DataTransfer}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link DataTransfer}. */
    @Override
    public DataTransfer build() {
      return new DataTransfer(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link DataTransferRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setDataTransferRequestInitializer(
        DataTransferRequestInitializer datatransferRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(datatransferRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}

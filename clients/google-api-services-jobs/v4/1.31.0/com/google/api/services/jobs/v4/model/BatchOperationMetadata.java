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

package com.google.api.services.jobs.v4.model;

/**
 * Metadata used for long running operations returned by CTS batch APIs. It's used to replace
 * google.longrunning.Operation.metadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The time when the batch operation is created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The time when the batch operation is finished and google.longrunning.Operation.done is set to
   * `true`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Count of failed item(s) inside an operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer failureCount;

  /**
   * The state of a long running operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * More detailed information about operation state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stateDescription;

  /**
   * Count of successful item(s) inside an operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer successCount;

  /**
   * Count of total item(s) inside an operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalCount;

  /**
   * The time when the batch operation status is updated. The metadata and the update_time is
   * refreshed every minute otherwise cached data is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The time when the batch operation is created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time when the batch operation is created.
   * @param createTime createTime or {@code null} for none
   */
  public BatchOperationMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The time when the batch operation is finished and google.longrunning.Operation.done is set to
   * `true`.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * The time when the batch operation is finished and google.longrunning.Operation.done is set to
   * `true`.
   * @param endTime endTime or {@code null} for none
   */
  public BatchOperationMetadata setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Count of failed item(s) inside an operation.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getFailureCount() {
    return failureCount;
  }

  /**
   * Count of failed item(s) inside an operation.
   * @param failureCount failureCount or {@code null} for none
   */
  public BatchOperationMetadata setFailureCount(java.lang.Integer failureCount) {
    this.failureCount = failureCount;
    return this;
  }

  /**
   * The state of a long running operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The state of a long running operation.
   * @param state state or {@code null} for none
   */
  public BatchOperationMetadata setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * More detailed information about operation state.
   * @return value or {@code null} for none
   */
  public java.lang.String getStateDescription() {
    return stateDescription;
  }

  /**
   * More detailed information about operation state.
   * @param stateDescription stateDescription or {@code null} for none
   */
  public BatchOperationMetadata setStateDescription(java.lang.String stateDescription) {
    this.stateDescription = stateDescription;
    return this;
  }

  /**
   * Count of successful item(s) inside an operation.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSuccessCount() {
    return successCount;
  }

  /**
   * Count of successful item(s) inside an operation.
   * @param successCount successCount or {@code null} for none
   */
  public BatchOperationMetadata setSuccessCount(java.lang.Integer successCount) {
    this.successCount = successCount;
    return this;
  }

  /**
   * Count of total item(s) inside an operation.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalCount() {
    return totalCount;
  }

  /**
   * Count of total item(s) inside an operation.
   * @param totalCount totalCount or {@code null} for none
   */
  public BatchOperationMetadata setTotalCount(java.lang.Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * The time when the batch operation status is updated. The metadata and the update_time is
   * refreshed every minute otherwise cached data is returned.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The time when the batch operation status is updated. The metadata and the update_time is
   * refreshed every minute otherwise cached data is returned.
   * @param updateTime updateTime or {@code null} for none
   */
  public BatchOperationMetadata setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public BatchOperationMetadata set(String fieldName, Object value) {
    return (BatchOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public BatchOperationMetadata clone() {
    return (BatchOperationMetadata) super.clone();
  }

}

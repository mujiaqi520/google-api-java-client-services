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
 * Request to update a batch of jobs.
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
public final class BatchUpdateJobsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The jobs to be updated. A maximum of 200 jobs can be updated in a batch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Job> jobs;

  /**
   * Strongly recommended for the best service experience. Be aware that it will also increase
   * latency when checking the status of a batch operation. If update_mask is provided, only the
   * specified fields in Job are updated. Otherwise all the fields are updated. A field mask to
   * restrict the fields that are updated. Only top level fields of Job are supported. If
   * update_mask is provided, The Job inside JobResult will only contains fields that is updated,
   * plus the Id of the Job. Otherwise, Job will include all fields, which can yield a very large
   * response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateMask;

  /**
   * Required. The jobs to be updated. A maximum of 200 jobs can be updated in a batch.
   * @return value or {@code null} for none
   */
  public java.util.List<Job> getJobs() {
    return jobs;
  }

  /**
   * Required. The jobs to be updated. A maximum of 200 jobs can be updated in a batch.
   * @param jobs jobs or {@code null} for none
   */
  public BatchUpdateJobsRequest setJobs(java.util.List<Job> jobs) {
    this.jobs = jobs;
    return this;
  }

  /**
   * Strongly recommended for the best service experience. Be aware that it will also increase
   * latency when checking the status of a batch operation. If update_mask is provided, only the
   * specified fields in Job are updated. Otherwise all the fields are updated. A field mask to
   * restrict the fields that are updated. Only top level fields of Job are supported. If
   * update_mask is provided, The Job inside JobResult will only contains fields that is updated,
   * plus the Id of the Job. Otherwise, Job will include all fields, which can yield a very large
   * response.
   * @return value or {@code null} for none
   */
  public String getUpdateMask() {
    return updateMask;
  }

  /**
   * Strongly recommended for the best service experience. Be aware that it will also increase
   * latency when checking the status of a batch operation. If update_mask is provided, only the
   * specified fields in Job are updated. Otherwise all the fields are updated. A field mask to
   * restrict the fields that are updated. Only top level fields of Job are supported. If
   * update_mask is provided, The Job inside JobResult will only contains fields that is updated,
   * plus the Id of the Job. Otherwise, Job will include all fields, which can yield a very large
   * response.
   * @param updateMask updateMask or {@code null} for none
   */
  public BatchUpdateJobsRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  @Override
  public BatchUpdateJobsRequest set(String fieldName, Object value) {
    return (BatchUpdateJobsRequest) super.set(fieldName, value);
  }

  @Override
  public BatchUpdateJobsRequest clone() {
    return (BatchUpdateJobsRequest) super.clone();
  }

}

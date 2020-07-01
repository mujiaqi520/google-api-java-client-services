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

package com.google.api.services.dataproc.v1beta2.model;

/**
 * A Dataproc workflow template resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkflowMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The name of the target cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterName;

  /**
   * Output only. The UUID of target cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterUuid;

  /**
   * Output only. The create cluster operation metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ClusterOperation createCluster;

  /**
   * Output only. DAG end time, only set for workflows with dag_timeout when DAG ends.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String dagEndTime;

  /**
   * Output only. DAG start time, only set for workflows with dag_timeout when DAG begins.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String dagStartTime;

  /**
   * Output only. The timeout duration for the DAG of jobs. Minimum timeout duration is 10 minutes
   * and maximum is 24 hours, expressed as a google.protobuf.Duration. For example, "1800" = 1800
   * seconds/30 minutes duration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String dagTimeout;

  /**
   * Output only. The delete cluster operation metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ClusterOperation deleteCluster;

  /**
   * Output only. Workflow end time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Output only. The workflow graph.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WorkflowGraph graph;

  /**
   * Map from parameter names to values that were used for those parameters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> parameters;

  /**
   * Output only. Workflow start time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Output only. The workflow state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The resource name of the workflow template as described in
   * https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates,
   * the resource name of the  template has the following format:
   * projects/{project_id}/regions/{region}/workflowTemplates/{template_id} For
   * projects.locations.workflowTemplates, the resource name of the  template has the following
   * format:  projects/{project_id}/locations/{location}/workflowTemplates/{template_id}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String template;

  /**
   * Output only. The version of template at the time of workflow instantiation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer version;

  /**
   * Output only. The name of the target cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterName() {
    return clusterName;
  }

  /**
   * Output only. The name of the target cluster.
   * @param clusterName clusterName or {@code null} for none
   */
  public WorkflowMetadata setClusterName(java.lang.String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * Output only. The UUID of target cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterUuid() {
    return clusterUuid;
  }

  /**
   * Output only. The UUID of target cluster.
   * @param clusterUuid clusterUuid or {@code null} for none
   */
  public WorkflowMetadata setClusterUuid(java.lang.String clusterUuid) {
    this.clusterUuid = clusterUuid;
    return this;
  }

  /**
   * Output only. The create cluster operation metadata.
   * @return value or {@code null} for none
   */
  public ClusterOperation getCreateCluster() {
    return createCluster;
  }

  /**
   * Output only. The create cluster operation metadata.
   * @param createCluster createCluster or {@code null} for none
   */
  public WorkflowMetadata setCreateCluster(ClusterOperation createCluster) {
    this.createCluster = createCluster;
    return this;
  }

  /**
   * Output only. DAG end time, only set for workflows with dag_timeout when DAG ends.
   * @return value or {@code null} for none
   */
  public String getDagEndTime() {
    return dagEndTime;
  }

  /**
   * Output only. DAG end time, only set for workflows with dag_timeout when DAG ends.
   * @param dagEndTime dagEndTime or {@code null} for none
   */
  public WorkflowMetadata setDagEndTime(String dagEndTime) {
    this.dagEndTime = dagEndTime;
    return this;
  }

  /**
   * Output only. DAG start time, only set for workflows with dag_timeout when DAG begins.
   * @return value or {@code null} for none
   */
  public String getDagStartTime() {
    return dagStartTime;
  }

  /**
   * Output only. DAG start time, only set for workflows with dag_timeout when DAG begins.
   * @param dagStartTime dagStartTime or {@code null} for none
   */
  public WorkflowMetadata setDagStartTime(String dagStartTime) {
    this.dagStartTime = dagStartTime;
    return this;
  }

  /**
   * Output only. The timeout duration for the DAG of jobs. Minimum timeout duration is 10 minutes
   * and maximum is 24 hours, expressed as a google.protobuf.Duration. For example, "1800" = 1800
   * seconds/30 minutes duration.
   * @return value or {@code null} for none
   */
  public String getDagTimeout() {
    return dagTimeout;
  }

  /**
   * Output only. The timeout duration for the DAG of jobs. Minimum timeout duration is 10 minutes
   * and maximum is 24 hours, expressed as a google.protobuf.Duration. For example, "1800" = 1800
   * seconds/30 minutes duration.
   * @param dagTimeout dagTimeout or {@code null} for none
   */
  public WorkflowMetadata setDagTimeout(String dagTimeout) {
    this.dagTimeout = dagTimeout;
    return this;
  }

  /**
   * Output only. The delete cluster operation metadata.
   * @return value or {@code null} for none
   */
  public ClusterOperation getDeleteCluster() {
    return deleteCluster;
  }

  /**
   * Output only. The delete cluster operation metadata.
   * @param deleteCluster deleteCluster or {@code null} for none
   */
  public WorkflowMetadata setDeleteCluster(ClusterOperation deleteCluster) {
    this.deleteCluster = deleteCluster;
    return this;
  }

  /**
   * Output only. Workflow end time.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Output only. Workflow end time.
   * @param endTime endTime or {@code null} for none
   */
  public WorkflowMetadata setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Output only. The workflow graph.
   * @return value or {@code null} for none
   */
  public WorkflowGraph getGraph() {
    return graph;
  }

  /**
   * Output only. The workflow graph.
   * @param graph graph or {@code null} for none
   */
  public WorkflowMetadata setGraph(WorkflowGraph graph) {
    this.graph = graph;
    return this;
  }

  /**
   * Map from parameter names to values that were used for those parameters.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getParameters() {
    return parameters;
  }

  /**
   * Map from parameter names to values that were used for those parameters.
   * @param parameters parameters or {@code null} for none
   */
  public WorkflowMetadata setParameters(java.util.Map<String, java.lang.String> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Output only. Workflow start time.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Output only. Workflow start time.
   * @param startTime startTime or {@code null} for none
   */
  public WorkflowMetadata setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Output only. The workflow state.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The workflow state.
   * @param state state or {@code null} for none
   */
  public WorkflowMetadata setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The resource name of the workflow template as described in
   * https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates,
   * the resource name of the  template has the following format:
   * projects/{project_id}/regions/{region}/workflowTemplates/{template_id} For
   * projects.locations.workflowTemplates, the resource name of the  template has the following
   * format:  projects/{project_id}/locations/{location}/workflowTemplates/{template_id}
   * @return value or {@code null} for none
   */
  public java.lang.String getTemplate() {
    return template;
  }

  /**
   * Output only. The resource name of the workflow template as described in
   * https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates,
   * the resource name of the  template has the following format:
   * projects/{project_id}/regions/{region}/workflowTemplates/{template_id} For
   * projects.locations.workflowTemplates, the resource name of the  template has the following
   * format:  projects/{project_id}/locations/{location}/workflowTemplates/{template_id}
   * @param template template or {@code null} for none
   */
  public WorkflowMetadata setTemplate(java.lang.String template) {
    this.template = template;
    return this;
  }

  /**
   * Output only. The version of template at the time of workflow instantiation.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVersion() {
    return version;
  }

  /**
   * Output only. The version of template at the time of workflow instantiation.
   * @param version version or {@code null} for none
   */
  public WorkflowMetadata setVersion(java.lang.Integer version) {
    this.version = version;
    return this;
  }

  @Override
  public WorkflowMetadata set(String fieldName, Object value) {
    return (WorkflowMetadata) super.set(fieldName, value);
  }

  @Override
  public WorkflowMetadata clone() {
    return (WorkflowMetadata) super.clone();
  }

}

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

package com.google.api.services.cloudasset.v1.model;

/**
 * Cloud asset. This includes all Google Cloud Platform resources, Cloud IAM policies, and other
 * non-GCP assets.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Asset extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleIdentityAccesscontextmanagerV1AccessLevel accessLevel;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleIdentityAccesscontextmanagerV1AccessPolicy accessPolicy;

  /**
   * Asset's ancestry path in Cloud Resource Manager (CRM) hierarchy, represented as a list of
   * relative resource names. Ancestry path starts with the closest CRM ancestor and ends at root.
   * If the asset is a CRM project/folder/organization, this starts from the asset itself.
   *
   * Example: ["projects/123456789", "folders/5432", "organizations/1234"]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ancestors;

  /**
   * Type of the asset. Example: "compute.googleapis.com/Disk".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String assetType;

  /**
   * Representation of the actual Cloud IAM policy set on a cloud resource. For each resource, there
   * must be at most one Cloud IAM policy set on it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Policy iamPolicy;

  /**
   * The full name of the asset. For example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See
   * [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for
   * more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Representation of the Cloud Organization Policy set on an asset. For each asset, there could be
   * multiple Organization policies with different constraints.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudOrgpolicyV1Policy> orgPolicy;

  /**
   * Representation of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Resource resource;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleIdentityAccesscontextmanagerV1ServicePerimeter servicePerimeter;

  /**
   * @return value or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1AccessLevel getAccessLevel() {
    return accessLevel;
  }

  /**
   * @param accessLevel accessLevel or {@code null} for none
   */
  public Asset setAccessLevel(GoogleIdentityAccesscontextmanagerV1AccessLevel accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1AccessPolicy getAccessPolicy() {
    return accessPolicy;
  }

  /**
   * @param accessPolicy accessPolicy or {@code null} for none
   */
  public Asset setAccessPolicy(GoogleIdentityAccesscontextmanagerV1AccessPolicy accessPolicy) {
    this.accessPolicy = accessPolicy;
    return this;
  }

  /**
   * Asset's ancestry path in Cloud Resource Manager (CRM) hierarchy, represented as a list of
   * relative resource names. Ancestry path starts with the closest CRM ancestor and ends at root.
   * If the asset is a CRM project/folder/organization, this starts from the asset itself.
   *
   * Example: ["projects/123456789", "folders/5432", "organizations/1234"]
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAncestors() {
    return ancestors;
  }

  /**
   * Asset's ancestry path in Cloud Resource Manager (CRM) hierarchy, represented as a list of
   * relative resource names. Ancestry path starts with the closest CRM ancestor and ends at root.
   * If the asset is a CRM project/folder/organization, this starts from the asset itself.
   *
   * Example: ["projects/123456789", "folders/5432", "organizations/1234"]
   * @param ancestors ancestors or {@code null} for none
   */
  public Asset setAncestors(java.util.List<java.lang.String> ancestors) {
    this.ancestors = ancestors;
    return this;
  }

  /**
   * Type of the asset. Example: "compute.googleapis.com/Disk".
   * @return value or {@code null} for none
   */
  public java.lang.String getAssetType() {
    return assetType;
  }

  /**
   * Type of the asset. Example: "compute.googleapis.com/Disk".
   * @param assetType assetType or {@code null} for none
   */
  public Asset setAssetType(java.lang.String assetType) {
    this.assetType = assetType;
    return this;
  }

  /**
   * Representation of the actual Cloud IAM policy set on a cloud resource. For each resource, there
   * must be at most one Cloud IAM policy set on it.
   * @return value or {@code null} for none
   */
  public Policy getIamPolicy() {
    return iamPolicy;
  }

  /**
   * Representation of the actual Cloud IAM policy set on a cloud resource. For each resource, there
   * must be at most one Cloud IAM policy set on it.
   * @param iamPolicy iamPolicy or {@code null} for none
   */
  public Asset setIamPolicy(Policy iamPolicy) {
    this.iamPolicy = iamPolicy;
    return this;
  }

  /**
   * The full name of the asset. For example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See
   * [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for
   * more information.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The full name of the asset. For example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See
   * [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for
   * more information.
   * @param name name or {@code null} for none
   */
  public Asset setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Representation of the Cloud Organization Policy set on an asset. For each asset, there could be
   * multiple Organization policies with different constraints.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudOrgpolicyV1Policy> getOrgPolicy() {
    return orgPolicy;
  }

  /**
   * Representation of the Cloud Organization Policy set on an asset. For each asset, there could be
   * multiple Organization policies with different constraints.
   * @param orgPolicy orgPolicy or {@code null} for none
   */
  public Asset setOrgPolicy(java.util.List<GoogleCloudOrgpolicyV1Policy> orgPolicy) {
    this.orgPolicy = orgPolicy;
    return this;
  }

  /**
   * Representation of the resource.
   * @return value or {@code null} for none
   */
  public Resource getResource() {
    return resource;
  }

  /**
   * Representation of the resource.
   * @param resource resource or {@code null} for none
   */
  public Asset setResource(Resource resource) {
    this.resource = resource;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1ServicePerimeter getServicePerimeter() {
    return servicePerimeter;
  }

  /**
   * @param servicePerimeter servicePerimeter or {@code null} for none
   */
  public Asset setServicePerimeter(GoogleIdentityAccesscontextmanagerV1ServicePerimeter servicePerimeter) {
    this.servicePerimeter = servicePerimeter;
    return this;
  }

  @Override
  public Asset set(String fieldName, Object value) {
    return (Asset) super.set(fieldName, value);
  }

  @Override
  public Asset clone() {
    return (Asset) super.clone();
  }

}

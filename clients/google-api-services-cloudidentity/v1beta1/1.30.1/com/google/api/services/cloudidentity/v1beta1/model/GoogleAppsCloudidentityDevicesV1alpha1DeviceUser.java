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

package com.google.api.services.cloudidentity.v1beta1.model;

/**
 * Resource representing a user's use of a Device
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsCloudidentityDevicesV1alpha1DeviceUser extends com.google.api.client.json.GenericJson {

  /**
   * Compromised State of the DeviceUser object
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String compromisedState;

  /**
   * Output only. Most recent time when user registered with this service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String firstSyncTime;

  /**
   * Output only. Default locale used on device, in IETF BCP-47 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Output only. Last time when user synced with policies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastSyncTime;

  /**
   * Output only. Management state of the user on the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String managementState;

  /**
   * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the
   * DeviceUser in format: `devices/{device_id}/deviceUsers/{user_id}`, where user_id is the ID of
   * the user associated with the user session.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Password state of the DeviceUser object
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String passwordState;

  /**
   * Output only. User agent on the device for this specific user
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userAgent;

  /**
   * Email address of the user registered on the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userEmail;

  /**
   * Compromised State of the DeviceUser object
   * @return value or {@code null} for none
   */
  public java.lang.String getCompromisedState() {
    return compromisedState;
  }

  /**
   * Compromised State of the DeviceUser object
   * @param compromisedState compromisedState or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1DeviceUser setCompromisedState(java.lang.String compromisedState) {
    this.compromisedState = compromisedState;
    return this;
  }

  /**
   * Output only. Most recent time when user registered with this service.
   * @return value or {@code null} for none
   */
  public String getFirstSyncTime() {
    return firstSyncTime;
  }

  /**
   * Output only. Most recent time when user registered with this service.
   * @param firstSyncTime firstSyncTime or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1DeviceUser setFirstSyncTime(String firstSyncTime) {
    this.firstSyncTime = firstSyncTime;
    return this;
  }

  /**
   * Output only. Default locale used on device, in IETF BCP-47 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Output only. Default locale used on device, in IETF BCP-47 format.
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1DeviceUser setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Output only. Last time when user synced with policies.
   * @return value or {@code null} for none
   */
  public String getLastSyncTime() {
    return lastSyncTime;
  }

  /**
   * Output only. Last time when user synced with policies.
   * @param lastSyncTime lastSyncTime or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1DeviceUser setLastSyncTime(String lastSyncTime) {
    this.lastSyncTime = lastSyncTime;
    return this;
  }

  /**
   * Output only. Management state of the user on the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getManagementState() {
    return managementState;
  }

  /**
   * Output only. Management state of the user on the device.
   * @param managementState managementState or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1DeviceUser setManagementState(java.lang.String managementState) {
    this.managementState = managementState;
    return this;
  }

  /**
   * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the
   * DeviceUser in format: `devices/{device_id}/deviceUsers/{user_id}`, where user_id is the ID of
   * the user associated with the user session.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the
   * DeviceUser in format: `devices/{device_id}/deviceUsers/{user_id}`, where user_id is the ID of
   * the user associated with the user session.
   * @param name name or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1DeviceUser setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Password state of the DeviceUser object
   * @return value or {@code null} for none
   */
  public java.lang.String getPasswordState() {
    return passwordState;
  }

  /**
   * Password state of the DeviceUser object
   * @param passwordState passwordState or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1DeviceUser setPasswordState(java.lang.String passwordState) {
    this.passwordState = passwordState;
    return this;
  }

  /**
   * Output only. User agent on the device for this specific user
   * @return value or {@code null} for none
   */
  public java.lang.String getUserAgent() {
    return userAgent;
  }

  /**
   * Output only. User agent on the device for this specific user
   * @param userAgent userAgent or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1DeviceUser setUserAgent(java.lang.String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  /**
   * Email address of the user registered on the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserEmail() {
    return userEmail;
  }

  /**
   * Email address of the user registered on the device.
   * @param userEmail userEmail or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1alpha1DeviceUser setUserEmail(java.lang.String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  @Override
  public GoogleAppsCloudidentityDevicesV1alpha1DeviceUser set(String fieldName, Object value) {
    return (GoogleAppsCloudidentityDevicesV1alpha1DeviceUser) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsCloudidentityDevicesV1alpha1DeviceUser clone() {
    return (GoogleAppsCloudidentityDevicesV1alpha1DeviceUser) super.clone();
  }

}
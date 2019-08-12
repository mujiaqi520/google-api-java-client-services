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

package com.google.api.services.directory.model;

/**
 * JSON request template for firing commands on Mobile Device in Directory Devices API.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin Directory API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MobileDeviceAction extends com.google.api.client.json.GenericJson {

  /**
   * Action to be taken on the Mobile Device
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String action;

  /**
   * Action to be taken on the Mobile Device
   * @return value or {@code null} for none
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * Action to be taken on the Mobile Device
   * @param action action or {@code null} for none
   */
  public MobileDeviceAction setAction(java.lang.String action) {
    this.action = action;
    return this;
  }

  @Override
  public MobileDeviceAction set(String fieldName, Object value) {
    return (MobileDeviceAction) super.set(fieldName, value);
  }

  @Override
  public MobileDeviceAction clone() {
    return (MobileDeviceAction) super.clone();
  }

}

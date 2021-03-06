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

package com.google.api.services.gmailpostmastertools.v1beta1.model;

/**
 * Metric on a particular delivery error type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Gmail Postmaster Tools API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeliveryError extends com.google.api.client.json.GenericJson {

  /**
   * The class of delivery error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorClass;

  /**
   * The ratio of messages where the error occurred vs all authenticated traffic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double errorRatio;

  /**
   * The type of delivery error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorType;

  /**
   * The class of delivery error.
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorClass() {
    return errorClass;
  }

  /**
   * The class of delivery error.
   * @param errorClass errorClass or {@code null} for none
   */
  public DeliveryError setErrorClass(java.lang.String errorClass) {
    this.errorClass = errorClass;
    return this;
  }

  /**
   * The ratio of messages where the error occurred vs all authenticated traffic.
   * @return value or {@code null} for none
   */
  public java.lang.Double getErrorRatio() {
    return errorRatio;
  }

  /**
   * The ratio of messages where the error occurred vs all authenticated traffic.
   * @param errorRatio errorRatio or {@code null} for none
   */
  public DeliveryError setErrorRatio(java.lang.Double errorRatio) {
    this.errorRatio = errorRatio;
    return this;
  }

  /**
   * The type of delivery error.
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorType() {
    return errorType;
  }

  /**
   * The type of delivery error.
   * @param errorType errorType or {@code null} for none
   */
  public DeliveryError setErrorType(java.lang.String errorType) {
    this.errorType = errorType;
    return this;
  }

  @Override
  public DeliveryError set(String fieldName, Object value) {
    return (DeliveryError) super.set(fieldName, value);
  }

  @Override
  public DeliveryError clone() {
    return (DeliveryError) super.clone();
  }

}

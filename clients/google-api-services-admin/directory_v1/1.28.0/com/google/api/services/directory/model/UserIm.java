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
 * JSON template for instant messenger of an user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin Directory API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserIm extends com.google.api.client.json.GenericJson {

  /**
   * Custom protocol.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customProtocol;

  /**
   * Custom type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customType;

  /**
   * Instant messenger id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String im;

  /**
   * If this is user's primary im. Only one entry could be marked as primary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean primary;

  /**
   * Protocol used in the instant messenger. It should be one of the values from ImProtocolTypes
   * map. Similar to type, it can take a CUSTOM value and specify the custom name in customProtocol
   * field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String protocol;

  /**
   * Each entry can have a type which indicates standard types of that entry. For example instant
   * messengers could be of home, work etc. In addition to the standard type, an entry can have a
   * custom type and can take any value. Such types should have the CUSTOM value as type and also
   * have a customType value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Custom protocol.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomProtocol() {
    return customProtocol;
  }

  /**
   * Custom protocol.
   * @param customProtocol customProtocol or {@code null} for none
   */
  public UserIm setCustomProtocol(java.lang.String customProtocol) {
    this.customProtocol = customProtocol;
    return this;
  }

  /**
   * Custom type.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomType() {
    return customType;
  }

  /**
   * Custom type.
   * @param customType customType or {@code null} for none
   */
  public UserIm setCustomType(java.lang.String customType) {
    this.customType = customType;
    return this;
  }

  /**
   * Instant messenger id.
   * @return value or {@code null} for none
   */
  public java.lang.String getIm() {
    return im;
  }

  /**
   * Instant messenger id.
   * @param im im or {@code null} for none
   */
  public UserIm setIm(java.lang.String im) {
    this.im = im;
    return this;
  }

  /**
   * If this is user's primary im. Only one entry could be marked as primary.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPrimary() {
    return primary;
  }

  /**
   * If this is user's primary im. Only one entry could be marked as primary.
   * @param primary primary or {@code null} for none
   */
  public UserIm setPrimary(java.lang.Boolean primary) {
    this.primary = primary;
    return this;
  }

  /**
   * Protocol used in the instant messenger. It should be one of the values from ImProtocolTypes
   * map. Similar to type, it can take a CUSTOM value and specify the custom name in customProtocol
   * field.
   * @return value or {@code null} for none
   */
  public java.lang.String getProtocol() {
    return protocol;
  }

  /**
   * Protocol used in the instant messenger. It should be one of the values from ImProtocolTypes
   * map. Similar to type, it can take a CUSTOM value and specify the custom name in customProtocol
   * field.
   * @param protocol protocol or {@code null} for none
   */
  public UserIm setProtocol(java.lang.String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * Each entry can have a type which indicates standard types of that entry. For example instant
   * messengers could be of home, work etc. In addition to the standard type, an entry can have a
   * custom type and can take any value. Such types should have the CUSTOM value as type and also
   * have a customType value.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Each entry can have a type which indicates standard types of that entry. For example instant
   * messengers could be of home, work etc. In addition to the standard type, an entry can have a
   * custom type and can take any value. Such types should have the CUSTOM value as type and also
   * have a customType value.
   * @param type type or {@code null} for none
   */
  public UserIm setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public UserIm set(String fieldName, Object value) {
    return (UserIm) super.set(fieldName, value);
  }

  @Override
  public UserIm clone() {
    return (UserIm) super.clone();
  }

}

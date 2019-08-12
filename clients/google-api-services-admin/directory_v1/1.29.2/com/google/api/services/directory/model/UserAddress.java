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
 * JSON template for address.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin Directory API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserAddress extends com.google.api.client.json.GenericJson {

  /**
   * Country.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String country;

  /**
   * Country code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String countryCode;

  /**
   * Custom type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customType;

  /**
   * Extended Address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String extendedAddress;

  /**
   * Formatted address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formatted;

  /**
   * Locality.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locality;

  /**
   * Other parts of address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String poBox;

  /**
   * Postal code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postalCode;

  /**
   * If this is user's primary address. Only one entry could be marked as primary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean primary;

  /**
   * Region.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * User supplied address was structured. Structured addresses are NOT supported at this time. You
   * might be able to write structured addresses, but any values will eventually be clobbered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean sourceIsStructured;

  /**
   * Street.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String streetAddress;

  /**
   * Each entry can have a type which indicates standard values of that entry. For example address
   * could be of home, work etc. In addition to the standard type, an entry can have a custom type
   * and can take any value. Such type should have the CUSTOM value as type and also have a
   * customType value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Country.
   * @return value or {@code null} for none
   */
  public java.lang.String getCountry() {
    return country;
  }

  /**
   * Country.
   * @param country country or {@code null} for none
   */
  public UserAddress setCountry(java.lang.String country) {
    this.country = country;
    return this;
  }

  /**
   * Country code.
   * @return value or {@code null} for none
   */
  public java.lang.String getCountryCode() {
    return countryCode;
  }

  /**
   * Country code.
   * @param countryCode countryCode or {@code null} for none
   */
  public UserAddress setCountryCode(java.lang.String countryCode) {
    this.countryCode = countryCode;
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
  public UserAddress setCustomType(java.lang.String customType) {
    this.customType = customType;
    return this;
  }

  /**
   * Extended Address.
   * @return value or {@code null} for none
   */
  public java.lang.String getExtendedAddress() {
    return extendedAddress;
  }

  /**
   * Extended Address.
   * @param extendedAddress extendedAddress or {@code null} for none
   */
  public UserAddress setExtendedAddress(java.lang.String extendedAddress) {
    this.extendedAddress = extendedAddress;
    return this;
  }

  /**
   * Formatted address.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormatted() {
    return formatted;
  }

  /**
   * Formatted address.
   * @param formatted formatted or {@code null} for none
   */
  public UserAddress setFormatted(java.lang.String formatted) {
    this.formatted = formatted;
    return this;
  }

  /**
   * Locality.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocality() {
    return locality;
  }

  /**
   * Locality.
   * @param locality locality or {@code null} for none
   */
  public UserAddress setLocality(java.lang.String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * Other parts of address.
   * @return value or {@code null} for none
   */
  public java.lang.String getPoBox() {
    return poBox;
  }

  /**
   * Other parts of address.
   * @param poBox poBox or {@code null} for none
   */
  public UserAddress setPoBox(java.lang.String poBox) {
    this.poBox = poBox;
    return this;
  }

  /**
   * Postal code.
   * @return value or {@code null} for none
   */
  public java.lang.String getPostalCode() {
    return postalCode;
  }

  /**
   * Postal code.
   * @param postalCode postalCode or {@code null} for none
   */
  public UserAddress setPostalCode(java.lang.String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * If this is user's primary address. Only one entry could be marked as primary.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPrimary() {
    return primary;
  }

  /**
   * If this is user's primary address. Only one entry could be marked as primary.
   * @param primary primary or {@code null} for none
   */
  public UserAddress setPrimary(java.lang.Boolean primary) {
    this.primary = primary;
    return this;
  }

  /**
   * Region.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * Region.
   * @param region region or {@code null} for none
   */
  public UserAddress setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * User supplied address was structured. Structured addresses are NOT supported at this time. You
   * might be able to write structured addresses, but any values will eventually be clobbered.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSourceIsStructured() {
    return sourceIsStructured;
  }

  /**
   * User supplied address was structured. Structured addresses are NOT supported at this time. You
   * might be able to write structured addresses, but any values will eventually be clobbered.
   * @param sourceIsStructured sourceIsStructured or {@code null} for none
   */
  public UserAddress setSourceIsStructured(java.lang.Boolean sourceIsStructured) {
    this.sourceIsStructured = sourceIsStructured;
    return this;
  }

  /**
   * Street.
   * @return value or {@code null} for none
   */
  public java.lang.String getStreetAddress() {
    return streetAddress;
  }

  /**
   * Street.
   * @param streetAddress streetAddress or {@code null} for none
   */
  public UserAddress setStreetAddress(java.lang.String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  /**
   * Each entry can have a type which indicates standard values of that entry. For example address
   * could be of home, work etc. In addition to the standard type, an entry can have a custom type
   * and can take any value. Such type should have the CUSTOM value as type and also have a
   * customType value.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Each entry can have a type which indicates standard values of that entry. For example address
   * could be of home, work etc. In addition to the standard type, an entry can have a custom type
   * and can take any value. Such type should have the CUSTOM value as type and also have a
   * customType value.
   * @param type type or {@code null} for none
   */
  public UserAddress setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public UserAddress set(String fieldName, Object value) {
    return (UserAddress) super.set(fieldName, value);
  }

  @Override
  public UserAddress clone() {
    return (UserAddress) super.clone();
  }

}

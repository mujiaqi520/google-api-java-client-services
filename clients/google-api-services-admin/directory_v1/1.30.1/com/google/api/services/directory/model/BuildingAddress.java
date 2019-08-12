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
 * JSON template for the postal address of a building in Directory API.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin Directory API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuildingAddress extends com.google.api.client.json.GenericJson {

  /**
   * Unstructured address lines describing the lower levels of an address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> addressLines;

  /**
   * Optional. Highest administrative subdivision which is used for postal addresses of a country or
   * region.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String administrativeArea;

  /**
   * Optional. BCP-47 language code of the contents of this address (if known).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Optional. Generally refers to the city/town portion of the address. Examples: US city, IT
   * comune, UK post town. In regions of the world where localities are not well defined or do not
   * fit into this structure well, leave locality empty and use addressLines.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locality;

  /**
   * Optional. Postal code of the address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postalCode;

  /**
   * Required. CLDR region code of the country/region of the address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regionCode;

  /**
   * Optional. Sublocality of the address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sublocality;

  /**
   * Unstructured address lines describing the lower levels of an address.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAddressLines() {
    return addressLines;
  }

  /**
   * Unstructured address lines describing the lower levels of an address.
   * @param addressLines addressLines or {@code null} for none
   */
  public BuildingAddress setAddressLines(java.util.List<java.lang.String> addressLines) {
    this.addressLines = addressLines;
    return this;
  }

  /**
   * Optional. Highest administrative subdivision which is used for postal addresses of a country or
   * region.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdministrativeArea() {
    return administrativeArea;
  }

  /**
   * Optional. Highest administrative subdivision which is used for postal addresses of a country or
   * region.
   * @param administrativeArea administrativeArea or {@code null} for none
   */
  public BuildingAddress setAdministrativeArea(java.lang.String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

  /**
   * Optional. BCP-47 language code of the contents of this address (if known).
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Optional. BCP-47 language code of the contents of this address (if known).
   * @param languageCode languageCode or {@code null} for none
   */
  public BuildingAddress setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Optional. Generally refers to the city/town portion of the address. Examples: US city, IT
   * comune, UK post town. In regions of the world where localities are not well defined or do not
   * fit into this structure well, leave locality empty and use addressLines.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocality() {
    return locality;
  }

  /**
   * Optional. Generally refers to the city/town portion of the address. Examples: US city, IT
   * comune, UK post town. In regions of the world where localities are not well defined or do not
   * fit into this structure well, leave locality empty and use addressLines.
   * @param locality locality or {@code null} for none
   */
  public BuildingAddress setLocality(java.lang.String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * Optional. Postal code of the address.
   * @return value or {@code null} for none
   */
  public java.lang.String getPostalCode() {
    return postalCode;
  }

  /**
   * Optional. Postal code of the address.
   * @param postalCode postalCode or {@code null} for none
   */
  public BuildingAddress setPostalCode(java.lang.String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Required. CLDR region code of the country/region of the address.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegionCode() {
    return regionCode;
  }

  /**
   * Required. CLDR region code of the country/region of the address.
   * @param regionCode regionCode or {@code null} for none
   */
  public BuildingAddress setRegionCode(java.lang.String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  /**
   * Optional. Sublocality of the address.
   * @return value or {@code null} for none
   */
  public java.lang.String getSublocality() {
    return sublocality;
  }

  /**
   * Optional. Sublocality of the address.
   * @param sublocality sublocality or {@code null} for none
   */
  public BuildingAddress setSublocality(java.lang.String sublocality) {
    this.sublocality = sublocality;
    return this;
  }

  @Override
  public BuildingAddress set(String fieldName, Object value) {
    return (BuildingAddress) super.set(fieldName, value);
  }

  @Override
  public BuildingAddress clone() {
    return (BuildingAddress) super.clone();
  }

}

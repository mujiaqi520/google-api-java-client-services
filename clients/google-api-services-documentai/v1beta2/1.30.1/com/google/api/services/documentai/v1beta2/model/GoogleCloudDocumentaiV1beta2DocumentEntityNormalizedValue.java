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

package com.google.api.services.documentai.v1beta2.model;

/**
 * Parsed and normalized entity value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1beta2DocumentEntityNormalizedValue extends com.google.api.client.json.GenericJson {

  /**
   * Date value. Includes year, month, day. See also: https:
   * //github.com/googleapis/googleapis/blob/master/google/type/date.proto
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeDate dateValue;

  /**
   * DateTime value. Includes date, time, and timezone. See also: https:
   * //github.com/googleapis/googleapis/blob/ // master/google/type/datetime.proto
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeDateTime datetimeValue;

  /**
   * Money value. See also: https: //github.com/googleapis/googleapis/blob/ //
   * master/google/type/money.proto
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeMoney moneyValue;

  /**
   * Required. Normalized entity value stored as a string. This field is populated for supported
   * document type (e.g. Invoice). For some entity types, one of respective 'structured_value'
   * fields may also be populated. - Money/Currency type (`money_value`) is in the ISO 4217 text
   * format. - Date type (`date_value`) is in the ISO 8601 text format. - Datetime type
   * (`datetime_value`) is in the ISO 8601 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * Date value. Includes year, month, day. See also: https:
   * //github.com/googleapis/googleapis/blob/master/google/type/date.proto
   * @return value or {@code null} for none
   */
  public GoogleTypeDate getDateValue() {
    return dateValue;
  }

  /**
   * Date value. Includes year, month, day. See also: https:
   * //github.com/googleapis/googleapis/blob/master/google/type/date.proto
   * @param dateValue dateValue or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentEntityNormalizedValue setDateValue(GoogleTypeDate dateValue) {
    this.dateValue = dateValue;
    return this;
  }

  /**
   * DateTime value. Includes date, time, and timezone. See also: https:
   * //github.com/googleapis/googleapis/blob/ // master/google/type/datetime.proto
   * @return value or {@code null} for none
   */
  public GoogleTypeDateTime getDatetimeValue() {
    return datetimeValue;
  }

  /**
   * DateTime value. Includes date, time, and timezone. See also: https:
   * //github.com/googleapis/googleapis/blob/ // master/google/type/datetime.proto
   * @param datetimeValue datetimeValue or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentEntityNormalizedValue setDatetimeValue(GoogleTypeDateTime datetimeValue) {
    this.datetimeValue = datetimeValue;
    return this;
  }

  /**
   * Money value. See also: https: //github.com/googleapis/googleapis/blob/ //
   * master/google/type/money.proto
   * @return value or {@code null} for none
   */
  public GoogleTypeMoney getMoneyValue() {
    return moneyValue;
  }

  /**
   * Money value. See also: https: //github.com/googleapis/googleapis/blob/ //
   * master/google/type/money.proto
   * @param moneyValue moneyValue or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentEntityNormalizedValue setMoneyValue(GoogleTypeMoney moneyValue) {
    this.moneyValue = moneyValue;
    return this;
  }

  /**
   * Required. Normalized entity value stored as a string. This field is populated for supported
   * document type (e.g. Invoice). For some entity types, one of respective 'structured_value'
   * fields may also be populated. - Money/Currency type (`money_value`) is in the ISO 4217 text
   * format. - Date type (`date_value`) is in the ISO 8601 text format. - Datetime type
   * (`datetime_value`) is in the ISO 8601 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Required. Normalized entity value stored as a string. This field is populated for supported
   * document type (e.g. Invoice). For some entity types, one of respective 'structured_value'
   * fields may also be populated. - Money/Currency type (`money_value`) is in the ISO 4217 text
   * format. - Date type (`date_value`) is in the ISO 8601 text format. - Datetime type
   * (`datetime_value`) is in the ISO 8601 text format.
   * @param text text or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentEntityNormalizedValue setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentEntityNormalizedValue set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta2DocumentEntityNormalizedValue) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentEntityNormalizedValue clone() {
    return (GoogleCloudDocumentaiV1beta2DocumentEntityNormalizedValue) super.clone();
  }

}

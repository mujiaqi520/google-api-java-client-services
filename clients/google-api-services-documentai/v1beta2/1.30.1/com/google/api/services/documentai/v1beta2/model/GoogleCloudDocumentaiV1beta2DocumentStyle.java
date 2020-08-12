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
 * Annotation for common text style attributes. This adheres to CSS conventions as much as possible.
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
public final class GoogleCloudDocumentaiV1beta2DocumentStyle extends com.google.api.client.json.GenericJson {

  /**
   * Text background color.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeColor backgroundColor;

  /**
   * Text color.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeColor color;

  /**
   * Font size.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2DocumentStyleFontSize fontSize;

  /**
   * Font weight. Possible values are normal, bold, bolder, and lighter.
   * https://www.w3schools.com/cssref/pr_font_weight.asp
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fontWeight;

  /**
   * Text anchor indexing into the Document.text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2DocumentTextAnchor textAnchor;

  /**
   * Text decoration. Follows CSS standard. https://www.w3schools.com/cssref/pr_text_text-
   * decoration.asp
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String textDecoration;

  /**
   * Text style. Possible values are normal, italic, and oblique. https://www.w3schools.com/cssref
   * /pr_font_font-style.asp
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String textStyle;

  /**
   * Text background color.
   * @return value or {@code null} for none
   */
  public GoogleTypeColor getBackgroundColor() {
    return backgroundColor;
  }

  /**
   * Text background color.
   * @param backgroundColor backgroundColor or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentStyle setBackgroundColor(GoogleTypeColor backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * Text color.
   * @return value or {@code null} for none
   */
  public GoogleTypeColor getColor() {
    return color;
  }

  /**
   * Text color.
   * @param color color or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentStyle setColor(GoogleTypeColor color) {
    this.color = color;
    return this;
  }

  /**
   * Font size.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentStyleFontSize getFontSize() {
    return fontSize;
  }

  /**
   * Font size.
   * @param fontSize fontSize or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentStyle setFontSize(GoogleCloudDocumentaiV1beta2DocumentStyleFontSize fontSize) {
    this.fontSize = fontSize;
    return this;
  }

  /**
   * Font weight. Possible values are normal, bold, bolder, and lighter.
   * https://www.w3schools.com/cssref/pr_font_weight.asp
   * @return value or {@code null} for none
   */
  public java.lang.String getFontWeight() {
    return fontWeight;
  }

  /**
   * Font weight. Possible values are normal, bold, bolder, and lighter.
   * https://www.w3schools.com/cssref/pr_font_weight.asp
   * @param fontWeight fontWeight or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentStyle setFontWeight(java.lang.String fontWeight) {
    this.fontWeight = fontWeight;
    return this;
  }

  /**
   * Text anchor indexing into the Document.text.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentTextAnchor getTextAnchor() {
    return textAnchor;
  }

  /**
   * Text anchor indexing into the Document.text.
   * @param textAnchor textAnchor or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentStyle setTextAnchor(GoogleCloudDocumentaiV1beta2DocumentTextAnchor textAnchor) {
    this.textAnchor = textAnchor;
    return this;
  }

  /**
   * Text decoration. Follows CSS standard. https://www.w3schools.com/cssref/pr_text_text-
   * decoration.asp
   * @return value or {@code null} for none
   */
  public java.lang.String getTextDecoration() {
    return textDecoration;
  }

  /**
   * Text decoration. Follows CSS standard. https://www.w3schools.com/cssref/pr_text_text-
   * decoration.asp
   * @param textDecoration textDecoration or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentStyle setTextDecoration(java.lang.String textDecoration) {
    this.textDecoration = textDecoration;
    return this;
  }

  /**
   * Text style. Possible values are normal, italic, and oblique. https://www.w3schools.com/cssref
   * /pr_font_font-style.asp
   * @return value or {@code null} for none
   */
  public java.lang.String getTextStyle() {
    return textStyle;
  }

  /**
   * Text style. Possible values are normal, italic, and oblique. https://www.w3schools.com/cssref
   * /pr_font_font-style.asp
   * @param textStyle textStyle or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentStyle setTextStyle(java.lang.String textStyle) {
    this.textStyle = textStyle;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentStyle set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta2DocumentStyle) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentStyle clone() {
    return (GoogleCloudDocumentaiV1beta2DocumentStyle) super.clone();
  }

}

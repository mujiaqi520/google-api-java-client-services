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
 * Request to process one document.
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
public final class GoogleCloudDocumentaiV1beta2ProcessDocumentRequest extends com.google.api.client.json.GenericJson {

  /**
   * Controls AutoML model prediction behavior. AutoMlParams cannot be used together with other
   * Params.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2AutoMlParams automlParams;

  /**
   * Specifies a known document type for deeper structure detection. Valid values are currently
   * "general" and "invoice". If not provided, "general"\ is used as default. If any other value is
   * given, the request is rejected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String documentType;

  /**
   * Controls entity extraction behavior. If not specified, the system will decide reasonable
   * defaults.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2EntityExtractionParams entityExtractionParams;

  /**
   * Controls form extraction behavior. If not specified, the system will decide reasonable
   * defaults.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2FormExtractionParams formExtractionParams;

  /**
   * Required. Information about the input file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2InputConfig inputConfig;

  /**
   * Controls OCR behavior. If not specified, the system will decide reasonable defaults.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2OcrParams ocrParams;

  /**
   * The desired output location. This field is only needed in BatchProcessDocumentsRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2OutputConfig outputConfig;

  /**
   * Target project and location to make a call. Format: `projects/{project-id}/locations/{location-
   * id}`. If no location is specified, a region will be chosen automatically. This field is only
   * populated when used in ProcessDocument method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * Controls table extraction behavior. If not specified, the system will decide reasonable
   * defaults.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2TableExtractionParams tableExtractionParams;

  /**
   * Controls AutoML model prediction behavior. AutoMlParams cannot be used together with other
   * Params.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2AutoMlParams getAutomlParams() {
    return automlParams;
  }

  /**
   * Controls AutoML model prediction behavior. AutoMlParams cannot be used together with other
   * Params.
   * @param automlParams automlParams or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2ProcessDocumentRequest setAutomlParams(GoogleCloudDocumentaiV1beta2AutoMlParams automlParams) {
    this.automlParams = automlParams;
    return this;
  }

  /**
   * Specifies a known document type for deeper structure detection. Valid values are currently
   * "general" and "invoice". If not provided, "general"\ is used as default. If any other value is
   * given, the request is rejected.
   * @return value or {@code null} for none
   */
  public java.lang.String getDocumentType() {
    return documentType;
  }

  /**
   * Specifies a known document type for deeper structure detection. Valid values are currently
   * "general" and "invoice". If not provided, "general"\ is used as default. If any other value is
   * given, the request is rejected.
   * @param documentType documentType or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2ProcessDocumentRequest setDocumentType(java.lang.String documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * Controls entity extraction behavior. If not specified, the system will decide reasonable
   * defaults.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2EntityExtractionParams getEntityExtractionParams() {
    return entityExtractionParams;
  }

  /**
   * Controls entity extraction behavior. If not specified, the system will decide reasonable
   * defaults.
   * @param entityExtractionParams entityExtractionParams or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2ProcessDocumentRequest setEntityExtractionParams(GoogleCloudDocumentaiV1beta2EntityExtractionParams entityExtractionParams) {
    this.entityExtractionParams = entityExtractionParams;
    return this;
  }

  /**
   * Controls form extraction behavior. If not specified, the system will decide reasonable
   * defaults.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2FormExtractionParams getFormExtractionParams() {
    return formExtractionParams;
  }

  /**
   * Controls form extraction behavior. If not specified, the system will decide reasonable
   * defaults.
   * @param formExtractionParams formExtractionParams or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2ProcessDocumentRequest setFormExtractionParams(GoogleCloudDocumentaiV1beta2FormExtractionParams formExtractionParams) {
    this.formExtractionParams = formExtractionParams;
    return this;
  }

  /**
   * Required. Information about the input file.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2InputConfig getInputConfig() {
    return inputConfig;
  }

  /**
   * Required. Information about the input file.
   * @param inputConfig inputConfig or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2ProcessDocumentRequest setInputConfig(GoogleCloudDocumentaiV1beta2InputConfig inputConfig) {
    this.inputConfig = inputConfig;
    return this;
  }

  /**
   * Controls OCR behavior. If not specified, the system will decide reasonable defaults.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2OcrParams getOcrParams() {
    return ocrParams;
  }

  /**
   * Controls OCR behavior. If not specified, the system will decide reasonable defaults.
   * @param ocrParams ocrParams or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2ProcessDocumentRequest setOcrParams(GoogleCloudDocumentaiV1beta2OcrParams ocrParams) {
    this.ocrParams = ocrParams;
    return this;
  }

  /**
   * The desired output location. This field is only needed in BatchProcessDocumentsRequest.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2OutputConfig getOutputConfig() {
    return outputConfig;
  }

  /**
   * The desired output location. This field is only needed in BatchProcessDocumentsRequest.
   * @param outputConfig outputConfig or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2ProcessDocumentRequest setOutputConfig(GoogleCloudDocumentaiV1beta2OutputConfig outputConfig) {
    this.outputConfig = outputConfig;
    return this;
  }

  /**
   * Target project and location to make a call. Format: `projects/{project-id}/locations/{location-
   * id}`. If no location is specified, a region will be chosen automatically. This field is only
   * populated when used in ProcessDocument method.
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * Target project and location to make a call. Format: `projects/{project-id}/locations/{location-
   * id}`. If no location is specified, a region will be chosen automatically. This field is only
   * populated when used in ProcessDocument method.
   * @param parent parent or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2ProcessDocumentRequest setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Controls table extraction behavior. If not specified, the system will decide reasonable
   * defaults.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2TableExtractionParams getTableExtractionParams() {
    return tableExtractionParams;
  }

  /**
   * Controls table extraction behavior. If not specified, the system will decide reasonable
   * defaults.
   * @param tableExtractionParams tableExtractionParams or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2ProcessDocumentRequest setTableExtractionParams(GoogleCloudDocumentaiV1beta2TableExtractionParams tableExtractionParams) {
    this.tableExtractionParams = tableExtractionParams;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta2ProcessDocumentRequest set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta2ProcessDocumentRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta2ProcessDocumentRequest clone() {
    return (GoogleCloudDocumentaiV1beta2ProcessDocumentRequest) super.clone();
  }

}

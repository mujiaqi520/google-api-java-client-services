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
 * JSON template for Calendar Resource List Response object in Directory API.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin Directory API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CalendarResources extends com.google.api.client.json.GenericJson {

  /**
   * ETag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The CalendarResources in this page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CalendarResource> items;

  static {
    // hack to force ProGuard to consider CalendarResource used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CalendarResource.class);
  }

  /**
   * Identifies this as a collection of CalendarResources. This is always
   * admin#directory#resources#calendars#calendarResourcesList.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The continuation token, used to page through large result sets. Provide this value in a
   * subsequent request to return the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * ETag of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of the resource.
   * @param etag etag or {@code null} for none
   */
  public CalendarResources setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The CalendarResources in this page of results.
   * @return value or {@code null} for none
   */
  public java.util.List<CalendarResource> getItems() {
    return items;
  }

  /**
   * The CalendarResources in this page of results.
   * @param items items or {@code null} for none
   */
  public CalendarResources setItems(java.util.List<CalendarResource> items) {
    this.items = items;
    return this;
  }

  /**
   * Identifies this as a collection of CalendarResources. This is always
   * admin#directory#resources#calendars#calendarResourcesList.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies this as a collection of CalendarResources. This is always
   * admin#directory#resources#calendars#calendarResourcesList.
   * @param kind kind or {@code null} for none
   */
  public CalendarResources setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The continuation token, used to page through large result sets. Provide this value in a
   * subsequent request to return the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The continuation token, used to page through large result sets. Provide this value in a
   * subsequent request to return the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public CalendarResources setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public CalendarResources set(String fieldName, Object value) {
    return (CalendarResources) super.set(fieldName, value);
  }

  @Override
  public CalendarResources clone() {
    return (CalendarResources) super.clone();
  }

}

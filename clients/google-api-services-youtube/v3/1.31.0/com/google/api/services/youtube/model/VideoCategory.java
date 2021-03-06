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

package com.google.api.services.youtube.model;

/**
 * A *videoCategory* resource identifies a category that has been or could be associated with
 * uploaded videos.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoCategory extends com.google.api.client.json.GenericJson {

  /**
   * Etag of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The ID that YouTube uses to uniquely identify the video category.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "youtube#videoCategory".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The snippet object contains basic details about the video category, including its title.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VideoCategorySnippet snippet;

  /**
   * Etag of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Etag of this resource.
   * @param etag etag or {@code null} for none
   */
  public VideoCategory setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the video category.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID that YouTube uses to uniquely identify the video category.
   * @param id id or {@code null} for none
   */
  public VideoCategory setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "youtube#videoCategory".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "youtube#videoCategory".
   * @param kind kind or {@code null} for none
   */
  public VideoCategory setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The snippet object contains basic details about the video category, including its title.
   * @return value or {@code null} for none
   */
  public VideoCategorySnippet getSnippet() {
    return snippet;
  }

  /**
   * The snippet object contains basic details about the video category, including its title.
   * @param snippet snippet or {@code null} for none
   */
  public VideoCategory setSnippet(VideoCategorySnippet snippet) {
    this.snippet = snippet;
    return this;
  }

  @Override
  public VideoCategory set(String fieldName, Object value) {
    return (VideoCategory) super.set(fieldName, value);
  }

  @Override
  public VideoCategory clone() {
    return (VideoCategory) super.clone();
  }

}

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

package com.google.api.services.displayvideo.v1.model;

/**
 * The length an audio or a video has been played.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AudioVideoOffset extends com.google.api.client.json.GenericJson {

  /**
   * The offset in percentage of the audio or video duration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long percentage;

  /**
   * The offset in seconds from the start of the audio or video.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long seconds;

  /**
   * The offset in percentage of the audio or video duration.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPercentage() {
    return percentage;
  }

  /**
   * The offset in percentage of the audio or video duration.
   * @param percentage percentage or {@code null} for none
   */
  public AudioVideoOffset setPercentage(java.lang.Long percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * The offset in seconds from the start of the audio or video.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSeconds() {
    return seconds;
  }

  /**
   * The offset in seconds from the start of the audio or video.
   * @param seconds seconds or {@code null} for none
   */
  public AudioVideoOffset setSeconds(java.lang.Long seconds) {
    this.seconds = seconds;
    return this;
  }

  @Override
  public AudioVideoOffset set(String fieldName, Object value) {
    return (AudioVideoOffset) super.set(fieldName, value);
  }

  @Override
  public AudioVideoOffset clone() {
    return (AudioVideoOffset) super.clone();
  }

}

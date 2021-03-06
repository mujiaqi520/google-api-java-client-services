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

package com.google.api.services.dfareporting.model;

/**
 * FsCommand.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Campaign Manager 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FsCommand extends com.google.api.client.json.GenericJson {

  /**
   * Distance from the left of the browser.Applicable when positionOption is
   * DISTANCE_FROM_TOP_LEFT_CORNER.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer left;

  /**
   * Position in the browser where the window will open.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String positionOption;

  /**
   * Distance from the top of the browser. Applicable when positionOption is
   * DISTANCE_FROM_TOP_LEFT_CORNER.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer top;

  /**
   * Height of the window.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer windowHeight;

  /**
   * Width of the window.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer windowWidth;

  /**
   * Distance from the left of the browser.Applicable when positionOption is
   * DISTANCE_FROM_TOP_LEFT_CORNER.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLeft() {
    return left;
  }

  /**
   * Distance from the left of the browser.Applicable when positionOption is
   * DISTANCE_FROM_TOP_LEFT_CORNER.
   * @param left left or {@code null} for none
   */
  public FsCommand setLeft(java.lang.Integer left) {
    this.left = left;
    return this;
  }

  /**
   * Position in the browser where the window will open.
   * @return value or {@code null} for none
   */
  public java.lang.String getPositionOption() {
    return positionOption;
  }

  /**
   * Position in the browser where the window will open.
   * @param positionOption positionOption or {@code null} for none
   */
  public FsCommand setPositionOption(java.lang.String positionOption) {
    this.positionOption = positionOption;
    return this;
  }

  /**
   * Distance from the top of the browser. Applicable when positionOption is
   * DISTANCE_FROM_TOP_LEFT_CORNER.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTop() {
    return top;
  }

  /**
   * Distance from the top of the browser. Applicable when positionOption is
   * DISTANCE_FROM_TOP_LEFT_CORNER.
   * @param top top or {@code null} for none
   */
  public FsCommand setTop(java.lang.Integer top) {
    this.top = top;
    return this;
  }

  /**
   * Height of the window.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWindowHeight() {
    return windowHeight;
  }

  /**
   * Height of the window.
   * @param windowHeight windowHeight or {@code null} for none
   */
  public FsCommand setWindowHeight(java.lang.Integer windowHeight) {
    this.windowHeight = windowHeight;
    return this;
  }

  /**
   * Width of the window.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWindowWidth() {
    return windowWidth;
  }

  /**
   * Width of the window.
   * @param windowWidth windowWidth or {@code null} for none
   */
  public FsCommand setWindowWidth(java.lang.Integer windowWidth) {
    this.windowWidth = windowWidth;
    return this;
  }

  @Override
  public FsCommand set(String fieldName, Object value) {
    return (FsCommand) super.set(fieldName, value);
  }

  @Override
  public FsCommand clone() {
    return (FsCommand) super.clone();
  }

}

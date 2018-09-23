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

package com.google.classroom.model;

/**
 * Response when listing students.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Classroom API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListStudentsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Token identifying the next page of results to return. If empty, no further results are
   * available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Students who match the list request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Student> students;

  /**
   * Token identifying the next page of results to return. If empty, no further results are
   * available.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token identifying the next page of results to return. If empty, no further results are
   * available.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListStudentsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Students who match the list request.
   * @return value or {@code null} for none
   */
  public java.util.List<Student> getStudents() {
    return students;
  }

  /**
   * Students who match the list request.
   * @param students students or {@code null} for none
   */
  public ListStudentsResponse setStudents(java.util.List<Student> students) {
    this.students = students;
    return this;
  }

  @Override
  public ListStudentsResponse set(String fieldName, Object value) {
    return (ListStudentsResponse) super.set(fieldName, value);
  }

  @Override
  public ListStudentsResponse clone() {
    return (ListStudentsResponse) super.clone();
  }

}

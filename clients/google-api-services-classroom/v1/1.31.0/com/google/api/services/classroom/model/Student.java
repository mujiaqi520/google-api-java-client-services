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

package com.google.api.services.classroom.model;

/**
 * Student in a course.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Classroom API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Student extends com.google.api.client.json.GenericJson {

  /**
   * Identifier of the course. Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String courseId;

  /**
   * Global user information for the student. Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UserProfile profile;

  /**
   * Information about a Drive Folder for this student's work in this course. Only visible to the
   * student and domain administrators. Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DriveFolder studentWorkFolder;

  /**
   * Identifier of the user. When specified as a parameter of a request, this identifier can be one
   * of the following: * the numeric identifier for the user * the email address of the user * the
   * string literal `"me"`, indicating the requesting user
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userId;

  /**
   * Identifier of the course. Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getCourseId() {
    return courseId;
  }

  /**
   * Identifier of the course. Read-only.
   * @param courseId courseId or {@code null} for none
   */
  public Student setCourseId(java.lang.String courseId) {
    this.courseId = courseId;
    return this;
  }

  /**
   * Global user information for the student. Read-only.
   * @return value or {@code null} for none
   */
  public UserProfile getProfile() {
    return profile;
  }

  /**
   * Global user information for the student. Read-only.
   * @param profile profile or {@code null} for none
   */
  public Student setProfile(UserProfile profile) {
    this.profile = profile;
    return this;
  }

  /**
   * Information about a Drive Folder for this student's work in this course. Only visible to the
   * student and domain administrators. Read-only.
   * @return value or {@code null} for none
   */
  public DriveFolder getStudentWorkFolder() {
    return studentWorkFolder;
  }

  /**
   * Information about a Drive Folder for this student's work in this course. Only visible to the
   * student and domain administrators. Read-only.
   * @param studentWorkFolder studentWorkFolder or {@code null} for none
   */
  public Student setStudentWorkFolder(DriveFolder studentWorkFolder) {
    this.studentWorkFolder = studentWorkFolder;
    return this;
  }

  /**
   * Identifier of the user. When specified as a parameter of a request, this identifier can be one
   * of the following: * the numeric identifier for the user * the email address of the user * the
   * string literal `"me"`, indicating the requesting user
   * @return value or {@code null} for none
   */
  public java.lang.String getUserId() {
    return userId;
  }

  /**
   * Identifier of the user. When specified as a parameter of a request, this identifier can be one
   * of the following: * the numeric identifier for the user * the email address of the user * the
   * string literal `"me"`, indicating the requesting user
   * @param userId userId or {@code null} for none
   */
  public Student setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  @Override
  public Student set(String fieldName, Object value) {
    return (Student) super.set(fieldName, value);
  }

  @Override
  public Student clone() {
    return (Student) super.clone();
  }

}

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
 * JSON template for a POSIX account entry. Description of the field family: go/fbs-posix.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin Directory API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserPosixAccount extends com.google.api.client.json.GenericJson {

  /**
   * A POSIX account field identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountId;

  /**
   * The GECOS (user information) for this account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gecos;

  /**
   * The default group ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger gid;

  /**
   * The path to the home directory for this account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String homeDirectory;

  /**
   * The operating system type for this account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operatingSystemType;

  /**
   * If this is user's primary account within the SystemId.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean primary;

  /**
   * The path to the login shell for this account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shell;

  /**
   * System identifier for which account Username or Uid apply to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String systemId;

  /**
   * The POSIX compliant user ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger uid;

  /**
   * The username of the account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String username;

  /**
   * A POSIX account field identifier.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccountId() {
    return accountId;
  }

  /**
   * A POSIX account field identifier.
   * @param accountId accountId or {@code null} for none
   */
  public UserPosixAccount setAccountId(java.lang.String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The GECOS (user information) for this account.
   * @return value or {@code null} for none
   */
  public java.lang.String getGecos() {
    return gecos;
  }

  /**
   * The GECOS (user information) for this account.
   * @param gecos gecos or {@code null} for none
   */
  public UserPosixAccount setGecos(java.lang.String gecos) {
    this.gecos = gecos;
    return this;
  }

  /**
   * The default group ID.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getGid() {
    return gid;
  }

  /**
   * The default group ID.
   * @param gid gid or {@code null} for none
   */
  public UserPosixAccount setGid(java.math.BigInteger gid) {
    this.gid = gid;
    return this;
  }

  /**
   * The path to the home directory for this account.
   * @return value or {@code null} for none
   */
  public java.lang.String getHomeDirectory() {
    return homeDirectory;
  }

  /**
   * The path to the home directory for this account.
   * @param homeDirectory homeDirectory or {@code null} for none
   */
  public UserPosixAccount setHomeDirectory(java.lang.String homeDirectory) {
    this.homeDirectory = homeDirectory;
    return this;
  }

  /**
   * The operating system type for this account.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperatingSystemType() {
    return operatingSystemType;
  }

  /**
   * The operating system type for this account.
   * @param operatingSystemType operatingSystemType or {@code null} for none
   */
  public UserPosixAccount setOperatingSystemType(java.lang.String operatingSystemType) {
    this.operatingSystemType = operatingSystemType;
    return this;
  }

  /**
   * If this is user's primary account within the SystemId.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPrimary() {
    return primary;
  }

  /**
   * If this is user's primary account within the SystemId.
   * @param primary primary or {@code null} for none
   */
  public UserPosixAccount setPrimary(java.lang.Boolean primary) {
    this.primary = primary;
    return this;
  }

  /**
   * The path to the login shell for this account.
   * @return value or {@code null} for none
   */
  public java.lang.String getShell() {
    return shell;
  }

  /**
   * The path to the login shell for this account.
   * @param shell shell or {@code null} for none
   */
  public UserPosixAccount setShell(java.lang.String shell) {
    this.shell = shell;
    return this;
  }

  /**
   * System identifier for which account Username or Uid apply to.
   * @return value or {@code null} for none
   */
  public java.lang.String getSystemId() {
    return systemId;
  }

  /**
   * System identifier for which account Username or Uid apply to.
   * @param systemId systemId or {@code null} for none
   */
  public UserPosixAccount setSystemId(java.lang.String systemId) {
    this.systemId = systemId;
    return this;
  }

  /**
   * The POSIX compliant user ID.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getUid() {
    return uid;
  }

  /**
   * The POSIX compliant user ID.
   * @param uid uid or {@code null} for none
   */
  public UserPosixAccount setUid(java.math.BigInteger uid) {
    this.uid = uid;
    return this;
  }

  /**
   * The username of the account.
   * @return value or {@code null} for none
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * The username of the account.
   * @param username username or {@code null} for none
   */
  public UserPosixAccount setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  @Override
  public UserPosixAccount set(String fieldName, Object value) {
    return (UserPosixAccount) super.set(fieldName, value);
  }

  @Override
  public UserPosixAccount clone() {
    return (UserPosixAccount) super.clone();
  }

}

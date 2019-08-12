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
 * JSON template for an organization entry.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin Directory API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserOrganization extends com.google.api.client.json.GenericJson {

  /**
   * The cost center of the users department.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String costCenter;

  /**
   * Custom type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customType;

  /**
   * Department within the organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String department;

  /**
   * Description of the organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The domain to which the organization belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domain;

  /**
   * The full-time equivalent millipercent within the organization (100000 = 100%).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer fullTimeEquivalent;

  /**
   * Location of the organization. This need not be fully qualified address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * Name of the organization
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * If it user's primary organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean primary;

  /**
   * Symbol of the organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String symbol;

  /**
   * Title (designation) of the user in the organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Each entry can have a type which indicates standard types of that entry. For example
   * organization could be of school, work etc. In addition to the standard type, an entry can have
   * a custom type and can give it any name. Such types should have the CUSTOM value as type and
   * also have a CustomType value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The cost center of the users department.
   * @return value or {@code null} for none
   */
  public java.lang.String getCostCenter() {
    return costCenter;
  }

  /**
   * The cost center of the users department.
   * @param costCenter costCenter or {@code null} for none
   */
  public UserOrganization setCostCenter(java.lang.String costCenter) {
    this.costCenter = costCenter;
    return this;
  }

  /**
   * Custom type.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomType() {
    return customType;
  }

  /**
   * Custom type.
   * @param customType customType or {@code null} for none
   */
  public UserOrganization setCustomType(java.lang.String customType) {
    this.customType = customType;
    return this;
  }

  /**
   * Department within the organization.
   * @return value or {@code null} for none
   */
  public java.lang.String getDepartment() {
    return department;
  }

  /**
   * Department within the organization.
   * @param department department or {@code null} for none
   */
  public UserOrganization setDepartment(java.lang.String department) {
    this.department = department;
    return this;
  }

  /**
   * Description of the organization.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the organization.
   * @param description description or {@code null} for none
   */
  public UserOrganization setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The domain to which the organization belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getDomain() {
    return domain;
  }

  /**
   * The domain to which the organization belongs to.
   * @param domain domain or {@code null} for none
   */
  public UserOrganization setDomain(java.lang.String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The full-time equivalent millipercent within the organization (100000 = 100%).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getFullTimeEquivalent() {
    return fullTimeEquivalent;
  }

  /**
   * The full-time equivalent millipercent within the organization (100000 = 100%).
   * @param fullTimeEquivalent fullTimeEquivalent or {@code null} for none
   */
  public UserOrganization setFullTimeEquivalent(java.lang.Integer fullTimeEquivalent) {
    this.fullTimeEquivalent = fullTimeEquivalent;
    return this;
  }

  /**
   * Location of the organization. This need not be fully qualified address.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Location of the organization. This need not be fully qualified address.
   * @param location location or {@code null} for none
   */
  public UserOrganization setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * Name of the organization
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the organization
   * @param name name or {@code null} for none
   */
  public UserOrganization setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * If it user's primary organization.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPrimary() {
    return primary;
  }

  /**
   * If it user's primary organization.
   * @param primary primary or {@code null} for none
   */
  public UserOrganization setPrimary(java.lang.Boolean primary) {
    this.primary = primary;
    return this;
  }

  /**
   * Symbol of the organization.
   * @return value or {@code null} for none
   */
  public java.lang.String getSymbol() {
    return symbol;
  }

  /**
   * Symbol of the organization.
   * @param symbol symbol or {@code null} for none
   */
  public UserOrganization setSymbol(java.lang.String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Title (designation) of the user in the organization.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Title (designation) of the user in the organization.
   * @param title title or {@code null} for none
   */
  public UserOrganization setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Each entry can have a type which indicates standard types of that entry. For example
   * organization could be of school, work etc. In addition to the standard type, an entry can have
   * a custom type and can give it any name. Such types should have the CUSTOM value as type and
   * also have a CustomType value.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Each entry can have a type which indicates standard types of that entry. For example
   * organization could be of school, work etc. In addition to the standard type, an entry can have
   * a custom type and can give it any name. Such types should have the CUSTOM value as type and
   * also have a CustomType value.
   * @param type type or {@code null} for none
   */
  public UserOrganization setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public UserOrganization set(String fieldName, Object value) {
    return (UserOrganization) super.set(fieldName, value);
  }

  @Override
  public UserOrganization clone() {
    return (UserOrganization) super.clone();
  }

}

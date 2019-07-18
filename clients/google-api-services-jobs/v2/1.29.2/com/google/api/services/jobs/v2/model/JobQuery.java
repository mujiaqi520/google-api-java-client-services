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

package com.google.api.services.jobs.v2.model;

/**
 * Input only.
 *
 * The query required to perform a search query or histogram.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JobQuery extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The category filter specifies the categories of jobs to search against. See Category
   * for more information.
   *
   * If a value is not specified, jobs from any category are searched against.
   *
   * If multiple values are specified, jobs from any of the specified categories are searched
   * against.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> categories;

  /**
   * Optional. Allows filtering jobs by commute time with different travel methods (for  example,
   * driving or public transit). Note: This only works with COMMUTE  MODE. When specified,
   * [JobQuery.location_filters] is  ignored.
   *
   *  Currently we don't support sorting by commute time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CommutePreference commuteFilter;

  /**
   * Optional. This filter specifies the exact company display name of the jobs to search against.
   *
   * If a value isn't specified, jobs within the search results are associated with any company.
   *
   * If multiple values are specified, jobs within the search results may be associated with any of
   * the specified companies.
   *
   * At most 20 company display name filters are allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> companyDisplayNames;

  /**
   * Optional. This filter specifies the company entities to search against.
   *
   * If a value isn't specified, jobs are searched for against all companies.
   *
   * If multiple values are specified, jobs are searched against the companies specified.
   *
   * At most 20 company filters are allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> companyNames;

  /**
   * Optional. This search filter is applied only to Job.compensation_info. For example, if the
   * filter is specified as "Hourly job with per-hour compensation > $15", only jobs meeting these
   * criteria are searched. If a filter isn't defined, all open jobs are searched.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CompensationFilter compensationFilter;

  /**
   * Optional. This filter specifies a structured syntax to match against the Job.custom_attributes
   * marked as `filterable`.
   *
   * The syntax for this expression is a subset of Google SQL syntax.
   *
   * Supported operators are: =, !=, <, <=, >, >= where the left of the operator is a custom field
   * key and the right of the operator is a number or string (surrounded by quotes) value.
   *
   * Supported functions are LOWER() to perform case insensitive match and EMPTY() to filter on the
   * existence of a key.
   *
   * Boolean expressions (AND/OR/NOT) are supported up to 3 levels of nesting (for example, "((A AND
   * B AND C) OR NOT D) AND E"), a maximum of 50 comparisons/functions are allowed in the
   * expression. The expression must be < 2000 characters in length.
   *
   * Sample Query: (key1 = "TEST" OR LOWER(key1)="test" OR NOT EMPTY(key1)) AND key2 > 100
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customAttributeFilter;

  /**
   * Optional. This flag controls the spell-check feature. If false, the service attempts to correct
   * a misspelled query, for example, "enginee" is corrected to "engineer".
   *
   * Defaults to false: a spell check is performed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableSpellCheck;

  /**
   * Optional. The employment type filter specifies the employment type of jobs to search against,
   * such as EmploymentType.FULL_TIME.
   *
   * If a value is not specified, jobs in the search results include any employment type.
   *
   * If multiple values are specified, jobs in the search results include any of the specified
   * employment types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> employmentTypes;

  /**
   * Optional. This filter specifies the locale of jobs to search against, for example, "en-US".
   *
   * If a value isn't specified, the search results can contain jobs in any locale.
   *
   * Language codes should be in BCP-47 format, such as "en-US" or "sr-Latn". For more information,
   * see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   *
   * At most 10 language code filters are allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> languageCodes;

  /**
   * Optional. The location filter specifies geo-regions containing the jobs to search against. See
   * LocationFilter for more information.
   *
   * If a location value isn't specified, jobs fitting the other search criteria are retrieved
   * regardless of where they're located.
   *
   * If multiple values are specified, jobs are retrieved from any of the specified locations. If
   * different values are specified for the LocationFilter.distance_in_miles parameter, the maximum
   * provided distance is used for all locations.
   *
   * At most 5 location filters are allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LocationFilter> locationFilters;

  /**
   * Optional. Jobs published within a range specified by this filter are searched against, for
   * example, DateRange.PAST_MONTH. If a value isn't specified, all open jobs are searched against
   * regardless of their published date.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publishDateRange;

  /**
   * Optional. The query string that matches against the job title, description, and location
   * fields.
   *
   * The maximum query size is 255 bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * Optional. The category filter specifies the categories of jobs to search against. See Category
   * for more information.
   *
   * If a value is not specified, jobs from any category are searched against.
   *
   * If multiple values are specified, jobs from any of the specified categories are searched
   * against.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCategories() {
    return categories;
  }

  /**
   * Optional. The category filter specifies the categories of jobs to search against. See Category
   * for more information.
   *
   * If a value is not specified, jobs from any category are searched against.
   *
   * If multiple values are specified, jobs from any of the specified categories are searched
   * against.
   * @param categories categories or {@code null} for none
   */
  public JobQuery setCategories(java.util.List<java.lang.String> categories) {
    this.categories = categories;
    return this;
  }

  /**
   * Optional. Allows filtering jobs by commute time with different travel methods (for  example,
   * driving or public transit). Note: This only works with COMMUTE  MODE. When specified,
   * [JobQuery.location_filters] is  ignored.
   *
   *  Currently we don't support sorting by commute time.
   * @return value or {@code null} for none
   */
  public CommutePreference getCommuteFilter() {
    return commuteFilter;
  }

  /**
   * Optional. Allows filtering jobs by commute time with different travel methods (for  example,
   * driving or public transit). Note: This only works with COMMUTE  MODE. When specified,
   * [JobQuery.location_filters] is  ignored.
   *
   *  Currently we don't support sorting by commute time.
   * @param commuteFilter commuteFilter or {@code null} for none
   */
  public JobQuery setCommuteFilter(CommutePreference commuteFilter) {
    this.commuteFilter = commuteFilter;
    return this;
  }

  /**
   * Optional. This filter specifies the exact company display name of the jobs to search against.
   *
   * If a value isn't specified, jobs within the search results are associated with any company.
   *
   * If multiple values are specified, jobs within the search results may be associated with any of
   * the specified companies.
   *
   * At most 20 company display name filters are allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCompanyDisplayNames() {
    return companyDisplayNames;
  }

  /**
   * Optional. This filter specifies the exact company display name of the jobs to search against.
   *
   * If a value isn't specified, jobs within the search results are associated with any company.
   *
   * If multiple values are specified, jobs within the search results may be associated with any of
   * the specified companies.
   *
   * At most 20 company display name filters are allowed.
   * @param companyDisplayNames companyDisplayNames or {@code null} for none
   */
  public JobQuery setCompanyDisplayNames(java.util.List<java.lang.String> companyDisplayNames) {
    this.companyDisplayNames = companyDisplayNames;
    return this;
  }

  /**
   * Optional. This filter specifies the company entities to search against.
   *
   * If a value isn't specified, jobs are searched for against all companies.
   *
   * If multiple values are specified, jobs are searched against the companies specified.
   *
   * At most 20 company filters are allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCompanyNames() {
    return companyNames;
  }

  /**
   * Optional. This filter specifies the company entities to search against.
   *
   * If a value isn't specified, jobs are searched for against all companies.
   *
   * If multiple values are specified, jobs are searched against the companies specified.
   *
   * At most 20 company filters are allowed.
   * @param companyNames companyNames or {@code null} for none
   */
  public JobQuery setCompanyNames(java.util.List<java.lang.String> companyNames) {
    this.companyNames = companyNames;
    return this;
  }

  /**
   * Optional. This search filter is applied only to Job.compensation_info. For example, if the
   * filter is specified as "Hourly job with per-hour compensation > $15", only jobs meeting these
   * criteria are searched. If a filter isn't defined, all open jobs are searched.
   * @return value or {@code null} for none
   */
  public CompensationFilter getCompensationFilter() {
    return compensationFilter;
  }

  /**
   * Optional. This search filter is applied only to Job.compensation_info. For example, if the
   * filter is specified as "Hourly job with per-hour compensation > $15", only jobs meeting these
   * criteria are searched. If a filter isn't defined, all open jobs are searched.
   * @param compensationFilter compensationFilter or {@code null} for none
   */
  public JobQuery setCompensationFilter(CompensationFilter compensationFilter) {
    this.compensationFilter = compensationFilter;
    return this;
  }

  /**
   * Optional. This filter specifies a structured syntax to match against the Job.custom_attributes
   * marked as `filterable`.
   *
   * The syntax for this expression is a subset of Google SQL syntax.
   *
   * Supported operators are: =, !=, <, <=, >, >= where the left of the operator is a custom field
   * key and the right of the operator is a number or string (surrounded by quotes) value.
   *
   * Supported functions are LOWER() to perform case insensitive match and EMPTY() to filter on the
   * existence of a key.
   *
   * Boolean expressions (AND/OR/NOT) are supported up to 3 levels of nesting (for example, "((A AND
   * B AND C) OR NOT D) AND E"), a maximum of 50 comparisons/functions are allowed in the
   * expression. The expression must be < 2000 characters in length.
   *
   * Sample Query: (key1 = "TEST" OR LOWER(key1)="test" OR NOT EMPTY(key1)) AND key2 > 100
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomAttributeFilter() {
    return customAttributeFilter;
  }

  /**
   * Optional. This filter specifies a structured syntax to match against the Job.custom_attributes
   * marked as `filterable`.
   *
   * The syntax for this expression is a subset of Google SQL syntax.
   *
   * Supported operators are: =, !=, <, <=, >, >= where the left of the operator is a custom field
   * key and the right of the operator is a number or string (surrounded by quotes) value.
   *
   * Supported functions are LOWER() to perform case insensitive match and EMPTY() to filter on the
   * existence of a key.
   *
   * Boolean expressions (AND/OR/NOT) are supported up to 3 levels of nesting (for example, "((A AND
   * B AND C) OR NOT D) AND E"), a maximum of 50 comparisons/functions are allowed in the
   * expression. The expression must be < 2000 characters in length.
   *
   * Sample Query: (key1 = "TEST" OR LOWER(key1)="test" OR NOT EMPTY(key1)) AND key2 > 100
   * @param customAttributeFilter customAttributeFilter or {@code null} for none
   */
  public JobQuery setCustomAttributeFilter(java.lang.String customAttributeFilter) {
    this.customAttributeFilter = customAttributeFilter;
    return this;
  }

  /**
   * Optional. This flag controls the spell-check feature. If false, the service attempts to correct
   * a misspelled query, for example, "enginee" is corrected to "engineer".
   *
   * Defaults to false: a spell check is performed.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableSpellCheck() {
    return disableSpellCheck;
  }

  /**
   * Optional. This flag controls the spell-check feature. If false, the service attempts to correct
   * a misspelled query, for example, "enginee" is corrected to "engineer".
   *
   * Defaults to false: a spell check is performed.
   * @param disableSpellCheck disableSpellCheck or {@code null} for none
   */
  public JobQuery setDisableSpellCheck(java.lang.Boolean disableSpellCheck) {
    this.disableSpellCheck = disableSpellCheck;
    return this;
  }

  /**
   * Optional. The employment type filter specifies the employment type of jobs to search against,
   * such as EmploymentType.FULL_TIME.
   *
   * If a value is not specified, jobs in the search results include any employment type.
   *
   * If multiple values are specified, jobs in the search results include any of the specified
   * employment types.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEmploymentTypes() {
    return employmentTypes;
  }

  /**
   * Optional. The employment type filter specifies the employment type of jobs to search against,
   * such as EmploymentType.FULL_TIME.
   *
   * If a value is not specified, jobs in the search results include any employment type.
   *
   * If multiple values are specified, jobs in the search results include any of the specified
   * employment types.
   * @param employmentTypes employmentTypes or {@code null} for none
   */
  public JobQuery setEmploymentTypes(java.util.List<java.lang.String> employmentTypes) {
    this.employmentTypes = employmentTypes;
    return this;
  }

  /**
   * Optional. This filter specifies the locale of jobs to search against, for example, "en-US".
   *
   * If a value isn't specified, the search results can contain jobs in any locale.
   *
   * Language codes should be in BCP-47 format, such as "en-US" or "sr-Latn". For more information,
   * see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   *
   * At most 10 language code filters are allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLanguageCodes() {
    return languageCodes;
  }

  /**
   * Optional. This filter specifies the locale of jobs to search against, for example, "en-US".
   *
   * If a value isn't specified, the search results can contain jobs in any locale.
   *
   * Language codes should be in BCP-47 format, such as "en-US" or "sr-Latn". For more information,
   * see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   *
   * At most 10 language code filters are allowed.
   * @param languageCodes languageCodes or {@code null} for none
   */
  public JobQuery setLanguageCodes(java.util.List<java.lang.String> languageCodes) {
    this.languageCodes = languageCodes;
    return this;
  }

  /**
   * Optional. The location filter specifies geo-regions containing the jobs to search against. See
   * LocationFilter for more information.
   *
   * If a location value isn't specified, jobs fitting the other search criteria are retrieved
   * regardless of where they're located.
   *
   * If multiple values are specified, jobs are retrieved from any of the specified locations. If
   * different values are specified for the LocationFilter.distance_in_miles parameter, the maximum
   * provided distance is used for all locations.
   *
   * At most 5 location filters are allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<LocationFilter> getLocationFilters() {
    return locationFilters;
  }

  /**
   * Optional. The location filter specifies geo-regions containing the jobs to search against. See
   * LocationFilter for more information.
   *
   * If a location value isn't specified, jobs fitting the other search criteria are retrieved
   * regardless of where they're located.
   *
   * If multiple values are specified, jobs are retrieved from any of the specified locations. If
   * different values are specified for the LocationFilter.distance_in_miles parameter, the maximum
   * provided distance is used for all locations.
   *
   * At most 5 location filters are allowed.
   * @param locationFilters locationFilters or {@code null} for none
   */
  public JobQuery setLocationFilters(java.util.List<LocationFilter> locationFilters) {
    this.locationFilters = locationFilters;
    return this;
  }

  /**
   * Optional. Jobs published within a range specified by this filter are searched against, for
   * example, DateRange.PAST_MONTH. If a value isn't specified, all open jobs are searched against
   * regardless of their published date.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublishDateRange() {
    return publishDateRange;
  }

  /**
   * Optional. Jobs published within a range specified by this filter are searched against, for
   * example, DateRange.PAST_MONTH. If a value isn't specified, all open jobs are searched against
   * regardless of their published date.
   * @param publishDateRange publishDateRange or {@code null} for none
   */
  public JobQuery setPublishDateRange(java.lang.String publishDateRange) {
    this.publishDateRange = publishDateRange;
    return this;
  }

  /**
   * Optional. The query string that matches against the job title, description, and location
   * fields.
   *
   * The maximum query size is 255 bytes.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * Optional. The query string that matches against the job title, description, and location
   * fields.
   *
   * The maximum query size is 255 bytes.
   * @param query query or {@code null} for none
   */
  public JobQuery setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  @Override
  public JobQuery set(String fieldName, Object value) {
    return (JobQuery) super.set(fieldName, value);
  }

  @Override
  public JobQuery clone() {
    return (JobQuery) super.clone();
  }

}

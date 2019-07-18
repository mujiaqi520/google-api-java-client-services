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
 * A Company resource represents a company in the service. A company is the entity that owns job
 * listings, that is, the hiring entity responsible for employing applicants for the job position.
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
public final class Company extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The URL to employer's career site or careers page on the employer's web site.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String careerPageLink;

  /**
   * Optional. Identifiers external to the application that help to further identify the employer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CompanyInfoSource> companyInfoSources;

  /**
   * Optional. The employer's company size.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String companySize;

  /**
   * Deprecated. Do not use this field.
   *
   * Optional.
   *
   * This field is no longer used. Any value set to it is ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableLocationOptimization;

  /**
   * Required. The name of the employer to be displayed with the job, for example, "Google, LLC.".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. The unique company identifier provided by the client to identify an employer for
   * billing purposes. Recommended practice is to use the distributor_company_id.
   *
   * Defaults to same value as distributor_company_id when a value is not provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String distributorBillingCompanyId;

  /**
   * Required. A client's company identifier, used to uniquely identify the company. If an employer
   * has a subsidiary or sub-brand, such as "Alphabet" and "Google", which the client wishes to use
   * as the company displayed on the job. Best practice is to create a distinct company identifier
   * for each distinct brand displayed.
   *
   * The maximum number of allowed characters is 255.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String distributorCompanyId;

  /**
   * Optional. Equal Employment Opportunity legal disclaimer text to be associated with all jobs,
   * and typically to be displayed in all roles.
   *
   * The maximum number of allowed characters is 500.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eeoText;

  /**
   * Optional. Set to true if it is the hiring agency that post jobs for other employers.
   *
   * Defaults to false if not provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hiringAgency;

  /**
   * Optional. The street address of the company's main headquarters, which may be different from
   * the job location. The service attempts to geolocate the provided address, and populates a more
   * specific location wherever possible in structured_company_hq_location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hqLocation;

  /**
   * Optional. A URL that hosts the employer's company logo. If provided, the logo image should be
   * squared at 80x80 pixels.
   *
   * The url must be a Google Photos or Google Album url. Only images in these Google sub-domains
   * are accepted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageUrl;

  /**
   * Optional. A list of keys of filterable Job.custom_attributes, whose corresponding
   * `string_values` are used in keyword search. Jobs with `string_values` under these specified
   * field keys are returned if any of the values matches the search keyword. Custom field values
   * with parenthesis, brackets and special symbols might not be properly searchable, and those
   * keyword queries need to be surrounded by quotes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> keywordSearchableCustomAttributes;

  /**
   * Deprecated. Use keyword_searchable_custom_attributes instead.
   *
   * Optional.
   *
   * A list of filterable custom fields that should be used in keyword search. The jobs of this
   * company are returned if any of these custom fields matches the search keyword. Custom field
   * values with parenthesis, brackets and special symbols might not be properly searchable, and
   * those keyword queries need to be surrounded by quotes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> keywordSearchableCustomFields;

  /**
   * Required during company update.
   *
   * The resource name for a company. This is generated by the service when a company is created,
   * for example, "companies/0000aaaa-1111-bbbb-2222-cccc3333dddd".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. A structured headquarters location of the company, resolved from hq_location if
   * possible.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobLocation structuredCompanyHqLocation;

  /**
   * Output only. Indicates whether a company is flagged to be suspended from public availability by
   * the service when job content appears suspicious, abusive, or spammy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean suspended;

  /**
   * Deprecated. Use display_name instead.
   *
   * Required.
   *
   * The name of the employer to be displayed with the job, for example, "Google, LLC.".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Optional. The URL representing the company's primary web site or home page, such as,
   * "www.google.com".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String website;

  /**
   * Optional. The URL to employer's career site or careers page on the employer's web site.
   * @return value or {@code null} for none
   */
  public java.lang.String getCareerPageLink() {
    return careerPageLink;
  }

  /**
   * Optional. The URL to employer's career site or careers page on the employer's web site.
   * @param careerPageLink careerPageLink or {@code null} for none
   */
  public Company setCareerPageLink(java.lang.String careerPageLink) {
    this.careerPageLink = careerPageLink;
    return this;
  }

  /**
   * Optional. Identifiers external to the application that help to further identify the employer.
   * @return value or {@code null} for none
   */
  public java.util.List<CompanyInfoSource> getCompanyInfoSources() {
    return companyInfoSources;
  }

  /**
   * Optional. Identifiers external to the application that help to further identify the employer.
   * @param companyInfoSources companyInfoSources or {@code null} for none
   */
  public Company setCompanyInfoSources(java.util.List<CompanyInfoSource> companyInfoSources) {
    this.companyInfoSources = companyInfoSources;
    return this;
  }

  /**
   * Optional. The employer's company size.
   * @return value or {@code null} for none
   */
  public java.lang.String getCompanySize() {
    return companySize;
  }

  /**
   * Optional. The employer's company size.
   * @param companySize companySize or {@code null} for none
   */
  public Company setCompanySize(java.lang.String companySize) {
    this.companySize = companySize;
    return this;
  }

  /**
   * Deprecated. Do not use this field.
   *
   * Optional.
   *
   * This field is no longer used. Any value set to it is ignored.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableLocationOptimization() {
    return disableLocationOptimization;
  }

  /**
   * Deprecated. Do not use this field.
   *
   * Optional.
   *
   * This field is no longer used. Any value set to it is ignored.
   * @param disableLocationOptimization disableLocationOptimization or {@code null} for none
   */
  public Company setDisableLocationOptimization(java.lang.Boolean disableLocationOptimization) {
    this.disableLocationOptimization = disableLocationOptimization;
    return this;
  }

  /**
   * Required. The name of the employer to be displayed with the job, for example, "Google, LLC.".
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The name of the employer to be displayed with the job, for example, "Google, LLC.".
   * @param displayName displayName or {@code null} for none
   */
  public Company setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. The unique company identifier provided by the client to identify an employer for
   * billing purposes. Recommended practice is to use the distributor_company_id.
   *
   * Defaults to same value as distributor_company_id when a value is not provided.
   * @return value or {@code null} for none
   */
  public java.lang.String getDistributorBillingCompanyId() {
    return distributorBillingCompanyId;
  }

  /**
   * Optional. The unique company identifier provided by the client to identify an employer for
   * billing purposes. Recommended practice is to use the distributor_company_id.
   *
   * Defaults to same value as distributor_company_id when a value is not provided.
   * @param distributorBillingCompanyId distributorBillingCompanyId or {@code null} for none
   */
  public Company setDistributorBillingCompanyId(java.lang.String distributorBillingCompanyId) {
    this.distributorBillingCompanyId = distributorBillingCompanyId;
    return this;
  }

  /**
   * Required. A client's company identifier, used to uniquely identify the company. If an employer
   * has a subsidiary or sub-brand, such as "Alphabet" and "Google", which the client wishes to use
   * as the company displayed on the job. Best practice is to create a distinct company identifier
   * for each distinct brand displayed.
   *
   * The maximum number of allowed characters is 255.
   * @return value or {@code null} for none
   */
  public java.lang.String getDistributorCompanyId() {
    return distributorCompanyId;
  }

  /**
   * Required. A client's company identifier, used to uniquely identify the company. If an employer
   * has a subsidiary or sub-brand, such as "Alphabet" and "Google", which the client wishes to use
   * as the company displayed on the job. Best practice is to create a distinct company identifier
   * for each distinct brand displayed.
   *
   * The maximum number of allowed characters is 255.
   * @param distributorCompanyId distributorCompanyId or {@code null} for none
   */
  public Company setDistributorCompanyId(java.lang.String distributorCompanyId) {
    this.distributorCompanyId = distributorCompanyId;
    return this;
  }

  /**
   * Optional. Equal Employment Opportunity legal disclaimer text to be associated with all jobs,
   * and typically to be displayed in all roles.
   *
   * The maximum number of allowed characters is 500.
   * @return value or {@code null} for none
   */
  public java.lang.String getEeoText() {
    return eeoText;
  }

  /**
   * Optional. Equal Employment Opportunity legal disclaimer text to be associated with all jobs,
   * and typically to be displayed in all roles.
   *
   * The maximum number of allowed characters is 500.
   * @param eeoText eeoText or {@code null} for none
   */
  public Company setEeoText(java.lang.String eeoText) {
    this.eeoText = eeoText;
    return this;
  }

  /**
   * Optional. Set to true if it is the hiring agency that post jobs for other employers.
   *
   * Defaults to false if not provided.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHiringAgency() {
    return hiringAgency;
  }

  /**
   * Optional. Set to true if it is the hiring agency that post jobs for other employers.
   *
   * Defaults to false if not provided.
   * @param hiringAgency hiringAgency or {@code null} for none
   */
  public Company setHiringAgency(java.lang.Boolean hiringAgency) {
    this.hiringAgency = hiringAgency;
    return this;
  }

  /**
   * Optional. The street address of the company's main headquarters, which may be different from
   * the job location. The service attempts to geolocate the provided address, and populates a more
   * specific location wherever possible in structured_company_hq_location.
   * @return value or {@code null} for none
   */
  public java.lang.String getHqLocation() {
    return hqLocation;
  }

  /**
   * Optional. The street address of the company's main headquarters, which may be different from
   * the job location. The service attempts to geolocate the provided address, and populates a more
   * specific location wherever possible in structured_company_hq_location.
   * @param hqLocation hqLocation or {@code null} for none
   */
  public Company setHqLocation(java.lang.String hqLocation) {
    this.hqLocation = hqLocation;
    return this;
  }

  /**
   * Optional. A URL that hosts the employer's company logo. If provided, the logo image should be
   * squared at 80x80 pixels.
   *
   * The url must be a Google Photos or Google Album url. Only images in these Google sub-domains
   * are accepted.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUrl() {
    return imageUrl;
  }

  /**
   * Optional. A URL that hosts the employer's company logo. If provided, the logo image should be
   * squared at 80x80 pixels.
   *
   * The url must be a Google Photos or Google Album url. Only images in these Google sub-domains
   * are accepted.
   * @param imageUrl imageUrl or {@code null} for none
   */
  public Company setImageUrl(java.lang.String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Optional. A list of keys of filterable Job.custom_attributes, whose corresponding
   * `string_values` are used in keyword search. Jobs with `string_values` under these specified
   * field keys are returned if any of the values matches the search keyword. Custom field values
   * with parenthesis, brackets and special symbols might not be properly searchable, and those
   * keyword queries need to be surrounded by quotes.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getKeywordSearchableCustomAttributes() {
    return keywordSearchableCustomAttributes;
  }

  /**
   * Optional. A list of keys of filterable Job.custom_attributes, whose corresponding
   * `string_values` are used in keyword search. Jobs with `string_values` under these specified
   * field keys are returned if any of the values matches the search keyword. Custom field values
   * with parenthesis, brackets and special symbols might not be properly searchable, and those
   * keyword queries need to be surrounded by quotes.
   * @param keywordSearchableCustomAttributes keywordSearchableCustomAttributes or {@code null} for none
   */
  public Company setKeywordSearchableCustomAttributes(java.util.List<java.lang.String> keywordSearchableCustomAttributes) {
    this.keywordSearchableCustomAttributes = keywordSearchableCustomAttributes;
    return this;
  }

  /**
   * Deprecated. Use keyword_searchable_custom_attributes instead.
   *
   * Optional.
   *
   * A list of filterable custom fields that should be used in keyword search. The jobs of this
   * company are returned if any of these custom fields matches the search keyword. Custom field
   * values with parenthesis, brackets and special symbols might not be properly searchable, and
   * those keyword queries need to be surrounded by quotes.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getKeywordSearchableCustomFields() {
    return keywordSearchableCustomFields;
  }

  /**
   * Deprecated. Use keyword_searchable_custom_attributes instead.
   *
   * Optional.
   *
   * A list of filterable custom fields that should be used in keyword search. The jobs of this
   * company are returned if any of these custom fields matches the search keyword. Custom field
   * values with parenthesis, brackets and special symbols might not be properly searchable, and
   * those keyword queries need to be surrounded by quotes.
   * @param keywordSearchableCustomFields keywordSearchableCustomFields or {@code null} for none
   */
  public Company setKeywordSearchableCustomFields(java.util.List<java.lang.Integer> keywordSearchableCustomFields) {
    this.keywordSearchableCustomFields = keywordSearchableCustomFields;
    return this;
  }

  /**
   * Required during company update.
   *
   * The resource name for a company. This is generated by the service when a company is created,
   * for example, "companies/0000aaaa-1111-bbbb-2222-cccc3333dddd".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required during company update.
   *
   * The resource name for a company. This is generated by the service when a company is created,
   * for example, "companies/0000aaaa-1111-bbbb-2222-cccc3333dddd".
   * @param name name or {@code null} for none
   */
  public Company setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. A structured headquarters location of the company, resolved from hq_location if
   * possible.
   * @return value or {@code null} for none
   */
  public JobLocation getStructuredCompanyHqLocation() {
    return structuredCompanyHqLocation;
  }

  /**
   * Output only. A structured headquarters location of the company, resolved from hq_location if
   * possible.
   * @param structuredCompanyHqLocation structuredCompanyHqLocation or {@code null} for none
   */
  public Company setStructuredCompanyHqLocation(JobLocation structuredCompanyHqLocation) {
    this.structuredCompanyHqLocation = structuredCompanyHqLocation;
    return this;
  }

  /**
   * Output only. Indicates whether a company is flagged to be suspended from public availability by
   * the service when job content appears suspicious, abusive, or spammy.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSuspended() {
    return suspended;
  }

  /**
   * Output only. Indicates whether a company is flagged to be suspended from public availability by
   * the service when job content appears suspicious, abusive, or spammy.
   * @param suspended suspended or {@code null} for none
   */
  public Company setSuspended(java.lang.Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * Deprecated. Use display_name instead.
   *
   * Required.
   *
   * The name of the employer to be displayed with the job, for example, "Google, LLC.".
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Deprecated. Use display_name instead.
   *
   * Required.
   *
   * The name of the employer to be displayed with the job, for example, "Google, LLC.".
   * @param title title or {@code null} for none
   */
  public Company setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Optional. The URL representing the company's primary web site or home page, such as,
   * "www.google.com".
   * @return value or {@code null} for none
   */
  public java.lang.String getWebsite() {
    return website;
  }

  /**
   * Optional. The URL representing the company's primary web site or home page, such as,
   * "www.google.com".
   * @param website website or {@code null} for none
   */
  public Company setWebsite(java.lang.String website) {
    this.website = website;
    return this;
  }

  @Override
  public Company set(String fieldName, Object value) {
    return (Company) super.set(fieldName, value);
  }

  @Override
  public Company clone() {
    return (Company) super.clone();
  }

}

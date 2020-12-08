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

package com.google.api.services.jobs.v3.model;

/**
 * Input only. The Request of the CreateCompany method.
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
public final class CreateCompanyRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The company to be created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Company company;

  /**
   * Required. The company to be created.
   * @return value or {@code null} for none
   */
  public Company getCompany() {
    return company;
  }

  /**
   * Required. The company to be created.
   * @param company company or {@code null} for none
   */
  public CreateCompanyRequest setCompany(Company company) {
    this.company = company;
    return this;
  }

  @Override
  public CreateCompanyRequest set(String fieldName, Object value) {
    return (CreateCompanyRequest) super.set(fieldName, value);
  }

  @Override
  public CreateCompanyRequest clone() {
    return (CreateCompanyRequest) super.clone();
  }

}

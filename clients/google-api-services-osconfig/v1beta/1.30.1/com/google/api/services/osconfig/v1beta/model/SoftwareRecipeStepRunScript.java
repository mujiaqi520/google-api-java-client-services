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

package com.google.api.services.osconfig.v1beta.model;

/**
 * Runs a script through an interpreter.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SoftwareRecipeStepRunScript extends com.google.api.client.json.GenericJson {

  /**
   * Return codes that indicate that the software installed or updated successfully. Behaviour
   * defaults to [0]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> allowedExitCodes;

  /**
   * The script interpreter to use to run the script. If no interpreter is specified the script is
   * executed directly, which likely only succeed for scripts with [shebang
   * lines](https://en.wikipedia.org/wiki/Shebang_\(Unix\)).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String interpreter;

  /**
   * Required. The shell script to be executed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String script;

  /**
   * Return codes that indicate that the software installed or updated successfully. Behaviour
   * defaults to [0]
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getAllowedExitCodes() {
    return allowedExitCodes;
  }

  /**
   * Return codes that indicate that the software installed or updated successfully. Behaviour
   * defaults to [0]
   * @param allowedExitCodes allowedExitCodes or {@code null} for none
   */
  public SoftwareRecipeStepRunScript setAllowedExitCodes(java.util.List<java.lang.Integer> allowedExitCodes) {
    this.allowedExitCodes = allowedExitCodes;
    return this;
  }

  /**
   * The script interpreter to use to run the script. If no interpreter is specified the script is
   * executed directly, which likely only succeed for scripts with [shebang
   * lines](https://en.wikipedia.org/wiki/Shebang_\(Unix\)).
   * @return value or {@code null} for none
   */
  public java.lang.String getInterpreter() {
    return interpreter;
  }

  /**
   * The script interpreter to use to run the script. If no interpreter is specified the script is
   * executed directly, which likely only succeed for scripts with [shebang
   * lines](https://en.wikipedia.org/wiki/Shebang_\(Unix\)).
   * @param interpreter interpreter or {@code null} for none
   */
  public SoftwareRecipeStepRunScript setInterpreter(java.lang.String interpreter) {
    this.interpreter = interpreter;
    return this;
  }

  /**
   * Required. The shell script to be executed.
   * @return value or {@code null} for none
   */
  public java.lang.String getScript() {
    return script;
  }

  /**
   * Required. The shell script to be executed.
   * @param script script or {@code null} for none
   */
  public SoftwareRecipeStepRunScript setScript(java.lang.String script) {
    this.script = script;
    return this;
  }

  @Override
  public SoftwareRecipeStepRunScript set(String fieldName, Object value) {
    return (SoftwareRecipeStepRunScript) super.set(fieldName, value);
  }

  @Override
  public SoftwareRecipeStepRunScript clone() {
    return (SoftwareRecipeStepRunScript) super.clone();
  }

}
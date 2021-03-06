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

package com.google.api.services.compute.model;

/**
 * Model definition for StatefulPolicyPreservedStateDiskDevice.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StatefulPolicyPreservedStateDiskDevice extends com.google.api.client.json.GenericJson {

  /**
   * These stateful disks will never be deleted during autohealing, update or VM instance recreate
   * operations. This flag is used to configure if the disk should be deleted after it is no longer
   * used by the group, e.g. when the given instance or the whole group is deleted. Note: disks
   * attached in READ_ONLY mode cannot be auto-deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String autoDelete;

  /**
   * These stateful disks will never be deleted during autohealing, update or VM instance recreate
   * operations. This flag is used to configure if the disk should be deleted after it is no longer
   * used by the group, e.g. when the given instance or the whole group is deleted. Note: disks
   * attached in READ_ONLY mode cannot be auto-deleted.
   * @return value or {@code null} for none
   */
  public java.lang.String getAutoDelete() {
    return autoDelete;
  }

  /**
   * These stateful disks will never be deleted during autohealing, update or VM instance recreate
   * operations. This flag is used to configure if the disk should be deleted after it is no longer
   * used by the group, e.g. when the given instance or the whole group is deleted. Note: disks
   * attached in READ_ONLY mode cannot be auto-deleted.
   * @param autoDelete autoDelete or {@code null} for none
   */
  public StatefulPolicyPreservedStateDiskDevice setAutoDelete(java.lang.String autoDelete) {
    this.autoDelete = autoDelete;
    return this;
  }

  @Override
  public StatefulPolicyPreservedStateDiskDevice set(String fieldName, Object value) {
    return (StatefulPolicyPreservedStateDiskDevice) super.set(fieldName, value);
  }

  @Override
  public StatefulPolicyPreservedStateDiskDevice clone() {
    return (StatefulPolicyPreservedStateDiskDevice) super.clone();
  }

}

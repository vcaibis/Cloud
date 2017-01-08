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
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-12-13 18:16:55 UTC)
 * on 2017-01-08 at 23:23:31 UTC 
 * Modify at your own risk.
 */

package com.example.vincent.myapplication.backend.questionApi.model;

/**
 * Model definition for Answer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the questionApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Answer extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Question question;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * @param content content or {@code null} for none
   */
  public Answer setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public Answer setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Question getQuestion() {
    return question;
  }

  /**
   * @param question question or {@code null} for none
   */
  public Answer setQuestion(Question question) {
    this.question = question;
    return this;
  }

  @Override
  public Answer set(String fieldName, Object value) {
    return (Answer) super.set(fieldName, value);
  }

  @Override
  public Answer clone() {
    return (Answer) super.clone();
  }

}

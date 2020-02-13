/*
 * Domainrobot JSON API
 * Domainrobot JSON API for managing: Domains, SSL            Certificates, DNS and            much more.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.domainrobot.sdk.models.generated;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * SpamPolicy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T09:53:42.259+01:00")
public class SpamPolicy {
  @JsonProperty("modifySubject")
  private Boolean modifySubject = null;

  @JsonProperty("tagHeader")
  private Double tagHeader = null;

  @JsonProperty("spam")
  private Double spam = null;

  @JsonProperty("kill")
  private Double kill = null;

  @JsonProperty("quarantineDigestInterval")
  private Integer quarantineDigestInterval = null;

  public SpamPolicy modifySubject(Boolean modifySubject) {
    this.modifySubject = modifySubject;
    return this;
  }

   /**
   * Get modifySubject
   * @return modifySubject
  **/
  @ApiModelProperty(value = "")
  public Boolean isModifySubject() {
    return modifySubject;
  }

  public void setModifySubject(Boolean modifySubject) {
    this.modifySubject = modifySubject;
  }

  public SpamPolicy tagHeader(Double tagHeader) {
    this.tagHeader = tagHeader;
    return this;
  }

   /**
   * Get tagHeader
   * minimum: -999.9
   * maximum: 999.9
   * @return tagHeader
  **/
 @DecimalMin("-999.9") @DecimalMax("999.9")  @ApiModelProperty(value = "")
  public Double getTagHeader() {
    return tagHeader;
  }

  public void setTagHeader(Double tagHeader) {
    this.tagHeader = tagHeader;
  }

  public SpamPolicy spam(Double spam) {
    this.spam = spam;
    return this;
  }

   /**
   * Get spam
   * minimum: -999.9
   * maximum: 999.9
   * @return spam
  **/
 @DecimalMin("-999.9") @DecimalMax("999.9")  @ApiModelProperty(value = "")
  public Double getSpam() {
    return spam;
  }

  public void setSpam(Double spam) {
    this.spam = spam;
  }

  public SpamPolicy kill(Double kill) {
    this.kill = kill;
    return this;
  }

   /**
   * Get kill
   * minimum: -999.9
   * maximum: 999.9
   * @return kill
  **/
 @DecimalMin("-999.9") @DecimalMax("999.9")  @ApiModelProperty(value = "")
  public Double getKill() {
    return kill;
  }

  public void setKill(Double kill) {
    this.kill = kill;
  }

  public SpamPolicy quarantineDigestInterval(Integer quarantineDigestInterval) {
    this.quarantineDigestInterval = quarantineDigestInterval;
    return this;
  }

   /**
   * Get quarantineDigestInterval
   * minimum: 1440
   * @return quarantineDigestInterval
  **/
 @Min(1440)  @ApiModelProperty(value = "")
  public Integer getQuarantineDigestInterval() {
    return quarantineDigestInterval;
  }

  public void setQuarantineDigestInterval(Integer quarantineDigestInterval) {
    this.quarantineDigestInterval = quarantineDigestInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpamPolicy spamPolicy = (SpamPolicy) o;
    return Objects.equals(this.modifySubject, spamPolicy.modifySubject) &&
        Objects.equals(this.tagHeader, spamPolicy.tagHeader) &&
        Objects.equals(this.spam, spamPolicy.spam) &&
        Objects.equals(this.kill, spamPolicy.kill) &&
        Objects.equals(this.quarantineDigestInterval, spamPolicy.quarantineDigestInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifySubject, tagHeader, spam, kill, quarantineDigestInterval);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpamPolicy {\n");
    
    sb.append("    modifySubject: ").append(toIndentedString(modifySubject)).append("\n");
    sb.append("    tagHeader: ").append(toIndentedString(tagHeader)).append("\n");
    sb.append("    spam: ").append(toIndentedString(spam)).append("\n");
    sb.append("    kill: ").append(toIndentedString(kill)).append("\n");
    sb.append("    quarantineDigestInterval: ").append(toIndentedString(quarantineDigestInterval)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


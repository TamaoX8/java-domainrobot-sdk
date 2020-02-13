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
import org.domainrobot.sdk.models.generated.AuEligibilityIdTypeConstants;
import org.domainrobot.sdk.models.generated.AuEligibilityTypeConstants;
import org.domainrobot.sdk.models.generated.AuRegistrantIdTypeConstants;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ContactAuExtensions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T13:06:11.008+01:00")
public class ContactAuExtensions {
  @JsonProperty("eligibilityId")
  private String eligibilityId = null;

  @JsonProperty("eligibilityIdType")
  private AuEligibilityIdTypeConstants eligibilityIdType = null;

  @JsonProperty("eligibilityName")
  private String eligibilityName = null;

  @JsonProperty("eligibilityType")
  private AuEligibilityTypeConstants eligibilityType = null;

  @JsonProperty("policyReason")
  private Integer policyReason = null;

  @JsonProperty("registrantId")
  private String registrantId = null;

  @JsonProperty("registrantIdType")
  private AuRegistrantIdTypeConstants registrantIdType = null;

  @JsonProperty("registrantName")
  private String registrantName = null;

  public ContactAuExtensions eligibilityId(String eligibilityId) {
    this.eligibilityId = eligibilityId;
    return this;
  }

   /**
   * The corresponding ID number for the eligibility name if applicable, if in doubt just use the same details as your Registrant ID.
   * @return eligibilityId
  **/
  @ApiModelProperty(value = "The corresponding ID number for the eligibility name if applicable, if in doubt just use the same details as your Registrant ID.")
  public String getEligibilityId() {
    return eligibilityId;
  }

  public void setEligibilityId(String eligibilityId) {
    this.eligibilityId = eligibilityId;
  }

  public ContactAuExtensions eligibilityIdType(AuEligibilityIdTypeConstants eligibilityIdType) {
    this.eligibilityIdType = eligibilityIdType;
    return this;
  }

   /**
   * The type of Eligibility ID.
   * @return eligibilityIdType
  **/
  @Valid
  @ApiModelProperty(value = "The type of Eligibility ID.")
  public AuEligibilityIdTypeConstants getEligibilityIdType() {
    return eligibilityIdType;
  }

  public void setEligibilityIdType(AuEligibilityIdTypeConstants eligibilityIdType) {
    this.eligibilityIdType = eligibilityIdType;
  }

  public ContactAuExtensions eligibilityName(String eligibilityName) {
    this.eligibilityName = eligibilityName;
    return this;
  }

   /**
   *  This field is usually optional and whether it is required is determined by your policy reason for the domain registration, if in doubt just use the same details as your Registrant Name.
   * @return eligibilityName
  **/
  @ApiModelProperty(value = " This field is usually optional and whether it is required is determined by your policy reason for the domain registration, if in doubt just use the same details as your Registrant Name.")
  public String getEligibilityName() {
    return eligibilityName;
  }

  public void setEligibilityName(String eligibilityName) {
    this.eligibilityName = eligibilityName;
  }

  public ContactAuExtensions eligibilityType(AuEligibilityTypeConstants eligibilityType) {
    this.eligibilityType = eligibilityType;
    return this;
  }

   /**
   * The type of entity that the registrant is.
   * @return eligibilityType
  **/
  @Valid
  @ApiModelProperty(value = "The type of entity that the registrant is.")
  public AuEligibilityTypeConstants getEligibilityType() {
    return eligibilityType;
  }

  public void setEligibilityType(AuEligibilityTypeConstants eligibilityType) {
    this.eligibilityType = eligibilityType;
  }

  public ContactAuExtensions policyReason(Integer policyReason) {
    this.policyReason = policyReason;
    return this;
  }

   /**
   * Reason for eligibility.
   * @return policyReason
  **/
  @ApiModelProperty(value = "Reason for eligibility.")
  public Integer getPolicyReason() {
    return policyReason;
  }

  public void setPolicyReason(Integer policyReason) {
    this.policyReason = policyReason;
  }

  public ContactAuExtensions registrantId(String registrantId) {
    this.registrantId = registrantId;
    return this;
  }

   /**
   * Australian Business Number or Registered Business Number.
   * @return registrantId
  **/
  @ApiModelProperty(value = "Australian Business Number or Registered Business Number.")
  public String getRegistrantId() {
    return registrantId;
  }

  public void setRegistrantId(String registrantId) {
    this.registrantId = registrantId;
  }

  public ContactAuExtensions registrantIdType(AuRegistrantIdTypeConstants registrantIdType) {
    this.registrantIdType = registrantIdType;
    return this;
  }

   /**
   * Concerns the Registrant ID which you have selected in the Registrant ID form field.
   * @return registrantIdType
  **/
  @Valid
  @ApiModelProperty(value = "Concerns the Registrant ID which you have selected in the Registrant ID form field.")
  public AuRegistrantIdTypeConstants getRegistrantIdType() {
    return registrantIdType;
  }

  public void setRegistrantIdType(AuRegistrantIdTypeConstants registrantIdType) {
    this.registrantIdType = registrantIdType;
  }

  public ContactAuExtensions registrantName(String registrantName) {
    this.registrantName = registrantName;
    return this;
  }

   /**
   * The registrants name.
   * @return registrantName
  **/
  @ApiModelProperty(value = "The registrants name.")
  public String getRegistrantName() {
    return registrantName;
  }

  public void setRegistrantName(String registrantName) {
    this.registrantName = registrantName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactAuExtensions contactAuExtensions = (ContactAuExtensions) o;
    return Objects.equals(this.eligibilityId, contactAuExtensions.eligibilityId) &&
        Objects.equals(this.eligibilityIdType, contactAuExtensions.eligibilityIdType) &&
        Objects.equals(this.eligibilityName, contactAuExtensions.eligibilityName) &&
        Objects.equals(this.eligibilityType, contactAuExtensions.eligibilityType) &&
        Objects.equals(this.policyReason, contactAuExtensions.policyReason) &&
        Objects.equals(this.registrantId, contactAuExtensions.registrantId) &&
        Objects.equals(this.registrantIdType, contactAuExtensions.registrantIdType) &&
        Objects.equals(this.registrantName, contactAuExtensions.registrantName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligibilityId, eligibilityIdType, eligibilityName, eligibilityType, policyReason, registrantId, registrantIdType, registrantName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactAuExtensions {\n");
    
    sb.append("    eligibilityId: ").append(toIndentedString(eligibilityId)).append("\n");
    sb.append("    eligibilityIdType: ").append(toIndentedString(eligibilityIdType)).append("\n");
    sb.append("    eligibilityName: ").append(toIndentedString(eligibilityName)).append("\n");
    sb.append("    eligibilityType: ").append(toIndentedString(eligibilityType)).append("\n");
    sb.append("    policyReason: ").append(toIndentedString(policyReason)).append("\n");
    sb.append("    registrantId: ").append(toIndentedString(registrantId)).append("\n");
    sb.append("    registrantIdType: ").append(toIndentedString(registrantIdType)).append("\n");
    sb.append("    registrantName: ").append(toIndentedString(registrantName)).append("\n");
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


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
 * ContactJobsExtensions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T09:53:42.259+01:00")
public class ContactJobsExtensions {
  @JsonProperty("adminType")
  private Boolean adminType = null;

  @JsonProperty("contactTitle")
  private String contactTitle = null;

  @JsonProperty("hrMember")
  private Boolean hrMember = null;

  @JsonProperty("industryClass")
  private Integer industryClass = null;

  @JsonProperty("website")
  private String website = null;

  public ContactJobsExtensions adminType(Boolean adminType) {
    this.adminType = adminType;
    return this;
  }

   /**
   * Contact is the administrative contact with the permission to act as an independent agent / recruiter on behalf of the listed registrant.
   * @return adminType
  **/
  @ApiModelProperty(value = "Contact is the administrative contact with the permission to act as an independent agent / recruiter on behalf of the listed registrant.")
  public Boolean isAdminType() {
    return adminType;
  }

  public void setAdminType(Boolean adminType) {
    this.adminType = adminType;
  }

  public ContactJobsExtensions contactTitle(String contactTitle) {
    this.contactTitle = contactTitle;
    return this;
  }

   /**
   * Title of the domain contact in the organization.
   * @return contactTitle
  **/
  @ApiModelProperty(value = "Title of the domain contact in the organization.")
  public String getContactTitle() {
    return contactTitle;
  }

  public void setContactTitle(String contactTitle) {
    this.contactTitle = contactTitle;
  }

  public ContactJobsExtensions hrMember(Boolean hrMember) {
    this.hrMember = hrMember;
    return this;
  }

   /**
   * Choose whether the contact is is a member of the Human Resource Organization
   * @return hrMember
  **/
  @ApiModelProperty(value = "Choose whether the contact is is a member of the Human Resource Organization")
  public Boolean isHrMember() {
    return hrMember;
  }

  public void setHrMember(Boolean hrMember) {
    this.hrMember = hrMember;
  }

  public ContactJobsExtensions industryClass(Integer industryClass) {
    this.industryClass = industryClass;
    return this;
  }

   /**
   * The Industry class.
   * @return industryClass
  **/
  @ApiModelProperty(value = "The Industry class.")
  public Integer getIndustryClass() {
    return industryClass;
  }

  public void setIndustryClass(Integer industryClass) {
    this.industryClass = industryClass;
  }

  public ContactJobsExtensions website(String website) {
    this.website = website;
    return this;
  }

   /**
   * The Website.
   * @return website
  **/
  @ApiModelProperty(value = "The Website.")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactJobsExtensions contactJobsExtensions = (ContactJobsExtensions) o;
    return Objects.equals(this.adminType, contactJobsExtensions.adminType) &&
        Objects.equals(this.contactTitle, contactJobsExtensions.contactTitle) &&
        Objects.equals(this.hrMember, contactJobsExtensions.hrMember) &&
        Objects.equals(this.industryClass, contactJobsExtensions.industryClass) &&
        Objects.equals(this.website, contactJobsExtensions.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminType, contactTitle, hrMember, industryClass, website);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactJobsExtensions {\n");
    
    sb.append("    adminType: ").append(toIndentedString(adminType)).append("\n");
    sb.append("    contactTitle: ").append(toIndentedString(contactTitle)).append("\n");
    sb.append("    hrMember: ").append(toIndentedString(hrMember)).append("\n");
    sb.append("    industryClass: ").append(toIndentedString(industryClass)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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


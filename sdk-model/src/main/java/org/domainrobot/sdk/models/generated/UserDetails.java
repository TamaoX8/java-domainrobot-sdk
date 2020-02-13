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
 * UserDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T13:06:11.008+01:00")
public class UserDetails {
  @JsonProperty("organization")
  private String organization = null;

  @JsonProperty("passwordResetMobile")
  private String passwordResetMobile = null;

  @JsonProperty("passwordResetVerifyEmail")
  private String passwordResetVerifyEmail = null;

  @JsonProperty("passwordResetEmail")
  private String passwordResetEmail = null;

  @JsonProperty("fname")
  private String fname = null;

  @JsonProperty("lname")
  private String lname = null;

  public UserDetails organization(String organization) {
    this.organization = organization;
    return this;
  }

   /**
   * The organization.
   * @return organization
  **/
  @ApiModelProperty(value = "The organization.")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public UserDetails passwordResetMobile(String passwordResetMobile) {
    this.passwordResetMobile = passwordResetMobile;
    return this;
  }

   /**
   * The mobile phone number.
   * @return passwordResetMobile
  **/
  @ApiModelProperty(example = "+49-123-12345", value = "The mobile phone number.")
  public String getPasswordResetMobile() {
    return passwordResetMobile;
  }

  public void setPasswordResetMobile(String passwordResetMobile) {
    this.passwordResetMobile = passwordResetMobile;
  }

  public UserDetails passwordResetVerifyEmail(String passwordResetVerifyEmail) {
    this.passwordResetVerifyEmail = passwordResetVerifyEmail;
    return this;
  }

   /**
   * The email address for the verification of the password reset process.
   * @return passwordResetVerifyEmail
  **/
  @ApiModelProperty(value = "The email address for the verification of the password reset process.")
  public String getPasswordResetVerifyEmail() {
    return passwordResetVerifyEmail;
  }

  public void setPasswordResetVerifyEmail(String passwordResetVerifyEmail) {
    this.passwordResetVerifyEmail = passwordResetVerifyEmail;
  }

  public UserDetails passwordResetEmail(String passwordResetEmail) {
    this.passwordResetEmail = passwordResetEmail;
    return this;
  }

   /**
   * The email address for the password reset tan.
   * @return passwordResetEmail
  **/
  @ApiModelProperty(value = "The email address for the password reset tan.")
  public String getPasswordResetEmail() {
    return passwordResetEmail;
  }

  public void setPasswordResetEmail(String passwordResetEmail) {
    this.passwordResetEmail = passwordResetEmail;
  }

  public UserDetails fname(String fname) {
    this.fname = fname;
    return this;
  }

   /**
   * The first name.
   * @return fname
  **/
  @ApiModelProperty(value = "The first name.")
  public String getFname() {
    return fname;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }

  public UserDetails lname(String lname) {
    this.lname = lname;
    return this;
  }

   /**
   * The last name.
   * @return lname
  **/
  @ApiModelProperty(value = "The last name.")
  public String getLname() {
    return lname;
  }

  public void setLname(String lname) {
    this.lname = lname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDetails userDetails = (UserDetails) o;
    return Objects.equals(this.organization, userDetails.organization) &&
        Objects.equals(this.passwordResetMobile, userDetails.passwordResetMobile) &&
        Objects.equals(this.passwordResetVerifyEmail, userDetails.passwordResetVerifyEmail) &&
        Objects.equals(this.passwordResetEmail, userDetails.passwordResetEmail) &&
        Objects.equals(this.fname, userDetails.fname) &&
        Objects.equals(this.lname, userDetails.lname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organization, passwordResetMobile, passwordResetVerifyEmail, passwordResetEmail, fname, lname);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDetails {\n");
    
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    passwordResetMobile: ").append(toIndentedString(passwordResetMobile)).append("\n");
    sb.append("    passwordResetVerifyEmail: ").append(toIndentedString(passwordResetVerifyEmail)).append("\n");
    sb.append("    passwordResetEmail: ").append(toIndentedString(passwordResetEmail)).append("\n");
    sb.append("    fname: ").append(toIndentedString(fname)).append("\n");
    sb.append("    lname: ").append(toIndentedString(lname)).append("\n");
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


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
import java.util.Date;
import org.domainrobot.sdk.models.generated.GenericStatusConstants;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ContactVerificationDomain
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T13:06:11.008+01:00")
public class ContactVerificationDomain {
  @JsonProperty("created")
  private Date created = null;

  @JsonProperty("updated")
  private Date updated = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("idn")
  private String idn = null;

  @JsonProperty("status")
  private GenericStatusConstants status = null;

  @JsonProperty("deactivation")
  private Date deactivation = null;

  public ContactVerificationDomain created(Date created) {
    this.created = created;
    return this;
  }

   /**
   * The created date.
   * @return created
  **/
  @Valid
  @ApiModelProperty(value = "The created date.")
  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public ContactVerificationDomain updated(Date updated) {
    this.updated = updated;
    return this;
  }

   /**
   * The updated date.
   * @return updated
  **/
  @Valid
  @ApiModelProperty(value = "The updated date.")
  public Date getUpdated() {
    return updated;
  }

  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  public ContactVerificationDomain name(String name) {
    this.name = name;
    return this;
  }

   /**
   * the domain of the Verification
   * @return name
  **/
  @ApiModelProperty(value = "the domain of the Verification")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContactVerificationDomain idn(String idn) {
    this.idn = idn;
    return this;
  }

   /**
   * the idn domain
   * @return idn
  **/
  @ApiModelProperty(value = "the idn domain")
  public String getIdn() {
    return idn;
  }

  public void setIdn(String idn) {
    this.idn = idn;
  }

  public ContactVerificationDomain status(GenericStatusConstants status) {
    this.status = status;
    return this;
  }

   /**
   * the status of the domain Verification
   * @return status
  **/
  @Valid
  @ApiModelProperty(value = "the status of the domain Verification")
  public GenericStatusConstants getStatus() {
    return status;
  }

  public void setStatus(GenericStatusConstants status) {
    this.status = status;
  }

  public ContactVerificationDomain deactivation(Date deactivation) {
    this.deactivation = deactivation;
    return this;
  }

   /**
   * the deactivation of the domain Verification
   * @return deactivation
  **/
  @Valid
  @ApiModelProperty(value = "the deactivation of the domain Verification")
  public Date getDeactivation() {
    return deactivation;
  }

  public void setDeactivation(Date deactivation) {
    this.deactivation = deactivation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactVerificationDomain contactVerificationDomain = (ContactVerificationDomain) o;
    return Objects.equals(this.created, contactVerificationDomain.created) &&
        Objects.equals(this.updated, contactVerificationDomain.updated) &&
        Objects.equals(this.name, contactVerificationDomain.name) &&
        Objects.equals(this.idn, contactVerificationDomain.idn) &&
        Objects.equals(this.status, contactVerificationDomain.status) &&
        Objects.equals(this.deactivation, contactVerificationDomain.deactivation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, updated, name, idn, status, deactivation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactVerificationDomain {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    idn: ").append(toIndentedString(idn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    deactivation: ").append(toIndentedString(deactivation)).append("\n");
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


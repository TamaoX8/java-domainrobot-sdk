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
import org.domainrobot.sdk.models.generated.BasicUser;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * DomainSafeObject
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T09:53:42.259+01:00")
public class DomainSafeObject {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("idn")
  private String idn = null;

  @JsonProperty("owner")
  private BasicUser owner = null;

  @JsonProperty("updater")
  private BasicUser updater = null;

  @JsonProperty("updated")
  private Date updated = null;

  public DomainSafeObject type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the object.
   * @return type
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "The type of the object.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DomainSafeObject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the object.
   * @return name
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "The name of the object.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DomainSafeObject idn(String idn) {
    this.idn = idn;
    return this;
  }

   /**
   * The idn of the object.
   * @return idn
  **/
  @ApiModelProperty(value = "The idn of the object.")
  public String getIdn() {
    return idn;
  }

  public void setIdn(String idn) {
    this.idn = idn;
  }

  public DomainSafeObject owner(BasicUser owner) {
    this.owner = owner;
    return this;
  }

   /**
   * The owner of the object
   * @return owner
  **/
  @Valid
  @ApiModelProperty(value = "The owner of the object")
  public BasicUser getOwner() {
    return owner;
  }

  public void setOwner(BasicUser owner) {
    this.owner = owner;
  }

  public DomainSafeObject updater(BasicUser updater) {
    this.updater = updater;
    return this;
  }

   /**
   * The updating user of the object
   * @return updater
  **/
  @Valid
  @ApiModelProperty(value = "The updating user of the object")
  public BasicUser getUpdater() {
    return updater;
  }

  public void setUpdater(BasicUser updater) {
    this.updater = updater;
  }

  public DomainSafeObject updated(Date updated) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainSafeObject domainSafeObject = (DomainSafeObject) o;
    return Objects.equals(this.type, domainSafeObject.type) &&
        Objects.equals(this.name, domainSafeObject.name) &&
        Objects.equals(this.idn, domainSafeObject.idn) &&
        Objects.equals(this.owner, domainSafeObject.owner) &&
        Objects.equals(this.updater, domainSafeObject.updater) &&
        Objects.equals(this.updated, domainSafeObject.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, idn, owner, updater, updated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainSafeObject {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    idn: ").append(toIndentedString(idn)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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


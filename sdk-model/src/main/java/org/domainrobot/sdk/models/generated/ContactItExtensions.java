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
import org.domainrobot.sdk.models.generated.ItEntityTypeConstants;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ContactItExtensions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T09:53:42.259+01:00")
public class ContactItExtensions {
  @JsonProperty("entityType")
  private ItEntityTypeConstants entityType = null;

  public ContactItExtensions entityType(ItEntityTypeConstants entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * The number of the matching entity.
   * @return entityType
  **/
  @Valid
  @ApiModelProperty(value = "The number of the matching entity.")
  public ItEntityTypeConstants getEntityType() {
    return entityType;
  }

  public void setEntityType(ItEntityTypeConstants entityType) {
    this.entityType = entityType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactItExtensions contactItExtensions = (ContactItExtensions) o;
    return Objects.equals(this.entityType, contactItExtensions.entityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactItExtensions {\n");
    
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
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


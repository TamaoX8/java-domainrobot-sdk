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
 * WorkflowEvent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T13:06:11.008+01:00")
public class WorkflowEvent {
  @JsonProperty("vertex")
  private Integer vertex = null;

  @JsonProperty("type")
  private String type = null;

  public WorkflowEvent vertex(Integer vertex) {
    this.vertex = vertex;
    return this;
  }

   /**
   * Lorem Ipsum
   * @return vertex
  **/
  @ApiModelProperty(value = "Lorem Ipsum")
  public Integer getVertex() {
    return vertex;
  }

  public void setVertex(Integer vertex) {
    this.vertex = vertex;
  }

  public WorkflowEvent type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Lorem Ipsum
   * @return type
  **/
  @ApiModelProperty(value = "Lorem Ipsum")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowEvent workflowEvent = (WorkflowEvent) o;
    return Objects.equals(this.vertex, workflowEvent.vertex) &&
        Objects.equals(this.type, workflowEvent.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vertex, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowEvent {\n");
    
    sb.append("    vertex: ").append(toIndentedString(vertex)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


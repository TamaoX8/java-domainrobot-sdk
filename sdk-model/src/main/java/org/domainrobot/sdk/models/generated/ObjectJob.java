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
import java.util.ArrayList;
import java.util.List;
import org.domainrobot.sdk.models.generated.Job;
import org.domainrobot.sdk.models.generated.NiccomLog;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ObjectJob
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T09:53:42.259+01:00")
public class ObjectJob {
  @JsonProperty("job")
  private Job job = null;

  @JsonProperty("object")
  private List<NiccomLog> object = null;

  public ObjectJob job(Job job) {
    this.job = job;
    return this;
  }

   /**
   * The related job.
   * @return job
  **/
  @Valid
  @ApiModelProperty(value = "The related job.")
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  public ObjectJob object(List<NiccomLog> object) {
    this.object = object;
    return this;
  }

  public ObjectJob addObjectItem(NiccomLog objectItem) {
    if (this.object == null) {
      this.object = new ArrayList<NiccomLog>();
    }
    this.object.add(objectItem);
    return this;
  }

   /**
   * The object of the job or notify.
   * @return object
  **/
  @Valid
  @ApiModelProperty(value = "The object of the job or notify.")
  public List<NiccomLog> getObject() {
    return object;
  }

  public void setObject(List<NiccomLog> object) {
    this.object = object;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectJob objectJob = (ObjectJob) o;
    return Objects.equals(this.job, objectJob.job) &&
        Objects.equals(this.object, objectJob.object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, object);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectJob {\n");
    
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
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


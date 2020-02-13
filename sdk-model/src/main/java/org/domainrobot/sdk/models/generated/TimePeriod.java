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
import org.domainrobot.sdk.models.generated.TimeUnitConstants;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * TimePeriod
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T09:53:42.259+01:00")
public class TimePeriod {
  @JsonProperty("unit")
  private TimeUnitConstants unit = null;

  @JsonProperty("period")
  private Long period = null;

  public TimePeriod unit(TimeUnitConstants unit) {
    this.unit = unit;
    return this;
  }

   /**
   * The unit of the period
   * @return unit
  **/
  @Valid
  @ApiModelProperty(value = "The unit of the period")
  public TimeUnitConstants getUnit() {
    return unit;
  }

  public void setUnit(TimeUnitConstants unit) {
    this.unit = unit;
  }

  public TimePeriod period(Long period) {
    this.period = period;
    return this;
  }

   /**
   * The period value
   * @return period
  **/
  @ApiModelProperty(example = "1", value = "The period value")
  public Long getPeriod() {
    return period;
  }

  public void setPeriod(Long period) {
    this.period = period;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimePeriod timePeriod = (TimePeriod) o;
    return Objects.equals(this.unit, timePeriod.unit) &&
        Objects.equals(this.period, timePeriod.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, period);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimePeriod {\n");
    
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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


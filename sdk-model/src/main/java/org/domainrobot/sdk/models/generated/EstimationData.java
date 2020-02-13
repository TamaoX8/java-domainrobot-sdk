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
import org.domainrobot.sdk.models.generated.Currency;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * EstimationData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T09:53:42.259+01:00")
public class EstimationData {
  @JsonProperty("currency")
  private Currency currency = null;

  @JsonProperty("amount")
  private Double amount = null;

  public EstimationData currency(Currency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The currency
   * @return currency
  **/
  @Valid
  @ApiModelProperty(value = "The currency")
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public EstimationData amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount
   * @return amount
  **/
  @ApiModelProperty(value = "The amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstimationData estimationData = (EstimationData) o;
    return Objects.equals(this.currency, estimationData.currency) &&
        Objects.equals(this.amount, estimationData.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimationData {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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


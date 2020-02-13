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
import java.util.Date;
import java.util.List;
import org.domainrobot.sdk.models.generated.BasicUser;
import org.domainrobot.sdk.models.generated.Customer;
import org.domainrobot.sdk.models.generated.ExchangedPrice;
import org.domainrobot.sdk.models.generated.PriceServiceEntity;
import org.domainrobot.sdk.models.generated.PriceTypeConstants;
import org.domainrobot.sdk.models.generated.PriorityConstants;
import org.domainrobot.sdk.models.generated.TimePeriod;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ExchangedPrice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T09:53:42.259+01:00")
public class ExchangedPrice {
  @JsonProperty("created")
  private Date created = null;

  @JsonProperty("updated")
  private Date updated = null;

  @JsonProperty("owner")
  private BasicUser owner = null;

  @JsonProperty("updater")
  private BasicUser updater = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("type")
  private PriceTypeConstants type = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("priority")
  private PriorityConstants priority = null;

  @JsonProperty("customer")
  private Customer customer = null;

  @JsonProperty("period")
  private TimePeriod period = null;

  @JsonProperty("discountable")
  private Boolean discountable = null;

  @JsonProperty("logId")
  private Long logId = null;

  @JsonProperty("refund")
  private Integer refund = null;

  @JsonProperty("priceConditions")
  private List<PriceServiceEntity> priceConditions = null;

  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("normalPrice")
  private ExchangedPrice normalPrice = null;

  @JsonProperty("valid")
  private Date valid = null;

  @JsonProperty("vatRate")
  private Double vatRate = null;

  @JsonProperty("vatAmount")
  private Double vatAmount = null;

  @JsonProperty("rate")
  private Double rate = null;

  public ExchangedPrice created(Date created) {
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

  public ExchangedPrice updated(Date updated) {
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

  public ExchangedPrice owner(BasicUser owner) {
    this.owner = owner;
    return this;
  }

   /**
   * The owner of the object.
   * @return owner
  **/
  @Valid
  @ApiModelProperty(value = "The owner of the object.")
  public BasicUser getOwner() {
    return owner;
  }

  public void setOwner(BasicUser owner) {
    this.owner = owner;
  }

  public ExchangedPrice updater(BasicUser updater) {
    this.updater = updater;
    return this;
  }

   /**
   * The updating user of the object.
   * @return updater
  **/
  @Valid
  @ApiModelProperty(value = "The updating user of the object.")
  public BasicUser getUpdater() {
    return updater;
  }

  public void setUpdater(BasicUser updater) {
    this.updater = updater;
  }

  public ExchangedPrice amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Lorem Ipum
   * @return amount
  **/
  @ApiModelProperty(value = "Lorem Ipum")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public ExchangedPrice type(PriceTypeConstants type) {
    this.type = type;
    return this;
  }

   /**
   * Lorem Ipum
   * @return type
  **/
  @Valid
  @ApiModelProperty(value = "Lorem Ipum")
  public PriceTypeConstants getType() {
    return type;
  }

  public void setType(PriceTypeConstants type) {
    this.type = type;
  }

  public ExchangedPrice currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Lorem Ipsum
   * @return currency
  **/
  @NotNull
  @ApiModelProperty(example = "EUR", required = true, value = "Lorem Ipsum")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ExchangedPrice priority(PriorityConstants priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Lorem Ipum
   * @return priority
  **/
  @Valid
  @ApiModelProperty(value = "Lorem Ipum")
  public PriorityConstants getPriority() {
    return priority;
  }

  public void setPriority(PriorityConstants priority) {
    this.priority = priority;
  }

  public ExchangedPrice customer(Customer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Lorem Ipum
   * @return customer
  **/
  @Valid
  @ApiModelProperty(value = "Lorem Ipum")
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public ExchangedPrice period(TimePeriod period) {
    this.period = period;
    return this;
  }

   /**
   * Lorem Ipum
   * @return period
  **/
  @Valid
  @ApiModelProperty(value = "Lorem Ipum")
  public TimePeriod getPeriod() {
    return period;
  }

  public void setPeriod(TimePeriod period) {
    this.period = period;
  }

  public ExchangedPrice discountable(Boolean discountable) {
    this.discountable = discountable;
    return this;
  }

   /**
   * Lorem Ipum
   * @return discountable
  **/
  @ApiModelProperty(value = "Lorem Ipum")
  public Boolean isDiscountable() {
    return discountable;
  }

  public void setDiscountable(Boolean discountable) {
    this.discountable = discountable;
  }

  public ExchangedPrice logId(Long logId) {
    this.logId = logId;
    return this;
  }

   /**
   * Lorem Ipum
   * @return logId
  **/
  @ApiModelProperty(value = "Lorem Ipum")
  public Long getLogId() {
    return logId;
  }

  public void setLogId(Long logId) {
    this.logId = logId;
  }

  public ExchangedPrice refund(Integer refund) {
    this.refund = refund;
    return this;
  }

   /**
   * Lorem Ipum
   * @return refund
  **/
  @ApiModelProperty(value = "Lorem Ipum")
  public Integer getRefund() {
    return refund;
  }

  public void setRefund(Integer refund) {
    this.refund = refund;
  }

  public ExchangedPrice priceConditions(List<PriceServiceEntity> priceConditions) {
    this.priceConditions = priceConditions;
    return this;
  }

  public ExchangedPrice addPriceConditionsItem(PriceServiceEntity priceConditionsItem) {
    if (this.priceConditions == null) {
      this.priceConditions = new ArrayList<PriceServiceEntity>();
    }
    this.priceConditions.add(priceConditionsItem);
    return this;
  }

   /**
   * Lorem Ipum
   * @return priceConditions
  **/
  @Valid
  @ApiModelProperty(value = "Lorem Ipum")
  public List<PriceServiceEntity> getPriceConditions() {
    return priceConditions;
  }

  public void setPriceConditions(List<PriceServiceEntity> priceConditions) {
    this.priceConditions = priceConditions;
  }

  public ExchangedPrice comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Lorem Ipum
   * @return comment
  **/
  @ApiModelProperty(value = "Lorem Ipum")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public ExchangedPrice normalPrice(ExchangedPrice normalPrice) {
    this.normalPrice = normalPrice;
    return this;
  }

   /**
   * Lorem Ipum
   * @return normalPrice
  **/
  @Valid
  @ApiModelProperty(value = "Lorem Ipum")
  public ExchangedPrice getNormalPrice() {
    return normalPrice;
  }

  public void setNormalPrice(ExchangedPrice normalPrice) {
    this.normalPrice = normalPrice;
  }

  public ExchangedPrice valid(Date valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Lorem Ipum
   * @return valid
  **/
  @Valid
  @ApiModelProperty(value = "Lorem Ipum")
  public Date getValid() {
    return valid;
  }

  public void setValid(Date valid) {
    this.valid = valid;
  }

  public ExchangedPrice vatRate(Double vatRate) {
    this.vatRate = vatRate;
    return this;
  }

   /**
   * Lorem Ipsum
   * @return vatRate
  **/
  @ApiModelProperty(value = "Lorem Ipsum")
  public Double getVatRate() {
    return vatRate;
  }

  public void setVatRate(Double vatRate) {
    this.vatRate = vatRate;
  }

  public ExchangedPrice vatAmount(Double vatAmount) {
    this.vatAmount = vatAmount;
    return this;
  }

   /**
   * Lorem Ipsum
   * @return vatAmount
  **/
  @ApiModelProperty(value = "Lorem Ipsum")
  public Double getVatAmount() {
    return vatAmount;
  }

  public void setVatAmount(Double vatAmount) {
    this.vatAmount = vatAmount;
  }

  public ExchangedPrice rate(Double rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Lorem Ipsum
   * @return rate
  **/
  @ApiModelProperty(value = "Lorem Ipsum")
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangedPrice exchangedPrice = (ExchangedPrice) o;
    return Objects.equals(this.created, exchangedPrice.created) &&
        Objects.equals(this.updated, exchangedPrice.updated) &&
        Objects.equals(this.owner, exchangedPrice.owner) &&
        Objects.equals(this.updater, exchangedPrice.updater) &&
        Objects.equals(this.amount, exchangedPrice.amount) &&
        Objects.equals(this.type, exchangedPrice.type) &&
        Objects.equals(this.currency, exchangedPrice.currency) &&
        Objects.equals(this.priority, exchangedPrice.priority) &&
        Objects.equals(this.customer, exchangedPrice.customer) &&
        Objects.equals(this.period, exchangedPrice.period) &&
        Objects.equals(this.discountable, exchangedPrice.discountable) &&
        Objects.equals(this.logId, exchangedPrice.logId) &&
        Objects.equals(this.refund, exchangedPrice.refund) &&
        Objects.equals(this.priceConditions, exchangedPrice.priceConditions) &&
        Objects.equals(this.comment, exchangedPrice.comment) &&
        Objects.equals(this.normalPrice, exchangedPrice.normalPrice) &&
        Objects.equals(this.valid, exchangedPrice.valid) &&
        Objects.equals(this.vatRate, exchangedPrice.vatRate) &&
        Objects.equals(this.vatAmount, exchangedPrice.vatAmount) &&
        Objects.equals(this.rate, exchangedPrice.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, updated, owner, updater, amount, type, currency, priority, customer, period, discountable, logId, refund, priceConditions, comment, normalPrice, valid, vatRate, vatAmount, rate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangedPrice {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    discountable: ").append(toIndentedString(discountable)).append("\n");
    sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
    sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
    sb.append("    priceConditions: ").append(toIndentedString(priceConditions)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    normalPrice: ").append(toIndentedString(normalPrice)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    vatRate: ").append(toIndentedString(vatRate)).append("\n");
    sb.append("    vatAmount: ").append(toIndentedString(vatAmount)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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


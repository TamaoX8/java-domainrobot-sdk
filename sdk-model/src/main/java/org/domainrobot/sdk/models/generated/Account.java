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
import org.domainrobot.sdk.models.generated.CurrencyRate;
import org.domainrobot.sdk.models.generated.GenericCustomer;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Account
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T13:06:11.008+01:00")
public class Account {
  @JsonProperty("customer")
  private GenericCustomer customer = null;

  @JsonProperty("currentAccountBalance")
  private Double currentAccountBalance = null;

  @JsonProperty("runningTotal")
  private Double runningTotal = null;

  @JsonProperty("creditLimit")
  private Double creditLimit = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("minRunningTotalNotification")
  private Double minRunningTotalNotification = null;

  @JsonProperty("minRunningTotalNotificationEmail")
  private String minRunningTotalNotificationEmail = null;

  @JsonProperty("created")
  private Date created = null;

  @JsonProperty("updated")
  private Date updated = null;

  @JsonProperty("view")
  private CurrencyRate view = null;

  public Account customer(GenericCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * The customer itself
   * @return customer
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "The customer itself")
  public GenericCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(GenericCustomer customer) {
    this.customer = customer;
  }

  public Account currentAccountBalance(Double currentAccountBalance) {
    this.currentAccountBalance = currentAccountBalance;
    return this;
  }

   /**
   * The real account balance
   * @return currentAccountBalance
  **/
  @ApiModelProperty(value = "The real account balance")
  public Double getCurrentAccountBalance() {
    return currentAccountBalance;
  }

  public void setCurrentAccountBalance(Double currentAccountBalance) {
    this.currentAccountBalance = currentAccountBalance;
  }

  public Account runningTotal(Double runningTotal) {
    this.runningTotal = runningTotal;
    return this;
  }

   /**
   * The current total, the amount of all finished and unfinished transactions
   * @return runningTotal
  **/
  @ApiModelProperty(value = "The current total, the amount of all finished and unfinished transactions")
  public Double getRunningTotal() {
    return runningTotal;
  }

  public void setRunningTotal(Double runningTotal) {
    this.runningTotal = runningTotal;
  }

  public Account creditLimit(Double creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

   /**
   * The credit limit of the account.
   * @return creditLimit
  **/
  @ApiModelProperty(value = "The credit limit of the account.")
  public Double getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(Double creditLimit) {
    this.creditLimit = creditLimit;
  }

  public Account currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the account
   * @return currency
  **/
  @ApiModelProperty(example = "EUR", value = "The currency of the account")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Account minRunningTotalNotification(Double minRunningTotalNotification) {
    this.minRunningTotalNotification = minRunningTotalNotification;
    return this;
  }

   /**
   * The minimum running total amount if a notification should be send
   * @return minRunningTotalNotification
  **/
  @ApiModelProperty(value = "The minimum running total amount if a notification should be send")
  public Double getMinRunningTotalNotification() {
    return minRunningTotalNotification;
  }

  public void setMinRunningTotalNotification(Double minRunningTotalNotification) {
    this.minRunningTotalNotification = minRunningTotalNotification;
  }

  public Account minRunningTotalNotificationEmail(String minRunningTotalNotificationEmail) {
    this.minRunningTotalNotificationEmail = minRunningTotalNotificationEmail;
    return this;
  }

   /**
   * The recipient of the notification limit email
   * @return minRunningTotalNotificationEmail
  **/
  @ApiModelProperty(value = "The recipient of the notification limit email")
  public String getMinRunningTotalNotificationEmail() {
    return minRunningTotalNotificationEmail;
  }

  public void setMinRunningTotalNotificationEmail(String minRunningTotalNotificationEmail) {
    this.minRunningTotalNotificationEmail = minRunningTotalNotificationEmail;
  }

  public Account created(Date created) {
    this.created = created;
    return this;
  }

   /**
   * The date of the acccount creation
   * @return created
  **/
  @Valid
  @ApiModelProperty(value = "The date of the acccount creation")
  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public Account updated(Date updated) {
    this.updated = updated;
    return this;
  }

   /**
   * The date of the las update.
   * @return updated
  **/
  @Valid
  @ApiModelProperty(value = "The date of the las update.")
  public Date getUpdated() {
    return updated;
  }

  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  public Account view(CurrencyRate view) {
    this.view = view;
    return this;
  }

   /**
   * The selected exchange for the account
   * @return view
  **/
  @Valid
  @ApiModelProperty(value = "The selected exchange for the account")
  public CurrencyRate getView() {
    return view;
  }

  public void setView(CurrencyRate view) {
    this.view = view;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.customer, account.customer) &&
        Objects.equals(this.currentAccountBalance, account.currentAccountBalance) &&
        Objects.equals(this.runningTotal, account.runningTotal) &&
        Objects.equals(this.creditLimit, account.creditLimit) &&
        Objects.equals(this.currency, account.currency) &&
        Objects.equals(this.minRunningTotalNotification, account.minRunningTotalNotification) &&
        Objects.equals(this.minRunningTotalNotificationEmail, account.minRunningTotalNotificationEmail) &&
        Objects.equals(this.created, account.created) &&
        Objects.equals(this.updated, account.updated) &&
        Objects.equals(this.view, account.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, currentAccountBalance, runningTotal, creditLimit, currency, minRunningTotalNotification, minRunningTotalNotificationEmail, created, updated, view);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    currentAccountBalance: ").append(toIndentedString(currentAccountBalance)).append("\n");
    sb.append("    runningTotal: ").append(toIndentedString(runningTotal)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    minRunningTotalNotification: ").append(toIndentedString(minRunningTotalNotification)).append("\n");
    sb.append("    minRunningTotalNotificationEmail: ").append(toIndentedString(minRunningTotalNotificationEmail)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
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


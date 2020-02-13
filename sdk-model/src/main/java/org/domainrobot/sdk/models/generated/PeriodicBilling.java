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
import org.domainrobot.sdk.models.generated.BillingStatus;
import org.domainrobot.sdk.models.generated.PeriodicBilling;
import org.domainrobot.sdk.models.generated.TimePeriod;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * PeriodicBilling
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T09:53:42.259+01:00")
public class PeriodicBilling {
  @JsonProperty("created")
  private Date created = null;

  @JsonProperty("updated")
  private Date updated = null;

  @JsonProperty("owner")
  private BasicUser owner = null;

  @JsonProperty("updater")
  private BasicUser updater = null;

  @JsonProperty("status")
  private BillingStatus status = null;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("period")
  private TimePeriod period = null;

  @JsonProperty("articleTypeLabel")
  private String articleTypeLabel = null;

  @JsonProperty("articleLabel")
  private String articleLabel = null;

  @JsonProperty("item")
  private List<PeriodicBilling> item = null;

  @JsonProperty("businessCase")
  private String businessCase = null;

  public PeriodicBilling created(Date created) {
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

  public PeriodicBilling updated(Date updated) {
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

  public PeriodicBilling owner(BasicUser owner) {
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

  public PeriodicBilling updater(BasicUser updater) {
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

  public PeriodicBilling status(BillingStatus status) {
    this.status = status;
    return this;
  }

   /**
   * The actual status of the entry, active means ok.
   * @return status
  **/
  @Valid
  @ApiModelProperty(value = "The actual status of the entry, active means ok.")
  public BillingStatus getStatus() {
    return status;
  }

  public void setStatus(BillingStatus status) {
    this.status = status;
  }

  public PeriodicBilling object(String object) {
    this.object = object;
    return this;
  }

   /**
   * The name of the subscription, e.g. the contract number
   * @return object
  **/
  @ApiModelProperty(value = "The name of the subscription, e.g. the contract number")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public PeriodicBilling description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The human readable name of the subscription, e.g. the name of a package
   * @return description
  **/
  @ApiModelProperty(value = "The human readable name of the subscription, e.g. the name of a package")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PeriodicBilling period(TimePeriod period) {
    this.period = period;
    return this;
  }

   /**
   * The period used by the subscription, e.g. 1 month
   * @return period
  **/
  @Valid
  @ApiModelProperty(value = "The period used by the subscription, e.g. 1 month")
  public TimePeriod getPeriod() {
    return period;
  }

  public void setPeriod(TimePeriod period) {
    this.period = period;
  }

  public PeriodicBilling articleTypeLabel(String articleTypeLabel) {
    this.articleTypeLabel = articleTypeLabel;
    return this;
  }

   /**
   * The article type label of the subscription, e.g. domain
   * @return articleTypeLabel
  **/
  @ApiModelProperty(value = "The article type label of the subscription, e.g. domain")
  public String getArticleTypeLabel() {
    return articleTypeLabel;
  }

  public void setArticleTypeLabel(String articleTypeLabel) {
    this.articleTypeLabel = articleTypeLabel;
  }

  public PeriodicBilling articleLabel(String articleLabel) {
    this.articleLabel = articleLabel;
    return this;
  }

   /**
   * The article label of the subscription, e.g. backup_mx
   * @return articleLabel
  **/
  @ApiModelProperty(value = "The article label of the subscription, e.g. backup_mx")
  public String getArticleLabel() {
    return articleLabel;
  }

  public void setArticleLabel(String articleLabel) {
    this.articleLabel = articleLabel;
  }

  public PeriodicBilling item(List<PeriodicBilling> item) {
    this.item = item;
    return this;
  }

  public PeriodicBilling addItemItem(PeriodicBilling itemItem) {
    if (this.item == null) {
      this.item = new ArrayList<PeriodicBilling>();
    }
    this.item.add(itemItem);
    return this;
  }

   /**
   * The items of the subscription
   * @return item
  **/
  @Valid
  @ApiModelProperty(value = "The items of the subscription")
  public List<PeriodicBilling> getItem() {
    return item;
  }

  public void setItem(List<PeriodicBilling> item) {
    this.item = item;
  }

  public PeriodicBilling businessCase(String businessCase) {
    this.businessCase = businessCase;
    return this;
  }

   /**
   * The businessCase of the subscription, e.g. create
   * @return businessCase
  **/
  @ApiModelProperty(value = "The businessCase of the subscription, e.g. create")
  public String getBusinessCase() {
    return businessCase;
  }

  public void setBusinessCase(String businessCase) {
    this.businessCase = businessCase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeriodicBilling periodicBilling = (PeriodicBilling) o;
    return Objects.equals(this.created, periodicBilling.created) &&
        Objects.equals(this.updated, periodicBilling.updated) &&
        Objects.equals(this.owner, periodicBilling.owner) &&
        Objects.equals(this.updater, periodicBilling.updater) &&
        Objects.equals(this.status, periodicBilling.status) &&
        Objects.equals(this.object, periodicBilling.object) &&
        Objects.equals(this.description, periodicBilling.description) &&
        Objects.equals(this.period, periodicBilling.period) &&
        Objects.equals(this.articleTypeLabel, periodicBilling.articleTypeLabel) &&
        Objects.equals(this.articleLabel, periodicBilling.articleLabel) &&
        Objects.equals(this.item, periodicBilling.item) &&
        Objects.equals(this.businessCase, periodicBilling.businessCase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, updated, owner, updater, status, object, description, period, articleTypeLabel, articleLabel, item, businessCase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeriodicBilling {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    articleTypeLabel: ").append(toIndentedString(articleTypeLabel)).append("\n");
    sb.append("    articleLabel: ").append(toIndentedString(articleLabel)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    businessCase: ").append(toIndentedString(businessCase)).append("\n");
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


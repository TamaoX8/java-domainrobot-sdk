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
import org.domainrobot.sdk.models.generated.TransferAnswer;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * TransferOut
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T13:06:11.008+01:00")
public class TransferOut {
  @JsonProperty("created")
  private Date created = null;

  @JsonProperty("updated")
  private Date updated = null;

  @JsonProperty("owner")
  private BasicUser owner = null;

  @JsonProperty("updater")
  private BasicUser updater = null;

  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("gainingRegistrar")
  private String gainingRegistrar = null;

  @JsonProperty("loosingRegistrar")
  private String loosingRegistrar = null;

  @JsonProperty("start")
  private Date start = null;

  @JsonProperty("reminder")
  private Date reminder = null;

  @JsonProperty("autoAck")
  private Date autoAck = null;

  @JsonProperty("autoNack")
  private Date autoNack = null;

  @JsonProperty("end")
  private Date end = null;

  @JsonProperty("autoAnswer")
  private Boolean autoAnswer = null;

  @JsonProperty("recipient")
  private String recipient = null;

  @JsonProperty("mailserver")
  private String mailserver = null;

  @JsonProperty("deliveredMailserver")
  private String deliveredMailserver = null;

  @JsonProperty("delivered")
  private Date delivered = null;

  @JsonProperty("transaction")
  private String transaction = null;

  @JsonProperty("type")
  private TransferAnswer type = null;

  @JsonProperty("nackReason")
  private Integer nackReason = null;

  public TransferOut created(Date created) {
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

  public TransferOut updated(Date updated) {
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

  public TransferOut owner(BasicUser owner) {
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

  public TransferOut updater(BasicUser updater) {
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

  public TransferOut domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * The domain name.
   * @return domain
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "The domain name.")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public TransferOut gainingRegistrar(String gainingRegistrar) {
    this.gainingRegistrar = gainingRegistrar;
    return this;
  }

   /**
   * The gaining registrar.
   * @return gainingRegistrar
  **/
  @ApiModelProperty(value = "The gaining registrar.")
  public String getGainingRegistrar() {
    return gainingRegistrar;
  }

  public void setGainingRegistrar(String gainingRegistrar) {
    this.gainingRegistrar = gainingRegistrar;
  }

  public TransferOut loosingRegistrar(String loosingRegistrar) {
    this.loosingRegistrar = loosingRegistrar;
    return this;
  }

   /**
   * The loosing registrar.
   * @return loosingRegistrar
  **/
  @ApiModelProperty(value = "The loosing registrar.")
  public String getLoosingRegistrar() {
    return loosingRegistrar;
  }

  public void setLoosingRegistrar(String loosingRegistrar) {
    this.loosingRegistrar = loosingRegistrar;
  }

  public TransferOut start(Date start) {
    this.start = start;
    return this;
  }

   /**
   * The start date.
   * @return start
  **/
  @Valid
  @ApiModelProperty(value = "The start date.")
  public Date getStart() {
    return start;
  }

  public void setStart(Date start) {
    this.start = start;
  }

  public TransferOut reminder(Date reminder) {
    this.reminder = reminder;
    return this;
  }

   /**
   * The reminder date.
   * @return reminder
  **/
  @Valid
  @ApiModelProperty(value = "The reminder date.")
  public Date getReminder() {
    return reminder;
  }

  public void setReminder(Date reminder) {
    this.reminder = reminder;
  }

  public TransferOut autoAck(Date autoAck) {
    this.autoAck = autoAck;
    return this;
  }

   /**
   * The auto ack date.
   * @return autoAck
  **/
  @Valid
  @ApiModelProperty(value = "The auto ack date.")
  public Date getAutoAck() {
    return autoAck;
  }

  public void setAutoAck(Date autoAck) {
    this.autoAck = autoAck;
  }

  public TransferOut autoNack(Date autoNack) {
    this.autoNack = autoNack;
    return this;
  }

   /**
   * The auto nack date.
   * @return autoNack
  **/
  @Valid
  @ApiModelProperty(value = "The auto nack date.")
  public Date getAutoNack() {
    return autoNack;
  }

  public void setAutoNack(Date autoNack) {
    this.autoNack = autoNack;
  }

  public TransferOut end(Date end) {
    this.end = end;
    return this;
  }

   /**
   * The end date.
   * @return end
  **/
  @Valid
  @ApiModelProperty(value = "The end date.")
  public Date getEnd() {
    return end;
  }

  public void setEnd(Date end) {
    this.end = end;
  }

  public TransferOut autoAnswer(Boolean autoAnswer) {
    this.autoAnswer = autoAnswer;
    return this;
  }

   /**
   * Autoanswer active.
   * @return autoAnswer
  **/
  @ApiModelProperty(value = "Autoanswer active.")
  public Boolean isAutoAnswer() {
    return autoAnswer;
  }

  public void setAutoAnswer(Boolean autoAnswer) {
    this.autoAnswer = autoAnswer;
  }

  public TransferOut recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

   /**
   * The recipient.
   * @return recipient
  **/
  @ApiModelProperty(value = "The recipient.")
  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public TransferOut mailserver(String mailserver) {
    this.mailserver = mailserver;
    return this;
  }

   /**
   * The mailserver.
   * @return mailserver
  **/
  @ApiModelProperty(value = "The mailserver.")
  public String getMailserver() {
    return mailserver;
  }

  public void setMailserver(String mailserver) {
    this.mailserver = mailserver;
  }

  public TransferOut deliveredMailserver(String deliveredMailserver) {
    this.deliveredMailserver = deliveredMailserver;
    return this;
  }

   /**
   * The delivered mailserver.
   * @return deliveredMailserver
  **/
  @ApiModelProperty(value = "The delivered mailserver.")
  public String getDeliveredMailserver() {
    return deliveredMailserver;
  }

  public void setDeliveredMailserver(String deliveredMailserver) {
    this.deliveredMailserver = deliveredMailserver;
  }

  public TransferOut delivered(Date delivered) {
    this.delivered = delivered;
    return this;
  }

   /**
   * The delivered date.
   * @return delivered
  **/
  @Valid
  @ApiModelProperty(value = "The delivered date.")
  public Date getDelivered() {
    return delivered;
  }

  public void setDelivered(Date delivered) {
    this.delivered = delivered;
  }

  public TransferOut transaction(String transaction) {
    this.transaction = transaction;
    return this;
  }

   /**
   * The ctid.
   * @return transaction
  **/
  @ApiModelProperty(value = "The ctid.")
  public String getTransaction() {
    return transaction;
  }

  public void setTransaction(String transaction) {
    this.transaction = transaction;
  }

  public TransferOut type(TransferAnswer type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the transfer.
   * @return type
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "The type of the transfer.")
  public TransferAnswer getType() {
    return type;
  }

  public void setType(TransferAnswer type) {
    this.type = type;
  }

  public TransferOut nackReason(Integer nackReason) {
    this.nackReason = nackReason;
    return this;
  }

   /**
   * The reason.
   * @return nackReason
  **/
  @ApiModelProperty(value = "The reason.")
  public Integer getNackReason() {
    return nackReason;
  }

  public void setNackReason(Integer nackReason) {
    this.nackReason = nackReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferOut transferOut = (TransferOut) o;
    return Objects.equals(this.created, transferOut.created) &&
        Objects.equals(this.updated, transferOut.updated) &&
        Objects.equals(this.owner, transferOut.owner) &&
        Objects.equals(this.updater, transferOut.updater) &&
        Objects.equals(this.domain, transferOut.domain) &&
        Objects.equals(this.gainingRegistrar, transferOut.gainingRegistrar) &&
        Objects.equals(this.loosingRegistrar, transferOut.loosingRegistrar) &&
        Objects.equals(this.start, transferOut.start) &&
        Objects.equals(this.reminder, transferOut.reminder) &&
        Objects.equals(this.autoAck, transferOut.autoAck) &&
        Objects.equals(this.autoNack, transferOut.autoNack) &&
        Objects.equals(this.end, transferOut.end) &&
        Objects.equals(this.autoAnswer, transferOut.autoAnswer) &&
        Objects.equals(this.recipient, transferOut.recipient) &&
        Objects.equals(this.mailserver, transferOut.mailserver) &&
        Objects.equals(this.deliveredMailserver, transferOut.deliveredMailserver) &&
        Objects.equals(this.delivered, transferOut.delivered) &&
        Objects.equals(this.transaction, transferOut.transaction) &&
        Objects.equals(this.type, transferOut.type) &&
        Objects.equals(this.nackReason, transferOut.nackReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, updated, owner, updater, domain, gainingRegistrar, loosingRegistrar, start, reminder, autoAck, autoNack, end, autoAnswer, recipient, mailserver, deliveredMailserver, delivered, transaction, type, nackReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferOut {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    gainingRegistrar: ").append(toIndentedString(gainingRegistrar)).append("\n");
    sb.append("    loosingRegistrar: ").append(toIndentedString(loosingRegistrar)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    reminder: ").append(toIndentedString(reminder)).append("\n");
    sb.append("    autoAck: ").append(toIndentedString(autoAck)).append("\n");
    sb.append("    autoNack: ").append(toIndentedString(autoNack)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    autoAnswer: ").append(toIndentedString(autoAnswer)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    mailserver: ").append(toIndentedString(mailserver)).append("\n");
    sb.append("    deliveredMailserver: ").append(toIndentedString(deliveredMailserver)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    nackReason: ").append(toIndentedString(nackReason)).append("\n");
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


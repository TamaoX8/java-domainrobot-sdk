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
import org.domainrobot.sdk.models.generated.RenewStatusConstants;
import org.domainrobot.sdk.models.generated.TimePeriod;
import org.domainrobot.sdk.models.generated.TmchContact;
import org.domainrobot.sdk.models.generated.TmchMarkAddon;
import org.domainrobot.sdk.models.generated.TmchMarkComment;
import org.domainrobot.sdk.models.generated.TmchMarkDocument;
import org.domainrobot.sdk.models.generated.TmchMarkStatusConstants;
import org.domainrobot.sdk.models.generated.TmchMarkTypeConstants;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * TmchMark
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T09:53:42.259+01:00")
public class TmchMark {
  @JsonProperty("created")
  private Date created = null;

  @JsonProperty("updated")
  private Date updated = null;

  @JsonProperty("owner")
  private BasicUser owner = null;

  @JsonProperty("updater")
  private BasicUser updater = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("type")
  private TmchMarkTypeConstants type = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("holder")
  private TmchContact holder = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("period")
  private TimePeriod period = null;

  @JsonProperty("documents")
  private List<TmchMarkDocument> documents = null;

  @JsonProperty("labels")
  private List<String> labels = null;

  @JsonProperty("comments")
  private List<TmchMarkComment> comments = null;

  @JsonProperty("renew")
  private RenewStatusConstants renew = null;

  @JsonProperty("status")
  private TmchMarkStatusConstants status = null;

  @JsonProperty("payable")
  private Date payable = null;

  @JsonProperty("internalComment")
  private String internalComment = null;

  @JsonProperty("sent")
  private Boolean sent = null;

  @JsonProperty("smdInclusion")
  private Boolean smdInclusion = null;

  @JsonProperty("claimsNotify")
  private Boolean claimsNotify = null;

  @JsonProperty("smdFile")
  private String smdFile = null;

  @JsonProperty("orderComplete")
  private Boolean orderComplete = null;

  @JsonProperty("claimsNotifyExtended")
  private Boolean claimsNotifyExtended = null;

  @JsonProperty("extension")
  private TmchMarkAddon extension = null;

  public TmchMark created(Date created) {
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

  public TmchMark updated(Date updated) {
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

  public TmchMark owner(BasicUser owner) {
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

  public TmchMark updater(BasicUser updater) {
    this.updater = updater;
    return this;
  }

   /**
   * The updater of the object.
   * @return updater
  **/
  @Valid
  @ApiModelProperty(value = "The updater of the object.")
  public BasicUser getUpdater() {
    return updater;
  }

  public void setUpdater(BasicUser updater) {
    this.updater = updater;
  }

  public TmchMark id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TmchMark type(TmchMarkTypeConstants type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public TmchMarkTypeConstants getType() {
    return type;
  }

  public void setType(TmchMarkTypeConstants type) {
    this.type = type;
  }

  public TmchMark name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TmchMark reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public TmchMark holder(TmchContact holder) {
    this.holder = holder;
    return this;
  }

   /**
   * Get holder
   * @return holder
  **/
  @Valid
  @ApiModelProperty(value = "")
  public TmchContact getHolder() {
    return holder;
  }

  public void setHolder(TmchContact holder) {
    this.holder = holder;
  }

  public TmchMark description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TmchMark period(TimePeriod period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public TimePeriod getPeriod() {
    return period;
  }

  public void setPeriod(TimePeriod period) {
    this.period = period;
  }

  public TmchMark documents(List<TmchMarkDocument> documents) {
    this.documents = documents;
    return this;
  }

  public TmchMark addDocumentsItem(TmchMarkDocument documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<TmchMarkDocument>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Get documents
   * @return documents
  **/
  @Valid
  @ApiModelProperty(value = "")
  public List<TmchMarkDocument> getDocuments() {
    return documents;
  }

  public void setDocuments(List<TmchMarkDocument> documents) {
    this.documents = documents;
  }

  public TmchMark labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public TmchMark addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<String>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public TmchMark comments(List<TmchMarkComment> comments) {
    this.comments = comments;
    return this;
  }

  public TmchMark addCommentsItem(TmchMarkComment commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<TmchMarkComment>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @Valid
  @ApiModelProperty(value = "")
  public List<TmchMarkComment> getComments() {
    return comments;
  }

  public void setComments(List<TmchMarkComment> comments) {
    this.comments = comments;
  }

  public TmchMark renew(RenewStatusConstants renew) {
    this.renew = renew;
    return this;
  }

   /**
   * Get renew
   * @return renew
  **/
  @Valid
  @ApiModelProperty(value = "")
  public RenewStatusConstants getRenew() {
    return renew;
  }

  public void setRenew(RenewStatusConstants renew) {
    this.renew = renew;
  }

  public TmchMark status(TmchMarkStatusConstants status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Valid
  @ApiModelProperty(value = "")
  public TmchMarkStatusConstants getStatus() {
    return status;
  }

  public void setStatus(TmchMarkStatusConstants status) {
    this.status = status;
  }

  public TmchMark payable(Date payable) {
    this.payable = payable;
    return this;
  }

   /**
   * Get payable
   * @return payable
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public Date getPayable() {
    return payable;
  }

  public void setPayable(Date payable) {
    this.payable = payable;
  }

  public TmchMark internalComment(String internalComment) {
    this.internalComment = internalComment;
    return this;
  }

   /**
   * Get internalComment
   * @return internalComment
  **/
  @ApiModelProperty(value = "")
  public String getInternalComment() {
    return internalComment;
  }

  public void setInternalComment(String internalComment) {
    this.internalComment = internalComment;
  }

  public TmchMark sent(Boolean sent) {
    this.sent = sent;
    return this;
  }

   /**
   * Get sent
   * @return sent
  **/
  @ApiModelProperty(value = "")
  public Boolean isSent() {
    return sent;
  }

  public void setSent(Boolean sent) {
    this.sent = sent;
  }

  public TmchMark smdInclusion(Boolean smdInclusion) {
    this.smdInclusion = smdInclusion;
    return this;
  }

   /**
   * Get smdInclusion
   * @return smdInclusion
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "")
  public Boolean isSmdInclusion() {
    return smdInclusion;
  }

  public void setSmdInclusion(Boolean smdInclusion) {
    this.smdInclusion = smdInclusion;
  }

  public TmchMark claimsNotify(Boolean claimsNotify) {
    this.claimsNotify = claimsNotify;
    return this;
  }

   /**
   * Get claimsNotify
   * @return claimsNotify
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "")
  public Boolean isClaimsNotify() {
    return claimsNotify;
  }

  public void setClaimsNotify(Boolean claimsNotify) {
    this.claimsNotify = claimsNotify;
  }

  public TmchMark smdFile(String smdFile) {
    this.smdFile = smdFile;
    return this;
  }

   /**
   * Get smdFile
   * @return smdFile
  **/
  @ApiModelProperty(value = "")
  public String getSmdFile() {
    return smdFile;
  }

  public void setSmdFile(String smdFile) {
    this.smdFile = smdFile;
  }

  public TmchMark orderComplete(Boolean orderComplete) {
    this.orderComplete = orderComplete;
    return this;
  }

   /**
   * Get orderComplete
   * @return orderComplete
  **/
  @ApiModelProperty(value = "")
  public Boolean isOrderComplete() {
    return orderComplete;
  }

  public void setOrderComplete(Boolean orderComplete) {
    this.orderComplete = orderComplete;
  }

  public TmchMark claimsNotifyExtended(Boolean claimsNotifyExtended) {
    this.claimsNotifyExtended = claimsNotifyExtended;
    return this;
  }

   /**
   * Get claimsNotifyExtended
   * @return claimsNotifyExtended
  **/
  @ApiModelProperty(value = "")
  public Boolean isClaimsNotifyExtended() {
    return claimsNotifyExtended;
  }

  public void setClaimsNotifyExtended(Boolean claimsNotifyExtended) {
    this.claimsNotifyExtended = claimsNotifyExtended;
  }

  public TmchMark extension(TmchMarkAddon extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Get extension
   * @return extension
  **/
  @Valid
  @ApiModelProperty(value = "")
  public TmchMarkAddon getExtension() {
    return extension;
  }

  public void setExtension(TmchMarkAddon extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmchMark tmchMark = (TmchMark) o;
    return Objects.equals(this.created, tmchMark.created) &&
        Objects.equals(this.updated, tmchMark.updated) &&
        Objects.equals(this.owner, tmchMark.owner) &&
        Objects.equals(this.updater, tmchMark.updater) &&
        Objects.equals(this.id, tmchMark.id) &&
        Objects.equals(this.type, tmchMark.type) &&
        Objects.equals(this.name, tmchMark.name) &&
        Objects.equals(this.reference, tmchMark.reference) &&
        Objects.equals(this.holder, tmchMark.holder) &&
        Objects.equals(this.description, tmchMark.description) &&
        Objects.equals(this.period, tmchMark.period) &&
        Objects.equals(this.documents, tmchMark.documents) &&
        Objects.equals(this.labels, tmchMark.labels) &&
        Objects.equals(this.comments, tmchMark.comments) &&
        Objects.equals(this.renew, tmchMark.renew) &&
        Objects.equals(this.status, tmchMark.status) &&
        Objects.equals(this.payable, tmchMark.payable) &&
        Objects.equals(this.internalComment, tmchMark.internalComment) &&
        Objects.equals(this.sent, tmchMark.sent) &&
        Objects.equals(this.smdInclusion, tmchMark.smdInclusion) &&
        Objects.equals(this.claimsNotify, tmchMark.claimsNotify) &&
        Objects.equals(this.smdFile, tmchMark.smdFile) &&
        Objects.equals(this.orderComplete, tmchMark.orderComplete) &&
        Objects.equals(this.claimsNotifyExtended, tmchMark.claimsNotifyExtended) &&
        Objects.equals(this.extension, tmchMark.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, updated, owner, updater, id, type, name, reference, holder, description, period, documents, labels, comments, renew, status, payable, internalComment, sent, smdInclusion, claimsNotify, smdFile, orderComplete, claimsNotifyExtended, extension);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmchMark {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    renew: ").append(toIndentedString(renew)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    payable: ").append(toIndentedString(payable)).append("\n");
    sb.append("    internalComment: ").append(toIndentedString(internalComment)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    smdInclusion: ").append(toIndentedString(smdInclusion)).append("\n");
    sb.append("    claimsNotify: ").append(toIndentedString(claimsNotify)).append("\n");
    sb.append("    smdFile: ").append(toIndentedString(smdFile)).append("\n");
    sb.append("    orderComplete: ").append(toIndentedString(orderComplete)).append("\n");
    sb.append("    claimsNotifyExtended: ").append(toIndentedString(claimsNotifyExtended)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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


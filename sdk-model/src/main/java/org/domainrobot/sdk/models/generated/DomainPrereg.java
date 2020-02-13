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
import org.domainrobot.sdk.models.generated.Contact;
import org.domainrobot.sdk.models.generated.DomainPreregAddon;
import org.domainrobot.sdk.models.generated.DomainPreregStatusConstants;
import org.domainrobot.sdk.models.generated.NameServer;
import org.domainrobot.sdk.models.generated.PreregConfig;
import org.domainrobot.sdk.models.generated.RegistryStatusConstants;
import org.domainrobot.sdk.models.generated.TmchMark;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * DomainPrereg
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T09:53:42.259+01:00")
public class DomainPrereg {
  @JsonProperty("created")
  private Date created = null;

  @JsonProperty("updated")
  private Date updated = null;

  @JsonProperty("owner")
  private BasicUser owner = null;

  @JsonProperty("updater")
  private BasicUser updater = null;

  @JsonProperty("ownerc")
  private Contact ownerc = null;

  @JsonProperty("adminc")
  private Contact adminc = null;

  @JsonProperty("techc")
  private Contact techc = null;

  @JsonProperty("zonec")
  private Contact zonec = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("authinfo")
  private String authinfo = null;

  @JsonProperty("nameServers")
  private List<NameServer> nameServers = null;

  @JsonProperty("nameServerEntries")
  private List<String> nameServerEntries = null;

  @JsonProperty("status")
  private DomainPreregStatusConstants status = null;

  @JsonProperty("extension")
  private DomainPreregAddon extension = null;

  @JsonProperty("orderReference")
  private String orderReference = null;

  @JsonProperty("tmchMark")
  private TmchMark tmchMark = null;

  @JsonProperty("preregConfig")
  private PreregConfig preregConfig = null;

  @JsonProperty("idn")
  private String idn = null;

  @JsonProperty("confirmed")
  private Date confirmed = null;

  @JsonProperty("trustee")
  private Boolean trustee = null;

  @JsonProperty("domainCreated")
  private Date domainCreated = null;

  @JsonProperty("domainExpire")
  private Date domainExpire = null;

  @JsonProperty("registryStatus")
  private RegistryStatusConstants registryStatus = null;

  @JsonProperty("recommended")
  private Boolean recommended = null;

  public DomainPrereg created(Date created) {
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

  public DomainPrereg updated(Date updated) {
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

  public DomainPrereg owner(BasicUser owner) {
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

  public DomainPrereg updater(BasicUser updater) {
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

  public DomainPrereg ownerc(Contact ownerc) {
    this.ownerc = ownerc;
    return this;
  }

   /**
   * The owner contact.
   * @return ownerc
  **/
  @Valid
  @ApiModelProperty(value = "The owner contact.")
  public Contact getOwnerc() {
    return ownerc;
  }

  public void setOwnerc(Contact ownerc) {
    this.ownerc = ownerc;
  }

  public DomainPrereg adminc(Contact adminc) {
    this.adminc = adminc;
    return this;
  }

   /**
   * The administrative contact.
   * @return adminc
  **/
  @Valid
  @ApiModelProperty(value = "The administrative contact.")
  public Contact getAdminc() {
    return adminc;
  }

  public void setAdminc(Contact adminc) {
    this.adminc = adminc;
  }

  public DomainPrereg techc(Contact techc) {
    this.techc = techc;
    return this;
  }

   /**
   * The technical contact reference.
   * @return techc
  **/
  @Valid
  @ApiModelProperty(value = "The technical contact reference.")
  public Contact getTechc() {
    return techc;
  }

  public void setTechc(Contact techc) {
    this.techc = techc;
  }

  public DomainPrereg zonec(Contact zonec) {
    this.zonec = zonec;
    return this;
  }

   /**
   * The dns contact.
   * @return zonec
  **/
  @Valid
  @ApiModelProperty(value = "The dns contact.")
  public Contact getZonec() {
    return zonec;
  }

  public void setZonec(Contact zonec) {
    this.zonec = zonec;
  }

  public DomainPrereg name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the domain.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the domain.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DomainPrereg authinfo(String authinfo) {
    this.authinfo = authinfo;
    return this;
  }

   /**
   * The authinfo.
   * @return authinfo
  **/
  @ApiModelProperty(value = "The authinfo.")
  public String getAuthinfo() {
    return authinfo;
  }

  public void setAuthinfo(String authinfo) {
    this.authinfo = authinfo;
  }

  public DomainPrereg nameServers(List<NameServer> nameServers) {
    this.nameServers = nameServers;
    return this;
  }

  public DomainPrereg addNameServersItem(NameServer nameServersItem) {
    if (this.nameServers == null) {
      this.nameServers = new ArrayList<NameServer>();
    }
    this.nameServers.add(nameServersItem);
    return this;
  }

   /**
   * The nameservers.
   * @return nameServers
  **/
  @Valid
  @ApiModelProperty(value = "The nameservers.")
  public List<NameServer> getNameServers() {
    return nameServers;
  }

  public void setNameServers(List<NameServer> nameServers) {
    this.nameServers = nameServers;
  }

  public DomainPrereg nameServerEntries(List<String> nameServerEntries) {
    this.nameServerEntries = nameServerEntries;
    return this;
  }

  public DomainPrereg addNameServerEntriesItem(String nameServerEntriesItem) {
    if (this.nameServerEntries == null) {
      this.nameServerEntries = new ArrayList<String>();
    }
    this.nameServerEntries.add(nameServerEntriesItem);
    return this;
  }

   /**
   * The nameserver entries.
   * @return nameServerEntries
  **/
  @ApiModelProperty(value = "The nameserver entries.")
  public List<String> getNameServerEntries() {
    return nameServerEntries;
  }

  public void setNameServerEntries(List<String> nameServerEntries) {
    this.nameServerEntries = nameServerEntries;
  }

  public DomainPrereg status(DomainPreregStatusConstants status) {
    this.status = status;
    return this;
  }

   /**
   * The preregistration status of the domain.
   * @return status
  **/
  @Valid
  @ApiModelProperty(value = "The preregistration status of the domain.")
  public DomainPreregStatusConstants getStatus() {
    return status;
  }

  public void setStatus(DomainPreregStatusConstants status) {
    this.status = status;
  }

  public DomainPrereg extension(DomainPreregAddon extension) {
    this.extension = extension;
    return this;
  }

   /**
   * The preregistration extensions.
   * @return extension
  **/
  @Valid
  @ApiModelProperty(value = "The preregistration extensions.")
  public DomainPreregAddon getExtension() {
    return extension;
  }

  public void setExtension(DomainPreregAddon extension) {
    this.extension = extension;
  }

  public DomainPrereg orderReference(String orderReference) {
    this.orderReference = orderReference;
    return this;
  }

   /**
   * The unique order reference.
   * @return orderReference
  **/
  @ApiModelProperty(value = "The unique order reference.")
  public String getOrderReference() {
    return orderReference;
  }

  public void setOrderReference(String orderReference) {
    this.orderReference = orderReference;
  }

  public DomainPrereg tmchMark(TmchMark tmchMark) {
    this.tmchMark = tmchMark;
    return this;
  }

   /**
   * The tmchmark.
   * @return tmchMark
  **/
  @Valid
  @ApiModelProperty(value = "The tmchmark.")
  public TmchMark getTmchMark() {
    return tmchMark;
  }

  public void setTmchMark(TmchMark tmchMark) {
    this.tmchMark = tmchMark;
  }

  public DomainPrereg preregConfig(PreregConfig preregConfig) {
    this.preregConfig = preregConfig;
    return this;
  }

   /**
   * The preregistration configuration.
   * @return preregConfig
  **/
  @Valid
  @ApiModelProperty(value = "The preregistration configuration.")
  public PreregConfig getPreregConfig() {
    return preregConfig;
  }

  public void setPreregConfig(PreregConfig preregConfig) {
    this.preregConfig = preregConfig;
  }

  public DomainPrereg idn(String idn) {
    this.idn = idn;
    return this;
  }

   /**
   * The idn version of the name.
   * @return idn
  **/
  @ApiModelProperty(value = "The idn version of the name.")
  public String getIdn() {
    return idn;
  }

  public void setIdn(String idn) {
    this.idn = idn;
  }

  public DomainPrereg confirmed(Date confirmed) {
    this.confirmed = confirmed;
    return this;
  }

   /**
   * The confirmation date.
   * @return confirmed
  **/
  @Valid
  @ApiModelProperty(value = "The confirmation date.")
  public Date getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(Date confirmed) {
    this.confirmed = confirmed;
  }

  public DomainPrereg trustee(Boolean trustee) {
    this.trustee = trustee;
    return this;
  }

   /**
   * Trustee active or not.
   * @return trustee
  **/
  @ApiModelProperty(value = "Trustee active or not.")
  public Boolean isTrustee() {
    return trustee;
  }

  public void setTrustee(Boolean trustee) {
    this.trustee = trustee;
  }

  public DomainPrereg domainCreated(Date domainCreated) {
    this.domainCreated = domainCreated;
    return this;
  }

   /**
   * The domain created date.
   * @return domainCreated
  **/
  @Valid
  @ApiModelProperty(value = "The domain created date.")
  public Date getDomainCreated() {
    return domainCreated;
  }

  public void setDomainCreated(Date domainCreated) {
    this.domainCreated = domainCreated;
  }

  public DomainPrereg domainExpire(Date domainExpire) {
    this.domainExpire = domainExpire;
    return this;
  }

   /**
   * The domain expire date.
   * @return domainExpire
  **/
  @Valid
  @ApiModelProperty(value = "The domain expire date.")
  public Date getDomainExpire() {
    return domainExpire;
  }

  public void setDomainExpire(Date domainExpire) {
    this.domainExpire = domainExpire;
  }

  public DomainPrereg registryStatus(RegistryStatusConstants registryStatus) {
    this.registryStatus = registryStatus;
    return this;
  }

   /**
   * The registry status.
   * @return registryStatus
  **/
  @Valid
  @ApiModelProperty(value = "The registry status.")
  public RegistryStatusConstants getRegistryStatus() {
    return registryStatus;
  }

  public void setRegistryStatus(RegistryStatusConstants registryStatus) {
    this.registryStatus = registryStatus;
  }

  public DomainPrereg recommended(Boolean recommended) {
    this.recommended = recommended;
    return this;
  }

   /**
   * Recommended
   * @return recommended
  **/
  @ApiModelProperty(value = "Recommended")
  public Boolean isRecommended() {
    return recommended;
  }

  public void setRecommended(Boolean recommended) {
    this.recommended = recommended;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainPrereg domainPrereg = (DomainPrereg) o;
    return Objects.equals(this.created, domainPrereg.created) &&
        Objects.equals(this.updated, domainPrereg.updated) &&
        Objects.equals(this.owner, domainPrereg.owner) &&
        Objects.equals(this.updater, domainPrereg.updater) &&
        Objects.equals(this.ownerc, domainPrereg.ownerc) &&
        Objects.equals(this.adminc, domainPrereg.adminc) &&
        Objects.equals(this.techc, domainPrereg.techc) &&
        Objects.equals(this.zonec, domainPrereg.zonec) &&
        Objects.equals(this.name, domainPrereg.name) &&
        Objects.equals(this.authinfo, domainPrereg.authinfo) &&
        Objects.equals(this.nameServers, domainPrereg.nameServers) &&
        Objects.equals(this.nameServerEntries, domainPrereg.nameServerEntries) &&
        Objects.equals(this.status, domainPrereg.status) &&
        Objects.equals(this.extension, domainPrereg.extension) &&
        Objects.equals(this.orderReference, domainPrereg.orderReference) &&
        Objects.equals(this.tmchMark, domainPrereg.tmchMark) &&
        Objects.equals(this.preregConfig, domainPrereg.preregConfig) &&
        Objects.equals(this.idn, domainPrereg.idn) &&
        Objects.equals(this.confirmed, domainPrereg.confirmed) &&
        Objects.equals(this.trustee, domainPrereg.trustee) &&
        Objects.equals(this.domainCreated, domainPrereg.domainCreated) &&
        Objects.equals(this.domainExpire, domainPrereg.domainExpire) &&
        Objects.equals(this.registryStatus, domainPrereg.registryStatus) &&
        Objects.equals(this.recommended, domainPrereg.recommended);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, updated, owner, updater, ownerc, adminc, techc, zonec, name, authinfo, nameServers, nameServerEntries, status, extension, orderReference, tmchMark, preregConfig, idn, confirmed, trustee, domainCreated, domainExpire, registryStatus, recommended);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainPrereg {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
    sb.append("    ownerc: ").append(toIndentedString(ownerc)).append("\n");
    sb.append("    adminc: ").append(toIndentedString(adminc)).append("\n");
    sb.append("    techc: ").append(toIndentedString(techc)).append("\n");
    sb.append("    zonec: ").append(toIndentedString(zonec)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    authinfo: ").append(toIndentedString(authinfo)).append("\n");
    sb.append("    nameServers: ").append(toIndentedString(nameServers)).append("\n");
    sb.append("    nameServerEntries: ").append(toIndentedString(nameServerEntries)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    orderReference: ").append(toIndentedString(orderReference)).append("\n");
    sb.append("    tmchMark: ").append(toIndentedString(tmchMark)).append("\n");
    sb.append("    preregConfig: ").append(toIndentedString(preregConfig)).append("\n");
    sb.append("    idn: ").append(toIndentedString(idn)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    trustee: ").append(toIndentedString(trustee)).append("\n");
    sb.append("    domainCreated: ").append(toIndentedString(domainCreated)).append("\n");
    sb.append("    domainExpire: ").append(toIndentedString(domainExpire)).append("\n");
    sb.append("    registryStatus: ").append(toIndentedString(registryStatus)).append("\n");
    sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n");
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


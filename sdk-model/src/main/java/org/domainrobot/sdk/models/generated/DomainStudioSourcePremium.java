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
import org.domainrobot.sdk.models.generated.DomainEnvelopeSearchService;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * DomainStudioSourcePremium
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T09:53:42.259+01:00")
public class DomainStudioSourcePremium {
  @JsonProperty("services")
  private List<DomainEnvelopeSearchService> services = null;

  @JsonProperty("promoTlds")
  private List<String> promoTlds = null;

  @JsonProperty("topTlds")
  private List<String> topTlds = null;

  @JsonProperty("max")
  private Integer max = null;

  public DomainStudioSourcePremium services(List<DomainEnvelopeSearchService> services) {
    this.services = services;
    return this;
  }

  public DomainStudioSourcePremium addServicesItem(DomainEnvelopeSearchService servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<DomainEnvelopeSearchService>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * The services to fetch extra data from for this source
   * @return services
  **/
  @Valid
  @ApiModelProperty(value = "The services to fetch extra data from for this source")
  public List<DomainEnvelopeSearchService> getServices() {
    return services;
  }

  public void setServices(List<DomainEnvelopeSearchService> services) {
    this.services = services;
  }

  public DomainStudioSourcePremium promoTlds(List<String> promoTlds) {
    this.promoTlds = promoTlds;
    return this;
  }

  public DomainStudioSourcePremium addPromoTldsItem(String promoTldsItem) {
    if (this.promoTlds == null) {
      this.promoTlds = new ArrayList<String>();
    }
    this.promoTlds.add(promoTldsItem);
    return this;
  }

   /**
   * Promo tlds
   * @return promoTlds
  **/
  @ApiModelProperty(value = "Promo tlds")
  public List<String> getPromoTlds() {
    return promoTlds;
  }

  public void setPromoTlds(List<String> promoTlds) {
    this.promoTlds = promoTlds;
  }

  public DomainStudioSourcePremium topTlds(List<String> topTlds) {
    this.topTlds = topTlds;
    return this;
  }

  public DomainStudioSourcePremium addTopTldsItem(String topTldsItem) {
    if (this.topTlds == null) {
      this.topTlds = new ArrayList<String>();
    }
    this.topTlds.add(topTldsItem);
    return this;
  }

   /**
   * Top tlds
   * @return topTlds
  **/
  @ApiModelProperty(value = "Top tlds")
  public List<String> getTopTlds() {
    return topTlds;
  }

  public void setTopTlds(List<String> topTlds) {
    this.topTlds = topTlds;
  }

  public DomainStudioSourcePremium max(Integer max) {
    this.max = max;
    return this;
  }

   /**
   * The maximum amount of fetched premium and market domains.
   * @return max
  **/
  @ApiModelProperty(value = "The maximum amount of fetched premium and market domains.")
  public Integer getMax() {
    return max;
  }

  public void setMax(Integer max) {
    this.max = max;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainStudioSourcePremium domainStudioSourcePremium = (DomainStudioSourcePremium) o;
    return Objects.equals(this.services, domainStudioSourcePremium.services) &&
        Objects.equals(this.promoTlds, domainStudioSourcePremium.promoTlds) &&
        Objects.equals(this.topTlds, domainStudioSourcePremium.topTlds) &&
        Objects.equals(this.max, domainStudioSourcePremium.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(services, promoTlds, topTlds, max);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainStudioSourcePremium {\n");
    
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    promoTlds: ").append(toIndentedString(promoTlds)).append("\n");
    sb.append("    topTlds: ").append(toIndentedString(topTlds)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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


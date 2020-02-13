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
import org.domainrobot.sdk.models.generated.QueryFilter;
import org.domainrobot.sdk.models.generated.QueryOrder;
import org.domainrobot.sdk.models.generated.QueryView;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Query
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T09:53:42.259+01:00")
public class Query {
  @JsonProperty("filters")
  private List<QueryFilter> filters = null;

  @JsonProperty("view")
  private QueryView view = null;

  @JsonProperty("orders")
  private List<QueryOrder> orders = null;

  public Query filters(List<QueryFilter> filters) {
    this.filters = filters;
    return this;
  }

  public Query addFiltersItem(QueryFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<QueryFilter>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @Valid
  @ApiModelProperty(value = "")
  public List<QueryFilter> getFilters() {
    return filters;
  }

  public void setFilters(List<QueryFilter> filters) {
    this.filters = filters;
  }

  public Query view(QueryView view) {
    this.view = view;
    return this;
  }

   /**
   * Get view
   * @return view
  **/
  @Valid
  @ApiModelProperty(value = "")
  public QueryView getView() {
    return view;
  }

  public void setView(QueryView view) {
    this.view = view;
  }

  public Query orders(List<QueryOrder> orders) {
    this.orders = orders;
    return this;
  }

  public Query addOrdersItem(QueryOrder ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<QueryOrder>();
    }
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * Get orders
   * @return orders
  **/
  @Valid
  @ApiModelProperty(value = "")
  public List<QueryOrder> getOrders() {
    return orders;
  }

  public void setOrders(List<QueryOrder> orders) {
    this.orders = orders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Query query = (Query) o;
    return Objects.equals(this.filters, query.filters) &&
        Objects.equals(this.view, query.view) &&
        Objects.equals(this.orders, query.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, view, orders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Query {\n");
    
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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


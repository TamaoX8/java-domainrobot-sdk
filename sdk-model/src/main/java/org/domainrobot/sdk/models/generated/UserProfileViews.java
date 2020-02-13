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
import org.domainrobot.sdk.models.generated.UserProfile;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * UserProfileViews
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-13T09:53:42.259+01:00")
public class UserProfileViews {
  @JsonProperty("profiles")
  private List<UserProfile> profiles = null;

  public UserProfileViews profiles(List<UserProfile> profiles) {
    this.profiles = profiles;
    return this;
  }

  public UserProfileViews addProfilesItem(UserProfile profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<UserProfile>();
    }
    this.profiles.add(profilesItem);
    return this;
  }

   /**
   * Get profiles
   * @return profiles
  **/
  @Valid
  @ApiModelProperty(value = "")
  public List<UserProfile> getProfiles() {
    return profiles;
  }

  public void setProfiles(List<UserProfile> profiles) {
    this.profiles = profiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfileViews userProfileViews = (UserProfileViews) o;
    return Objects.equals(this.profiles, userProfileViews.profiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfileViews {\n");
    
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
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


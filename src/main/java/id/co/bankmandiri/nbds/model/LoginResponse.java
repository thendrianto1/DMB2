package id.co.bankmandiri.nbds.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LoginResponse
 */


public class LoginResponse   {
  @JsonProperty("accessMenu")
  @Valid
  private List<String> accessMenu = null;

  @JsonProperty("accessToken")
  private String accessToken;

  @JsonProperty("branchName")
  private String branchName;

  @JsonProperty("branchNumber")
  private String branchNumber;

  @JsonProperty("fullName")
  private String fullName;

  @JsonProperty("isReserved")
  private Boolean isReserved;

  @JsonProperty("phoneNumber")
  private String phoneNumber;

  @JsonProperty("role")
  private String role;

  @JsonProperty("tellerCounter")
  private String tellerCounter;

  @JsonProperty("tellerGroup")
  private String tellerGroup;

  @JsonProperty("tellerId")
  private String tellerId;

  @JsonProperty("tellerUserId")
  private String tellerUserId;

  public LoginResponse accessMenu(List<String> accessMenu) {
    this.accessMenu = accessMenu;
    return this;
  }

  public LoginResponse addAccessMenuItem(String accessMenuItem) {
    if (this.accessMenu == null) {
      this.accessMenu = new ArrayList<String>();
    }
    this.accessMenu.add(accessMenuItem);
    return this;
  }

  /**
   * Get accessMenu
   * @return accessMenu
  */
  @ApiModelProperty(value = "")


  public List<String> getAccessMenu() {
    return accessMenu;
  }

  public void setAccessMenu(List<String> accessMenu) {
    this.accessMenu = accessMenu;
  }

  public LoginResponse accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Get accessToken
   * @return accessToken
  */
  @ApiModelProperty(value = "")


  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public LoginResponse branchName(String branchName) {
    this.branchName = branchName;
    return this;
  }

  /**
   * Get branchName
   * @return branchName
  */
  @ApiModelProperty(value = "")


  public String getBranchName() {
    return branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }

  public LoginResponse branchNumber(String branchNumber) {
    this.branchNumber = branchNumber;
    return this;
  }

  /**
   * Get branchNumber
   * @return branchNumber
  */
  @ApiModelProperty(value = "")


  public String getBranchNumber() {
    return branchNumber;
  }

  public void setBranchNumber(String branchNumber) {
    this.branchNumber = branchNumber;
  }

  public LoginResponse fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
  */
  @ApiModelProperty(value = "")


  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public LoginResponse isReserved(Boolean isReserved) {
    this.isReserved = isReserved;
    return this;
  }

  /**
   * Get isReserved
   * @return isReserved
  */
  @ApiModelProperty(value = "")


  public Boolean getIsReserved() {
    return isReserved;
  }

  public void setIsReserved(Boolean isReserved) {
    this.isReserved = isReserved;
  }

  public LoginResponse phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  */
  @ApiModelProperty(value = "")


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public LoginResponse role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  @ApiModelProperty(value = "")


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public LoginResponse tellerCounter(String tellerCounter) {
    this.tellerCounter = tellerCounter;
    return this;
  }

  /**
   * Get tellerCounter
   * @return tellerCounter
  */
  @ApiModelProperty(value = "")


  public String getTellerCounter() {
    return tellerCounter;
  }

  public void setTellerCounter(String tellerCounter) {
    this.tellerCounter = tellerCounter;
  }

  public LoginResponse tellerGroup(String tellerGroup) {
    this.tellerGroup = tellerGroup;
    return this;
  }

  /**
   * Get tellerGroup
   * @return tellerGroup
  */
  @ApiModelProperty(value = "")


  public String getTellerGroup() {
    return tellerGroup;
  }

  public void setTellerGroup(String tellerGroup) {
    this.tellerGroup = tellerGroup;
  }

  public LoginResponse tellerId(String tellerId) {
    this.tellerId = tellerId;
    return this;
  }

  /**
   * Get tellerId
   * @return tellerId
  */
  @ApiModelProperty(value = "")


  public String getTellerId() {
    return tellerId;
  }

  public void setTellerId(String tellerId) {
    this.tellerId = tellerId;
  }

  public LoginResponse tellerUserId(String tellerUserId) {
    this.tellerUserId = tellerUserId;
    return this;
  }

  /**
   * Get tellerUserId
   * @return tellerUserId
  */
  @ApiModelProperty(value = "")


  public String getTellerUserId() {
    return tellerUserId;
  }

  public void setTellerUserId(String tellerUserId) {
    this.tellerUserId = tellerUserId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginResponse loginResponse = (LoginResponse) o;
    return Objects.equals(this.accessMenu, loginResponse.accessMenu) &&
        Objects.equals(this.accessToken, loginResponse.accessToken) &&
        Objects.equals(this.branchName, loginResponse.branchName) &&
        Objects.equals(this.branchNumber, loginResponse.branchNumber) &&
        Objects.equals(this.fullName, loginResponse.fullName) &&
        Objects.equals(this.isReserved, loginResponse.isReserved) &&
        Objects.equals(this.phoneNumber, loginResponse.phoneNumber) &&
        Objects.equals(this.role, loginResponse.role) &&
        Objects.equals(this.tellerCounter, loginResponse.tellerCounter) &&
        Objects.equals(this.tellerGroup, loginResponse.tellerGroup) &&
        Objects.equals(this.tellerId, loginResponse.tellerId) &&
        Objects.equals(this.tellerUserId, loginResponse.tellerUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessMenu, accessToken, branchName, branchNumber, fullName, isReserved, phoneNumber, role, tellerCounter, tellerGroup, tellerId, tellerUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginResponse {\n");
    
    sb.append("    accessMenu: ").append(toIndentedString(accessMenu)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    branchNumber: ").append(toIndentedString(branchNumber)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    isReserved: ").append(toIndentedString(isReserved)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    tellerCounter: ").append(toIndentedString(tellerCounter)).append("\n");
    sb.append("    tellerGroup: ").append(toIndentedString(tellerGroup)).append("\n");
    sb.append("    tellerId: ").append(toIndentedString(tellerId)).append("\n");
    sb.append("    tellerUserId: ").append(toIndentedString(tellerUserId)).append("\n");
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


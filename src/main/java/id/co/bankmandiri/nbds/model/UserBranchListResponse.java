package id.co.bankmandiri.nbds.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserBranchListResponse
 */


public class UserBranchListResponse   {
  @JsonProperty("branchNumber")
  private String branchNumber;

  @JsonProperty("fullname")
  private String fullname;

  @JsonProperty("loginStatus")
  private Boolean loginStatus;

  @JsonProperty("role")
  private String role;

  @JsonProperty("tellerCounter")
  private String tellerCounter;

  @JsonProperty("userId")
  private String userId;

  public UserBranchListResponse branchNumber(String branchNumber) {
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

  public UserBranchListResponse fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

  /**
   * Get fullname
   * @return fullname
  */
  @ApiModelProperty(value = "")


  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public UserBranchListResponse loginStatus(Boolean loginStatus) {
    this.loginStatus = loginStatus;
    return this;
  }

  /**
   * Get loginStatus
   * @return loginStatus
  */
  @ApiModelProperty(value = "")


  public Boolean getLoginStatus() {
    return loginStatus;
  }

  public void setLoginStatus(Boolean loginStatus) {
    this.loginStatus = loginStatus;
  }

  public UserBranchListResponse role(String role) {
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

  public UserBranchListResponse tellerCounter(String tellerCounter) {
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

  public UserBranchListResponse userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @ApiModelProperty(value = "")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBranchListResponse userBranchListResponse = (UserBranchListResponse) o;
    return Objects.equals(this.branchNumber, userBranchListResponse.branchNumber) &&
        Objects.equals(this.fullname, userBranchListResponse.fullname) &&
        Objects.equals(this.loginStatus, userBranchListResponse.loginStatus) &&
        Objects.equals(this.role, userBranchListResponse.role) &&
        Objects.equals(this.tellerCounter, userBranchListResponse.tellerCounter) &&
        Objects.equals(this.userId, userBranchListResponse.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchNumber, fullname, loginStatus, role, tellerCounter, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBranchListResponse {\n");
    
    sb.append("    branchNumber: ").append(toIndentedString(branchNumber)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    loginStatus: ").append(toIndentedString(loginStatus)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    tellerCounter: ").append(toIndentedString(tellerCounter)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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


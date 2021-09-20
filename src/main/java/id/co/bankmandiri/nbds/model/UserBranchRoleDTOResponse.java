package id.co.bankmandiri.nbds.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserBranchRoleDTOResponse
 */


public class UserBranchRoleDTOResponse   {
  @JsonProperty("branchNumber")
  private String branchNumber;

  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdTime")
  private java.sql.Timestamp createdTime = null;

  @JsonProperty("roleId")
  private String roleId;

  @JsonProperty("updatedBy")
  private String updatedBy;

  @JsonProperty("updatedTime")
  private java.sql.Timestamp updatedTime = null;

  @JsonProperty("userBranchRoleId")
  private String userBranchRoleId;

  @JsonProperty("userId")
  private String userId;

  public UserBranchRoleDTOResponse branchNumber(String branchNumber) {
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

  public UserBranchRoleDTOResponse createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  */
  @ApiModelProperty(value = "")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public UserBranchRoleDTOResponse createdTime(java.sql.Timestamp createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   * @return createdTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public java.sql.Timestamp getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(java.sql.Timestamp createdTime) {
    this.createdTime = createdTime;
  }

  public UserBranchRoleDTOResponse roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Get roleId
   * @return roleId
  */
  @ApiModelProperty(value = "")


  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public UserBranchRoleDTOResponse updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * Get updatedBy
   * @return updatedBy
  */
  @ApiModelProperty(value = "")


  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public UserBranchRoleDTOResponse updatedTime(java.sql.Timestamp updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Get updatedTime
   * @return updatedTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public java.sql.Timestamp getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(java.sql.Timestamp updatedTime) {
    this.updatedTime = updatedTime;
  }

  public UserBranchRoleDTOResponse userBranchRoleId(String userBranchRoleId) {
    this.userBranchRoleId = userBranchRoleId;
    return this;
  }

  /**
   * Get userBranchRoleId
   * @return userBranchRoleId
  */
  @ApiModelProperty(value = "")


  public String getUserBranchRoleId() {
    return userBranchRoleId;
  }

  public void setUserBranchRoleId(String userBranchRoleId) {
    this.userBranchRoleId = userBranchRoleId;
  }

  public UserBranchRoleDTOResponse userId(String userId) {
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
    UserBranchRoleDTOResponse userBranchRoleDTOResponse = (UserBranchRoleDTOResponse) o;
    return Objects.equals(this.branchNumber, userBranchRoleDTOResponse.branchNumber) &&
        Objects.equals(this.createdBy, userBranchRoleDTOResponse.createdBy) &&
        Objects.equals(this.createdTime, userBranchRoleDTOResponse.createdTime) &&
        Objects.equals(this.roleId, userBranchRoleDTOResponse.roleId) &&
        Objects.equals(this.updatedBy, userBranchRoleDTOResponse.updatedBy) &&
        Objects.equals(this.updatedTime, userBranchRoleDTOResponse.updatedTime) &&
        Objects.equals(this.userBranchRoleId, userBranchRoleDTOResponse.userBranchRoleId) &&
        Objects.equals(this.userId, userBranchRoleDTOResponse.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchNumber, createdBy, createdTime, roleId, updatedBy, updatedTime, userBranchRoleId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBranchRoleDTOResponse {\n");
    
    sb.append("    branchNumber: ").append(toIndentedString(branchNumber)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    userBranchRoleId: ").append(toIndentedString(userBranchRoleId)).append("\n");
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


package id.co.bankmandiri.nbds.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoleMenuDTOResponse
 */


public class RoleMenuDTOResponse   {
  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdTime")
  private java.sql.Timestamp createdTime = null;

  @JsonProperty("menuId")
  private String menuId;

  @JsonProperty("roleId")
  private String roleId;

  @JsonProperty("roleMenuId")
  private String roleMenuId;

  @JsonProperty("updatedBy")
  private String updatedBy;

  @JsonProperty("updatedTime")
  private java.sql.Timestamp updatedTime = null;

  public RoleMenuDTOResponse createdBy(String createdBy) {
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

  public RoleMenuDTOResponse createdTime(java.sql.Timestamp createdTime) {
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

  public RoleMenuDTOResponse menuId(String menuId) {
    this.menuId = menuId;
    return this;
  }

  /**
   * Get menuId
   * @return menuId
  */
  @ApiModelProperty(value = "")


  public String getMenuId() {
    return menuId;
  }

  public void setMenuId(String menuId) {
    this.menuId = menuId;
  }

  public RoleMenuDTOResponse roleId(String roleId) {
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

  public RoleMenuDTOResponse roleMenuId(String roleMenuId) {
    this.roleMenuId = roleMenuId;
    return this;
  }

  /**
   * Get roleMenuId
   * @return roleMenuId
  */
  @ApiModelProperty(value = "")


  public String getRoleMenuId() {
    return roleMenuId;
  }

  public void setRoleMenuId(String roleMenuId) {
    this.roleMenuId = roleMenuId;
  }

  public RoleMenuDTOResponse updatedBy(String updatedBy) {
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

  public RoleMenuDTOResponse updatedTime(java.sql.Timestamp updatedTime) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleMenuDTOResponse roleMenuDTOResponse = (RoleMenuDTOResponse) o;
    return Objects.equals(this.createdBy, roleMenuDTOResponse.createdBy) &&
        Objects.equals(this.createdTime, roleMenuDTOResponse.createdTime) &&
        Objects.equals(this.menuId, roleMenuDTOResponse.menuId) &&
        Objects.equals(this.roleId, roleMenuDTOResponse.roleId) &&
        Objects.equals(this.roleMenuId, roleMenuDTOResponse.roleMenuId) &&
        Objects.equals(this.updatedBy, roleMenuDTOResponse.updatedBy) &&
        Objects.equals(this.updatedTime, roleMenuDTOResponse.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdTime, menuId, roleId, roleMenuId, updatedBy, updatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleMenuDTOResponse {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    roleMenuId: ").append(toIndentedString(roleMenuId)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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


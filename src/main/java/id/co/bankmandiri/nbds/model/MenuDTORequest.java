package id.co.bankmandiri.nbds.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import id.co.bankmandiri.nbds.model.Timestamp1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MenuDTORequest
 */


public class MenuDTORequest   {
  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdTime")
  private Timestamp1 createdTime = null;

  @JsonProperty("menuId")
  private String menuId;

  @JsonProperty("menuName")
  private String menuName;

  @JsonProperty("updatedBy")
  private String updatedBy;

  @JsonProperty("updatedTime")
  private Timestamp1 updatedTime = null;

  public MenuDTORequest createdBy(String createdBy) {
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

  public MenuDTORequest createdTime(Timestamp1 createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   * @return createdTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public Timestamp1 getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Timestamp1 createdTime) {
    this.createdTime = createdTime;
  }

  public MenuDTORequest menuId(String menuId) {
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

  public MenuDTORequest menuName(String menuName) {
    this.menuName = menuName;
    return this;
  }

  /**
   * Get menuName
   * @return menuName
  */
  @ApiModelProperty(value = "")


  public String getMenuName() {
    return menuName;
  }

  public void setMenuName(String menuName) {
    this.menuName = menuName;
  }

  public MenuDTORequest updatedBy(String updatedBy) {
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

  public MenuDTORequest updatedTime(Timestamp1 updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Get updatedTime
   * @return updatedTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public Timestamp1 getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Timestamp1 updatedTime) {
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
    MenuDTORequest menuDTORequest = (MenuDTORequest) o;
    return Objects.equals(this.createdBy, menuDTORequest.createdBy) &&
        Objects.equals(this.createdTime, menuDTORequest.createdTime) &&
        Objects.equals(this.menuId, menuDTORequest.menuId) &&
        Objects.equals(this.menuName, menuDTORequest.menuName) &&
        Objects.equals(this.updatedBy, menuDTORequest.updatedBy) &&
        Objects.equals(this.updatedTime, menuDTORequest.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdTime, menuId, menuName, updatedBy, updatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuDTORequest {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
    sb.append("    menuName: ").append(toIndentedString(menuName)).append("\n");
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


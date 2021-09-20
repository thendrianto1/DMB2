package id.co.bankmandiri.nbds.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import id.co.bankmandiri.nbds.model.UserBranchListResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserBranchResponse
 */


public class UserBranchResponse   {
  @JsonProperty("currentPage")
  private Integer currentPage;

  @JsonProperty("responseList")
  @Valid
  private List<UserBranchListResponse> responseList = null;

  @JsonProperty("totalItem")
  private Integer totalItem;

  @JsonProperty("totalPage")
  private Integer totalPage;

  public UserBranchResponse currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

  /**
   * Get currentPage
   * @return currentPage
  */
  @ApiModelProperty(value = "")


  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public UserBranchResponse responseList(List<UserBranchListResponse> responseList) {
    this.responseList = responseList;
    return this;
  }

  public UserBranchResponse addResponseListItem(UserBranchListResponse responseListItem) {
    if (this.responseList == null) {
      this.responseList = new ArrayList<UserBranchListResponse>();
    }
    this.responseList.add(responseListItem);
    return this;
  }

  /**
   * Get responseList
   * @return responseList
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<UserBranchListResponse> getResponseList() {
    return responseList;
  }

  public void setResponseList(List<UserBranchListResponse> responseList) {
    this.responseList = responseList;
  }

  public UserBranchResponse totalItem(Integer totalItem) {
    this.totalItem = totalItem;
    return this;
  }

  /**
   * Get totalItem
   * @return totalItem
  */
  @ApiModelProperty(value = "")


  public Integer getTotalItem() {
    return totalItem;
  }

  public void setTotalItem(Integer totalItem) {
    this.totalItem = totalItem;
  }

  public UserBranchResponse totalPage(Integer totalPage) {
    this.totalPage = totalPage;
    return this;
  }

  /**
   * Get totalPage
   * @return totalPage
  */
  @ApiModelProperty(value = "")


  public Integer getTotalPage() {
    return totalPage;
  }

  public void setTotalPage(Integer totalPage) {
    this.totalPage = totalPage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBranchResponse userBranchResponse = (UserBranchResponse) o;
    return Objects.equals(this.currentPage, userBranchResponse.currentPage) &&
        Objects.equals(this.responseList, userBranchResponse.responseList) &&
        Objects.equals(this.totalItem, userBranchResponse.totalItem) &&
        Objects.equals(this.totalPage, userBranchResponse.totalPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, responseList, totalItem, totalPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBranchResponse {\n");
    
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    responseList: ").append(toIndentedString(responseList)).append("\n");
    sb.append("    totalItem: ").append(toIndentedString(totalItem)).append("\n");
    sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
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


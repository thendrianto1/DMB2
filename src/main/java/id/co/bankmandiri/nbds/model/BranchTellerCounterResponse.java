package id.co.bankmandiri.nbds.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import id.co.bankmandiri.nbds.model.BranchTellerCounterListResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BranchTellerCounterResponse
 */


public class BranchTellerCounterResponse   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("message")
  private String message;

  @JsonProperty("responseList")
  @Valid
  private List<BranchTellerCounterListResponse> responseList = null;

  public BranchTellerCounterResponse code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @ApiModelProperty(value = "")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public BranchTellerCounterResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public BranchTellerCounterResponse responseList(List<BranchTellerCounterListResponse> responseList) {
    this.responseList = responseList;
    return this;
  }

  public BranchTellerCounterResponse addResponseListItem(BranchTellerCounterListResponse responseListItem) {
    if (this.responseList == null) {
      this.responseList = new ArrayList<BranchTellerCounterListResponse>();
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

  public List<BranchTellerCounterListResponse> getResponseList() {
    return responseList;
  }

  public void setResponseList(List<BranchTellerCounterListResponse> responseList) {
    this.responseList = responseList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchTellerCounterResponse branchTellerCounterResponse = (BranchTellerCounterResponse) o;
    return Objects.equals(this.code, branchTellerCounterResponse.code) &&
        Objects.equals(this.message, branchTellerCounterResponse.message) &&
        Objects.equals(this.responseList, branchTellerCounterResponse.responseList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, responseList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchTellerCounterResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    responseList: ").append(toIndentedString(responseList)).append("\n");
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


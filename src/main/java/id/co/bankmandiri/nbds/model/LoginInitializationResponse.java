package id.co.bankmandiri.nbds.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LoginInitializationResponse
 */


public class LoginInitializationResponse   {
  @JsonProperty("phoneNumber")
  private String phoneNumber;

  @JsonProperty("userId")
  private String userId;

  @JsonProperty("verifyId")
  private String verifyId;

  public LoginInitializationResponse phoneNumber(String phoneNumber) {
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

  public LoginInitializationResponse userId(String userId) {
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

  public LoginInitializationResponse verifyId(String verifyId) {
    this.verifyId = verifyId;
    return this;
  }

  /**
   * Get verifyId
   * @return verifyId
  */
  @ApiModelProperty(value = "")


  public String getVerifyId() {
    return verifyId;
  }

  public void setVerifyId(String verifyId) {
    this.verifyId = verifyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginInitializationResponse loginInitializationResponse = (LoginInitializationResponse) o;
    return Objects.equals(this.phoneNumber, loginInitializationResponse.phoneNumber) &&
        Objects.equals(this.userId, loginInitializationResponse.userId) &&
        Objects.equals(this.verifyId, loginInitializationResponse.verifyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, userId, verifyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginInitializationResponse {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    verifyId: ").append(toIndentedString(verifyId)).append("\n");
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


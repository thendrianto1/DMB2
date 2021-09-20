package id.co.bankmandiri.nbds.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VerificationRequest
 */


public class VerificationRequest   {
  @JsonProperty("channel")
  private String channel;

  @JsonProperty("otp")
  private String otp;

  @JsonProperty("userId")
  private String userId;

  @JsonProperty("verifyId")
  private String verifyId;

  public VerificationRequest channel(String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * Get channel
   * @return channel
  */
  @ApiModelProperty(value = "")


  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public VerificationRequest otp(String otp) {
    this.otp = otp;
    return this;
  }

  /**
   * Get otp
   * @return otp
  */
  @ApiModelProperty(value = "")


  public String getOtp() {
    return otp;
  }

  public void setOtp(String otp) {
    this.otp = otp;
  }

  public VerificationRequest userId(String userId) {
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

  public VerificationRequest verifyId(String verifyId) {
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
    VerificationRequest verificationRequest = (VerificationRequest) o;
    return Objects.equals(this.channel, verificationRequest.channel) &&
        Objects.equals(this.otp, verificationRequest.otp) &&
        Objects.equals(this.userId, verificationRequest.userId) &&
        Objects.equals(this.verifyId, verificationRequest.verifyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, otp, userId, verifyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationRequest {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    otp: ").append(toIndentedString(otp)).append("\n");
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


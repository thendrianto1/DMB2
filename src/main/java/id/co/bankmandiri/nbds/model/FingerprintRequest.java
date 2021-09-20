package id.co.bankmandiri.nbds.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FingerprintRequest
 */


public class FingerprintRequest   {
  @JsonProperty("fingerprintISO")
  private String fingerprintISO;

  @JsonProperty("userId")
  private String userId;

  public FingerprintRequest fingerprintISO(String fingerprintISO) {
    this.fingerprintISO = fingerprintISO;
    return this;
  }

  /**
   * Get fingerprintISO
   * @return fingerprintISO
  */
  @ApiModelProperty(value = "")


  public String getFingerprintISO() {
    return fingerprintISO;
  }

  public void setFingerprintISO(String fingerprintISO) {
    this.fingerprintISO = fingerprintISO;
  }

  public FingerprintRequest userId(String userId) {
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
    FingerprintRequest fingerprintRequest = (FingerprintRequest) o;
    return Objects.equals(this.fingerprintISO, fingerprintRequest.fingerprintISO) &&
        Objects.equals(this.userId, fingerprintRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fingerprintISO, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FingerprintRequest {\n");
    
    sb.append("    fingerprintISO: ").append(toIndentedString(fingerprintISO)).append("\n");
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


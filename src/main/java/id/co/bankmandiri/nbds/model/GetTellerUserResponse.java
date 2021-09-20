package id.co.bankmandiri.nbds.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetTellerUserResponse
 */


public class GetTellerUserResponse   {
  @JsonProperty("fullName")
  private String fullName;

  @JsonProperty("lastLogin")
  private String lastLogin;

  @JsonProperty("loginStatus")
  private Boolean loginStatus;

  @JsonProperty("tellerCounter")
  private String tellerCounter;

  public GetTellerUserResponse fullName(String fullName) {
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

  public GetTellerUserResponse lastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

  /**
   * Get lastLogin
   * @return lastLogin
  */
  @ApiModelProperty(value = "")


  public String getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
  }

  public GetTellerUserResponse loginStatus(Boolean loginStatus) {
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

  public GetTellerUserResponse tellerCounter(String tellerCounter) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTellerUserResponse getTellerUserResponse = (GetTellerUserResponse) o;
    return Objects.equals(this.fullName, getTellerUserResponse.fullName) &&
        Objects.equals(this.lastLogin, getTellerUserResponse.lastLogin) &&
        Objects.equals(this.loginStatus, getTellerUserResponse.loginStatus) &&
        Objects.equals(this.tellerCounter, getTellerUserResponse.tellerCounter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, lastLogin, loginStatus, tellerCounter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTellerUserResponse {\n");
    
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    loginStatus: ").append(toIndentedString(loginStatus)).append("\n");
    sb.append("    tellerCounter: ").append(toIndentedString(tellerCounter)).append("\n");
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


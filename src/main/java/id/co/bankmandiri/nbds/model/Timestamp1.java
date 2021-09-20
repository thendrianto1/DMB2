package id.co.bankmandiri.nbds.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Timestamp1
 */


public class Timestamp1   {
  @JsonProperty("date")
  private Integer date;

  @JsonProperty("hours")
  private Integer hours;

  @JsonProperty("minutes")
  private Integer minutes;

  @JsonProperty("month")
  private Integer month;

  @JsonProperty("nanos")
  private Integer nanos;

  @JsonProperty("seconds")
  private Integer seconds;

  @JsonProperty("time")
  private Long time;

  @JsonProperty("year")
  private Integer year;

  public Timestamp1 date(Integer date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(value = "")


  public Integer getDate() {
    return date;
  }

  public void setDate(Integer date) {
    this.date = date;
  }

  public Timestamp1 hours(Integer hours) {
    this.hours = hours;
    return this;
  }

  /**
   * Get hours
   * @return hours
  */
  @ApiModelProperty(value = "")


  public Integer getHours() {
    return hours;
  }

  public void setHours(Integer hours) {
    this.hours = hours;
  }

  public Timestamp1 minutes(Integer minutes) {
    this.minutes = minutes;
    return this;
  }

  /**
   * Get minutes
   * @return minutes
  */
  @ApiModelProperty(value = "")


  public Integer getMinutes() {
    return minutes;
  }

  public void setMinutes(Integer minutes) {
    this.minutes = minutes;
  }

  public Timestamp1 month(Integer month) {
    this.month = month;
    return this;
  }

  /**
   * Get month
   * @return month
  */
  @ApiModelProperty(value = "")


  public Integer getMonth() {
    return month;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }

  public Timestamp1 nanos(Integer nanos) {
    this.nanos = nanos;
    return this;
  }

  /**
   * Get nanos
   * @return nanos
  */
  @ApiModelProperty(value = "")


  public Integer getNanos() {
    return nanos;
  }

  public void setNanos(Integer nanos) {
    this.nanos = nanos;
  }

  public Timestamp1 seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }

  /**
   * Get seconds
   * @return seconds
  */
  @ApiModelProperty(value = "")


  public Integer getSeconds() {
    return seconds;
  }

  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }

  public Timestamp1 time(Long time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @ApiModelProperty(value = "")


  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public Timestamp1 year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
  */
  @ApiModelProperty(value = "")


  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Timestamp1 timestamp1 = (Timestamp1) o;
    return Objects.equals(this.date, timestamp1.date) &&
        Objects.equals(this.hours, timestamp1.hours) &&
        Objects.equals(this.minutes, timestamp1.minutes) &&
        Objects.equals(this.month, timestamp1.month) &&
        Objects.equals(this.nanos, timestamp1.nanos) &&
        Objects.equals(this.seconds, timestamp1.seconds) &&
        Objects.equals(this.time, timestamp1.time) &&
        Objects.equals(this.year, timestamp1.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, hours, minutes, month, nanos, seconds, time, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timestamp1 {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    nanos: ").append(toIndentedString(nanos)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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


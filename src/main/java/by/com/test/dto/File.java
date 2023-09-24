package by.com.test.dto;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class File {
  @SerializedName("file_path")
  private String path;

  private String status;

  public void setStatusUpdate() {
    status = Status.STATUS_UPDATE;
  }

  public void setStatusCreate() {
    status = Status.STATUS_CREATE;
  }

  public void setStatusSkip() {
    status = Status.STATUS_SKIP;
  }

  public void setStatusError() {
    status = Status.STATUS_ERROR;
  }

  public String getStatus() {
    return status;
  }

  @NoArgsConstructor(access = AccessLevel.PRIVATE)
  public static class Status {
    public static final String STATUS_UPDATE = "status_update";
    public static final String STATUS_CREATE = "status_create";
    public static final String STATUS_SKIP = "status_skip";
    public static final String STATUS_ERROR = "status_error";
  }
}

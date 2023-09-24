package by.com.test.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class PowerShellAnswer {
  @SerializedName("Hash")
  private String hash;

  @SerializedName("Path")
  private String path;
}

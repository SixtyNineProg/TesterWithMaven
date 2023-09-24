package by.com.test.dto;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Data;

@Data
public class Server {
  @SerializedName("server_name")
  private String name;

  private List<File> files;

  private boolean connection;
}

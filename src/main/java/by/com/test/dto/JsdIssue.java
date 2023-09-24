package by.com.test.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class JsdIssue {

  public static final String SEND_PASSWORD_TO_LINE_MANAGER_EMAIL =
      "Send password to line manager Email";

  private String id;

  private String self;

  private String key;

  private Fields fields;

  @Data
  public static class Fields {

    private String key;

    private String assignee;

    @SerializedName(value = "customfield_12607")
    private User user;

    @SerializedName(value = "customfield_12610")
    private Domain domain;

    @SerializedName(value = "customfield_12615")
    private SendPass sendPass;

    @Data
    public static class SendPass {

      private String value;

      public String getValue() {
        return value == null ? SEND_PASSWORD_TO_LINE_MANAGER_EMAIL : value;
      }
    }

    @Data
    public static class User {

      private String name;
    }

    @Data
    public static class Domain {

      private String value;
    }
  }
}

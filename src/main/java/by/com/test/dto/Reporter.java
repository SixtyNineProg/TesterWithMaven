package by.com.test.dto;

import lombok.Data;

@Data
public class Reporter {
  private String self;
  private String name;
  private String key;
  private String emailAddress;
  private String displayName;
  private boolean active;
  private String timeZone;
}

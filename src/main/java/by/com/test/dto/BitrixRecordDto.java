package by.com.test.dto;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class BitrixRecordDto {

  private Result result;

  @Data
  @AllArgsConstructor
  public static class Result {

    private List<Bitrix> bitrixList;
  }

  @Data
  @AllArgsConstructor
  public static class Bitrix {

    @SerializedName("NAME")
    private String name;

    @SerializedName("PROPERTY_1262")
    private Map<String, String> surname;

    @SerializedName("PROPERTY_1263")
    private FirstName firstName;

    @SerializedName("PROPERTY_1264")
    private MiddleName middleName;

    @SerializedName("PROPERTY_1265")
    private MainNumber mainNumber;

    @SerializedName("PROPERTY_1266")
    private AdditionalNumber additionalNumber;

    @SerializedName("PROPERTY_1267")
    private BillingAccount billingAccount;

    @SerializedName("PREVIEW_TEXT")
    private String comment;

    @SerializedName("DATE_CREATE")
    private String creationDate;
  }

  @Data
  @AllArgsConstructor
  public static class Surname {

    private String value;
  }

  @Data
  private static class FirstName {

    private Map<String, String> value;
  }

  @Data
  private static class MiddleName {

    private Map<String, String> value;
  }

  @Data
  private static class MainNumber {

    private Map<String, String> value;
  }

  @Data
  private static class AdditionalNumber {

    private Map<String, String> value;
  }

  @Data
  private static class BillingAccount {

    private Map<String, String> value;
  }
}

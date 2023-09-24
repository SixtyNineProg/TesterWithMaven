package by.com.test;

import by.com.test.dto.BitrixRecordDto;
import com.google.gson.Gson;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONObject;

@Slf4j
public class App {
  public static void main(String[] args) {
    org.apache.log4j.BasicConfigurator.configure();

    String json =
        "{\n"
            + "  \"result\": [\n"
            + "    {\n"
            + "      \"ID\": \"31071571\",\n"
            + "      \"IBLOCK_ID\": \"86\",\n"
            + "      \"NAME\": \"\\u041b\\u0435\\u0431\\u0435\\u0434\\u0435\\u0432\\u0430 \\u0415\\u043a\\u0430\\u0442\\u0430\\u0440\\u0438\\u043d\\u0430 \\u0410\\u043b\\u0435\\u043a\\u0441\\u0435\\u0435\\u0432\\u043d\\u0430\",\n"
            + "      \"IBLOCK_SECTION_ID\": null,\n"
            + "      \"CREATED_BY\": \"0\",\n"
            + "      \"BP_PUBLISHED\": \"Y\",\n"
            + "      \"CODE\": null,\n"
            + "      \"PREVIEW_TEXT\": \"\",\n"
            + "      \"DATE_CREATE\": \"01.11.2021 12:23:10\",\n"
            + "      \"PREVIEW_TEXT_TYPE\": \"text\",\n"
            + "      \"PROPERTY_1262\": {\n"
            + "        \"542364380\": \"\\u041b\\u0435\\u0431\\u0435\\u0434\\u0435\\u0432\\u0430\"\n"
            + "      },\n"
            + "      \"PROPERTY_1263\": {\n"
            + "        \"542364381\": \"\\u0415\\u043a\\u0430\\u0442\\u0430\\u0440\\u0438\\u043d\\u0430\"\n"
            + "      },\n"
            + "      \"PROPERTY_1264\": {\n"
            + "        \"542364382\": \"\\u0410\\u043b\\u0435\\u043a\\u0441\\u0435\\u0435\\u0432\\u043d\\u0430\"\n"
            + "      },\n"
            + "      \"PROPERTY_1265\": {\n"
            + "        \"542364383\": \"+375447101053\"\n"
            + "      },\n"
            + "      \"PROPERTY_1266\": {\n"
            + "        \"542364384\": \"+375111111111\"\n"
            + "      },\n"
            + "      \"PROPERTY_1267\": {\n"
            + "        \"542364385\": \"111\"\n"
            + "      }\n"
            + "    },\n"
            + "    {\n"
            + "      \"ID\": \"31073558\",\n"
            + "      \"IBLOCK_ID\": \"86\",\n"
            + "      \"NAME\": \"\\u0422\\u0435\\u0441\\u0442\",\n"
            + "      \"IBLOCK_SECTION_ID\": null,\n"
            + "      \"CREATED_BY\": \"0\",\n"
            + "      \"BP_PUBLISHED\": \"Y\",\n"
            + "      \"CODE\": null,\n"
            + "      \"PREVIEW_TEXT\": \"\\u0422\\u0435\\u0441\\u0442\",\n"
            + "      \"DATE_CREATE\": \"01.11.2021 12:40:51\",\n"
            + "      \"PREVIEW_TEXT_TYPE\": \"text\",\n"
            + "      \"PROPERTY_1262\": {\n"
            + "        \"542392162\": \"\\u0411\\u0430\\u0431\\u0438\\u0446\\u043a\\u0430\\u044f\"\n"
            + "      },\n"
            + "      \"PROPERTY_1263\": {\n"
            + "        \"542392163\": \"\\u0412\\u0438\\u043a\\u0442\\u043e\\u0440\\u0438\\u044f\"\n"
            + "      },\n"
            + "      \"PROPERTY_1264\": {\n"
            + "        \"542392164\": \"\\u041f\\u0430\\u0432\\u043b\\u043e\\u0432\\u043d\\u0430\"\n"
            + "      },\n"
            + "      \"PROPERTY_1265\": {\n"
            + "        \"542392165\": \"+375293100609\"\n"
            + "      },\n"
            + "      \"PROPERTY_1266\": {\n"
            + "        \"542392166\": \"+375293100609\"\n"
            + "      },\n"
            + "      \"PROPERTY_1267\": {\n"
            + "        \"542392167\": \"444\"\n"
            + "      }\n"
            + "    }\n"
            + "  ]\n"
            + "}";

    Gson gson = new Gson();

    JSONObject jsonObject = new JSONObject(json);
    System.out.println(jsonObject);
    JSONArray jsonArray = jsonObject.getJSONArray("result");
    System.out.println(jsonArray);

    List<BitrixRecordDto.Bitrix> bitrixList =
        Arrays.asList(gson.fromJson(jsonArray.toString(), BitrixRecordDto.Bitrix[].class));

    System.out.println(bitrixList.get(0).getSurname());

    System.out.println(bitrixList);
  }
}

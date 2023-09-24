package by.com.test.utils;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JsdApiUtils {
  public static final String APPLICATION_JSON = "application/json";
  public static final String CONTENT_TYPE = "Content-Type";
  public static final String JQL = "jql";

  public static HttpResponse<JsonNode> searchIssues(
      String username, String password, String jsdUrl, String endpoint, String jql)
      throws UnirestException {
    String url = jsdUrl + endpoint;
    System.out.println(url);

    return Unirest.get(url)
        .basicAuth(username, password)
        .header(CONTENT_TYPE, APPLICATION_JSON)
        .queryString(JQL, jql)
        .asJson();
  }
}

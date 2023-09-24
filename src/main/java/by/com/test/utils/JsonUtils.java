package by.com.test.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JsonUtils {

  public static final Gson GSON = new Gson();

  public static <T> List<T> jsonToList(String jsonArray) {
    Type listType = new TypeToken<ArrayList<T>>() {}.getType();
    return GSON.fromJson(jsonArray, listType);
  }

  public static <T> String listToJson(List<T> objectList) {
    return GSON.toJson(objectList);
  }

  public static <T> T jsonToObject(String jsonObject, Class<T> model) {
    return GSON.fromJson(jsonObject, model);
  }

  public static <T> String objToJson(T object) {
    return GSON.toJson(object);
  }
}

package by.com.test.dto;

import lombok.Data;

@Data
public class Restaurant {
  private String name;
  private Owner owner;
  private Cook cook;
  private Waiter waiter;

  @Data
  public static class Owner {
    private String name;
    private UserAddress address;
  }

  @Data
  public static class Cook {
    private String name;
    private int age;
    private int salary;
  }

  @Data
  public static class Waiter {
    private String name;
    private int age;
    private int salary;
  }

  @Data
  public static class UserNested {
    private String name;
    private String email;
    private boolean isDeveloper;
    private int age;
    private UserAddress userAddress;
  }

  @Data
  public static class UserAddress {
    private String street;
    private String houseNumber;
    private String city;
    private String country;
  }
}

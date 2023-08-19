import design_patterns.builder_pattern.User;

public class BuilderClient {
  public static void main(String[] args) {

    // object using the public constructor
    User user1 = new User.UserBuilder()
        .setEmail("Harshit@gmail.com")
        .setUsername("Harshit Pachori")
        .setUserid("1")
        .build();

    // object using the static method
    User user2 = User.UserBuilder
        .builder()
        .setEmail("test@gmail.com")
        .build();

    System.out.println(user1);
    System.out.println(user2);

  }
}

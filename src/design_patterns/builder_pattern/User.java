package design_patterns.builder_pattern;

public class User {

  private final String userid;
  private final String username;
  private final String email;

  private User(UserBuilder builder) {
    this.userid = builder.userid;
    this.email = builder.email;
    this.username = builder.username;
  }

  public String getUserid() {
    return userid;
  }

  public String getUsername() {
    return username;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String toString() {
    return "User [ userid = " + userid + ", username = " + username + ", email = " + email + " ]";
  }

  public static class UserBuilder {
    private String userid;
    private String username;
    private String email;

    public UserBuilder() {

    }

    // first make constructor private before using below method
    public static UserBuilder builder() {
      return new UserBuilder();
    }

    public UserBuilder setUserid(String userid) {
      this.userid = userid;
      return this;
    }

    public UserBuilder setUsername(String username) {
      this.username = username;
      return this;
    }

    public UserBuilder setEmail(String email) {
      this.email = email;
      return this;
    }

    public User build() {
      User user = new User(this);
      return user;
    }

  }

}

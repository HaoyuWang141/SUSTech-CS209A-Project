package sustech.project.javaproject.entity;

public class User1 {
  private String name;
  private String pwd;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", pwd='" + pwd + '\'' +
        '}';
  }
}

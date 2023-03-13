package test;

public class PersonTest {
  public static void main(String[] args) {
    Person p = new Person();
    p.setAge(10);
    System.out.println(p.getAge());

    // p.age = 200;
    // private로 설정해놔서 값을 따로 설정하는걸 막을수 있음
  }
}

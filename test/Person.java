package test;

public class Person {
  // 멤버 변수 값은 private값을 사용하는것이 기본적임(정보은닉)
  /* 
   * member variable은 특별한 이유가 없는한 private로 만들어라
   * 그 member variable을 클래스 외부에서 접근해야 한다면 그를 위한
   * method를 public으로 구현해라
   * 예를 들면, myAge라는 member variable에 값을 설정해야 하는 메서드는 
   * setAge로, myAge라는 member variable의 값을 읽어오는 메서드는 getAge로
   * public 접근제어장치를 명시하여 구현하면 된다
   */
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  // 멤버 값을 private로 설정해놔서 따로 값을 설정하는 메서드를 만들어줘야함
  public void setAge(int age) {
    // setAge를 따로 만들면 조건을 만들어서 제한을 걸수있음
    if (age >= 0 && age <= 150) 
      this.age = age;
    System.out.println("나이의 범위는 0부터 150까지 입니다");
  }

  public int getAge() {
    return age;
  }

 
}


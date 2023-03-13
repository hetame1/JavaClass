# 2023 - 03 - 03

## OOP 특징

- **추상화(Abstraction)**
- **캡슐화(Encapsulation)**
- **상속(Inheritance)**
- **다형성(Polymorphism)**
- **정보은닉(Information Hiding)**

int와 integer는 모두 정수를 표현하는 자료형

그러나 int는 `기본 자료형(primitive data type)`이며, integer는 `객체(object)`

따라서, integer는 int보다 더 많은 기능을 제공

### Primitive Type

- `byte`: 8비트 크기의 부호 있는 정수 타입
- `short`: 16비트 크기의 부호 있는 정수 타입
- `int`: 32비트 크기의 부호 있는 정수 타입
- `long`: 64비트 크기의 부호 있는 정수 타입
- `float`: 32비트 크기의 부동 소수점 타입
- `double`: 64비트 크기의 부동 소수점 타입
- `char`: 16비트 크기의 유니코드 문자 타입
- `boolean`: true/false 값을 저장하는 타입

primitive 타입은 `값(value)`을 직접 저장하며, `스택(stack)` 메모리에 저장

따라서, 변수에 저장된 값을 수정하면, 해당 변수에 저장된 값이 직접 수정

### Reference Type

- `String`: 문자열을 저장하는 타입
- `Array`: 배열을 저장하는 타입

`레퍼런스 타입(reference type)`은 객체를 참조하는 타입

레퍼런스 타입은 해당 객체의 주소를 저장하는 변수를 선언할 때 사용되며, 

변수에 저장되는 값은 객체의 인스턴스가 생성되는 메모리 영역의 주소

객체는 `힙(heap)` 메모리에 생성되며, 객체에 대한 모든 레퍼런스가 없어지면

`가비지 컬렉터(garbage collector)`에 의해 자동으로 소멸됩니다.

### User-Defined type

`사용자 정의 타입(user-defined type)`은 기본 자료형과 마찬가지로 변수의 타입으로 

사용될 수 있으며, 객체를 생성하여 사용할 수 있음

### 자바 네이밍 규칙

`클래스`, `인터페이스`, `enum` 등의 이름은 대문자로 시작하며, 각 단어의 첫 글자는 대문자로 한다

`메서드`, `변수`, `패키지`, 모듈 등의 이름은 소문자로 시작하며, 각 단어의 첫 글자는 대문자로 한다

`상수(constant)`의 이름은 모두 대문자로 적고 각 단어는 밑줄로 구분한다

### 추상화

추상화는 객체들이 가지는 공통적인 특성이나 속성을 추출하여 일반화하는 과정

이를 통해 객체들 간의 공통점을 찾아내고, 이를 하나의 클래스로 묶어서 객체를 생성할 때 반복되는 

코드를 줄일 수 있음

# 2023-03-13

클래스 멤버 변수를 **private**으로 설정하는 이유는 객체 지향 프로그래밍의 기본 원칙 중 하나인 **정보은닉**을 위해서

정보은닉은 객체의 내부 데이터를 외부에서 직접적으로 접근하지 못하도록 제한하는 것

클래스 멤버 변수를 private으로 설정하면, 해당 변수에 직접적으로 접근할 수 없음

이를 통해 객체가 더욱 **안정적**이고 **예측 가능한** 방식으로 동작할 수 있도록 할 수 있음

이러한 상황을 방지하기 위해 클래스 멤버 변수를 private으로 설정하고, 필요한 경우 **public getter와 setter**를 제공하여 외부에서 안전하게 데이터를 사용할 수 있도록 함

또한, 객체의 데이터를 보호하여 객체의 **무결성**을 유지

이를 통해 객체의 데이터를 보호하고, 객체가 예상치 못한 결과를 초래하는 상황을 방지할 수 있습니다.

따라서, 클래스 멤버 변수를 private으로 설정하고, 필요한 경우 public getter와 setter를 제공하여 외부에서 안전하게 객체의 데이터를 사용할 수 있도록 함으로써, 객체의 무결성을 유지하고 예측 가능한 방식으로 동작할 수 있는 안정적인 객체 지향 프로그래밍을 구현할 수 있음
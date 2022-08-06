###### 01.WebEx_Java\com\ssafy\mms\oop\model
###### 01.WebEx_Java\com\ssafy\mms\oop\view
###### step02_mms_oop

## Singleton Pattern

: 하나의 클래스에 대해서 하나의 인스턴스 (객체 1번만 생성) 설계하는 것

- 설계 규칙 3가지 (MemberService.java에 적용)

  1. 생성자 public → `private` 로 선언
  2. 인스턴스 생성
    
      `private static 클래스명 instance = new 클래스명();`
    
  3. 인스턴스의 getter 선언
    
      ```java
      public static 클래스명 getInstance() {
        return instance;
      }
      ```
    

- Singleton Pattern 반영된 클래스 사용하기

  : 직접 객체 생성 불가 ~~클래스명 참조변수명 = new 클래스명();~~

  → 객체 생성하지 않고 해당 인스턴스를 반환하는 메서드 사용 `클래스명 참조변수명 = 클래스명.getInstance();`

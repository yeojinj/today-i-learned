## JDK8 추가
</br>

1. interface  
  default method  
  static method  
2. Lambda 표현식  
  Lambda function  
3. `::` 더블콜론 연산자
    - 형식: `타겟레퍼런스::메서드명`
    - static method 참조: `클래스명::static메서드명`
    - 특정 인스턴스 메서드 참조: `참조변수명::인스턴스메서드명`
    - 생성자 참조: `클래스명::new`
    - 예제  
      ```java
      System.out.println("hello");
      System.out::println
      ```
      ```java
      List<String> list = Arrays.List("a", "b", "c");
      for(int index = 0; index < list.size(); index++) {
        System.out.println(list.get(index));                                       
      }
      for(String s: list) {
        System.out.println(s);
      }
                                          // System: 클래스 / out: static (객체 타입) 참조 변수 / println: 메서드
      list.forEach(System.out::println);  // list에 있는 요소를 하나씩 System.out(객체)의 println 메서드에 전달
      ```

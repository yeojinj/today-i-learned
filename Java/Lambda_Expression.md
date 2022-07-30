## Lambda Expression(람다식)
</br>

- 함수형 프로그래밍(Functional Programming)
- Java 8 지원
- 익명 함수(Anonymous Function) / 익명 객체(Anonymous Object) 지칭  
  : 이름이 없음, 파라미터는 () 괄호안에 지정
- 함수를 보다 단순하게 표현하는 법
- 함수형 인터페이스
    - 람다식을 선언하기 위한 인터페이스
    - 하나의 추상 메서드만 선언된 인터페이스
    - `@FunctionalInterface` 어노테이션
      - 다중의 추상 메서드 선언시 에러 발생
- 메서드와 함수 차이
   - 매개변수등를 받아서 수행하고, 결과를 반환하는 일련의 행위는 동일함
   - 메서드: 클래스에 종속(OOP 개념 용어)
   - 함수: 클래스에 독립(일반적 용어)
</br>

## 장단점
</br>

- 장점
  - 코드 라인수 줄어듬
  - 병렬 프로그래밍 가능
  - 람다식으로 실행문을 전달 할 수 있음
  - 가독성이 높음
- 단점
  - 재사용 불가: 일회용 함수
  - 불필요하게 과용하게 되면 가독성이 떨어짐
</br>

## 구현
</br>

- 익명 함수(Anonymous Function) 만들기
- 매개 변수와 매개 변수를 이용한 실행문 구현
- 형식:  
  `(매개변수, 매개변수) -> { 함수 실행문; };`  
  `() -> 함수 실행문`  
- 예시:  
  ```java
  int max(int a, int b) {
    return a > b ? a : b;
  }
  // 람다식
  (a, b) -> a > b ? a : b
  ```
</br>

## 문법
</br>

- 매개변수 1개이면 `()` 생략 가능
- 매개변수에 타입 지정시에는 1개 이어도 `(타입 매개변수명)` 괄호 표기해야함
- 매개변수가 없는 경우에는 `()` 빈 괄호 표기해야함
- 매개변수 2개 이상이면 `(a,b)` 괄호 생략 불가
- 매개변수의 타입이 추론 가능하면 생략가능
- 단일 수행문이면 `{}` 생략 가능
- 단일 수행문이어도 `return` 구문을 명시하면 `{}` 생략 불가
- 수행문이 `return` 구문 하나라면 식 또는 값만 적고 `return`과 `{}` 생략 가능
</br>

## 예제
</br>

```java
int min(int a, int b) {
  return a < b ? a : b;
}
// 람다식
(a, b) -> a < b ? a : b
```
</br>

```java
int printScore(String name, int score) {
  System.out.println(name + “:” + score);
}
// 람다식
(name, score) -> System.out.println(name + “:” + score)
```
</br>

```java
int square(int x) {
  return x * x;
} 
// 람다식
x -> x*x
```
</br>

```java
int lottoNo() {
  return Math.random(45)+1;
} 
// 람다식
() -> Math.random(45)+1
```
</br>

## 람다 함수형 인터페이스 예제
</br>

```java
@FunctionalInterface
interface Calculator{
	public double calc(int a, int b);
}

public class LambdaEx {
	public static void main(String[] args) {
		Calculator calcAdd = (a, b) -> a + b;
		Calculator calcSub = (a, b) -> a - b;
		Calculator calcMul = (a, b) -> a * b;
		Calculator calcDiv = (a, b) -> (double)a / b;
		
		System.out.println((int)calcAdd.calc(2, 5));
		System.out.println((int)calcSub.calc(2, 5));
		System.out.println((int)calcMul.calc(2, 5));
		System.out.println(calcDiv.calc(2, 5));
		
	}
}
```

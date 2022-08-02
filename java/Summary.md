# Java
<br></br>
# I. 기본 문법
<br></br>
## 자료형

기본형

- 정수형 : byte < short < int < long
- 실수형 : float < double
- 문자형 : char
- 논리형 : boolean(1바이트)

객체형

- java.lang.Object의 모든 클래스, 인터페이스, 배열

## **변수명**

- 대소문자 구분, 길이 제한 없음, 유니코드 지원
- 영문자, 숫자, _(언더바), $ 사용 가능 (숫자로 시작 X)
- 예약어(keyword) 사용 불가

## **형변환**

- 묵시적(자동) 형변환 : 작은 타입은 큰 타입에 자동 할당
    
    byte(1바이트) -> short(2바이트)
    
    char(2바이트) -> int(4바이트) -> long(8바이트) -> float(4바이트) -> double(8바이트)
    
- 명시적 형변환 : 객체형은 상속 시 다형성에서 진행
- boolean은 형변환 X

## **연산자**

- 논리 연산자
    
    `조건식1 & 조건식2` : 조건식1이 false여도 조건식2 수행
    
    `조건식1 | 조건식2` : 조건식1이 true여도 조건식2 수행
    
- 단축 논리 연산자
    
    `조건식1 && 조건식2` : 조건식1이 false면 조건식2 수행 X
    
    `조건식1 || 조건식2` : 조건식1이 true면 조건식2 수행 X
    

## **조건, 반복문**

- switch : case문 이어쓰기로 or 대체, break 꼭 쓰기

## **배열**

- 2차원 배열 선언
    
    `int [][] arr;`
    
    `int arr[][];`
    
    `int [] arr[];`
    

- 2차원 배열 복사
    
    얕은 복사: Arrays.copyOf로 레퍼런스를 복사하는 경우
    
    깊은 복사: for문 내부 Arrays.copyOf로 데이터 복사본을 만드는 경우
    

## **예외 처리**

try~ catch문

- catch나 finally는 없어도 됨
- try는 필수

`try (리소스 선언) { }` // finally 대신에 리소스 자원 알아서 해제

---
<br></br>
# II. Class, Object, Method
<br></br>
## **클래스**

- java.lang.Object : 모든 클래스 조상
- toString() : 객체 정보 문자열 반환
- equals() : 객체 내용 비교 (’정보가’ 같은 객체인지)
- hashCode() : 객체의 주소값을 변환해 생성한 객체의 고유한 정수값 반환

| 인스턴스 멤버 변수 | 클래스 멤버 변수 |
| --- | --- |
| - heap에 메모리 등록
- 객체 생성 후 객체 이름으로 접근
- Garbage Collector에 의해 소멸 | - static 키워드 사용 
- class area에 클래스 로딩 시 메모리 등록
- 객체 생성과 무관하게 클래스 이름으로 접근
 (객체 생성해서 객체 이름으로 접근도 가능은 함)
- 프로그램 종료 시 소멸 |

### **JVM 메모리 구조**

| class area | method stack | heap |
| --- | --- | --- |
| 클래스 원형
- field, method, 타입 정보 | 메서드 실행 공간
- thread 별로 관리
- 호출 순서대로 쌓임 | 객체 저장
- thread에 의해 공유
- 프로그래머가 삭제 X |

## **생성자**

생성자 : 기본 생성자, 중복 생성자

→ 역할 : 객체를 생성할 때 멤버변수를 초기화, 객체 생성 시 실행돼야 하는 작업 정리

→ return 타입 없음

→ 파라미터가 있는 생성자만 만들면 기본 생성자 제공 X (ex. FileInputStream)

## **메서드**

- 호출 시 메서드명, 매개변수 개수, 순서, 타입 확인
    
    → 전부 일치하는 게 있으면 호출
    
    → 더 큰 타입이 있으면 큰 타입의 메서드 호출(묵시적 형변환)
    
    → 없으면 **컴파일 시점에 오류**
    

- Variable arguments `…`
    
    메서드 선언 시 몇 개의 인자가 들어올지 모르는 경우 (배열로 선언은 생성, 초기화가 번거로움)
    
    ```java
    public void myMethod(int... params){
    	// 구현
    }
    ```
    

- 메서드 호출
    
    
    |  | static member | instance member |
    | --- | --- | --- |
    | 소속 | 클래스 | 객체 |
    | 접근 방법 - 같은 클래스 | 바로 호출 | 바로 호출 |
    | 접근 방법 - 다른 클래스 | 클래스명.멤버명 | 객체명.멤버명 |
- 기본형을 전달해주면 call by value
    
    객체형(Array, class)을 전달해주면 call by reference
    

## **this.**

객체 자신을 가리키는 참조변수

(객체 생성 시 자동으로 제공)

static 영역에서는 this 사용 불가

## **this(params)**

한 생성자에서 다른 생성자를 호출할 때 사용 (중복된 코드 제거)

첫 줄에서만 호출 가능

---
<br></br>
# III. 상속, 다형성
<br></br>
## **상속**

**다형성**

- **Overloading**(중복 정의)
    - 동일 : 메서드 이름
    - 차이 : 매개변수 개수 또는 순서, 타입
    - 리턴 타입, 접근 권한, 예외는 무관
    
    ex. println
    
- **Overriding**(재정의)
    
    부모로부터 상속 받은 메서드를 자식이 재정의하면 자동으로 자식의 메서드 호출 수행
    
    - 동일 : 메서드 이름, 리턴 타입, 매개변수(개수, 순서, 타입)
    - 차이 : 코드 구현부
    - **접근 권한** : 축소 불가 (public > protected > package > private)
    - **예외** : 확대 불가 (Exception < RuntimeException < NullPointerException)

- 부모가 자식에게 상속 가능한 것: default(package), protected, public 멤버 변수
    
    부모가 자식에게 상속 불가능한 것: private 멤버 변수, 생성자
    
    (자식의 생성자에서 명시적으로 지정 `super(매개변수);`)
    
- 부모는 자식을 reference 가능 `부모클래스명 = new 자식클래스명` ⭕ (부-자)
    
    자식은 부모를 reference 불가능 `~~자식클래스명 = new 부모클래스명~~` ❌
    
    형제끼리도 reference 불가능
    

---
<br></br>
# IV. Interface, Generic
<br></br>
## abstract class

- 추상 메서드(`abstract` 키워드 붙음)가 존재하는 클래스 (없어도 됨)
- 객체 직접 생성 불가
- 상속 강제, 반드시 모든 추상 메서드 재정의
- 단일 상속 (`extends 부모추상클래스`)

## interface

- 추상 메서드**만** 존재하는 클래스
- 객체 직접 생성 불가
- 상속 강제, 반드시 모든 추상 메서드 재정의
- 다중 구현 가능 (`implements 부모인터페이스1, 부모인터페이스2, …`)

- ‘class’ 대신 ‘`interface`’ 키워드로 선언
- 멤버변수 : 모두 `public static final` (생략 가능)
- 메서드 : 모두 `public abstract` (생략 가능)

- default : 인터페이스에 직접 메서드를 구현할 수 있음. 하위 호환성은 유지되고 인터페이스 보완 가능
- static

---
<br></br>
# V. File IO, XML 파싱
<br></br>
FileInputStream, FileOutputStream

- byte 단위
- 반환 타입 int

InputStreamReader

- Reader로 바꿔줌 (char)

BufferedReader, PrintWriter

- line 단위

IO 관련된 예외 : checked exception(명시적으로 예외 처리 필요)

## XML, JSON, CSV

이기종 간 데이터를 표준화해 주고받는 형식

## SAX

Event 기반

다양한 검색은 제한적이지만, 가벼움

## DOM Parser

XML 문서 전체를 메모리에 올려놓고 파싱

메모리를 많이 차지하지만, 다양한 검색을 하기 좋음

---
<br></br>
# VI. 기타
<br></br>
## **컴파일 에러와 런타임 에러**

1. 컴파일 에러
    - syntax 오류
    - 데이터 타입 오류
        
        (메서드 호출 오류)
        

1. 런타임 에러
    - RunTimeException
        
        NullPointerException, ArithmeticException(0으로 나눔), ArrayIndexOutOfBoundsException 등
        
    - 무한루프

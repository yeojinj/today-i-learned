## 데이터 타입

1. 기본형
    - 정수형
        
        byte(8bit), short(16bit), int(32bit)->default, long(64bit)
        (`5`: int, `5L`: long)
        
    - 실수형
        
        float(32bit), double(64bit)->default
        (`5.2`: double, `5.2f`: float)
        
    - 단일 문자형
        
        char(2byte=16bit)
        - unicode 지원
        - `char grade = 'A'`
        
    - 논리형
        
        boolean
        - `true` / `false`	// 0, 1 사용 X
        
2. 객체형
    - 모든 클래스, 인터페이스, 배열
    - 문자열 객체(클래스): java.lang.String
    `String name = "abc";`

### Type Casting (형변환)

기본형(primitive type) 크기 순서

byte =>short

char=>int=>long=>float=>double

boolean은 크기를 갖는 타입이 아님(참/거짓)

- 자동 형변환: 작은 타입은 큰 타입(기억 공간)에 자동 할당
- 명시적 형변환 (데이터 손실 가능성 有)
    - 기본형
    - 객체형 : 상속시에 다형성에서 진행
    - 형식 : `타입 변수명 = (타입) 변수명;`

<br></br>

## 자바 식별자(identifier)

- 대소문자 구분
- 길이 제한 없음 : 의미 있게 지정해야 함
- 유니코드 지원
- 시작 영문자, _(밑줄), $, (숫자는 시작은 불가능하지만, 조합사용가능)
    
    ex) `name`, `username`, `companyName`, `MAX_NO`, `no1`
    
- 예약어(keyword)는 사용불가
- 이름 규칙 준수(권장)

<br></br>

## 이름 규칙 (권장)

- 변수명 : `소문자 + 합성어대문자시작`
    
    `name`
    
    `companyName`
    
- 상수명 : `모두대문자_모두대문자`
    
    `PI`
    
    `MAX_VALUE`
    
- 메서드명 : `소문자 + 합성어대문자(매개변수 목록)`
    
    `println()`
    
    `charAt(int)`
    
- 클래스명 : `대문자시작 + 합성어대문자시작`
    
    `Member`
    
    `String. StringBuilder`
    
- 패키지명 : `모두소문자.모두소문자`
    
    `java.lang`
    
    `java.util`
    
    `com.ssafy.model`
    
    `com.ssafy.view`
    
<br></br>    

## 변수 선언 방법

1. 선언 : `타입 변수명;`
2. 선언 및 할당 : `타입 변수명 = 초기값;`
3. 선언 후 값 할당 (변경) : `변수명 = 값;`


## 배열이란?

동일한 타입의 데이터 0개 이상을 하나의 연속된 메모리 공간에서 관리하는 것

## 배열의 특징

- 요소 접근 속도가 매우 빠름
- 한번 생성하면 크기 변경 불가(Immutable)
    
    요소 추가, 삭제 불가
    

## 배열 만들기

### 선언

ex. `int[] arr;`
ex. `String[] names;`

### 생성

`new 자료형[길이]`

```java
arr = new int[3]; // arr: 메모리에 있는 배열을 가리키는 reference 타입 변수
```

### 초기화

- (명시적으로 초기화하기 전)자료형별 기본값으로 초기화됨
    
    
    | 자료형 | 기본값 |
    | --- | --- |
    | boolean | false |
    | char | ‘\u0000’ |
    | byte, short, int | 0 |
    | long | 0L |
    | float | 0.0f |
    | double | 0.0 |
    | 참조형 변수 | null |
- 생성과 동시에 초기화
    
    ```java
    int[] a1 = new int [] {1, 2, 3, 4};
    int[] a2 = {5, 6, 7, 8};
    ```
    
- 선언과 생성을 따로 할 경우 초기화
    
    ```java
    int[] arr;
    arr = {0, 1, 2, 3} // 컴파일 오류
    arr = new int[] {0, 1, 2, 3}; // 이렇게 해야 함
    ```
    

## 배열 사용

### 조회

- index 번호를 가지고 각 요소에 접근 가능 `arr[0]`, `arr[1]`
    1. for문 사용
        
        ```java
        for(int i=0; i<arr.length; i++) {
        	System.out.println(arr[i]);
        }
        ```
        
    2. for-each 사용
        
        ```java
        for(int a : arr) {
        	System.out.println(a);
        }
        ```
        
- `배열명.length`로 배열의 크기 조회

### 출력

- 요소에 접근해서 출력
- Arrays.toString() 사용

### 복사

`System.arrayCopy` 또는 `Arrays.copyOf` 사용

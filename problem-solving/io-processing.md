## 입출력 처리

- java.util.Scanner
    
    데이터를 읽어 구분자로 토큰화하고 형변환해 리턴해주는 클래스
    
    장점👍: 처리하기 쉽고 편리함
    
    단점👎: 대량의 데이터 처리 시 수행시간이 비효율적
    
    - nextInt() : int 타입 반환
    - nextDouble() : double 타입 반환
    - next() : 문자열 반환
    
    →  구분자를 만날 때까지 읽고, 구분자를 남겨둠
    
    처음으로 만나는 구분자(잔재)는 무시하고, 유효문자부터 식별
    
    위 과정을 반복
    
    - nextLine() : 문자열 반환
        
        → 개행문자를 만날 때까지 읽고, 개행문자는 버림
        
    
    즉, nextInt() 등으로 남겨둔 개행문자를 nextLine()이 처음에 읽을 수 있음
    </br></br>
    
    
- java.io.BufferedReader
    
    필터 스트림 유형
    
    줄 단위로 문자열 처리 기능 제공
    
    장점👍: 대량의 데이터 처리 시 수행시간이 효율적

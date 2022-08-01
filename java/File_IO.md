## 자바 입출력
</br>

- java.io.*
- 고려사항
  입력/출력  
  단위: byte, character  
  입/출력 device  
  -> 표준입력장치: System.in: InputStream (byte)  
  -> 표준출력장치: PrintStream, print(), println()  
  
- 입력용 스트림
  InputStream: byte, text 영문, 숫자 파일, 이미지, 음원(미디어 파일)  
  InputReader: character(2byte), text 한글 파일  
- 출력용 스트림
  OutputStream: byte  
  OutputReader: character(2byte)  
</br>

## Filter 스트림, Processing 스트림
</br>

- Node 스트림에 부가적인 기능 추가한 스트림  
- InputStreamReader
  byte -> char  
- BufferedReader
  라인 단위 입력용  
- PrintWriter
  라인 단위 출력용  
</br>

## 라인 단위로 문자열 입력
</br>

`BufferedReader in = new BufferedReader(new InputStreamReader(System.in));`  
- 입력 데이터가 '숫자'인 경우
  `int no = Integer.parseInt("숫자")`  
</br>

## 입력받은 데이터를 파일에 출력
</br>

- 라인 단위 입력 -> 라인 단위 출력
</br>

  

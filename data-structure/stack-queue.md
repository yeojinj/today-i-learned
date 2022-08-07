# Stack(스택)
<br>

## 스택이란?
: 목록의 끝에서만 제한적으로 접근할 수 있는 나열 구조
  한 쪽 끝에서만 자료를 넣거나 뺄 수 있는 선형 구조(LIFO - Last In First Out)으로 되어 있음
  
<br>

## 스택의 연산

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/Data_stack.svg/1920px-Data_stack.svg.png" width="400">

push() : 자료를 넣음  

pop() : 넣어둔 자료를 꺼냄. 가장 최근에 push한 자료부터 나옴  

top() : 스택의 가장 윗 데이터를 반환  

empty() : 스택이 비었다면 1(true)을 반환, 그렇지 않다면 0(false)를 반환  

<br>

## 스택의 활용

함수의 콜스택, 문자열 역순 출력, 연산자 후위표기법, 괄호 짝 맞추기 등

<br>

# Queue(큐)
<br>

## 큐란?
: 먼저 집어 넣은 데이터가 먼저 나오는 FIFO(First In First Out)구조로 저장하는 형식

<br>

## 큐의 연산

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Data_Queue.svg/1280px-Data_Queue.svg.png" width="400">

put() : 자료를 넣음  

get() : 넣어둔 자료를 꺼냄  

front() : 데이터를 get()할 수 있는 위치  

rear() : 데이터를 put()할 수 있는 위치  

<br>

## 큐의 활용

버퍼, BFS 등

<br>

## 참고
- https://ko.wikipedia.org/wiki/%EC%8A%A4%ED%83%9D
- https://ko.wikipedia.org/wiki/%ED%81%90_(%EC%9E%90%EB%A3%8C_%EA%B5%AC%EC%A1%B0)

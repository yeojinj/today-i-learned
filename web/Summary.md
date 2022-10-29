# 총정리

<br>

### block tag

div, section, header, p

<br>

### inline tag

span, a, input

<br>

### table

caption

thead

tbody

tr

td

th

<br>

### html에서 선언하는 방법

- javascript
    
    `<script>`
    
    `<src>`
    
- css
    
    `<style>`
    
    `<link>`
    
    `<style> @import url`
    
    tag에 style 지정 (인라인)
    
<br>

### CSS 선택자(Selector)

`#` : id

`.` : class

`,` : and

`>` : 자식

 `` : 자손

`+` : 인접 형제

`~` : 일반 형제

`position`

`fixed` : 뷰 포트 기준

`absolute` : 부모 기준

`relative` : 자기 자신 기준

`display none` vs `visiablity : hidden`

해당 태그가 차지하는 공간도 사라짐 / 차지하는 공간은 유지

<br>

### CSS 속성명

`[A^=V]` A 속성 값이 V로 시작하는 거

`[A$=V]` A 속성 값이 V로 끝나는 거

`[A*=V]` A 속성 값이 V를 포함하는 거

<br>

### 폼 액션

checkbox, select, radio → change 이벤트 → onchange

input text → keydown, keyup

<br>

### a 태그

href : 이동할 스테이지 url

target : 새창(default, `_blank`)/현재 페이지(`_self`)

<br>

### ajax 통신

웹에서 데이터 주고 받는 형식: html, **json**, csv

 : json → 문자열 변환

 : 서버에서 응답받은 문자열 → json으로 변환

통신 담당 객체 `xmlHttpRequest`

<br>

### CSS(in javascript)

element 가져오기 `document.getElementById`

`.setAttribute("style", "property:")`

`.setAttribute("class", "property:")` // 사전에 css가 정의되어 있을 경우

`document.getElementByValue()`

<br>

### javascript 연산자

`==` 값이 같은지 비교할 때

`===` type까지 같은지 비교할 때

<br>

### local storage

: 내 로컬에 저장됨. 세션이 끊겨도 사용 가능

문자열로만 저장 가능

모바일에서 사용 가능

javascript에서 핸들링

<br>

### fetch

`promise` 타입으로 전달

<br>

### call back 함수

명시적으로 호출 X, 함수를 만들어 놓고 특정 이벤트가 발생했을 때 호출됨

<br>

### 새창열기

`window.open('페이지URL', '창이름', '특성', 히스토리대체여부);`

부모 창에 값 전달 

`window.opener.document`

`window.opener.document.getElementById`

location.href = “URL”

<br>

### 자바스크립트 내장함수

alret : 브라우저 알림창

confirm : 브라우저의 확인/취소 선택창

prompt : 브라우저의 입력 창

parseInt : 문자열을 정수로

parseFloat : 문자열을 실수로

isNAN : not a number 인지

undefined : 변수가 선언되었지만 초기화되지 않음

## 웹 어플리케이션 (Web Component) 분류

- front-end
    - html, html5 : 웹 페이지 (컨텐츠) 구조화 (배치)
    - css, css3 : 웹 페이지 (컨텐츠) 표현 (색상, 글꼴 등)
    - javascript : 기능 (이벤트 처리, 데이터 검증, 동적 컨텐츠)
    - ajax (비동기 통신)
    - javascript 라이브러리 (프레임워크)
        - prototype.js
        - jquery, jquery-ui, jquery-mobile
        - bootstrap (ssafy)
        - vue.js, react.js, node.js 등
- back-end
    - Java Core 기술 : Servlet, JSP (el, jstl)
    - Framework : Spring, SpringBoot, Mybatis (SQL Mapping) (ssafy)
    - RDBMS : Oracle, Mysql (ssafy), DB2 등
- full stack = front-end + back-end

<br></br>

## Element(요소) : 태그 유형

1. 시작 태그 ~ 종료 태그 : body element
    
    ```html
    <ol type ="i">
    <li> 목록A </li>
    <li> 목록B </li>
    </ol>
    ```
    
2. 시작 태그 : empty element
    
    ```html
    <img src="a.gif"/>
    <br/>
    ```
    
<br></br>

## markup 주석 (html, xml 주석)

- 형식 : `<!--주석내용-->`
    
    응답 시에 전달 → 사용자가 소스 보기 가능
    
    페이지 배치 관련된 주석으로 작성함
    
    ### block tag
    
    - java : System.out.println("aaa"); // 출력하고 라인 이동
    `<div>`, `<p>`, `<h1>`, `<form>`, `<table>`
    
    ### inline tag
    
    - java : System.out.print("bbb"); // 출력만 함, 라인이동없음
    `<span>`, `<a>`, `<img>`, `<input>`
    
    ### 라인 이동 태그
    
    - `<br>`, `<br/>`

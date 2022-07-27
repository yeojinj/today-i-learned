## 다형성

- 변수: 큰 타입, 부모 타입
- 메서드
	1. 중복 정의(Overloading)  
		same class, [sub-class]
		- 규칙: 이름 동일, 파라미터 다름, 접근권한, 반환타입, 예외는 상관 없음
		- 예시  
			print(int);  
			print(String);  
			print(Member[]);				// 다형성 부모타입이므로 GeneralMember, SpecialMember ... 등도 담을 수 있음  
			print(GeneralMember[]);	// GeneralMember만 가능  
		- 옳지 않은 예시  
			print(ArrayList&lt;Member&gt;);  
			print(ArrayList&lt;GeneralMember&gt;);	// 둘 다 print(ArrayList); 로 파라미터 개수, 타입 동일  
	2. 재정의(Overriding)  
		부모가 정의한 일반화 기능이 자식과는 맞지 않을 때, 자식에 맞게 수정해서 사용하는 것  
		- 전제: 반드시 상속(sub-class)
		- 규칙: (1) 동일: 반환타입 메서드명  
					&emsp;&emsp;(2) 확대 가능: 접근 권한은 동일 또는 확대 가능  
					&emsp;&emsp;(3) 축소 가능: 예외는 미발생, sub-class, 동일 예외

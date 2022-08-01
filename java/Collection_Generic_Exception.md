###### 01.WebEx_Java\src\com.ssafy.day07.collection
###### 01.WebEx_Java\src\com.ssafy.mms.collection
## 배열

- 기본형, 객체형 자료 저장 구조
- static collection
- 크기 고정: 확장 불가
- CRUD 기능 제공 X
- 배열 저장 크기 **변수** : `배열명.length`
- 다차원 배열: 1차원, 2차원, 3차원 ... N차원


## Collection

- 객체들의 자료 저장구조
- java.util.*
- 크기 자동 확장
- CRUD 등 다양한 기능 제공
- 타입
	- List : 순서 존재, 중복 허용
	- Set : 순서 없음, 중복 불가
	- Map : Key=Value 형식 저장, Key는 Unique (중복 불가)
- 기본형은 Wrapper API를 사용해서 객체형으로 저장 가능
	자동으로 형변환 저장됨


## Wrapper API

- java.lang.*
- 기본형 -> 객체형 변환
	- byte -> Byte
	- short -> Short
	- int -> Integer
	- long -> Long
	- float -> Float
	- double -> Double
	- char -> Char
	- boolean -> Boolean


## List

- 순서 있음, 중복 허용   
- C(Create)   
	`boolean add(E e)`   
	`void add(int index, E element)`   
- R(Read)   
	`E get(int index)`   
	`int indexof(Object o)`   
- U(Update)   
	`E set(int index, E element)`   
- D(Delete)   
	`E remove(int index)`   
	`boolean remove(Object o)`   
- 크기: `int size()`   
- 단방향 검색: `Iterator<E> iterator()`   
- 양방향 검색: `ListIterator<E> listIterator()`   


## Set

- C(Create)   
	`boolean add(E e)`   
- R(Read)   
	??   
- U(Update)   
	??   
- D(Delete)   
	`boolean remove(Object o)`   
- 크기: `int size()`   
- 단방향 검색: `Iterator<E> iterator()`   


## Map

- C(Create)   
	`V put(K key, V value)`
- R(Read)   
	`V get(Object Key)`
- U(Update)   
	`V replace(Object Key)`
- D(Delete)   
	`V remove(Object key)`
- 크기: `int size()`   
- 단방향 검색: ??   
	`Set<K> keyset()`   


## Collection 자료 검색

- 단방향 검색: Set, Map(keySet(): Set)   
	-> `Iterator<E> iterator()`   
	`boolean hasNext()`   
	`E next()`   
	`default void remove()`   
- 양방향 검색: List   
	-> `ListIterator<E> listIterator()`   
	`void add(E e)`   
	`boolean hasNext()`   
	`boolean hasPrevious()`   
	`E next()`   
	`E previous()`   
	`void remove()`   
	`void set(E e)`   
	

## Generic

- jdk 1.5 추가
- 지정한 객체 타입 전용 Collection
	- `<E>` : Element 타입 객체, `ArrayList<Member>`
	- `<K>` : Key 객체
	- `<V>` : Value 객체
	- `<T>` : 지정한 타입 객체
	- `<? extends T?>` : 해당 타입의 sub class
	- `<? super T?>` : 해당 타입의 super class
- Generic Collection 예제
	```
	ArrayList<Member> list = new ArrayList<Member>();
	list.add(new Member(...));		// True
	list.add(new Date());			// False 오류 발생
	Member dto = list.get(0);
	dto.setMoblie("010-0000-0000");
	```
	

## Exception




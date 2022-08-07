# Tree(트리)
<br>

## 트리 구조란?

: 그래프의 일종, 한 노드에서 시작해서 다른 정점들을 순회하여 자기 자신에게 돌아오는 *순환*이 없는 *연결 그래프*
  
  - *순환(cycle)* : 시작 정점과 끝 정점이 같은 경로  
    <img src="https://i.imgur.com/BUJI3k1.png" width="200">
  - *연결 그래프(Connected Graph)* : 모든 두 꼭짓점 사이에 경로가 존재하는 그래프
  
<br>

## 트리의 구성 요소

노드(node) : 정점(vertex)  
간선(edge) : 노드와 노드를 연결하는 선  

<img src="https://gmlwjd9405.github.io/images/data-structure-tree/tree-terms.png" width="400">

루트 노드(root node) : 트리의 최상위 노드  
부모 노드(parent node) : 노드 A가 노드 B를 가리킬 때 A는 B의 부모 노드  
자식 노드(child node) : B는 A의 자식 노드  
형제(siblings) : 같은 부모를 가지는 노드  
잎 노드(leaf node) : 자식 노드가 없는 노드 (= terminal node)  
내부 노드(internal node) : 잎 노드가 아닌 노드  

<br>

## 트리의 특징

- 루트 노드는 1개  
  루트 노드는 0개 이상의 자식 노드를 가짐  
  그 자식 노드 또한 0개 이상의 자식 노드를 가짐 (반복적 정의)  

- 순환이 존재할 수 없음
- 모든 노드는 어떤 자료형으로도 표현 가능
- 루트에서 어떤 노드로 가는 경로는 유일함
- 모든 자식 노드는 1개의 부모 노드만을 가짐
- 노드의 개수가 N개면, 간선은 N-1개

<br>

## 트리의 활용

가족 관계도, 디렉터리 구조, 조직도 등

<img src="https://t1.daumcdn.net/cfile/tistory/277A7B37582821FA19" width="400">

<br>

## 이진 트리(Binary Tree)

부모 노드 밑의 자식 노드가 최대 2개인 트리

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/Binary_tree.svg/200px-Binary_tree.svg.png">

<br>

## 이진 트리 탐색

1. 전위 순회  
  노드 → 왼쪽 서브트리 → 오른쪽 서브트리  
    <img src="https://skilled.dev/images/pre-order-traversal.gif" width="350">

2. 중위 순회  
  왼쪽 서브트리 → 노드 → 오른쪽 서브트리  
    <img src="https://skilled.dev/images/in-order-traversal.gif" width="350">

3. 후위 순회  
  왼쪽 서브트리 → 오른쪽 서브트리 → 노드  
    <img src="https://skilled.dev/images/post-order-traversal.gif" width="350">

<br>

## 참고
- https://ko.wikipedia.org/wiki/%ED%8A%B8%EB%A6%AC_%EA%B5%AC%EC%A1%B0
- https://gmlwjd9405.github.io/2018/08/12/data-structure-tree.html
- https://skilled.dev/course/tree-traversal-in-order-pre-order-post-order

<br>

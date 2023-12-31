
# 다이나믹 프로그래밍

- 메모리를 적절히 사용하여 수행시간을 향상시키는 방법
- 이미 계산된 결과를 별도의 메모리에 저장하여 다시 계산하지 않도록 한다.
- 일반적으로 Top-Down과 Bottom-Up 두가지 방식으로 구성된다.
- 동적계획법이라고도 부른다.

## 다이나믹 프로그래밍의 조건

- 다이나믹 프로그래밍은 다음과 같은 조건을 문제가 만족할 때 사용할 수 있다.
1. 최적 부분 구조
    - 큰 문제를 작은 문제로 나눌 수 있으며, 작은 문제의 답을 모아 큰 문제를 해결할 수 있다.
2. 부분 문제의 중복
    - 동일한 작은 문제를 반복적으로 해결해야 한다.


![Untitled](https://github.com/soberdam/ssafy-10th-algorithm-study/assets/106129404/d6e4c1a2-049e-4812-ad41-56f7afa4c9e6)

- 피보나치 수열을 빅오표기법으로 표기한 O(2^n)의 지수 시간 복잡도를 가진다.
- f(30)을 계산하려면 10번의 연산을 해야한다.

![Untitled (1)](https://github.com/soberdam/ssafy-10th-algorithm-study/assets/106129404/e7923632-3dff-4ed6-8ed8-bfd13ec94dc2)

# 다이나믹 프로그래밍의 방식

## 메모이제이션

- 다이나믹 프로그래밍을 구현하는 기법 중 하나이다.
- **한번 계산한 결과를 메모리 공간에 메모**하는 기법
    - 같은 문제를 다시 호출할 때 메모한 결과를 그대로 가져온다.
    - 값을 기록해 놓는다는 뜻으로 캐싱(cashing)이라고도 한다.
- 이전에 계산한 결과를 일시적으로 기록해 놓는 넓은 개념으로, DP에 국한되지 않는다.
- 기록만 해놓고 DP를 위해 활용하지 않을 수도 있다.

## Top-down vs Bottom-up

- Top-down(메모이제이션)은 하향식, Bottom=up은 상향식이라고 부른다.
- DP의 전형적인 형태는 Bottom-up
    - 결과 저장용 배열은 DP테이블이라고 한다.


![Untitled (2)](https://github.com/soberdam/ssafy-10th-algorithm-study/assets/106129404/e3080876-2c6a-48a5-82a5-f0d17a007e86)
![Untitled (3)](https://github.com/soberdam/ssafy-10th-algorithm-study/assets/106129404/31078440-234f-43f6-895e-52b6966ddb27)

- 메모이제이션을 사용할 경우 피보나치 수열의 시간복잡도는 O(N)이다.

## 다이나믹 프로그래밍 vs 분할 정복
![Untitled (4)](https://github.com/soberdam/ssafy-10th-algorithm-study/assets/106129404/3d9509a8-b3b9-4d9c-919f-026ca7e8ca04)

- 다이나믹 프로그래밍과 분할 정복은 모두 최적 부분 구조를 가질 때 사용할 수 있다.
    - 큰 문제를 작은 문제로 나눌 수 있으며, 작은 문제의 답을 모아 큰 문제를 해결하는 상황
- DP와 분할정복의 차이는 부분 문제의 중복이다.
    - DP에서는 각 부분 문제가 서로 영향을 미치며 중복된다.
    - 분할정복 문제에서는 동일한 부분 문제가 반복적으로 계산되지 않는다.




## DP 문제에 접근하는 방법

- 가장 먼저 이 **문제가 다이나믹 프로그래밍 문제라는 것을 파악**해야 한다.
- 그리디, 완전탐색, 구현 등의 아이디어로 문제를 해결할 수 있는지 확인헤보고
- 다른 풀이방법이 떠오르지 않으면 DP를 고려한다.
- 일단 재귀로 완전탐색 프로그램을 작성한 후 부분 문제가 중복되면 DP로 개선할 수 있다.
- 문제마다 점화식이 다르기 때문에 일반적으로 코테에서는 기본 유형, 쉬운 유형이 나온다.

## DP 문제 풀이 과정

1. 테이블 정의하기
2. 점화식(인접한 항들 사이의 관계식) 찾기
3. 초기값 정하기

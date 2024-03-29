//5. 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
//첫째 줄에 다음 세 가지 중 하나를 출력한다.
//A가 B보다 큰 경우에는 '>'를 출력한다.
//A가 B보다 작은 경우에는 '<'를 출력한다.
//A와 B가 같은 경우에는 '=='를 출력한다.
//(조건 3항 연산자 이용)

#include <stdio.h>

int main(void)
{
	int A = 0, B = 0;
	char num = 0;

	printf("두 정수를 입력하세요.: ");
	scanf_s("%d%d", &A, &B);

	num = (A > B) ? '>' : '<';

	(A == B) ? printf("==") : printf("%c", num);
	
	return 0;
}
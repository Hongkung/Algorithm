#include<stdio.h>
//세자리수 곱하기
int main(void)
{
	int num1, num2;
	int a, b, c;
	scanf("%d %d", &num1, &num2);

	a = num1 * ((num2 % 100) % 10);//1자리만 곱하기

	b = num1 * ((num2 % 100) / 10);//10자리만 곱하기
	
	c = num1 * (num2 / 100);// 100자리만 곱하기

	printf("%d\n%d\n%d\n%d\n", a, b, c, num1*num2);
	return 0;
}
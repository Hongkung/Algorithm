#include<stdio.h>
//���ڸ��� ���ϱ�
int main(void)
{
	int num1, num2;
	int a, b, c;
	scanf("%d %d", &num1, &num2);

	a = num1 * ((num2 % 100) % 10);//1�ڸ��� ���ϱ�

	b = num1 * ((num2 % 100) / 10);//10�ڸ��� ���ϱ�
	
	c = num1 * (num2 / 100);// 100�ڸ��� ���ϱ�

	printf("%d\n%d\n%d\n%d\n", a, b, c, num1*num2);
	return 0;
}
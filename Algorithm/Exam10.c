#include<stdio.h>

int main(void)
{
	/*
	int a,b,c,d,x;
	scanf("%d", &x);

	a = x%60; //��

	c = ((x / 60) / 60) % 24; //��
	
	b = (x / 60) % 60; //��

	d = ((x / 60) / 60) / 24;//��
	printf("%d %d %d %d", d, c, b, a);
	*/
	int a = 0;

	scanf("%d", &a);

	int b = (a / 60);
	int c = (b / 60);
	int d = (c / 24);

	printf("%d %d %d %d", d, c % 24, b % 60, a % 60);
	return 0;

}
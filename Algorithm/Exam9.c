#include<stdio.h>

int main(void)
{
	int a,b,c,x;

	scanf("%d", &x);
	
	a = (1000-x)/ 100;

	b = ((1000 - x) % 100)/50;

	c = (((1000 - x) % 100) % 50)/10;

	printf("%d %d %d", a, b, c);
	return 0;
}
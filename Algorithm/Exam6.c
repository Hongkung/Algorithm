#include<stdio.h>
//average
int main(void) 
{
	/*
	double a, b, c, d;

	scanf("%lf %lf %lf %lf", &a, &b,&c, &d);
	printf("%.2f",(a+b+c+d)/4);
	*/
	int a, b, c, d;

	scanf("%d %d %d %d", &a, &b, &c, &d);
	printf("%.2f", (double)(a + b + c + d) / 4);

	return 0;

}
#include<stdio.h>
#include<math.h>
#include<string.h>
int main(){
	int d,bin,i,n,j,num;
	char st[100];
	printf("Enter your word: ");
	scanf("%[^\n]",&st);
	n=strlen(st);
	printf("The length of your word is %d\n",n);
	for(j=0;j<n;j++){
		num=(int)(st[j]);
		bin=0;
		i=0;
		while(num>0){
			d=num%2;
			bin=bin+d*pow(10,i);
			num=num/2;
			i++;
		}	
		printf("%d ",bin);
	}
return 0;
}
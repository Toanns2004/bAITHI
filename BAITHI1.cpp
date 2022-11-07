#include<stdio.h>
void sdn(){

	printf("nhap vao day so nguyen: \n");
	int x[10];

	for(int i=0; i<10;i++){
		printf("x[%d]:",i+1);
		scanf("%d ",&x[i]);
	}
	for(int i=9;i>=0;i--){
		printf("%d\n",x[i]);
	}
	
}
int main(){
	sdn();
}

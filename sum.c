#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
   long int a[20],i,j,n,temp,c;
   long int sum=0;
   clrscr();
   scanf("%ld",&n);
for(i=0;i<n;i++)
{
  scanf("%d",&a[i]);
}
for(i=0;i<n;i++)
{
 for(j=i+1;j<n;j++)
 {
  if(a[j]>a[i])
 {
  temp=a[i];
  a[i]=a[j];
  a[j]=temp;
 }
 }
}
for(i=0;i<n-1;i++)
{
  temp=a[i+1];
  c=0;
  while(temp!=0)
  {
    temp=temp/10;
    c++;
  }
  sum=(sum*pow(10,c))+a[i+1];
}
printf("\n%ld",sum);
getch();
}











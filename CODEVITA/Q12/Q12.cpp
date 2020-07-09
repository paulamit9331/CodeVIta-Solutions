#include<bits/stdc++.h>
using namespace std;

#define For(i,n) for(i=0;i<n;i++)
#define FOR(i,n) for(i=n-1;i>=0;i--)
#define nl printf("\n")
int main()
{
 int a[100005],ind=0,i;
 while(scanf("%d",&a[ind])!=EOF){
  ind++;
 }
 int n=ind,k,j,fl=0;
 For(i,n){
  if(i==0){}
  else a[i]+=a[i-1];
 }
 for(i=0;i<n;i++){
  for(j=i+2;j<n-2;j++){
    if(a[i]==a[j]-a[i+1] && a[j]-a[i+1]==a[n-1]-a[j+1]){
     printf("Indices which form equi pair { %d,%d }\n",i+1,j+1);
     printf("Slices are { 0,%d },{ %d,%d },{ %d,%d }\n",i,i+2,j,j+2,n-1);
     fl=1;
    }
  }
 }
 if(fl==0){
  printf("Array does not contain any equi pair\n");
 }
 return 0;
}
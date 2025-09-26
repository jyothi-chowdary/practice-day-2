 class ArmstrongRange{
     public static void main(String[]args){
         int m=0;
         int n=500;
          for(int i=m;i<=n;i++){
              int temp=i;
              int sum=0;
              int digit=0;
              while(temp>0){
                  digit=temp%10;
                  sum=sum+digit*digit*digit;
                  temp=temp/10;
              }
              if(i==sum){
                  System.out.println(i);
              }
          }
     }
 }
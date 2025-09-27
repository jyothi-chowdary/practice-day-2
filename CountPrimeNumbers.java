 class CountPrimeNumbers{
     public static void main(String[]args){
         int m=1;
         int n=10;
         int count=0;
         for(int i=m;i<=n;i++){
             boolean prime=true;
             if(i<=1){
                 prime=false;
             }
             else{
                 for(int j=2;j*j<=i;j++){
                     if(i%j==0){
                         prime=false;
                         break;
                     }
                 }
             }
             if(prime){
                 System.out.println(i);
                 count++;
             }
         }
         System.out.println("count prime numbers:"+count);
     }
 }
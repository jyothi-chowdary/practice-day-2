 class PrintfirstPrimeinrangr{
     public static void main(String[]args){
         for(int i=10;i<=20;i++){
             boolean prime=true;
             if(i<=1){
                 prime=false;
             }
             for(int j=2;j*j<=i;j++){
                 if(i%j==0){
                     prime=false;
                     break;
                 }
             }
             if(prime){
                  System.out.println(i);
                  break;
             }
         }
     }
 }
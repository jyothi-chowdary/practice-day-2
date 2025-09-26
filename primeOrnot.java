 class primeOrnot{
     public static void main(String[]args){
         int num=21;
         boolean prime=true;
         if(num<=1){
             prime=false;
         }
         else{
             for(int i=2;i<=num/2;i++){
                 if(num%i==0){
                     prime=true;
                     break;
                 }
             }
         }
         if(prime){
             System.out.println("prime");
             }
             else{
                 System.out.println("not prime");
            }
     }
 }
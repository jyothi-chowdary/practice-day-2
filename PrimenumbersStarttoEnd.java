 import java.util.*;
 class PrimenumbersStarttoEnd{
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         System.out.println("prime numbers starting number:");
         int startnum=sc.nextInt();
          System.out.println("prime numbers ending number:");
         int endnum=sc.nextInt();
         for(int i=startnum;i<=endnum;i++){
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
              }
         }
    }
 }
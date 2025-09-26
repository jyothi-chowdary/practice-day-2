 class Compositenumbersinrange{
     public static void main(String[]args){
           int primecount=0;
          int compositecount=0;
	   int m=0;
	   int n=10;
         for(int i=m;i<n;i++){
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
                 primecount++;
             }
             else if(i>1){
                 compositecount++;
             }
         }
          System.out.println("primenumbers count:"+primecount);
             System.out.println("composite count:"+compositecount);
     }
 }
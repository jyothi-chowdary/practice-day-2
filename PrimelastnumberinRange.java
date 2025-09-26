 

class PrimelastnumberinRange{
    public static void main(String[] args) {
        int last=-1;
       for(int i=10;i<=20;i++){
           
           boolean prime=true;
           if(i<=1){
               prime=false;
           }
           else{
               for(int j=2;j*j<=i;j++){
                   if(i%j==0){
                       prime=false;
                   }
               }
           }
           if(prime){
              
                last=i;
           }
       }
           if(last!=-1){
               System.out.println(last);
           }
    }
}
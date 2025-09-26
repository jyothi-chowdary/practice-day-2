 

class EvennumbersUsingcontinue{
    public static void main(String[] args) {
        System.out.println("even mubers");
        int a=1;
        int b=20;
        for(int i=a;i<=b;i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }
}
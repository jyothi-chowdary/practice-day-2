 
class lastVowel {
    public static void main(String[] args) {
        String s1="jyothi";
        char last='\0';
        s1=s1.toLowerCase();
        for(int i=s1.length()-1;i>=0;i--){
            char ch=s1.charAt(i);
            if(ch=='a' || ch=='e'||ch=='i'|| ch=='o'||ch=='u'){
                last=ch;
                break;
            }
        }
        if(last!='\0'){
            System.out.println(last);
        }
        else{
            System.out.println("vowels are not found");
        }
    }
}
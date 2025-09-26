 
class FirstVowel {
    public static void main(String[] args) {
        String s1="jyothi";
        char first='\0';
        for(int i=0;i<=s1.length();i++){
            char ch=s1.charAt(i);
            if(ch=='a' || ch=='e'||ch=='i'|| ch=='o'||ch=='u'){
                first=ch;
                break;
            }
        }
        if(first!='\0'){
            System.out.println(first);
        }
        else{
            System.out.println("vowels are not found");
        }
    }
}
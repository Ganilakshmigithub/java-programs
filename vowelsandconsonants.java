import java.util.Scanner;
class vowelsandconsonants{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine().toLowerCase();
        int vowels=0;
        int consonants=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);    
            if(Character.isLetter(ch)){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
            }
            System.out.println("vowels count is: "+vowels);
            System.out.println("consonants count is: "+consonants);
    }
}
        

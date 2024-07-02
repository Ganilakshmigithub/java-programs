import java.util.Scanner;
class readingage{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int count=0;
int[] ages=new int[10];
System.out.println("enter people ages:");// reading 100 people age for now 10 ppl
for(int i=0;i<10;i++)       //to enter 100 people age from index 0
{
System.out.print(" person "+ (i + 1) + ":");
ages[i]=sc.nextInt();
}
for(int age:ages){
if(age>=50&&age<=60)
count++;
}
System.out.println("the count of age group between 50 and 60 is:"+count);
}
}

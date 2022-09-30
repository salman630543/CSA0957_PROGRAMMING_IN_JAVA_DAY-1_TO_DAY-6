import java.util.*;
class vowels{
public static void main(String[] args){
int i,vowels=0;
String s;
Scanner input = new Scanner(System.in);
System.out.print("Enter the String:");
s = input.nextLine();
for(i=0;i<s.length()-1;i++)
{
char a = s.charAt(i);
if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
{
vowels = vowels+1;
}
}
System.out.println("Number of vowels:"+vowels);
}
}
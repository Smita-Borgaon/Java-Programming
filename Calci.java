import java.util.*;
class Calci
{
public static void main(String args [])
{
Scanner sc = new Scanner(System.in);
int ans =0;
while(true)
{
System.out.print("Enter the char :");
char op =sc.next().trim().charAt(0);
if(op == '+' || op == '-' ||op =='*' ||op =='/' ||op =='%' )
{
System.out.print("Enter two num:");
int a = sc.nextInt();
int b = sc.nextInt();
if(op=='+')
{
ans = a+b;
}
if (op=='-')
{
ans = a-b;
}
if(op=='%')
{
ans = a%b;
}
if(op=='*')
{
ans = a*b;
}
if(op=='/')
{
ans = a/b;
}
}
else if(op=='x'|| op=='X')
{
break;
}
else
{
System.out.println("Invalid details:");
}
System.out.println("Ans =" + ans);
}
}
}
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    
 System.out.println("Informe sua senha ");
int x = sc.nextInt();
int senha = 2022;

while ( x != 2022)
{
System.out.println("Senha incorreta");
x = sc.nextInt();
 } 
  if (x==senha) {
   System.out.println("Senha correta");
  }






 sc.close();
 }
}
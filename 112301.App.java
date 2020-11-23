package pac;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
while (true) {
int user_num=scanner.nextInt();
if (user_num==1) {
System.out.println("R("+(int)(Math.random()*100)+","+(int)(Math.random()*100)+")");
}
}
}
}

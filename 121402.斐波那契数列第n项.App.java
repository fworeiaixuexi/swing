package pac;

import java.util.Scanner;

public class App2 {
	public static long fibonacci(long number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
        public static void main(String[] args) {
        	while (true) {
        		System.out.println("请输入数值：");
        		Scanner scanner=new Scanner(System.in);
            	int n=scanner.nextInt();
            	if (0<n && n<=40) {
            		System.out.printf("Fibonacci of %d is: %d\n",
            	            n, fibonacci(n));
    			}else {
    				System.out.println("不在范围内，请输入正确的数值");
    			}
			}

    }

}

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		while (true) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("请输入年份");
			int year=scanner.nextInt();
//			判断输入数值是否在范围内
			if (year!=0 && -3200<year && year<3200) {
//				判断是否正数(公元后)
				if (year>0){
					if (year%4==0&&year%100!=00||year%400==0||year==1) {
						System.out.println("公元"+year+"是闰年");
					}else {
						System.out.println("公元"+year+"不是闰年");
					}
				}
//				判断是否负数（公元前）
				if (year<0) {
					if (year%4==-1||year%400==-1) {
						System.out.println("公元前"+year+"是闰年");
					}else {
						System.out.println("公元前"+year+"不是闰年");
					}
				}
			}else {
				System.out.println(year+"不在范围内哦:)");
			}
			
		}
	}

}

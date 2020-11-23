package pac;

public class App {
 public static void main(String[] args) throws InterruptedException {
	int arr[][]={
			{5,2},
			{90,50},
			{100,233},
			{666,999},
	};
	while (true) {
		Thread.sleep(1000);
		System.out.println("一秒已经过去了");
		int rdm=(int)(Math.random()*10%4);
		System.out.println(arr[rdm][0]+","+arr[rdm][1]);
	}
}
}

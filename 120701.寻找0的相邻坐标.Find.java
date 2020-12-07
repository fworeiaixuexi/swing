
public class Find {
	int leftX,leftY,rightX,rightY,upX,upY,downX,downY;
//	R_zero(x,y)=(column,row);
	void findZero(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					System.out.println("R_zero("+column+","+row+")");
				}
			}
		}
	}
	
	void findLeft(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					leftX=column-1;
					leftY=row;
					System.out.println("R_left("+leftX+","+leftY+")");
				}
			}
		}
	}
	
	void findRight(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					rightX=column+1;
					rightY=row;
					System.out.println("R_right("+rightX+","+rightY+")");
				}
			}
		}
	}
	
	void findUp(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					upX=column;
					upY=row-1;
					System.out.println("R_up("+upX+","+upY+")");
				}
			}
		}
	}
	
	void findDown(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					downX=column;
					downY=row+1;
					System.out.println("R_down("+downX+","+downY+")");
				}
			}
		}
	}

}

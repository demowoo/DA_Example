package wrp.alog.sort;

import java.util.Random;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr = new int[50];
		Random random = new Random(100);
		for(int i=0; i<50; i++){
			intArr[i] = random.nextInt(300);
		}
	}
}

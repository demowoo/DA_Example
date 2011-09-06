package wrp.alog.sort;

import java.util.Random;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(2000);
		int[] intArr = new int[50];
		for(int i=0; i<50; i++){
			intArr[i] = random.nextInt(1000);
		}
	}

}

package wrp.alog.sort;

import java.util.Random;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static int temp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr = new int[50];
		Random random = new Random(100);
		for(int i=0; i<50; i++){
			intArr[i] = random.nextInt(300);
		}
		
//		for(int i=0; i<50; i++){
//			xswap(intArr, i);
//		}
		
		int[] testarr = {23, 24};
		xswap(testarr, 0);
		System.out.println(testarr[0]+":"+ testarr[1]);
	}
	
	public static void xswap(int[] intArr, int i){
		if(intArr[i] > intArr[i+1]){
			temp = intArr[i];
			intArr[i] = intArr[i+1];
			intArr[i+1] = temp;
		}
	}
}

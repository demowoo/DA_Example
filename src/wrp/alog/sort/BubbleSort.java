package wrp.alog.sort;

import java.util.Random;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr = new int[10];
		Random random = new Random(100);
		for(int i=0; i<10; i++){
			intArr[i] = random.nextInt(300);
		}
		
		System.out.print("排序前：");
		printarr(intArr);
		
		System.out.println();
		for(int j=intArr.length-1; j>0; j--)
			for(int i=0; i < j; i++){
				swap(intArr, i);
			}
		
		System.out.print("排序后：");
		printarr(intArr);
	}
	
	public static void swap(int[] intArr, int i){
		if(intArr[i] > intArr[i+1]){
			int temp = intArr[i];
			intArr[i] = intArr[i+1];
			intArr[i+1] = temp;
		}
	}
	
	public static void printarr(int[] intarr){
		for(int i=0; i<intarr.length; i++){
			System.out.print(intarr[i]+",");
		}
	}
}

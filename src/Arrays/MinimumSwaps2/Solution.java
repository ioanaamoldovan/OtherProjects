package Arrays.MinimumSwaps2;

public class Solution {

	static int minimumSwaps(int[] arr) {
		int swapsNo = 0;
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				
				//System.out.println("i = " + i);
				//System.out.println("j = " + j);
				if(arr[i] > arr[j]) {
					
					int diff1 = arr[i] - i;
					int diff2 = arr[j] - j;
					
					if(diff1 > diff2) {
						if(j < arr.length - 1 && diff2 > arr[j+1] - (j+1)) {
							//System.out.println("skip");
							continue;
						}
						
						//swap
						//System.out.println("swap " + arr[i] + " " + arr[j]);
						int aux = arr[i];
						arr[i] = arr[j];
						arr[j] = aux;
						swapsNo++;
					}
				}
			}
		}
		
		/*for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}*/
		return swapsNo;
    }
	
	public static void main(String[] args) {
       
		int[] arr = {3, 7, 6, 9, 1, 8, 10, 4, 2, 5};
		int res = minimumSwaps(arr);
        System.out.println(res);
    }
}

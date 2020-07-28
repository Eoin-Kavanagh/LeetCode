
public class TwoSum {
	
	public static void main(String[] args) {
		int[] testArray = new int[] {2,7,11,15};
		int target = 9;
		twosumming(testArray, target);
		
	}
	
	public static int[] twosumming(int[] nums, int target) {
		int size = nums.length;
		
		// iterate through each number combination
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				
				//	checking if same element
				if(i==j) {}
				
				// comparing sum and target
				else{
					if(target == nums[i]+nums[j]) {
						System.out.println("[soln. found!]");
						System.out.println("num[" + i + "] and num[" + j + "]");
						int[] arr = {i,j};
						return arr;
					}
				}
			}
		}
		return null;
	}

}

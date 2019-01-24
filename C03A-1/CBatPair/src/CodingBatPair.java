/* C03A-1: CodingBat Pair Programming
 * 
 * Names: Carter Fowler, Blake Ray
 */
import java.util.Arrays;
public class CodingBatPair {

	//evenlySpaced
	public boolean evenlySpaced(int a, int b, int c) {
		//Start, sort
		int [] orderedList = {a, b, c};
		Arrays.sort(orderedList);
		//Now figure out if they are actually evenly spaced
		boolean result = false;
		if((orderedList[1] - orderedList[0]) == (orderedList[2] - orderedList[1])) {
			result = true;
		}
		return result;
	}
	/*	
		evenlySpaced(2, 4, 6) → true	true	OK	
		evenlySpaced(4, 6, 2) → true	true	OK	
		evenlySpaced(4, 6, 3) → false	false	OK	
		evenlySpaced(6, 2, 4) → true	true	OK	
		evenlySpaced(6, 2, 8) → false	false	OK	
		evenlySpaced(2, 2, 2) → true	true	OK	
		evenlySpaced(2, 2, 3) → false	false	OK	
		evenlySpaced(9, 10, 11) → true	true	OK	
		evenlySpaced(10, 9, 11) → true	true	OK	
		evenlySpaced(10, 9, 9) → false	false	OK	
		evenlySpaced(2, 4, 4) → false	false	OK	
		evenlySpaced(2, 2, 4) → false	false	OK	
		evenlySpaced(3, 6, 12) → false	false	OK	
		evenlySpaced(12, 3, 6) → false	false	OK	
		other tests			OK	
		
		All Correct
	 */
	
	//plusOut
	public String plusOut(String str, String word) {
		  
		String answer = "";
		
		for (int i = 0; i < str.length(); ++i) {
			if((str.length() - i) < word.length()) {
				for(int j = i; j < str.length(); ++j) {
					answer += '+';
				}
				break;
			}
			String temp = str.substring(i, (i + word.length()));
			if (temp.equals(word)) {
				answer += word;
				i += word.length() - 1;
			} else {
				answer += '+';
			}
		}
		
		return answer;
	}
	/*	
		plusOut("12xy34", "xy") → "++xy++"	"++xy++"	OK	
		plusOut("12xy34", "1") → "1+++++"	"1+++++"	OK	
		plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"	"++xy++xy+++xy"	OK	
		plusOut("abXYabcXYZ", "ab") → "ab++ab++++"	"ab++ab++++"	OK	
		plusOut("abXYabcXYZ", "abc") → "++++abc+++"	"++++abc+++"	OK	
		plusOut("abXYabcXYZ", "XY") → "++XY+++XY+"	"++XY+++XY+"	OK	
		plusOut("abXYxyzXYZ", "XYZ") → "+++++++XYZ"	"+++++++XYZ"	OK	
		plusOut("--++ab", "++") → "++++++"	"++++++"	OK	
		plusOut("aaxxxxbb", "xx") → "++xxxx++"	"++xxxx++"	OK	
		plusOut("123123", "3") → "++3++3"	"++3++3"	OK	
		other tests			OK	
		
		All Correct
	 */
	
	//countClumps
	public int countClumps(int[] nums) {
		
		int count = 0;
		
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i+1]) {
				while (i < nums.length - 1) {
					if (nums[i] == nums[i + 1]) {
						++i;
					} else {
						break;
					}
				}
				count++;
			}
		}
		
		return count;
		  
	}
	/*		
		countClumps([1, 2, 2, 3, 4, 4]) → 2	2	OK	
		countClumps([1, 1, 2, 1, 1]) → 2	2	OK	
		countClumps([1, 1, 1, 1, 1]) → 1	1	OK	
		countClumps([1, 2, 3]) → 0	0	OK	
		countClumps([2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 4	4	OK	
		countClumps([0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 4	4	OK	
		countClumps([0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 5	5	OK	
		countClumps([0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 5	5	OK	
		countClumps([]) → 0	0	OK	
		other tests				OK	
		
		All Correct
	 */
	//fix34
	public int[] fix34(int[] nums) {
	  	  int size = nums.length;
		  int [] fix34 = new int [size];
		  String otherNums = "";
		  for (int i = 0; i < size; ++i) {
		    if (nums[i] == 3) {
		      fix34[i] = 3;
		      fix34[i + 1] = 4;

		    } else if (nums[i] != 4) {
		      String temp = Integer.toString(nums[i]);
		      otherNums += temp;
		    }
		  }
		  
		  int j = 0;
		  
		  for (int k = 0; k < fix34.length; ++k) {
		    if (fix34[k] == 0) {
		      String temp1 = Character.toString(otherNums.charAt(j));
		      int temp = Integer.parseInt(temp1);
		      fix34[k] = temp;
		      ++j;
		    }
		  }
		  return fix34;
	}
	/*
		fix34([1, 3, 1, 4]) → [1, 3, 4, 1]	[1, 3, 4, 1]	OK	
		fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]	[1, 3, 4, 1, 1, 3, 4]	OK	
		fix34([3, 2, 2, 4]) → [3, 4, 2, 2]	[3, 4, 2, 2]	OK	
		fix34([3, 2, 3, 2, 4, 4]) → [3, 4, 3, 4, 2, 2]	[3, 4, 3, 4, 2, 2]	OK	
		fix34([2, 3, 2, 3, 2, 4, 4]) → [2, 3, 4, 3, 4, 2, 2]	[2, 3, 4, 3, 4, 2, 2]	OK	
		fix34([5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5]) → [5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4]	[5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4]	OK	
		fix34([3, 1, 4]) → [3, 4, 1]	[3, 4, 1]	OK	
		fix34([3, 4, 1]) → [3, 4, 1]	[3, 4, 1]	OK	
		fix34([1, 1, 1]) → [1, 1, 1]	[1, 1, 1]	OK	
		fix34([1]) → [1]	[1]	OK	
		fix34([]) → []	[]	OK	
		fix34([7, 3, 7, 7, 4]) → [7, 3, 4, 7, 7]	[7, 3, 4, 7, 7]	OK	
		fix34([3, 1, 4, 3, 1, 4]) → [3, 4, 1, 3, 4, 1]	[3, 4, 1, 3, 4, 1]	OK	
		fix34([3, 1, 1, 3, 4, 4]) → [3, 4, 1, 3, 4, 1]	[3, 4, 1, 3, 4, 1]	OK	
		other tests			OK	
		
		All Correct 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

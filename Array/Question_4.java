public class Question_4
{

public static boolean
	checkDuplicatesWithinK(int[] arr, int n, int k)
{

	
	for (int i = 0; i < n; i++) {
	int j = i + 1;
	int range = k;
	// searching in next k-1 elements if its
	// duplicate is present or not
	while (range > 0 && j < n) {
		if (arr[i] == arr[j]) {
		return true;
		}
		j++;
		range--;
	}
	}
	return false;
}


public static void main(String[] args)
{
	int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
	int n = arr.length;
	if (checkDuplicatesWithinK(arr, n, 3)) {
	System.out.print("Yes");
	}
	else {
	System.out.print("No");
	}
}
}




public class Fixedpoint2 {

	public static void main(String[] args) 
	{
		int arr1[] = {-40,-36,-30,-24,-22,-21,-16,-5,-3,1,2,3,5,10,13,14,16,47,56,59};
		int arr2[] = {-50,-45,-42,-36,-31,-29,-24,-20,-17,-13,-6,-2,1,3,5,7,8,9,10,16,19,21,26,35,41,44,60,76,89,93};
		int arr3[] = {2,5,6,8,9,13,14,16,19,21,23,25,28,32,34,39,41,47,56,59,64,65,67,70,72,74,80,86,90,93,100,101,111,112,125,136,137,142,150,151};

		System.out.println("in arr 1 the Fixed point is: "+ binarySearch(arr1, 0, arr1.length));
		System.out.println("in arr 2 the Fixed point is: "+ binarySearch(arr2, 0, arr2.length));
		System.out.println("in arr 3 the Fixed point is: "+ binarySearch(arr3, 0, arr3.length));
	}
	
	public static int binarySearch(int arr[],int low, int high)
	{
		if (high >= low)
		{
			int i=(low + high)/2;
			if (i == arr[i])
				return i;
			if (i > arr[i])
				return binarySearch(arr, (i +1), high);
			else
				return binarySearch(arr, low, (i -1));
		}
		return -1;
		
	}
	

}
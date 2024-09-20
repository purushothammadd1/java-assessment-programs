package practice;

public class LinearSearch {
	static int linearSearch(int []arr,int n,int k) {
		for(int i=0;i<n;i++) 
			if(arr[i]==k)
				return i+1;
		return -1;
		
	}
	public static void main(String[] args) {
		int []arr=new int[] {23,242,454,3,24,45,5};
		int k=3;
		int n=arr.length;
		int r=linearSearch(arr, n, k);
		if(r==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at "+r+" position");
	}

}
/*
 * public static boolean binarySearch(int[] arr, int data){
	
	for(int left = 0, right = arr.length-1; left<=right; ){
		int mid = left+(right-left) /2;
		if(data==arr[mid]){
			return true;
		}
		else if(arr[mid]<data){
			left = mid+1;
		}
		else{
			right = mid-1;
		}
	}
	return false;
}
 */

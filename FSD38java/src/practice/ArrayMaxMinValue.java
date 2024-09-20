package practice;

public class ArrayMaxMinValue {

	public static void main(String[] args) {
		int arr[]= {2,40,3,50,20,30};
		int max=65535,min=-65535;
		for(int i=0;i<arr.length;i++) {
			if(min<arr[i]) {
				min = arr[i];
			}
			if(max>arr[i]) {
				max =arr[i];
			}
		}
		System.out.println("Largest number: "+min+"\nSmallest number: "+max);

	}

}

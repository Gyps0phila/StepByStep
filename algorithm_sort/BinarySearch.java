public class BinarySearch {
	public static void main(String[] args) {
		int[] a={1,8,12,13,27,34,38,49,49,64,65,7678,97};

		int position = binarySearch(a,0,a.length,65);
		System.out.println("the position : " + position);

		position = binarySearch(a,65);
		System.out.println("the position : " + position);
	}

	public static int binarySearch(int[] a, int left, int right, int target) {
		if(left<=right) {
			int mid = (left+right)/2;
			if(a[mid]>target)
				return binarySearch(a,left,mid-1,target);
			else if(a[mid]<target)
				return binarySearch(a,mid+1,right,target);
			else
				return mid;
		}

		return -1;
	}

	public static int binarySearch(int[] a, int target) {
		int left = 0;
		int right = a.length-1;
		int mid;
		while(left<=right) {
			mid = (left+right)/2;
			if(target==a[mid])
				return mid;
			else if(target>a[mid])
				left = mid + 1;
			else if(target<a[mid])
				right = mid -1;
		}
		return -1;
	}
}
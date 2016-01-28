public class Half_Sort {
	public static void main(String[] args) {
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1};
		System.out.println("before sorted:");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

		for(int i=1;i<a.length;i++) {
			int temp = a[i];
			int left = 0;
			int right = i-1;
			int mid;

			while(left<=right) {
				mid = (left+right)/2;
				if(a[mid]>temp)
					right = mid -1;
				else left = mid + 1;
			}

			for(int j=i-1;j>right;j--) {
				a[j+1] = a[j];
			}
			a[right+1] = temp;
		}

		System.out.println("\nafter sorted:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}
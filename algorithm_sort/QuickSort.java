public class QuickSort {
	public static void main(String[] args) {
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1,8};
        System.out.println("before sorted:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        quick(a);
        System.out.println("after sorted:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
	}

	public static void quick(int[] a) {

		if(a.length>0) {
			quickSort(a,0,a.length-1);
		}

	}

	public static void quickSort(int[] a, int low, int high) {

		if(low<high) {
			int part = getPartition(a,low,high);
			quickSort(a,0,part-1);
			quickSort(a,part+1,high);
		}

	}

	public static int getPartition(int[] a, int low, int high) {
		int temp = a[low];
		if(low<high) {
			while(low<high) {

				while(low<high&&a[high]>=temp)
					high--;
				if(low<high) {
					a[low] = a[high];
					low++;
				}
				
				while(low<high&&a[low]<=temp)
					low++;
				if(low<high) {
					a[high] = a[low];
					high--;
				}
			}
		}
		a[low] = temp;	
		return low;
	}

}
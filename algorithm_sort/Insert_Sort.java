public class Insert_Sort {
	public static void main(String[] args) {

		int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1};
		System.out.println("before sorted:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

		for(int i=1;i<a.length;i++) {
			int temp = a[i];
			int j;
			for(j=i-1;j>=0;j--) {
				if(a[j]>temp) {
					a[j+1] = a[j];
				}
				else break;
			}
			a[j+1] = temp;
		}
		System.out.println("\nafter sorted:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
public class Bubble {
	public static void main(String[] args) {
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1};
		System.out.println("before sorted:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}

		}

		System.out.println("\nafter sorted:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
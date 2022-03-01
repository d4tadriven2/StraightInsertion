public class StraightInsertion {
	public static void main(String[] args){
		int unsorted[] = {12,38,64,13,18,71,26};
		int size = unsorted.length-1;
		System.out.println("Unsortiert :");
		for(int i = 0;i<=size;i++){
			System.out.print("[" + unsorted[i] + "]");
		}
		System.out.println();
		StraightInsertionSort(unsorted,size);
	}

	/**
	 * Insertion Sort Algorithmus mit Laufzeit O(n^2)
	 * **/
	public static void StraightInsertionSort(int[] arr,int length){
		/**
		 * For Schleife Faengt bei 1 an und vergleicht im Inneren mit
		 * vorgaenger Position in der if-Abfrage
		 * **/
		for(int i = 1; i<=length;i++){
			int pos_found = 0;
			/**Speicherun
			 * g der derzeitigen Position**/
			int j = i;
			/**
			 * Speicherung des Array Elements in der Temp Variable
			 * **/
			int temp = arr[i];
			while(j>0 && pos_found == 0){
				if(arr[j-1]<temp){
					pos_found = 1;
				}else{
					arr[j]=arr[j-1];
					j = j-1;
				}
			}
			arr[j] = temp;
		}
		System.out.println("Sortiert :");
		for(int i = 0;i<=length;i++){
			System.out.print("[ " +arr[i]+ " ]");
		}
		System.out.println();
	}
}

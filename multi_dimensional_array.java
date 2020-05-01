//multiple Dimension Array
public class multi_dimensional_array {
public static void main(String args[]){
	int firstarray[][]= {{8,9,10},{11,12,13},{14,15,16}};
	int Secondarray[][]= {{8,9,10},{11},{14,15,16,17,18}};
	display(firstarray);
	display(Secondarray);
	
}
public static void display(int x[][]) {
	for(int row=0;row<x.length;row++)    //in this loop we are just traversing the loop rows
	{
		for(int col=0;col<x[row].length;col++)   //in this loop we are travesing columns of each rows...  (col=== column)
		{
			System.out.print(x[row][col]+"\t");
		}
		System.out.println();
	}
}
}
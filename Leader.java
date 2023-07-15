package Leaders_array;
import java.util.Scanner;
public class Leader {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Leader led=new Leader();
		int n=sc.nextInt();
		int arr[]= new int [n];
		for (int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		led.printled(arr , n);
	}
	void printled(int arr[],int a)
	{
		int i;
		for( i=0;i<a;i++)
		{
			int j;
			for( j=i+1;j<a;j++)
			{
				if(arr[i] <=arr[j])
					break;
			}
			if(j==a) {
				System.out.println(arr[i]+" ");
			}
		}		
		
}
}
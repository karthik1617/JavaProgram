import java.util.Scanner;

class Smallest3Num
{
	public static void main(String args[]){
		System.out.println("To Find The Smallest Of Three Numbers");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first numbers: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the second numbers: ");
		int n2 =sc.nextInt();
		System.out.println("Enter the third numbers: ");
		int n3 =sc.nextInt();
		if(n1<=n2 && n1<=n3){
			System.out.println(  n1 +" is Smallest Number.");
		}
		else if(n2<=n3 && n2<=n1){
			System.out.println(  n2  +" is Smallest Number.");
		}
		else{
			System.out.println(  n3 +" is  Smallest Number.");
		}
	}
}
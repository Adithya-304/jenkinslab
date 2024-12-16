public class factorial{
	public static void main (String[]args){
		int number=4;
		System.out.print("Factors of "+ number +" are");
		for(int i=1;i<=number;i++){
			if(number%i==0){
				System.out.print(i+" ");
			}
		}
	}


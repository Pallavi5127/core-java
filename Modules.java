class Modules{
	public static void main(String mod[]){
	
		int a = mod (15425 , 72537);
		System.out.println(a);
		
		int b = mod (142 ,793);
		System.out.println(b); 
		
		int c = mod (3873 , 3673);
		System.out.println(c);
		
		int d = mod (536 ,636);
		System.out.println(d);
		
		int e = mod (3567 ,639);
		System.out.println(e);
		
		int f = mod (362 ,637);
		System.out.println(f);
	}
	//method	
	 public static int  mod (int number1 , int number2){
	    return number1 % number2 ;
		
	}
}

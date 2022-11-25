class Bag{

	public static void main(String hold[]){
		System.out.println("main started");
		
		holdThings ("books" , "laptop" , "pen");
		
		System.out.println("main started");
	}

	public static void holdThings(String s1 , String s2 ,String s3){
		System.out.println("Method Started");
		System.out.println(s1 + s2 + s3);
		System.out.println("Method ended");
	
	}

}
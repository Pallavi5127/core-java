class Apple{
	static String color;
	static double cost;
	
	public static void main(String Apple[]){
		System.out.println("invoking Variables before init");
		System.out.println("========-------=======-------");
		
		System.out.println(color + "   " +cost);
		
			color = "green";
			cost = 345.0;
			
		System.out.println("invoking Variables after init");
		System.out.println("========-------=======-------");
			
		System.out.println(color + "   " +cost);
		
	}
	
}
class Tublight {
	static boolean isConnected = false ;
	
	public static void main(String a[]){
	// invoking a giveLight method
		giveLight();
		giveLight();
		
	}

	//declaration of a  giveLight method
	public static void giveLight(){
		System.out.println("giveLight method has started");
			if(isConnected == false){
				isConnected = true;
				System.out.println("The light is terned on");
			}
			else
			{
			System.out.println("gube.....tubelight is alredy turned on");
			
			}
			
			System.out.println("giveLight method has ended");	
		
	}
		
}
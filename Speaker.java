class Speaker{

	static String brandname = "Bose";
	static String frequency = "50Hz";
	static boolean isWireLess = true ;
	static boolean isConnected ;
	static int minVolume = 0;
	static int maxVolume = 5;
	static int currentVolume;
	
	
	public static void main(String a[]){
		System.out.println("main method has started");
			onOrOff();
			increaseVolume();
			increaseVolume();
			increaseVolume();
			increaseVolume();
			onOrOff();
			increaseVolume();
			increaseVolume();
			decreasVoulume();
			decreasVoulume();
			decreasVoulume();
			decreasVoulume();
			 
			
		System.out.println("main method has ended");
		//System.out.println("Brandname Of the Speaker is : "  +  brandname);
		//System.out.println("Frequency Of the Speaker is : "  +  frequency);
		//System.out.println("maxvolume Of the Speaker is : "  +  maxVolume);
		//System.out.println("minvolume Of the Speaker is : "  +  minVolume);
	
	}
	
	public static void onOrOff(){
		System.out.println("onOrOff method has started");
		if(isConnected == false){
			isConnected = true ;
			System.out.println("Speaker is turned on");
			
		}
		else if(isConnected == true){
			isConnected = false ;
			System.out.println("Speaker is turned off");
		
		}
	
		System.out.println("onOrOff method has ended");
	
	}
	
	public static void increaseVolume(){
		System.out.println("invoke increaseVolume method");
		System.out.println("No Of Parameters :" +0);
			if(isConnected == true){
				if(currentVolume < maxVolume){
				currentVolume =	currentVolume +1 ;
				System.out.println("The currentVolume is :" + currentVolume);
		
				}
				else{
					System.out.println("Max volume Reached");
				}
			}
			else{
				
				System.out.println("Turn on Speaker");
			}	
	}
	
	public static void decreasVoulume(){
		System.out.println("invoking decreasVoulume method");
			if(isConnected == true){
				if(currentVolume > minVolume){
				currentVolume = currentVolume -1;
				System.out.println("The CurrentVoulme is :" +currentVolume);
				}
				else{
					System.out.println("Min Volume reached");
				}
			}
			else{
				
				System.out.println("Turn on Speaker");
			}
	}
}
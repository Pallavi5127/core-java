class EatSure{
	public static double findItem(String item){
	System.out.println("invoked findItem");
		if(item == "Biryani"){
			return 225.0;
		}
		if(item == "Pavbhaji"){
			return 60.0;
		}
		if(item == "eggRice"){
			return 80.0;
		}
		if(item == "Paratha"){
			return 70.0;
		}
		if(item == "Pizza"){
			return 250.0;
		}
		if(item == "Momos"){
			return 100.0;
		}
		if(item == "Panner Butter Masala"){
			return 200.0;
		}
		if(item == "Chole Bhature"){
			return 150.0;
		}
		if(item == "Mashroom Chilly"){
			return 180.0;
		}
		if(item == "Cold Coffe"){
			return 90.0;
		}
		else{
		
		System.out.println("Item not available");
		
		}
	System.out.println("end of findItem");
	return 0.0;
	}

}
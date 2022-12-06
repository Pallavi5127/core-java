class Zomato{
	public static void findItem(String item){
	System.out.println("invoked findItem");
		if(item == "Biryani"){
		System.out.println("The prise Biriyani is 255");
			return ;
		}
		else{
		
		System.out.println("Item not available");
		
		}
	System.out.println("end of findItem");
	return ;
	}

}
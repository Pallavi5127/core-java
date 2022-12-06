class UberEatesTester{	
			public static void main(String A[]){
			
			
			double priceOfItem = UberEates.findItem("Biryani");
			System.out.println("The price of Item is :" + priceOfItem);
			
			double itemPrice = UberEates.findItem("Pavbhaji");
			System.out.println("The price of Item is :" + itemPrice);
			
			double itemCost = UberEates.findItem("eggRice");
			System.out.println("The price of Item is :" + itemCost);
			
			double costOfItem = UberEates.findItem("Paratha");
			System.out.println("The price of Item is :" + costOfItem);
			
			double cost = UberEates.findItem("Pizza");
			System.out.println("The price of Item is :" + cost);
			
			double price = UberEates.findItem("Momos");
			System.out.println("The price of Item is :" + price);
			
			double itemAmount = UberEates.findItem("Panner Butter Masala");
			System.out.println("The price of Item is :" + itemAmount);
			
			double amount = UberEates.findItem("Chole Bhature");
			System.out.println("The price of Item is :" + amount);
			
			double itemRokka = UberEates.findItem("Mashroom Chilly");
			System.out.println("The price of Item is :" + itemRokka);
			
			double yestRokka = UberEates.findItem("Cold Coffe");
			System.out.println("The price of Item is :" + yestRokka);
			
			}
}
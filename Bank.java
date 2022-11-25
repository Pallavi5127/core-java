class Bank{
		static	String bankName ;
		static	String ifscCode ;
		static	String micrCode ;
		static	String branchName;
		static	long mobileNo ;
		static	int branchCode ;
	public static void main (String bank[]){
		System.out.println("ivoking variables before inetialization");
				System.out.println(bankName);
				System.out.println(ifscCode);
				System.out.println(micrCode);
				System.out.println(branchName);
				System.out.println(mobileNo);
				System.out.println(branchCode);
			 
			 bankName = "statebank";
		     ifscCode = "fs451671sbs";
			 micrCode = "514617986" ;
			 branchName = "angol";
		     mobileNo = 7332815125l;
			 branchCode =  674546;
		System.out.println("ivoking variables after inetialization");
				System.out.println(bankName);
				System.out.println(ifscCode);
				System.out.println(micrCode);
				System.out.println(branchName);
				System.out.println(mobileNo);
				System.out.println(branchCode);
		}
}
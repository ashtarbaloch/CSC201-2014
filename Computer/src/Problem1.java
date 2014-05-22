public class Problem1 {
	public static void main(String[] args) {
		System.out.println("Hello! I'll show you the details of your computer.\n");
		System.out.println("Model: HP Pavilion g7.\n");	
			String cpu = "Intel core i3-2370M";
			double cpuPrice = 179.99;
			String ram = "6GB DDR3";
			double ramPrice = 39.99;
			String harddrive = "750GB HP ProtectSmart";
			double hdPrice = 119.99;
			String gcard = "Intel HD graphics 3000";
			double gcardPrice = 99.99;
			String speakers = "HP 2.0 compact";
			double speakersPrice = 29.99;
			double total = cpuPrice + ramPrice + hdPrice + gcardPrice + speakersPrice;
			System.out.println("Component        Component Type  Price");
			System.out.println(cpu + "     CPU     " + "$" + cpuPrice);
			System.out.println(ram + "             RAM        " + "$" + ramPrice);
			System.out.println(harddrive + "  Hard Drive   " + "$" + hdPrice);
			System.out.println(gcard + "   Graphics Card   " + "$" + gcardPrice);
			System.out.println(speakers + "         Speakers   " + "$" + speakersPrice);
			System.out.println("Your current computer costs:" + "  $" + total);
			System.out.println("Here are some upgrades that I recommend for you.\n");
			String cpuNew = "3.4GHz Intel Core i7-4770"; 
			String ramNew = "16GB DDR3";
			String harddriveNew = "1024GB";
			String gcardNew = "NVI DIA Geforce GT620";
			String speakersNew = "Logitech z-5500 Speakers";
			double cpuPriceNew = 299.99;
			double ramPriceNew = 99.99;
			double hdPriceNew = 389.99;
			double gcardPriceNew = 199.99;
			double speakersPriceNew = 89.99;
			double totalNew = cpuPriceNew + ramPriceNew + hdPriceNew + gcardPriceNew + speakersPriceNew;
			System.out.println("Upgraded Component" + "     Component Type    " + "Price");
			System.out.println(cpuNew + "    CPU" + "     $" + cpuPriceNew);
			System.out.println(ramNew + "               RAM" + "           $" + ramPriceNew);
			System.out.println(harddriveNew + "             Hard Drive" + "           $" + hdPriceNew);
			System.out.println(gcardNew + "      Graphics Card" + "   $" + gcardPriceNew);
			System.out.println(speakersNew + "       Speakers" + "   $" + speakersPriceNew);
			System.out.println("Your new computer will only cost you:" + "   $" + totalNew);
			
			
	}
}
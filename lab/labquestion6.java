package day14_methodsPart2;

public class labquestion6 {

	public static void main(String[] args) {
		//done by Eren Çengel
		chipmonkParty(30, false);
		chipmonkParty(50, false);
		chipmonkParty(70, true);
	}

	public static void chipmonkParty(int cigarnumber, boolean weekend) {
		if (weekend) {
			if (40<=cigarnumber) {
				System.out.println("cigarParty("+cigarnumber+","+weekend+")-->"+true);
			}else {
				System.out.println("cigarParty("+cigarnumber+","+weekend+")-->"+false);
			}
		}else {
			if(cigarnumber>=40&&cigarnumber<=60) {
				System.out.println("cigarParty("+cigarnumber+","+weekend+")-->"+true);
			}else {
				System.out.println("cigarParty("+cigarnumber+","+weekend+")-->"+false);
			}
		}
	}
	
	
	
}

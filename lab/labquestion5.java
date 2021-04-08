package day14_methodsPart2;

public class labquestion5 {

	public static void main(String[] args) {
		//done by Eren Çengel.
		speedTicket(60, false);
		speedTicket(65, false);
		speedTicket(65, true);
	}
	public static void speedTicket(int speed, boolean birthday) {
		if (!birthday) {
			if (0<speed && 60>=speed) {
				System.out.println("caughtSpeeding("+speed+","+birthday+")-->0");
			}else if (60<speed && 80>=speed) {
				System.out.println("caughtSpeeding("+speed+","+birthday+")-->1");
			} else {
				System.out.println("caughtSpeeding("+speed+","+birthday+")-->2");
			}
		}else {
			if (0<speed && 65>=speed) {
				System.out.println("caughtSpeeding("+speed+","+birthday+")-->0");
			}else if (65<speed && 85>=speed) {
				System.out.println("caughtSpeeding("+speed+","+birthday+")-->1");
			}else {
				System.out.println("caughtSpeeding("+speed+","+birthday+")-->2");
			}
		}
	}
}

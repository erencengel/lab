package day14_methodsPart2;

public class labquestion4 {

	public static void main(String[] args) {
		//done by Eren Çengel.
		deer(70, false);
		deer(95, false);
		deer(95, true);
	}
	
	public static void deer(int temp, boolean isSummer) {
		if (temp>=60&&100>temp && (isSummer==false)) {
			System.out.println("deerplay("+temp+","+ isSummer+")-->"+true);
		}else if (temp>=90&&100>temp && (isSummer==true)) {
			System.out.println("deerplay("+temp+","+ isSummer+")-->"+false);
		}else if (temp>=60&&90>temp && (isSummer==true)) {
			System.out.println("deerplay("+temp+","+ isSummer+")-->"+true);
		}
	}
	
	
	
}

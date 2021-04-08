package day14_methodsPart2;

public class labquestion3 {

	public static void main(String[] args) {
		//done by Eren Çengel
		greatEleven(22);
		greatEleven(23);
		greatEleven(24);

	}

	public static void greatEleven(int num) {
		if (num%11==0 || num%11==1) {
			System.out.println("specialEleven("+num+")-->"+true);
		}else {
			System.out.println("specialEleven("+num+")-->"+false);
		}
	}
	
}

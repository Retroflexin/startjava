public class ConditionalStatement {

	 public static void main(String[] args) {

	 	int age = 21;
	 	if (age > 20) {
	 	System.out.println("Vi starshe, chem" + age);
	 	}

	 	boolean male = true;
	 	if (male == true) {
	 	System.out.println("Vi muzhchina, congrats");
	 	}

	 	boolean female = true;
	 	if (female == true) {
	 	System.out.println("Vi zhenshina, congrats");
	 	}

	 	float rost = 1.75f;
	 	float rost1 = 1.85f;

	 	if (rost < 1.80 == false) {
	 	System.out.println("Vash rost men'she, chem 180cm");
	 	} else if (rost1 > 1.80 == true)  {
	 	System.out.println("Vash rost bol'she, chem 180cm");
	 	}

	 	char M1 = 'M';
	 	char I1 = 'I';
	 	char T1 = 'T';
	 		
	 	if (M1 == I1) {
	 	System.out.println("Vashe imya nachinaetsya s bukvi M");
	 	}
	 	else if (I1 != M1) { 
	 	System.out.println("Vashe imya nachinaetsya s bukvi I");
	    }
	 	else if (T1 == T1) { 
	 	System.out.println("Vashe imya nachinaetsya s bukvi T");
	    }

	 	}
	 	}
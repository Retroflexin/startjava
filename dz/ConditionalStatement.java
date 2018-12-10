public class ConditionalStatement {

	 public static void main(String[] args) {

	 	int age = 21;
	 	if (age > 20) {
	 		System.out.println("You are older than" + age);
	 	}

	 	boolean male = true;
	 	if (male == true) {
	 		System.out.println("You're a man");
	 	}

	 	boolean female = true;
	 	if (female == true) {
	 		System.out.println("You are a woman");
	 	}

	 	float height = 1.75f;
	 	float height1 = 1.85f;

	 	if (height < 1.80) {
	 		System.out.println("Your height is less than 180");
	 	} else if (height1 > 1.80 == true)  {
	 		System.out.println("Your height is more than 180");
	 	}

	 	char NameFromM = 'M';
	 	char NameFromI = 'I';
	 	char NameFromT = 'T';
	 		
	 	if (NameFromM == NameFromI) {
	 		System.out.println("Your name begins with the letter M");
	 	}
	 	else if (NameFromI != NameFromM) { 
	 		System.out.println("Your name begins with the letter I");
	   		}
	 	else if (NameFromT == NameFromT) { 
	 		System.out.println("Your name begins with the letter T");
	    	}

	 	}
	 	}
public class Cycle {
	public static void main(String[] args) {

		int i = 0;
		for (i = 0; i <= 19; i++); {
			System.out.println (i + " ");
		}

		int u = 6;
        while (u >= -6) {
           System.out.print (u + " ");
           u--;
        }

         int o = 10;
         int sum = 0;
        do {
            o++;
            sum = o % 1;
        } while(sum == 20);
        System.out.println(sum);
	}
}
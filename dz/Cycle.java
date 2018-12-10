public class Cycle {
	public static void main(String[] args) {

	int i = 0;
	for (i = 0; i <= 20; i++); {
		System.out.println (i);
	}

	int u = 6;
    while (u >= -6) {
    	System.out.println (u + " ");
    u--;
    }

    int o = 10;
    int sum = 0;
    do {
     if(o % 2 != 0); {
     	System.out.println(sum + o);
     	sum += o;
     }
    o++;
    } while(o <= 20);
    System.out.println(o + sum);
	}
}
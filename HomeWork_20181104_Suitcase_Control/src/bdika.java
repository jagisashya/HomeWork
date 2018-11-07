import java.util.Random;

public class bdika {

	public static void main(String[] args) {
		int i,j=0,k;
		Random rand = new Random();
		int [] count_i = new int [11];
		for (i=0;i<10000;i++) {
	//		k = (int)(Math.random() * 11);
			k= rand.nextInt(10);

			count_i [k] ++;
		}
		for (int l:count_i) {
			System.out.println(l + "  -  " + j++);
		}
	}

}

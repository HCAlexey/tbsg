import test_packed.Test_Random;

import java.util.Random;

public class testMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_Random tr = new Test_Random();
		Random r = new Random();
		for(int a = 2; a<9;a++){
			tr.testRandoms((int)(Math.pow(10,a)));
			tr.testRandomsRandom((int)(Math.pow(10,a)), r);
			/* Olennaisesti Random.nextInt() on tehokkaampi algoritmi satunnaisen luvun generoimiseen
			 *  Lis�ksi Random.nextInt() on l�hemp�n� todellista satunnaista kuin Math.random()
			 *  Lis�� infoa: https://community.oracle.com/message/6596485#thread-message-6596485
			 */
		}
		
	}

}

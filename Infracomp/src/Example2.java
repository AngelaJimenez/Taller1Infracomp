
public class Example2  extends Thread{

	private static int contador = 0;

	public void run() {
		for (int i = 0; i < 10000; i++) {
			contador++;
		}
	}

	public static void main(String[] args) {
		Example2[] t = new Example2[1000];
		for (int i = 0; i < t.length; i++) {
			t[i] = new Example2();
			t[i].start();
		}

		System.out.println(contador);
	}
}

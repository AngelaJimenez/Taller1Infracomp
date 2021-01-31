package Taller1A;

import java.util.Scanner;

public class WithThread extends Thread {

	private String tipo;
	private static int n;
	private long t;

	public WithThread(String tipo)
	{
		Scanner l = new Scanner(System.in); 
		this.tipo = tipo;
		System.out.println("Ingrese el tiempo de dormida del thread "+tipo);
		t = l.nextLong();
	}

	public void run()
	{
		try
		{
			for (int i = 1; i <= n; i++) {
				if(tipo.equals("Par"))
				{
					if (i % 2 == 0)
					{
						System.out.println(Integer.toString(i));
						Thread.sleep(this.t);
					}

				}
				else if(tipo.equals("Impar"))
				{
					if (i % 2 != 0)
					{
						System.out.println(Integer.toString(i));
						Thread.sleep(this.t);
					}				

				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}


	public static void main(String[] args)
	{
		Scanner l = new Scanner(System.in); 
		System.out.println("límite superior:");
		n = l.nextInt();

		WithThread impar = new WithThread("Impar");
		WithThread par = new WithThread("Par");

		impar.start();
		par.start();
	}
}

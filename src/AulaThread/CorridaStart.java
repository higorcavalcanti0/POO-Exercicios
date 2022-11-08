package AulaThread;

public class CorridaStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("Nucleos Livres nesse Momento:" + Runtime.getRuntime().availableProcessors()+" 	Nucleos" );
		
		Corrida t1 = new Corrida("José",1200);
		Corrida t2 = new Corrida("Maria",500);
		Corrida t3 = new Corrida("Pedro",300);
		Corrida t4 = new Corrida("Elaine",100);
		Corrida t5 = new Corrida("Carla",600);
		Corrida t6 = new Corrida("Manoel",1030);
		Corrida t7 = new Corrida("Paulo",397);
		
		Thread t1_1 = new Thread(t1);
		Thread t2_2 = new Thread(t2);
		Thread t3_3 = new Thread(t3);
		Thread t4_4 = new Thread(t4);
		Thread t5_5 = new Thread(t5);
		Thread t6_6 = new Thread(t6);
		Thread t7_7 = new Thread(t7);
		
		t1_1.start();
		t2_2.start();
		t3_3.start();
		t4_4.start();
		t5_5.start();
		t6_6.start();
		t7_7.start();
		
	do {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Foi interrompida");
			}
		}while(t1_1.isAlive()|| t2_2.isAlive()|| t3_3.isAlive()|| t4_4.isAlive()|| t5_5.isAlive()
				||t6_6.isAlive() || t7_7.isAlive()
				);
		
		System.out.println("==============CORRIDA FINALIZOU=================");
		
		

	}

}

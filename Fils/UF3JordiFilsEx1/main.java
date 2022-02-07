package UF3JordiFilsEx1;

public class main {

	public static void main(String[] args) {
		
		Ex1Fils ex1Fils = new Ex1Fils();
		Ex1FilsRunnable runnable = new Ex1FilsRunnable();
		
		System.out.println("______Thread______");
		
		for(int i = 0; i <= 5; i++) {
		ex1Fils.run();
		}
		
		System.out.println("______Runnable______");
		
		for(int i = 0; i <= 5; i++) {
		runnable.run();
		}
	}
}

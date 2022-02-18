package UF3JordiFilsEx6;


public class Ex6main {
	
	public static void main(String[] args) {
		
		Thread fil1 = new Thread();
		Thread fil2 = new Thread();
		Thread fil3 = new Thread();
		
		ThreadGroup sGrup1 = new ThreadGroup("subgrup1");
		ThreadGroup sGrup2 = new ThreadGroup(sGrup1, "subgrup1_2");
			
		ThreadGroup sgr = new ThreadGroup("subgrup 2");
		Thread fil = new Thread(sgr, "Fil 1");
		
		sgr.activeGroupCount();
		sgr.activeCount();
		sgr.list();
		sgr.getMaxPriority();
		
		sGrup1.setMaxPriority(0);
		sGrup2.setMaxPriority(1);
		
		sGrup1.getParent();
		sGrup1.parentOf(sgr);
		
		
	}

}


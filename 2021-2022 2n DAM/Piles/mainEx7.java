package Piles;

import java.util.ArrayList;

public class mainEx7 {
	
	public mainEx7(String string) {
		
	}

	public static void main(String[] args) throws Exception {
		
		try {
			mainEx7 sy = new mainEx7("(3+4)*6-5"
					+ "");
			
			ArrayList<String> prefija = sy.prefija();
			
			for(String string : prefija) {
				System.out.println(string + " ");
			}
			ex7_Stack r = new ex7_Stack(prefija);
			
			System.out.println(r.rpn());
			
		}catch(Exception x) {
			x.printStackTrace();
		}
		
	}


}

import java.util.*;

public class aleatorio {

	public static void main(String[] args){

		int i;
		float nA;
		
		Random aleat = new Random();
		
			for(i=0; i<=9;i++) {
				//Math.random()
				//nA = (float) Math.random();
				nA =  aleat.nextInt();
				
				System.out.println(nA);	
				
			
			}

}


}

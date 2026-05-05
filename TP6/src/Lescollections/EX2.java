package Lescollections;
import java.util.LinkedList;
public class EX2{
	public static void main(String[]args) {
		 LinkedList<Client> file = new LinkedList<>();
		 file.add(new Client(1,"oma"));
		 file.add(new Client(2,"maryam"));
		 file.add(new Client(3,"nasim"));
		 System.out.println("file dattente:"+file);
		 Client premier= file.poll();
		 System.out.println("Client servi :"+ premier);
		 System.out.println("Client  apres servi :"+ file);
		 Client tete= file.peekFirst();
		 System.out.println("Client en tete :"+ tete);
		 
	}
	
}


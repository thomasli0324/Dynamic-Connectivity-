import java.util.*;

public class DynamicConnectivity {

	public static void main(String args[]) {
		ArrayList<Integer> id ;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("How many components?");
		int components = scan.nextInt();
		System.out.println("There are " + components + "components .");
		
		
		id = new ArrayList<Integer> (); 
		for(int i=0 ; i < components ; i++) {
			id.add(i) ; 
		}
		
		print(id) ; 
		System.out.println();
		
		
		boolean func = true ; 
		while(func) {
			System.out.println("1.Union") ; 
			System.out.println("2.Check") ; 
			System.out.println("3.Print") ; 	
			System.out.println("4.Exit") ; 
			
			int enter = scan.nextInt(); 
			
			if(enter == 1) {
				System.out.println("Please enter 2 components you want to connect");
				int p = scan.nextInt();
				int q = scan.nextInt(); 
				union(p,q ,id) ; 
			}
			
			if(enter == 2) {
				System.out.println("Please enter 2 components you want to check");
				int p = scan.nextInt();
				int q = scan.nextInt(); 
				check(p,q ,id) ; 
			}
			
			if(enter == 3) {
				print(id); 
			}
			
			if(enter == 4) {
				return ; 
			}	
		}
	}
		
	private static void union(int p, int q, ArrayList<Integer> id) {
		int pid = id.get(p) ;
		int qid = id.get(q) ;
		for(int i=0 ; i < id.size(); i++) {
			if(id.get(i) == pid) {
				id.set(i, qid) ; 
			}
		}
		
		System.out.println("After swapping " + p + " " + q);
		print(id) ; 
	}
	
	private static boolean check(int p , int q , ArrayList<Integer> id) {
		return id.get(p) == id.get(q) ; 
	}
	
	private static void print(ArrayList<Integer> id) {
		for(int i=0 ; i < id.size(); i++) {
			System.out.print(id.get(i) + " ") ; 
		}
	}
	
}

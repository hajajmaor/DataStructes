
public class MainClass {

	public static void main(String[] args) {
		
		NodeDS<String> a1= new NodeDS<String>("first");
//		System.out.println(a1.data);
		
		NodeDS<Integer> a2= new NodeDS<Integer>(222);
		
		a1.next=a2;
		
		
		
		NodeDS<?> temp=a1;
		while(temp.next!=null) {
			System.out.println(temp);
			temp=temp.next;
		}
		System.out.println(temp);
		
	
	}

}

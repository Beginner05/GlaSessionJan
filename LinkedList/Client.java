package LinkedList;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Construct c=new Construct();
c.addLast(10);
c.addLast(20);
c.addLast(30);
c.addLast(40);
c.addLast(50);
c.addLast(60);
//c.removeLast();
//c.removeFirst();
//c.addFirst(1002);
//c.addAt(2, 7);
//c.addAt(0, 100101);
//c.addAt(232324, 7);
c.removeAt(4);
c.removeAt(2);
c.display();
	}

}

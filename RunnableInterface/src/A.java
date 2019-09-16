
class A extends Thread{
	public void run(){
		System.out.println("From Thread A:1");
		System.out.println("From Thread A:2");
		stop();
		System.out.println("From Thread A:3");
		System.out.println("From Thread A:4");
		System.out.println("Exiting from A.");
		
	}
}
class B extends Thread{
	public void run() {
		System.out.println("From Thread B:1");
		try {
			sleep(5000);
		}catch(Exception e) {System.out.println(e);}
		
		System.out.println("From Thread B:2");
		System.out.println("From Thread B:3");
		System.out.println("From Thread B:4");
		System.out.println("Exiting from B.");
	}
}
 class ThreadAssociation{
	 public static void main(String args[]) {
		
		 A a=new A();
		 B b=new B();
		// Thread t1=new Thread(a);
		 System.out.println("Hello Main");
		 a.start();
		
		 //Thread t2=new Thread(b);
		 
		 System.out.println("Hello Bye");
		 b.start();
		 
	 }
 }





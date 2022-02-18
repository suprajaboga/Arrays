package Demo;

class ThreadClass implements Runnable{
	Thread thread;
	String threadname;
	ThreadClass(String name){
		this.threadname=name;
		System.out.println("Creating thread: "+this.threadname);
	}
	public void run() {
		System.out.println("Running thread: "+this.threadname);
		try {
			for(int i=0;i<5;i++) {
				System.out.println(i+" "+this.threadname);
				Thread.sleep(50);
			}
		}
		catch(InterruptedException e){
			System.out.println(this.threadname+" stopped in between");
		}
		System.out.println(this.threadname+" exited");
	}
	public void start() {
		System.out.println("Starting thread: "+this.threadname);
		if(thread==null) {
			System.out.println(this.threadname);
			thread=new Thread(this,this.threadname);
			thread.start();
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		ThreadClass t1=new ThreadClass("thread1");
		t1.start();
		ThreadClass t2=new ThreadClass("thread2");
		t2.start();
	}

}

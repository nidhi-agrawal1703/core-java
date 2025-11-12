package agrawal.nidhi.basic;

public class HelloThread extends Thread {
	
	public String name;
	
	public HelloThread(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		for(int i=0;i<=4;i++) {
			try {
				sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(i+"="+name);
		}
	}
}

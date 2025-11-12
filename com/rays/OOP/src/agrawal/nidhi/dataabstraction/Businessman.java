package agrawal.nidhi.dataabstraction;

public class Businessman extends Person implements Richman,SocialWorker {

	@Override
	public void helpToOthers() {
		System.out.println("Helping others");
		
	}

	@Override
	public void earnMoney() {
		System.out.println("Earning money");
		
	}

	@Override
	public void donation() {
		System.out.println("Giving Donation");
		
	}

	@Override
	public void party() {
		System.out.println("Doing party");
		
	}

}

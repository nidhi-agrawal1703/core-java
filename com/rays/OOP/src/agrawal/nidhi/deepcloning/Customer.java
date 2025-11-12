package agrawal.nidhi.deepcloning;

public class Customer implements Cloneable {

	public String name;
	public Account account=null;
	
	public Customer(String name,Account account) {
		this.name=name;
		this.account=account;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Customer c=(Customer)super.clone();
		c.account=(Account) c.account.clone();
		
		return c;
	}
}

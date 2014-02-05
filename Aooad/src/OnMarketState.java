
public class OnMarketState implements PState {
	
	private Property myProperty;
	public OnMarketState(Property property)
	{
		myProperty = property;
	}
	public void offer(Buyer buyer)
	{
		System.out.println("Offer made");
		myProperty.setBuyer(buyer);
	}
	public void vendorPullout()
	{
		System.out.println("Pulled out");
		myProperty.setState(myProperty.getOnMarketState());
	}
	public void signContract(String buyer)
	{
		
	}
	public void payPrice()
	{
		
	}
	public void buyerPullOut()
	{
		
	}
}

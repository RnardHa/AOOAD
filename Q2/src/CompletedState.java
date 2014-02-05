public class CompletedState implements PState
{
	private Property property;

	public CompletedState(Property property)
	{
		this.property = property;
	}

	public void offer(Buyer buyer)
	{
		System.out.println("Property has been sold, or vendor has pulled out");
	}

	public void buyerPullout()
	{
		System.out.println("Nothing to pull out from");
	}

	public void vendorPullout()
	{
		System.out.println("Nothing to pull out from");
	}

	public void signContract(Buyer buyer)
	{
		System.out.println("No contract to sign");
	}

	public void payPrice()
	{
		System.out.println("Nothing to pay for");
	}
}
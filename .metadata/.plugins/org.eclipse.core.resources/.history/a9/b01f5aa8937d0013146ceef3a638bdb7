public class OnMarketState implements PState
{
	private Property property;

	public OnMarketState(Property property)
	{
		this.property = property;
	}

	public void offer(Buyer buyer)
	{
		System.out.println("Offer made by buyer");
		property.setBuyer(buyer);
		property.setState(property.getUnderOfferState());
	}

	public void buyerPullout()
	{
		System.out.println("No buyer to pull out");
	}

	public void vendorPullout()
	{
		System.out.println("Vendor has pulled out");
		property.setSuccess(false);
		property.setState(property.getCompletedState());
	}

	public void signContract(Buyer buyer)
	{
		System.out.println("No buy to sign contract");
	}

	public void payPrice()
	{
		System.out.println("No buy to pay price");
	}
}
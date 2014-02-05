public class ContractedState implements PState
{
	private Property property;

	public ContractedState(Property property)
	{
		this.property = property;
	}

	public void offer(Buyer buyer)
	{
		System.out.println("Offer has already been made");
	}

	public void buyerPullout()
	{
		System.out.println("Buyer cannot pull out since contract has been signed");
	}

	public void vendorPullout()
	{
		System.out.println("Vendor cannot pull out since contract has been signed");
	}

	public void signContract(Buyer buyer)
	{
		System.out.println("Contracted has already been signed");
	}

	public void payPrice()
	{
		System.out.println("Price paid");
		property.setSuccess(true);
		property.setState(property.getCompletedState());
	}
}
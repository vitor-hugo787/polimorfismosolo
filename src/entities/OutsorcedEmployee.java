package entities;

public class OutsorcedEmployee  extends  Employee  {
	
	
	private Double additionalCharge;
	
	public OutsorcedEmployee() {
		
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	public OutsorcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	} 
	@Override
	public double paymat() {
		return super.paymat() + additionalCharge *1.1;
		
	}

}

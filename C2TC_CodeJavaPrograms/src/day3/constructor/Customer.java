package day3.constructor;

public class Customer {
	private String cusName,cusCity;
	 private int cusId;
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusCity() {
		return cusCity;
	}
	public void setCusCity(String cusCity) {
		this.cusCity = cusCity;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	@Override
	public String toString() {
		return "Customer [cusName=" + cusName + ", cusCity=" + cusCity + ", cusId=" + cusId + 
				"]";
	}
	
}
package com.app.model;

public class PaymentInfo {
private String custName;
private double amt;
private int custAccId;
private int userAccId;

public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public double getAmt() {
	return amt;
}
public void setAmt(double amt) {
	this.amt = amt;
}
public int getCustAccId() {
	return custAccId;
}
public void setCustAccId(int custAccId) {
	this.custAccId = custAccId;
}
public int getUserAccId() {
	return userAccId;
}
public void setUserAccId(int userAccId) {
	this.userAccId = userAccId;
}
@Override
public String toString() {
	return "paymentInfo [custName=" + custName + ", amt=" + amt + ", custAccId=" + custAccId + ", userAccId="
			+ userAccId + "]";
}

}

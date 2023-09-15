package com.example.Customers;

/*
 * 1. Override all the interface methods.
 */
public class SalesDepartment implements CustomerCare {

	private String department = "Sales Department";
	private String customerName;
	private String issue;
	private double refId;

	public SalesDepartment() {
	}
	public SalesDepartment(String customerName, String issue, double refId) {
		this.customerName = customerName;
		this.issue = issue;
		this.refId = refId;
	}

	public String getDepartment() {
		return department;
	}

	public void getService() {
		System.out.println("Your issue is : " + issue);
		System.out.println("Your reference id is : " + refId);
	}

	public void setCustomerName(String name) {
		this.customerName = name;
	}

	public void setProblem(String problem) {
		this.issue = problem;
	}

	@Override
	public String getProblem() {
		return "Dear " + customerName + ", your issue is registered with " + getDepartment();
	}
	


}

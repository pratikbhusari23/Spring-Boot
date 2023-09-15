package com.example.Customers;

/*
 * 1. Override all the interface methods.
 */
public class PaymentDepartment implements CustomerCare {
	
    private String department= "Payment Department";
    private String customerName;
    private String issue; 
    private double refId; 

    public PaymentDepartment() {
    }
    public PaymentDepartment(String customerName, String issue, double refId) {
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

    public String getProblem() {
        System.out.println("Your issue is : " + issue);
        System.out.println("Your reference id is : " + refId);
        return issue;
    }

}

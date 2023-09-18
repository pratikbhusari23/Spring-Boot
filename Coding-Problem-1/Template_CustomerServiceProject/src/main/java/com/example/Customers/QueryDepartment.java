	package com.example.Customers;

	/*
	* 1. Override all the interface methods.
	*/
	public class QueryDepartment implements CustomerCare {
		
		private String department = "Query Department";
		private String customerName;
		private String problem;
		private double refId= Math.random()*100;;

		public String getDepartment() {
			return department;
		}

		public String getService() {
			return "welcome to "+ department+ " " +customerName+ " How may i assist you with your payment inquiry";
		}

		public void setCustomerName(String name) {
			this.customerName = name;
		}

		public void setProblem(String problem) {
			this.problem = problem;
		}

		@Override
		public void getProblem() {
			System.out.println("Dear "+customerName+ " Your issue for " + problem + " has been recorded , your reference id is "+ refId) ;
		}
		
		public double getRefId() {
			return refId;
		}

		public String getCustomerName() {
			return customerName;
		}
	}

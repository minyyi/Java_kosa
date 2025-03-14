package kosa.bank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import kosa.phone.PhoneInfo;
import kosa.relation.Student;

public class MyBank {
	private Customer customers[];
	private int customersNum;
//	private int count;
	
	
	public MyBank() {
		customers = new Customer[5];
		customersNum = 0;
	}




	public void addCustomer(String id, String name, long balance) {
		customers[customersNum++] = new Customer(id, name, balance);
		System.out.println("eee");
//		customers.add(id, name, balance);
		
//		count++;
//		customers[count++] = new Customer();
	}
	
	public Customer getCustomer(String id) {
		Customer cust = null;
		System.out.println("1");
		for(int i = 0; i < customersNum +1; i++) {
			System.out.println(customers[i]);
			if(id.equals(customers[i].getId())) {
				System.out.println("3");
//				cust=customer[i];
				return customers[i];			
			} 
		}
		return null;
	}
	
	public Customer[] getAllCustomers() {
		// TODO Auto-generated method stub
		Customer newCustomers[] = new Customer[customersNum]; //값이 있는 만큼의 사이즈로 배열 새로 만듦.
		for (int i =0;i<customersNum; i++) {
			newCustomers[i] = customers[i];
		}
//		System.arraycopy(newCustomers, customersNum, newCustomers, customersNum, customersNum);
		newCustomers = Arrays.copyOf(customers, customersNum);
		return newCustomers;
	}
	

//	public Customer[] getCustomer() {
//		return customers;
//	}


	public void setCustomer(Customer[] customer) {
		this.customers = customer;
	}


	public int getCustomersNum() {
		return customersNum;
	}


	public void setCustomersNum(int customersNum) {
		this.customersNum = customersNum;
	}





	
	

}

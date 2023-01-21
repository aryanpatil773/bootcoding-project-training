package com.bootcoding.project.service;

import com.bootcoding.project.model.Customer;
import com.bootcoding.project.utils.*;

public class CustomerService {
    public Customer createCustomer(){
        Customer customer=new Customer();
        customer.setName(CustomerNameGenerator.getName());
        customer.setCity(CityGenerator.getName());
        customer.setPhoneNumber(PhoneNnumberGenerator.getPhone());
        customer.setEmailId(EmailIdGenerator.getEmailId(customer.getName()));
        customer.setDelivaryAddress(AddressGenerator.getName());
        return customer;


    }
    public void print(Customer customer){
        System.out.println("Customer Name:" + customer.getName());
        System.out.println("Customer city:" + customer.getCity());
        System.out.println("Customer phone.no:" + customer.getPhoneNumber());
        System.out.println("Customer Email.ID:" + customer.getEmailId());
        System.out.println("Customer Delivary address:" + customer.getDelivaryAddress());
    }

    public static void main(String[] args) {
        CustomerService cs= new CustomerService();
        for (int i=0;i<50;i++){
            Customer customer= cs.createCustomer();
            cs.print(customer);
        }

    }
}

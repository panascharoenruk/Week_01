package com.example.week_01;

import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController{
    private List<Customer> customers = new ArrayList<Customer>();
    public CustomerController(){
        Customer c1 = new Customer();
        c1.setID("1010");
        c1.setName("Jo-hn");
        c1.setSex("Male");
        c1.setAge(25);
        customers.add(c1);
        Customer c2 = new Customer();
        c2.setID("1018");
        c2.setName("Peter");
        c2.setSex("Male");
        c2.setAge(24);
        customers.add(c2);
        Customer c3 = new Customer();
        c3.setID("1019");
        c3.setName("Sara");
        c3.setSex("Female");
        c3.setAge(25);
        customers.add(c3);
        Customer c4 = new Customer();
        c4.setID("1110");
        c4.setName("Rose");
        c4.setSex("Female");
        c4.setAge(25);
        customers.add(c4);
        Customer c5 = new Customer();
        c5.setID("1001");
        c5.setName("Emma");
        c5.setSex("Female");
        c5.setAge(30);
        customers.add(c5);
    }

    @RequestMapping(value = "/customers")
    public List<Customer> getCustomers() {

        return customers;
    }

    @RequestMapping(value = "/customerbyid/{id}")
    public Customer getCustomerByID(@PathVariable("id") String ID) {

        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getID().equals(ID)){
                return customers.get(i);
            }
        }
        return customers.get(0);
    }
    @RequestMapping(value = "/customerbyname/{n}")
    public Customer getCustomerByName(@PathVariable("n") String name) {

        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getName().equals(name)){
                return customers.get(i);
            }
        }
        return customers.get(-1);
    }
    @RequestMapping(value = "/customerDelByid/{id}")
    public boolean delCustomerByID(@PathVariable("id") String ID) {

        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getID().equals(ID)){
                customers.remove(i);
                return true;
            }
        }
        return false;
    }
    @RequestMapping(value = "/customerDelByname/{n}")
    public boolean delCustomerByName(@PathVariable("n") String name) {

        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getName().equals(name)){
                customers.remove(i);
                return true;
            }
        }
        return false;
    }
    @RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
    public boolean addCustomer(@RequestParam String ID,@RequestParam String n, @RequestParam String s, @RequestParam int a) {
        Customer n1 = new Customer();
        n1.setID(ID);
        n1.setName(n);
        n1.setSex(s);
        n1.setAge(a);
        customers.add(n1);
        return true;
    }
    @RequestMapping(value = "/addCustomer2", method = RequestMethod.POST)
        public boolean addCustomer2(@RequestParam String ID,@RequestParam String n, @RequestParam String s, @RequestParam int a) {
        Customer n1 = new Customer();
        n1.setID(ID);
        n1.setName(n);
        n1.setSex(s);
        n1.setAge(a);
        customers.add(n1);
        return true;
    }
}

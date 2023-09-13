package org.Srvnnn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

    @Autowired
    private Address address;

    public Person() {
        this.name = "unknown";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress(){
        return address;
    }

    @Override
    public String toString(){
        return "Person [name=" + name + ", address=" + address + "]";
    }

}

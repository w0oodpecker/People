package org.example;

public class PersonBuilder {

    private int AGEDAFAULT = -1;
    private String ADDRESSDEFAULT = "";

    private String name;
    private String surname;
    private Integer age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }


    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }


    public PersonBuilder setAge(Integer age) {
        if (age < 0) {
            throw new IllegalArgumentException();
        }
        this.age = age;
        return this;
    }


    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }


    public Person build() {
        if (this.name != null & this.surname != null) {
            return new Person(this.name, this.surname,
                    this.age != null ? (int)this.age : AGEDAFAULT,
                    this.address != null ? this.address : ADDRESSDEFAULT);
        } else {
            throw new IllegalStateException();
        }
    }

}
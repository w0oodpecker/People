package org.example;

public class Person {

    protected final String name; //Имя персоны обязательно, менятся не может
    protected final String surname; //Фамилия персоны обязательно, менчтся не может
    protected int age; //Возраст, может менятся только на +1
    protected String address; //Текущий город жительства, может менятся


    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = city;
    }


    //Возврат имени
    public String getName() {
        return this.name;
    }


    //Возврат фамилии
    public String getSurname() {
        return this.surname;
    }


    //Возврат возраста
    public int getAge() {
        return this.age;
    }


    //Возврат текущего адреса жительства
    public String getAddress() {
        return this.address;
    }


    //Установка возраста
    public void happyBirthday() {
        if (hasAge()) {
            this.age++;
        }
    }


    // Определение известен ли возраст
    public boolean hasAge() {
        return this.age < 0 ? false : true;
    }


    // Опредлеление известен ли адрес
    public boolean hasAddress() {
        return this.address == "" ? false : true;
    }


    //Установка адреса
    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("  Имя: ");
        string.append(this.name);
        string.append("  Фамилия: ");
        string.append(this.surname);
        string.append("  Возраст: ");
        string.append(this.hasAge() ? this.getAge() : "неизвестно");
        string.append("  Адрес: ");
        string.append(this.hasAddress() ? this.getAddress() : "неизвестно");
        return string.toString();
    }

    public PersonBuilder newChildBuilder() { //Создание дочерних объектов
        return new PersonBuilder().setName("").setSurname(this.surname).setAddress(this.address);
    }

}

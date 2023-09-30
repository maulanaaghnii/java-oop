public class Person {

    String name;
    String address;
    final String country = "Indonesia";

    // Constructor
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    // Constructor Overloading
    Person(String paramName){
        name = paramName;
    }
    void sayHello(String name){
        System.out.println("Hello "+name);
    }
}

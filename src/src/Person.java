/**
 * Created by Domenico on 17/04/2016.
 */
public class Person {

    private  String first_name;
    private String second_name;
    private Address address;

    public Person(String first_name, String second_name, Address address) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.address = address;
    }

    public Person() {

    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first_name='" + first_name + '\'' +
                ", second_name='" + second_name + '\'' +
                ", address=" + address.toString() +
                '}';
    }
}

package HogwartsStudent3;

public class HogwartsStudent implements Comparable<HogwartsStudent> {
    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setHouse(String house) throws Exception {
        if (house.equals("Gryffindor") || house.equals("Hufflepuff") || house.equals("Ravenclaw") || house.equals("Slytherin")) {
            this.house = house;
        } else {
            throw new Exception();
        }
    }

    @Override
    public int compareTo(HogwartsStudent o) {
        return lastName.compareTo(o.lastName);
    }


    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", house='" + house + '\'' +
                '}';
    }
}

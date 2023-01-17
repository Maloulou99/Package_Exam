package Card2.HogwartsStudent;

public class HogwartsStudent implements Comparable<HogwartsStudent>{

    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

    }


    public void setHouse(String house) throws Exception{
        if (house.equals("Gryffindor") || house.equals("Huffelpuff") || house.equals("Ravenclaw") || house.equals("Slytherin")) {
            this.house = house;
        }else {
            throw new Exception("Ikke dette hus");
        }
    }


    @Override
    public int compareTo(HogwartsStudent o) {
        return lastName.compareTo(o.lastName);
    }

    public String toString(){
        return firstName + " " + lastName;
    }

}

package Names;

public class Names {

    private String firstName;
    private String middleName;
    private String lastName;


    public Names(String fullName){
        String[] s = fullName.split(" ");
        if (s.length > 2){
            this.middleName =s[1];
        }
        this.firstName = s[0];
        this.lastName = s[s.length -1];
    }

    public Names(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Names(String firstName,String middleName, String lastName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String toString() {
        if (middleName == null)
            return firstName + " " + lastName;
    else{
        return firstName + " " + middleName + " " +  lastName;
    }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public static void main(String[] args) {

        Names names = new Names("Malou", "Lundstrøm");
        Names names1 = new Names("Malou", "Fatma", "Lundstrøm");


        System.out.println(names);
        System.out.println(names1);

    }

}

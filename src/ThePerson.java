public class ThePerson {
    private String name;
    private String adress;
    private String phonenumber;
    private String email;

    public  ThePerson(String name, String adress, String phonenumber, String email){
        this.name = name;
        this.adress = adress;
        this.phonenumber = phonenumber;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ThePerson{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

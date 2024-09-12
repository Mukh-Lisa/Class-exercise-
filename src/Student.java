import java.security.PublicKey;

public class Student extends ThePerson{
    public  static  final  String FRESHMAN = "Freshman";
    public  static final String SOPHOMORE = "Sophomre";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private  String status;
    public Student(String name, String adress, String phonenumber, String email, String status){
     super(name,adress,phonenumber,email);
        this.status=status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "status='" + status + '\'' +
                '}'+super.toString();
    }
}


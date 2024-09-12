import java.time.LocalDate;

public class Faculty extends Employee{
    private String officehours;
    private String rank;

    public Faculty(String name, String adress, String phonenumber, String email, String office, Double salary, LocalDate datehired, String officehours, String rank) {
        super(name, adress, phonenumber, email, office, salary, datehired);
        this.officehours=officehours;
        this.rank=rank;
    }

    public String getOfficehours() {
        return officehours;
    }

    public void setOfficehours(String officehours) {
        this.officehours = officehours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "officehours='" + officehours + '\'' +
                ", rank='" + rank + '\'' +
                '}'+ super.toString();
    }
}

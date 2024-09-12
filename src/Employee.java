import java.time.LocalDate;

public class Employee extends ThePerson{
    private  String office;
    private Double salary;
    private LocalDate datehired;

    public Employee(String name, String adress, String phonenumber, String email, String office, Double salary, LocalDate datehired) {
        super(name, adress, phonenumber, email);
        this.office=office;
        this.salary=salary;
        this.datehired=datehired;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getDatehired() {
        return datehired;
    }

    public void setDatehired(LocalDate datehired) {
        this.datehired = datehired;
    }

    @Override
    public String toString() {
        return "Class : Employee, Name; " + super.toString();
    }
}


package JavaPrograms;
class Employee {
    private String name;
    private int empId;
    private String designation;
    private String companyName;

    public void setName(String Name) {
        this.name = Name;
        }
    public String getName() {
        return name;
        }

    public void setEmpId(int EmpId) {
        this.empId = EmpId;
        }
    public int getEmpId() {
        return empId;
        }

    public void setDesignation(String Designation) {
        this.designation = Designation;
       
    }
    public String getDesignation() { return designation; }

    public void setCompanyName(String companyName) { this.companyName = companyName; }
    public String getCompanyName() { return companyName; }
}

public class Employees {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Ruby");
        emp.setEmpId(1234);
        emp.setDesignation("Developer");
        emp.setCompanyName("Infosys");

        System.out.println("Name: " + emp.getName());
        System.out.println("Emp ID: " + emp.getEmpId());
        System.out.println("Designation: " + emp.getDesignation());
        System.out.println("Company Name: " + emp.getCompanyName());
    }
}

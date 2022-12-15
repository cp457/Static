import lombok.Data;

@Data
public class Employee {


    public   String name;
    public  String surname;
    public  String address;

    public  Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress){

        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;

    }
     public String getEmployeeDetails(){

        return ("Employee's details " + name + surname + address);
    }
}

/*
    3 instance variables name, surname and address
    a constructor method that assigns 3 params (newEmployeeName, newEmployeeSurname, newEmployeeAddress) to the respective object's properties
    a method getEmployeeDetails() that returns an informative String with all the details of the Employee
*/
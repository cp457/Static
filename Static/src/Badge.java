import lombok.Data;

@Data

public class Badge {
    private static int totalNumberOfEmployees;
    final private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber() {

        totalNumberOfEmployees++;
    }
    private String generateBadgeIdCode() {

        return " XXX " + employee.name + employee.surname + " XYZ ";
    }
        public void showBadgeDetails(){
            System.out.println(employee.getEmployeeDetails());
            System.out.println("IdCode " + generateBadgeIdCode());
            System.out.println("Employee's number " + totalNumberOfEmployees);
        }

    public Badge(Employee employeeThatNeedBadge) {
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedBadge;
        this.badgeIdCode = generateBadgeIdCode();

    }

}


/*
 a constructor method that takes an Employee param called employeeThatNeedsBadge and:
        call the static method for keeping track of the number of employees
        assign the value of employeeThatNeedsBadge to the object's employee property
        assign a generated id code to the object's badgeIdCode



    a private static int variable called totalNumberOfEmployees (the value of this variable will be shared across multiple class instances)
    a private String variable called badgeIdCode
    a public Employee variable called employee
    a private static void method called keepTrackOfEmployeesNumber() that increments by 1 the totalNumberOfEmployees


    a private String method called generateBadgeIdCode() that returns a String containing name and surname of the employee between two random String codes (e.g. XYZNameSurnameZYX)
    a public void method called showBadgeDetails() that informs the user about:
        the total number of employee tracked by the badges
        the details of the employee
        the badgeIdCode

        define a tester class where you:

    create 2 new Employee objects
    create their new 2 Badge
    show to the user the 2 employees' badge details

    */

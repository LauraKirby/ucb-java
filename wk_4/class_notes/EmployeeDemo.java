class Employee
{
    // fields, which has class-wide scope
    // because declared at top-most class level
    int initialSalary;
    int newSalary;
    String primaryColor1 = "red";
               // formal parameter
    Employee(int initialSalary)
    {
        // set the field value to equal the formal parameter
        // Note: removing "this." means the field value defaults to 0
        this.initialSalary = initialSalary;
        System.out.println("initial salary is " + initialSalary);
    }
                  // formal parameter
    void setSalary(int newSalary)
    {
        this.newSalary = newSalary;
        System.out.println("newSalary is " + newSalary);
        // local variable, which has scope only in this block
        String myFavoriteColor = "green";
    }
}
class EmployeeDemo
{
    public static void main(String[] args)
    {
                                      //  runtime arg
        Employee jamesBond = new Employee(100000);
        jamesBond.setSalary(150000);
        Employee maxwellSmart = new Employee(30);
        maxwellSmart.setSalary(50);
        System.out.println(jamesBond.initialSalary); // 100000
        System.out.println(maxwellSmart.newSalary);  // 50
    }
}
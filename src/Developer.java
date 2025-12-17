public class Developer extends Employee
{
    private String programmingLanguage;

    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("programmingLanguage :" +programmingLanguage);
    }
}

public class Manager extends Employee{
    private int teamSize;

    public Manager(String name, int employeeId, double salary, int teamSize) {
        super(name, employeeId, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("teamSize :"+teamSize);
    }
}

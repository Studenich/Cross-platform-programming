package sample;

/**
 * Employee class.
 * Class contains information about worker
 *
 * @author Valentin Studenichnik
 */

abstract class Employee {
    /**
     * Name of worker.
     */
    private final String name;
    /**
     * Salary of worker.
     */
    private int salary;
    private int cash;

    /**
     * Employee constructor.
     * Initialize worker
     *
     * @param newName Name
     * @param newSalary Salary
     */
    Employee(final String newName, final int newSalary) {
        this.name = newName;
        this.salary = newSalary;
        this.cash = 0;
    }

    /**
     * Get name.
     *
     * @return Name
     */
    public String getName() {
        return name;
    }

    /**
     * Get salary.
     *
     * @return Salary
     */
    public int getSalary() {
        return salary;
    }

    public void getCash() {
        this.cash += this.salary;
    }

    public void increaseSalary(final int addition) {
        this.salary += addition;
    }

    public String currentCash() { return String.valueOf(cash); }
}

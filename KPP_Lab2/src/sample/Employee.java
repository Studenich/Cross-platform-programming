package sample;

/**
 * Employee class.
 * Class contains information about worker
 *
 * @author Valentin Studenichnik
 */

class Employee {
    /**
     * Name of worker.
     */
    private final String name;
    /**
     * Salary of worker.
     */
    private final int salary;

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
}

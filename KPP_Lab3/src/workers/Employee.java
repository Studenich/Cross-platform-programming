package workers;

/**
 * Employee class.
 * Class contains information about worker
 *
 * @author Valentin Studenichnik
 */

abstract class Employee {
    /**
     * Salary of worker.
     */
    private int salary;
    /**
     * Current cash of worker.
     */
    private int cash;

    /**
     * Employee constructor.
     * Initialize worker
     *
     * @param newSalary Salary
     */
    Employee(final int newSalary) {
        this.salary = newSalary;
        this.cash = 0;
    }

    /**
     * Get salary.
     *
     * @return Salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Paying out salary.
     */
    public void getCash() {
        this.cash += this.salary;
    }

    /**
     * Method which increases salary of worker.
     *
     * @param addition Addition to salary
     */
    void increaseSalary(final int addition) {
        this.salary += addition;
    }
}

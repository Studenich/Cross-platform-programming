package workers;

import java.util.ArrayDeque;

/**
 * Director class.
 * Extends Employee
 *
 * @author Valentin Studenichnik
 */
public final class Director extends Employee {

    /**
     * Director constructor.
     *
     * @param salary Salary
     */
    @SuppressWarnings("SameParameterValue")
    public Director(final int salary) {
        super(salary);
    }

    /**
     * Method which adds new problem.
     *
     * @param queue Queue of problems
     */
    public void addProblem(final ArrayDeque<String> queue) {
        queue.add("Problem");
    }
}

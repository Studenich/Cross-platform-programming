package sample;

import java.util.ArrayDeque;

/**
 * Director class.
 * Extends Employee
 *
 * @author Valentin Studenichnik
 */
final class Director extends Employee {

    /**
     * Director constructor.
     *
     * @param name Name
     * @param salary Salary
     */
    @SuppressWarnings("SameParameterValue")
    Director(final String name, final int salary) {
        super(name, salary);
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

package sample;

import java.util.ArrayDeque;

/**
 * Coder class.
 * Extends Employee
 *
 * @author Valentin Studenichnik
 */
final class Coder extends Employee {

    /**
     * Coder constructor.
     *
     * @param name Name
     * @param salary Salary
     */
    @SuppressWarnings("SameParameterValue")
    Coder(final String name, final int salary) {
        super(name, salary);
    }

    /**
     * Method which solves problems.
     *
     * @param queue Queue of problems
     */
    public void solveProblem(final ArrayDeque queue) {
        if (!queue.isEmpty()) {
            queue.removeFirst();
        }
    }
}

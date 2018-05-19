package workers;

import java.util.ArrayDeque;

/**
 * Coder class.
 * Extends Employee
 *
 * @author Valentin Studenichnik
 */
public final class Coder extends Employee {

    /**
     * Count of solved problems.
     */
    private int solvedProblems;

    /**
     * Coder constructor.
     *
     * @param salary Salary
     */
    @SuppressWarnings("SameParameterValue")
    public Coder(final int salary) {
        super(salary);
        this.solvedProblems = 0;
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

    /**
     * Method which increases count of solved problems.
     */
    public void incSolvedProblems() {
        this.solvedProblems++;
    }

    /**
     * Method which increase salary.
     */
    public void increaseSalary() {
        this.increaseSalary(solvedProblems);
        solvedProblems = 0;
    }

    /**
     * Get count of solved problems.
     *
     * @return Count of solved problems.
     */
    public int getSolvedProblems() {
        return this.solvedProblems;
    }
}

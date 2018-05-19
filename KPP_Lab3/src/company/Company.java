package company;

import workers.Cleaner;
import workers.Coder;
import workers.Director;

import java.util.ArrayDeque;

/**
 * Company class.
 * Contains all workers and queue of problems
 *
 * @author Valentin Studenichnik
 */
public final class Company {

    /**
     * Default director salary.
     */
    public static final int DEFAULT_DIRECTOR_SALARY = 50;
    /**
     * Default coder salary.
     */
    public static final int DEFAULT_CODER_SALARY = 20;
    /**
     * Default cleaner salary.
     */
    public static final int DEFAULT_CLEANER_SALARY = 10;
    /**
     * Default value of award.
     */
    public static final int DEFAULT_AWARD = 10;

    /**
     * Director of company.
     */
    private Director director;
    /**
     * Coder of company.
     */
    private Coder coder;
    /**
     * Cleaner of company.
     */
    private Cleaner cleaner;
    /**
     * Queue (deque) of problems of company.
     */
    private final ArrayDeque<String> problems = new ArrayDeque<>();


    /**
     * Method which adds new director.
     */
    public void addDirector() {
        this.director = new Director(DEFAULT_DIRECTOR_SALARY);
    }

    /**
     * Method which adds new coder.
     */
    public void addCoder() {
        this.coder = new Coder(DEFAULT_CODER_SALARY);
    }

    /**
     * Method which adds new cleaner.
     */
    public void addCleaner() {
        this.cleaner = new Cleaner(DEFAULT_CLEANER_SALARY);
    }

    /**
     * Method which adds new problem by director.
     */
    public void addProblem() {
        this.director.addProblem(getDeque());
    }

    /**
     * Method which solves first problem by coder.
     * Also increase solved problems of coder.
     *
     * @return Current count of problems.
     */
    public int solveProblem() {
        this.coder.solveProblem(getDeque());
        this.coder.incSolvedProblems();

        return problems.size();
    }

    /**
     * Method which increases coder's salary.
     *
     * @return Current salary of coder.
     */
    public int increaseCoderSalary() {
        this.coder.increaseSalary();

        return this.coder.getSalary();
    }

    /**
     * Method which gives access to queue of problems.
     *
     * @return Queue
     */
    private ArrayDeque<String> getDeque() {
        return this.problems;
    }

    /**
     * Method which gives size of problem queue.
     *
     * @return Size of queue
     */
    public String problemCount() {
        return String.valueOf(this.problems.size());
    }

    /**
     * Method which gives to cleaner work.
     */
    public void clean() {
        this.cleaner.clean();
    }

    /**
     * Method which pay out salaries to all employees.
     */
    public void payOut() {
        this.director.getCash();
        this.cleaner.getCash();
        this.coder.getCash();
    }

    /**
     * Get salary of director.
     *
     * @return Director's salary
     */
    public int getDirectorSalary() {
        if (director != null) {
            return this.director.getSalary();
        }
        return 0;
    }

    /**
     * Get salary of coder.
     *
     * @return Coder's salary
     */
    public int getCoderSalary() {
        if (coder != null) {
            return this.coder.getSalary();
        }
        return 0;
    }

    /**
     * Get salary of cleaner.
     *
     * @return Cleaner's salary
     */
    public int getCleanerSalary() {
        if (cleaner != null) {
            return this.cleaner.getSalary();
        }
        return 0;
    }

    /**
     * Get count of solved problems by coder.
     *
     * @return Count of solved problems.
     */
    public int getCoderSolvedProblems() {
        return this.coder.getSolvedProblems();
    }
}

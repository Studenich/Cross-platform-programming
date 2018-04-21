package sample;

import java.util.ArrayDeque;

/**
 * Company class.
 * Contains all workers and queue of problems
 *
 * @author Valentin Studenichnik
 */
final class Company {

    /**
     * Default director salary.
     */
    private static final int DEFAULT_DIRECTOR_SALARY = 200;
    /**
     * Default coder salary.
     */
    private static final int DEFAULT_CODER_SALARY = 100;
    /**
     * Default cleaner salary.
     */
    private static final int DEFAULT_CLEANER_SALARY = 20;

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
        this.director = new Director("Name", DEFAULT_DIRECTOR_SALARY);
    }

    /**
     * Method which adds new coder.
     */
    public void addCoder() {
        this.coder = new Coder("Name", DEFAULT_CODER_SALARY);
    }

    /**
     * Method which adds new cleaner.
     */
    public void addCleaner() {
        this.cleaner = new Cleaner("Name", DEFAULT_CLEANER_SALARY);
    }

    /**
     * Method which adds new problem by director.
     */
    public void addProblem() {
        this.director.addProblem(getDeque());
    }

    /**
     * Method which solves first problem by coder.
     */
    public void solveProblem() {
        this.coder.solveProblem(getDeque());
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
}

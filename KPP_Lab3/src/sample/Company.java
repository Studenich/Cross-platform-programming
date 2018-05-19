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
    public static final int DEFAULT_DIRECTOR_SALARY = 50;
    /**
     * Default coder salary.
     */
    public static final int DEFAULT_CODER_SALARY = 20;
    /**
     * Default cleaner salary.
     */
    public static final int DEFAULT_CLEANER_SALARY = 10;
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
     * Also increase solved problems of coder.
     */
    public int solveProblem() {
        this.coder.solveProblem(getDeque());
        this.coder.incSolvedProblems();
        return problems.size();
    }

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
    public void payOut() {
        this.director.getCash();
        this.cleaner.getCash();
        this.coder.getCash();
    }

    public int getDirectorSalary() {
        if (director != null) {
            return this.director.getSalary();
        }
        return 0;
    }
    public int getCoderSalary() {
        if (coder != null) {
            return this.coder.getSalary();
        }
        return 0;
    }
    public int getCleanerSalary() {
        if (cleaner != null) {
            return this.cleaner.getSalary();
        }
        return 0;
    }
    public int getCoderSolvedProblems() {
        return this.coder.getSolvedProblems();
    }
}

package workers;

import javafx.scene.control.Alert;

/**
 * Cleaner class.
 * Extends Employee
 *
 * @author Valentin Studenichnik
 */
public final class Cleaner extends Employee {

    /**
     * Cleaner constructor.
     *
     * @param salary Salary
     */
    @SuppressWarnings("SameParameterValue")
    public Cleaner(final int salary) {
        super(salary);
    }

    /**
     * Clean method.
     * Just create alert window with text
     */
    public void clean() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Cleaning process");
        alert.setHeaderText(null);
        alert.setContentText("CLEANED!");

        alert.showAndWait();
    }
}

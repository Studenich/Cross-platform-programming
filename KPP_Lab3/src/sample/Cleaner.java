package sample;

import javafx.scene.control.Alert;

/**
 * Cleaner class.
 * Extends Employee
 *
 * @author Valentin Studenichnik
 */
final class Cleaner extends Employee {

    /**
     * Cleaner constructor.
     *
     * @param name Name
     * @param salary Salary
     */
    @SuppressWarnings("SameParameterValue")
    Cleaner(final String name, final int salary) {
        super(name, salary);
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

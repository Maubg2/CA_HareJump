/**
 * The package co.edu.unbosque.view contains the classes related to the graphical interface
 * from the Hare Jump app. These classes are designed following the design pattern
 * architectural Model-View-Controller (MVC). The View in this package takes care of
 * the presentation and user interface, displaying and collecting user information.
 * <p>
 * Classes in this package:
 * - HareJumpView: The main class that represents the view of the Hare Jump application.
 * - ShowData: A class that represents the view for displaying data during the Hare Jump application.
 * </p>
 */

package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * The ShowData class represents the view for displaying data during the Hare Jump application.
 * Extends JPanel and contains graphical interface elements for showing data.
 */
public class ShowData extends JPanel {

    /**
     * The area attribute represents the text area for displaying data in the graphical interface.
     * <p>
     * Properties:
     * - Editable: Disabled
     * - Background color: Gray
     * - Position: Located at (30, 40) with a size of 610x560 pixels.
     * </p>
     */
    private JTextArea area;

    /**
     * The nextStep attribute represents the button to navigate to the next step in the data display.
     * <p>
     * Properties:
     * - Text: "Next"
     * - Black background
     * - Foreground text: White
     * - Position: Located at (420, 620) with a size of 80x30 pixels.
     * </p>
     */
    private JButton nextStep;

    /**
     * The lastStep attribute represents the button to navigate to the last step in the data display.
     * <p>
     * Properties:
     * - Text: "Last"
     * - Black background
     * - Foreground text: White
     * - Position: Located at (180, 620) with a size of 80x30 pixels.
     * </p>
     */
    private JButton lastStep;

    /**
     * The scroll attribute represents the scroll pane for the text area to enable scrolling.
     * <p>
     * Properties:
     * - Position: Located at (30, 40) with a size of 610x560 pixels.
     * </p>
     */
    private JScrollPane scroll;

    /**
     * Constructor of the ShowData class.
     * Configures the initial appearance of the data display graphical interface.
     * <p>
     * Actions performed by the builder:
     * - Sets the panel layout to null (null layout).
     * - Set the panel background color to gray.
     * - Initializes and configures the interface components using the private execute() method.
     * - Makes the panel visible.
     * </p>
     */
    public ShowData() {

        setLayout(null);
        setBackground(Color.GRAY);
        execute();
        setVisible(true);

    }

    /**
     * Private method used in the constructor to initialize and configure the components
     * from the graphical interface for displaying data.
     * <p>
     * Actions performed by the method:
     * - Create and configure the text area for displaying data.
     * - Create and configure the scroll pane for the text area.
     * - Create and configure the "Next" and "Last" buttons.
     * </p>
     */
    public void execute() {

        area = new JTextArea();

        scroll = new JScrollPane(area);
        scroll.setBounds(30, 40, 610, 560);
        area.setEditable(false);
        add(scroll);

        nextStep = new JButton("Next");
        nextStep.setBackground(Color.BLACK);
        nextStep.setForeground(Color.WHITE);
        nextStep.setBounds(420, 620, 80, 30);
        add(nextStep);

        lastStep = new JButton("Last");
        lastStep.setBackground(Color.BLACK);
        lastStep.setForeground(Color.WHITE);
        lastStep.setBounds(180, 620, 80, 30);
        add(lastStep);

    }

    /**
     * Access method to get the text area for displaying data.
     *
     * @return The text area for displaying data.
     */
    public JTextArea getArea() {
        return area;
    }

    /**
     * Setting method to set the text area for displaying data.
     *
     * @param area The new text area for displaying data.
     */
    public void setArea(JTextArea area) {
        this.area = area;
    }

    /**
     * Access method to get the button for navigating to the next step.
     *
     * @return The button for navigating to the next step.
     */
    public JButton getNextStep() {
        return nextStep;
    }

    /**
     * Setting method to set the button for navigating to the next step.
     *
     * @param nextStep The new button for navigating to the next step.
     */
    public void setNextStep(JButton nextStep) {
        this.nextStep = nextStep;
    }

    /**
     * Access method to get the button for navigating to the last step.
     *
     * @return The button for navigating to the last step.
     */
    public JButton getLastStep() {
        return lastStep;
    }

    /**
     * Setting method to set the button for navigating to the last step.
     *
     * @param lastStep The new button for navigating to the last step.
     */
    public void setLastStep(JButton lastStep) {
        this.lastStep = lastStep;
    }

}
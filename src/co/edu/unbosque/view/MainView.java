/**
 * The package co.edu.unbosque.view contains the classes related to the graphical interface
 * from the Hare Jump app. These classes are designed following the design pattern
 * architectural Model-View-Controller (MVC). The View in this package takes care of
 * the presentation and user interface, displaying and collecting user information.
 * <p>
 * Classes in this package:
 * - HareJumpView: The main class that represents the view of the Hare Jump application.
 * - ShowData: A class that represents the view for displaying data during the Hare Jump application.
 * - MainView: The main frame that integrates the HareJumpView and ShowData views.
 * </p>
 */

package co.edu.unbosque.view;

import javax.swing.JFrame;

/**
 * The MainView class represents the main frame of the Hare Jump application.
 * Extends JFrame and integrates the HareJumpView and ShowData views.
 */
public class MainView extends JFrame {

    /**
     * The hj attribute represents the instance of the HareJumpView in the graphical interface.
     * <p>
     * Properties:
     * - Position: Located at (0, 0) with a size of 500x700 pixels.
     * </p>
     */
    private HareJumpView hj;

    /**
     * The sd attribute represents the instance of the ShowData view in the graphical interface.
     * <p>
     * Properties:
     * - Position: Located at (500, 0) with a size of 700x700 pixels.
     * </p>
     */
    private ShowData sd;

    /**
     * Constructor of the MainView class.
     * Configures the initial appearance of the main frame for the Hare Jump application.
     * <p>
     * Actions performed by the builder:
     * - Calls the execute() method to initialize and configure views.
     * - Configures the main frame properties, including title, size, location, and visibility.
     * </p>
     */
    public MainView() {

        execute();

        getContentPane().setLayout(null);
        setTitle("CA");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 700);
        setLocationRelativeTo(null);
        // setResizable(false);
        setVisible(true);

    }

    /**
     * Private method used in the constructor to initialize and configure the views
     * from the graphical interface of the Hare Jump application.
     * <p>
     * Actions performed by the method:
     * - Initializes and configures the HareJumpView.
     * - Initializes and configures the ShowData view.
     * - Adds the views to the content pane of the main frame.
     * </p>
     */
    private void execute() {

        hj = new HareJumpView();
        hj.setBounds(0, 0, 500, 700);
        getContentPane().add(hj);

        sd = new ShowData();
        sd.setBounds(500, 0, 700, 700);
        getContentPane().add(sd);
    }

    /**
     * Access method to get the HareJumpView instance in the graphical interface.
     *
     * @return The HareJumpView instance.
     */
    public HareJumpView getHj() {
        return hj;
    }

    /**
     * Setting method to set the HareJumpView instance in the graphical interface.
     *
     * @param hj The new HareJumpView instance.
     */
    public void setHj(HareJumpView hjv) {
        this.hj = hjv;
    }

    /**
     * Access method to get the ShowData instance in the graphical interface.
     *
     * @return The ShowData instance.
     */
    public ShowData getSd() {
        return sd;
    }

    /**
     * Setting method to set the ShowData instance in the graphical interface.
     *
     * @param sd The new ShowData instance.
     */
    public void setSd(ShowData sd) {
        this.sd = sd;
    }

}

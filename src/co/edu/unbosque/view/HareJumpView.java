/**
 * The package co.edu.unbosque.view contains the classes related to the graphical interface
 * from the Hare Jump app. These classes are designed following the design pattern
 * architectural Model-View-Controller (MVC). The View in this package takes care of
 * of the presentation and user interface, displaying and collecting user information.
 * <p>
 *Classes in this package:
 * - HareJumpView: The main class that represents the view of the Hare Jump application.
 * </p>
 */

package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * The HareJumpView class represents the view of the Hare Jump application.
 * Extends JPanel and contains the graphical interface elements.
 */

public class HareJumpView extends JPanel{
	
	 /**
	  * The title attribute represents the title tag in the graphical interface of the Hare Jump application.
	  * This tag is used to display the main title in the window.
	  * <p>
	  * Properties:
	  * - Text: "Hare Jump"
	  * - Font: Cooper black, bold, size 20
	  * - Color: Black
	  * - Position: Located at (180, 30) with a size of 300x30 pixels.
	  * </p>
	  */
	private JLabel title;
	
	 /**
	  * The labP attribute represents the label that describes the input field for the value of "p"
	  * in the graphical interface of the Hare Jump application.
	  * <p>
	  * Properties:
	  * - Text: "Value of p:"
	  * - Font: Arial, italic, size 15
	  * - Color: Black
	  * - Position: Located at (60, 120) with a size of 140x30 pixels.
	  * </p>
	  */
	private JLabel labP;
	
	 /**
	  * The labQ attribute represents the label that describes the input field for the value of "q"
	  * in the graphical interface of the Hare Jump application.
	  * <p>
	  * Properties:
	  * - Text: "Value of q:"
	  * - Font: Arial, italic, size 15
	  * - Color: Black
	  * - Position: Located at (240, 120) with a size of 140x30 pixels.
	  * </p>
	  */
	private JLabel labQ;
	
	 /**
	  * The inpP attribute represents the text input field to capture the value of "p"
	  * in the graphical interface of the Hare Jump application.
	  * <p>
	  * Properties:
	  * - Initial text: Empty ("")
	  * - Position: Located at (150, 120) with a size of 50x25 pixels.
	  * </p>
	  */
	private JTextField inpP;
	
	 /**
	  * The inpQ attribute represents the text input field to capture the value of "q"
	  * in the graphical interface of the Hare Jump application.
	  * <p>
	  * Properties:
	  * - Initial text: Empty ("")
	  * - Position: Located at (320, 120) with a size of 50x25 pixels.
	  * </p>
	  */
	private JTextField inpQ;
	
	 /**
	  * The labN attribute represents the label that describes the input field for the value of "n"
	  * in the graphical interface of the Hare Jump application.
	  * <p>
	  * Properties:
	  * - Text: "Value of n:"
	  * - Font: Arial, italic, size 15
	  * - Color: Black
	  * - Position: Located at (60, 220) with a size of 140x30 pixels.
	  * </p>
	  */
	private JLabel labN;
	
	 /**
	  * The labM attribute represents the label that describes the input field for the value of "m"
	  * in the graphical interface of the Hare Jump application.
	  * <p>
	  * Properties:
	  * - Text: "Value of m:"
	  * - Font: Arial, italic, size 15
	  * - Color: Black
	  * - Position: Located at (240, 220) with a size of 140x30 pixels.
	  * </p>
	  */
	private JLabel labM;
	
	 /**
	  * The inpN attribute represents the text input field to capture the value of "n"
	  * in the graphical interface of the Hare Jump application.
	  * <p>
	  * Properties:
	  * - Initial text: Empty ("")
	  * - Position: Located at (150, 220) with a size of 50x25 pixels.
	  * </p>
	  */
	private JTextField inpN;
	
	 /**
	  * The inpM attribute represents the text input field to capture the value of "m"
	  * in the graphical interface of the Hare Jump application.
	  * <p>
	  * Properties:
	  * - Initial text: Empty ("")
	  * - Position: Located at (320, 220) with a size of 50x25 pixels.
	  * </p>
	  */
	private JTextField inpM;
	
	 /**
	  * The labX0 attribute represents the label that describes the input field for the value of "X0"
	  * in the graphical interface of the Hare Jump application.
	  * <p>
	  * Properties:
	  * - Text: "Start of X:"
	  * - Font: Arial, italic, size 15
	  * - Color: Black
	  * - Position: Located at (70, 340) with a size of 140x30 pixels.
	  * </p>
	  */
	private JLabel labX0;
	
	 /**
	  * The labY0 attribute represents the label that describes the input field for the value of "Y0"
	  * in the graphical interface of the Hare Jump application.
	  * <p>
	  * Properties:
	  * - Text: "Start of Y:"
	  * - Font: Arial, italic, size 15
	  * - Color: Black
	  * - Position: Located at (240, 340) with a size of 140x30 pixels.
	  * </p>
	  */
	private JLabel labY0;
	
	 /**
	  * The inpX0 attribute represents the text input field to capture the value of "X0"
	  * in the graphical interface of the Hare Jump application.
	  * <p>
	  * Properties:
	  * - Initial text: Empty ("")
	  * - Position: Located at (150, 340) with a size of 50x25 pixels.
	  * </p>
	  */
	private JTextField inpX0;
	
	 /**
	  * The inpY0 attribute represents the text input field to capture the value of "Y0"
	  * in the graphical interface of the Hare Jump application.
	  * <p>
	  * Properties:
	  * - Initial text: Empty ("")
	  * - Position: Located at (320, 340) with a size of 50x25 pixels.
	  * </p>
	  */
	private JTextField inpY0;
	
	 /**
	  * The labEndX attribute represents the label that describes the input field for the "EndX" value
	  * in the graphical interface of the Hare Jump application.
	  * <p>
	  * Properties:
	  * - Text: "End of X:"
	  * - Font: Arial, italic, size 15
	  * - Color: Black
	  * - Position: Located at (70, 460) with a size of 140x30 pixels.
	  * </p>
	  */
	private JLabel labEndX;
	
	 /**
	  * The labEndY attribute represents the label that describes the input field for the value of "EndY"
	  * in the graphical interface of the Hare Jump application.
	  * <p>
	  * Properties:
	  * - Text: "End of Y:"
	  * - Font: Arial, italic, size 15
	  * - Color: Black
	  * - Position: Located at (240, 460) with a size of 140x30 pixels.
	  * </p>
	  */
	private JLabel labEndY;
	
	 /**
	  * The inpEndX attribute represents the text input field to capture the value of "EndX"
	  * in the graphical interface of the Hare Jump application.
	  * <p>
	  * Properties:
	  * - Initial text: Empty ("")
	  * - Position: Located at (150, 460) with a size of 50x25 pixels.
	  * </p>
	  */
	private JTextField inpEndX;
	
	 /**
	  * The inpEndY attribute represents the text input field to capture the value of "EndY"
	  * in the graphical interface of the Hare Jump application.
	  * <p>
	  * Properties:
	  * - Initial text: Empty ("")
	  * - Position: Located at (320, 460) with a size of 50x25 pixels.
	  * </p>
	  */
	private JTextField inpEndY;

	 /**
	  * The execute attribute represents the run button in the graphical interface of the Hare Jump application.
	  * <p>
	  * Properties:
	  * - Text: "Run"
	  * - Black background
	  * - Foreground text: White
	  * - Position: Located at (312, 580) with a size of 70x30 pixels.
	  * </p>
	  */
	private JButton execute;
	
	  /**
	   * The exit attribute represents the exit button in the graphical interface of the Hare Jump application.
	   * <p>
	   * Properties:
	   * - Text: "Exit"
	   * - Black background
	   * - Foreground text: White
	   * - Position: Located at (142, 580) with a size of 70x30 pixels.
	   * </p>
	   */
	private JButton exit;
	
	 /**
	  * Constructor of the HareJumpView class.
	  * Configures the initial appearance of the Hare Jump application graphical interface.
	  * <p>
	  * Actions performed by the builder:
	  * - Sets the panel layout to null (null layout).
	  * - Set the panel background color to gray.
	  * - Initializes and configures the interface components using the private execute() method.
	  * - Makes the panel visible.
	  * </p>
	  */
	public HareJumpView() {
		
		setLayout(null);
		setBackground(Color.GRAY);
		execute();
		setVisible(true);
		
	}

	 /**
	  * Private method used in the constructor to initialize and configure the components
	  * from the graphical interface of the Hare Jump application.
	  * <p>
	  * Actions performed by the method:
	  * - Create and configure the "Hare Jump" title tag.
	  * - Creates and configures the labels and input fields for the values of p, q, n, m, X0, Y0, EndX, EndY.
	  * - Create and configure the "Run" and "Exit" buttons.
	  * </p>
	  */
	private void execute() {
		
		title = new JLabel("Hare Jump");
		title.setFont(new Font("Cooper black", Font.BOLD, 20));
		title.setForeground(Color.BLACK);
		title.setBounds(180, 30, 300, 30);
		add(title);
		
		labP = new JLabel("Value of p: ");
		labP.setFont(new Font("Arial", Font.ITALIC, 15));
		labP.setForeground(Color.BLACK);
		labP.setBounds(60, 120, 140, 30);
		add(labP);
		
		inpP = new JTextField("");
		inpP.setBounds(150, 120, 50, 25);
		add(inpP);
		
		labQ = new JLabel("Value of q: ");
		labQ.setFont(new Font("Arial", Font.ITALIC, 15));
		labQ.setForeground(Color.BLACK);
		labQ.setBounds(240, 120, 140, 30);
		add(labQ);
		
		inpQ = new JTextField("");
		inpQ.setBounds(320, 120, 50, 25);
		add(inpQ);
		
		labN = new JLabel("Value of n: ");
		labN.setFont(new Font("Arial", Font.ITALIC, 15));
		labN.setForeground(Color.BLACK);
		labN.setBounds(60, 220, 140, 30);
		add(labN);
		
		inpN = new JTextField("");
		inpN.setBounds(150, 220, 50, 25);
		add(inpN);
		
		labM = new JLabel("Value of m: ");
		labM.setFont(new Font("Arial", Font.ITALIC, 15));
		labM.setForeground(Color.BLACK);
		labM.setBounds(240, 220, 140, 30);
		add(labM);
		
		inpM = new JTextField("");
		inpM.setBounds(320, 220, 50, 25);
		add(inpM);
		
		labX0 = new JLabel("Start of X: ");
		labX0.setFont(new Font("Arial", Font.ITALIC, 15));
		labX0.setForeground(Color.BLACK);
		labX0.setBounds(70, 340, 140, 30);
		add(labX0);
		
		inpX0 = new JTextField("");
		inpX0.setBounds(150, 340, 50, 25);
		add(inpX0);
		
		labY0 = new JLabel("Start of Y: ");
		labY0.setFont(new Font("Arial", Font.ITALIC, 15));
		labY0.setForeground(Color.BLACK);
		labY0.setBounds(240, 340, 140, 30);
		add(labY0);
		
		inpY0 = new JTextField("");
		inpY0.setBounds(320, 340, 50, 25);
		add(inpY0);
		
		labEndX = new JLabel("End of X: ");
		labEndX.setFont(new Font("Arial", Font.ITALIC, 15));
		labEndX.setForeground(Color.BLACK);
		labEndX.setBounds(70, 460, 140, 30);
		add(labEndX);
		
		inpEndX = new JTextField("");
		inpEndX.setBounds(150, 460, 50, 25);
		add(inpEndX);
		
		labEndY = new JLabel("End of Y: ");
		labEndY.setFont(new Font("Arial", Font.ITALIC, 15));
		labEndY.setForeground(Color.BLACK);
		labEndY.setBounds(240, 460, 140, 30);
		add(labEndY);
		
		inpEndY = new JTextField("");
		inpEndY.setBounds(320, 460, 50, 25);
		add(inpEndY);
		
		execute = new JButton("Run");
		execute.setBackground(Color.BLACK);
		execute.setForeground(Color.WHITE);
		execute.setBounds(312, 580, 70, 30);
		add(execute);
		
		exit = new JButton("Exit");
		exit.setBackground(Color.BLACK);
		exit.setForeground(Color.WHITE);
		exit.setBounds(142, 580, 70, 30);
		add(exit);
		
	}

	 /**
	  * Access method to get the text input field for "p" in the graphical interface.
	  * @return The text input field for "p".
	  */
	public JTextField getInpP() {
		return inpP;
	}

	 /**
	  * Setting method to set the text input field to "p" in the graphical interface.
	  * @param inpP The new text input field for "p".
	  */
	public void setInpP(JTextField inpP) {
		this.inpP = inpP;
	}

	 /**
	  * Access method to get the text input field for "q" in the graphical interface.
	  * @return The text input field for "q".
	  */
	public JTextField getInpQ() {
		return inpQ;
	}
	
	 /**
	  * Setting method to set the text input field for "q" in the graphical interface.
	  * @param inpQ The new text input field for "q".
	  */
	public void setInpQ(JTextField inpQ) {
		this.inpQ = inpQ;
	}

	 /**
	  * Access method to get the text input field for "n" in the graphical interface.
	  * @return The text input field for "n".
	  */
	public JTextField getInpN() {
		return inpN;
	}
	
	 /**
	  * Setting method to set the text input field to "n" in the graphical interface.
	  * @param inpN The new text input field for "n".
	  */
	public void setInpN(JTextField inpN) {
		this.inpN = inpN;
	}

	 /**
	  * Access method to get the text input field for "m" in the graphical interface.
	  * @return The text input field for "m".
	  */
	public JTextField getInpM() {
		return inpM;
	}
	
	 /**
	  * Setting method to set the text input field to "m" in the graphical interface.
	  * @param inpM The new text input field for "m".
	  */
	public void setInpM(JTextField inpM) {
		this.inpM = inpM;
	}

	 /**
	  * Access method to get the text input field for "X0" in the graphical interface.
	  * @return The text input field for "X0".
	  */
	public JTextField getInpX0() {
		return inpX0;
	}

	 /**
	  * Setting method to set the text input field to "X0" in the graphical interface.
	  * @param inpX0 The new text input field for "X0".
	  */
	public void setInpX0(JTextField inpX0) {
		this.inpX0 = inpX0;
	}

	 /**
	  * Access method to get the text input field for "Y0" in the graphical interface.
	  * @return The text input field for "Y0".
	  */
	public JTextField getInpY0() {
		return inpY0;
	}
	 /**
	  * Setting method to set the text input field to "Y0" in the graphical interface.
	  * @param inpY0 The new text input field for "Y0".
	  */
	public void setInpY0(JTextField inpY0) {
		this.inpY0 = inpY0;
	}

	 /**
	  * Access method to get the text input field for "EndX" in the graphical interface.
	  * @return The text input field for "EndX".
	  */
	public JTextField getInpEndX() {
		return inpEndX;
	}

	 /**
	  * Setting method to set the text input field for "EndX" in the graphical interface.
	  * @param inpEndX The new text input field for "EndX".
	  */
	public void setInpEndX(JTextField inpEndX) {
		this.inpEndX = inpEndX;
	}
	
	 /**
	  * Access method to get the text input field for "EndY" in the graphical interface.
	  * @return The text input field for "EndY".
	  */
	public JTextField getInpEndY() {
		return inpEndY;
	}

	 /**
	  * Setting method to set the text input field for "EndY" in the graphical interface.
	  * @param inpEndY The new text input field for "EndY".
	  */
	public void setInpEndY(JTextField inpEndY) {
		this.inpEndY = inpEndY;
	}

	 /**
	  * Access method to get the run button in the graphical interface.
	  * @return The run button.
	  */
	public JButton getExecute() {
		return execute;
	}
	
	 /**
	  * Setting method to set the run button in the graphical interface.
	  * @param execute The new execute button.
	  */
	public void setExecute(JButton execute) {
		this.execute = execute;
	}
	
	 /**
	  * Access method to get the exit button in the graphical interface.
	  * @return The exit button.
	  */
	public JButton getExit() {
		return exit;
	}
	
	 /**
	  * Método de configuración para establecer el botón de salida en la interfaz gráfica.
	  * @param exit El nuevo botón de salida.
	  */
	public void setExit(JButton exit) {
		this.exit = exit;
	}

}
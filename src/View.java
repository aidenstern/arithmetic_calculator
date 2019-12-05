//**************************************************************************************************************
// CLASS: View
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Fall Session B 2019
// Project Number: 4
//
// AUTHOR: Aiden Stern, amstern3, amstern3@asu.edu
//**************************************************************************************************************
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * The View class implements the GUI.
 */
public class View extends JFrame implements ActionListener {

    public static final int FRAME_WIDTH  = 500;
    public static final int FRAME_HEIGHT = 180;

    // Declare instance variables
    private JButton         mClearButton;
    private JButton         mEvalButton;
    private JTextField      mInputText;
    private JButton         mExitButton;
    private Main            mMain;
    private JLabel          mResultLabel;

    /**
     * View()
     *
     * The View constructor creates the GUI interface and makes the frame visible at the end.
     */
    public View(Main pMain) {
        // Save a reference to the Main object pMain in mMain.
        mMain = pMain;

        JPanel panelLabel = new JPanel(new FlowLayout());
        mResultLabel = new JLabel("");
        panelLabel.add(mResultLabel);

        JPanel panelInput = new JPanel(new FlowLayout());
        mInputText = new JTextField(40);
        panelInput.add(mInputText);

        JPanel panelButtons = new JPanel(new FlowLayout());
        mClearButton = new JButton("Clear");
        mClearButton.addActionListener(this);
        mEvalButton = new JButton("Evaluate");
        mEvalButton.addActionListener(this);
        mExitButton = new JButton("Exit");
        mExitButton.addActionListener(this);
        panelButtons.add(mClearButton);
        panelButtons.add(mEvalButton);
        panelButtons.add(mExitButton);

        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        panelMain.add(Box.createVerticalGlue());
        panelMain.add(panelLabel);
        panelMain.add(panelInput);
        panelMain.add(panelButtons);
        setTitle("Kalkutron-9001");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panelMain);
        setVisible(true);
    }

    /**
     * actionPerformed()
     *
     * Called when one of the JButtons is clicked. Detects which button was clicked and handles it.
     *
     */
    @Override
    public void actionPerformed(ActionEvent pEvent) {
        if (pEvent.getSource().equals(mClearButton)) {
            clear();
        } else if (pEvent.getSource().equals(mEvalButton)) {
            evaluate();
        } else if (pEvent.getSource().equals(mExitButton)) {
            mMain.exit();
        }
    }

    /**
     * clear() is called when the Clear button is clicked. Set the text in mInputText and mResultLabel to the
     * empty strings "".
     */
    public void clear() {
        mInputText.setText("");
        mResultLabel.setText("");
    }

    /**
     * evaluate() is called when the Evaluate button is clicked.
     *
     */
    public void evaluate() {
        Expression expr = new Expression(mInputText.getText());
        Double result = expr.evaluate();
        mResultLabel.setText(result.toString());
    }

    /**
     * messageBox() is called to show a message frame.
     *
     */
    public void messageBox(String pMessage) {
        JOptionPane.showMessageDialog(this, pMessage, "Message", JOptionPane.PLAIN_MESSAGE);
    }

}

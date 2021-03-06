package Emersim.Map;

import javax.swing.*;

public class APIErrorDialog extends JFrame {

    public APIErrorDialog() {
        /*
        * Dialog to notify the user when directions cannot be calculated for a
        * particular route.
        */

        init();
        show();
    }

    private void init() {


        JOptionPane.showMessageDialog(this, "A route could not be calculated for this journey," +
                " please choose another travel mode and try again.");

        this.pack();
        this.setVisible(true);

    }
}

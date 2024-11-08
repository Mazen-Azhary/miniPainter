package FrontEnd;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * ColorChooser allows the user to select a color for a specific shape.
 */
public class ColorChooser extends javax.swing.JFrame {
    private static mainWIndow parent;
    private static int ShapeToChangeIndex;
    private static final Color[] colorArray = {
        Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE, Color.BLACK, Color.MAGENTA 
    };
    private static final String[] colorNames = {
        "Red", "Green", "Blue", "Yellow", "Orange", "Black", "Magenta"
    };

    /**
     * Creates new form ColorChooser
     */
    public ColorChooser(mainWIndow parent, int ShapeToChangeIndex) {
        this.setTitle("Color Chooser");
        this.ShapeToChangeIndex = ShapeToChangeIndex;
        this.parent = parent;
        initComponents();
        setLocationRelativeTo(null);
        setupColorChooser();
    }

    private void setupColorChooser() {
        colorChooser.removeAllItems();
        for (String colorName : colorNames) {
            colorChooser.addItem(colorName);
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        colorChooser = new javax.swing.JComboBox<>();
        submitColor = new javax.swing.JButton();
        colorFillButton = new javax.swing.JButton();
    
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    
        jLabel1.setText("Choose Color");
    
        submitColor.setText("Apply Color");
        submitColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitColorActionPerformed(evt);
            }
        });
    
        colorFillButton.setText("Fill Color");
        colorFillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorFillButtonActionPerformed(evt);
            }
        });
    
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(submitColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorFillButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorFillButton)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    
        pack();
    }
    
    private void submitColorActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedIndex = colorChooser.getSelectedIndex();

        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a valid color.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            parent.engine.getShapes()[ShapeToChangeIndex].setColor(colorArray[selectedIndex]);
            parent.repaint();

            JOptionPane.showMessageDialog(this, "Color successfully applied!", "Success", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            parent.repaint();  
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Failed to apply color. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void colorFillButtonActionPerformed(java.awt.event.ActionEvent evt){
    
    
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColorChooser(parent, ShapeToChangeIndex).setVisible(true);  // Example index, update as needed
            }
        });
    }

    // Variables declaration
    private javax.swing.JComboBox<String> colorChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton submitColor;
    private javax.swing.JButton colorFillButton;
    // End of variables declaration
}

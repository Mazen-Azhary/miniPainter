/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import Backend.LineSegment;
import java.awt.Color;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Mazen
 */
public class LineSegmentWindow extends javax.swing.JFrame {

    static mainWIndow parent;

    /**
     * Creates new form LineSegmentWindow
     */
    public LineSegmentWindow(mainWIndow parent) {
        this.parent = parent;
        this.setTitle("Line Segment window");
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SubmitLineSegment = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        x1Text = new javax.swing.JTextField();
        x2Field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        y1Field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        StrokeText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        y2Field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SubmitLineSegment.setText("Draw");
        SubmitLineSegment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitLineSegmentActionPerformed(evt);
            }
        });

        jLabel1.setText("Specify Starting Point  x");

        jLabel2.setText("Specify Ending Point x");

        jLabel3.setText("Specify Starting Point  y");

        jLabel4.setText("specify stroke , not required");

        jLabel5.setText("Specify Ending Point y");

        y2Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y2FieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SubmitLineSegment, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(y1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(x2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(x1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(y2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StrokeText, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(x1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(y1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(x2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(y2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(StrokeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubmitLineSegment)
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitLineSegmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitLineSegmentActionPerformed
        String x1 = x1Text.getText().trim().replace("\n", "");
        String x2 = x2Field.getText().trim().replace("\n", "");
        String y1 = y1Field.getText().trim().replace("\n", "");
        String y2 = y2Field.getText().trim().replace("\n", "");

        if (!x1.isEmpty() && !x2.isEmpty() && !y1.isEmpty() && !y2.isEmpty()) {
            try {
                int x1Value = Integer.parseInt(x1);
                int y1Value = Integer.parseInt(y1);
                int x2Value = Integer.parseInt(x2);
                int y2Value = Integer.parseInt(y2);
                float stroke;
                if (StrokeText.getText().isEmpty()) {
                    stroke = 2; // default stroke value if not specefied
                } else {
                    try {
                        stroke = Math.abs(Float.parseFloat(StrokeText.getText().trim()));
                    } catch (NumberFormatException e) {
                        stroke = 2;
                    }
                }

                Map<String, Double> properties = new HashMap<>();

                double length = Math.sqrt(Math.pow(x2Value - x1Value, 2) + Math.pow(y2Value - y1Value, 2));
                double angle = Math.toDegrees(Math.atan2(y2Value - y1Value, x2Value - x1Value)); // tan inverse opposite 3ala adjacent
                double slope;
                if ((x2Value - x1Value) != 0) {
                    slope = (double) (y2Value - y1Value) / (x2Value - x1Value);
                } else {
                    slope = Double.POSITIVE_INFINITY;
                }

                LineSegment line = new LineSegment(new Point(x1Value, y1Value), new Point(x2Value, y2Value), properties, Color.BLACK, stroke);
                
                
                line.getProperties().put("startingX", x1 * 1.0);
                shapeToEdit.getProperties().put("startingY", y1 * 1.0);
                shapeToEdit.getProperties().put("endingX", x2 * 1.0);
                shapeToEdit.getProperties().put("endingY", y2 * 1.0);
                try {
                    shapeToEdit.getProperties().put("slope", (y2 - y1) / (x2 - x1) * 1.0);
                } catch (ArithmeticException e) {
                    shapeToEdit.getProperties().put("slope", Double.MAX_VALUE);
                }
                
                
                properties.put("ength", length);
                properties.put("Angle", angle);
                properties.put("Slope", slope);

                parent.engine.addShape(line);
                parent.repaint();
                // line.draw((Graphics) parent.getDrawingArea());
                
                parent.bindShapesToComboBox();
                this.setVisible(false);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Coordinates must be valid numbers", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "A line must have enough details to be drawn", "Insufficient data", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_SubmitLineSegmentActionPerformed

    private void y2FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y2FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y2FieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LineSegmentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LineSegmentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LineSegmentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LineSegmentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LineSegmentWindow(parent).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField StrokeText;
    private javax.swing.JButton SubmitLineSegment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField x1Text;
    private javax.swing.JTextField x2Field;
    private javax.swing.JTextField y1Field;
    private javax.swing.JTextField y2Field;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import Backend.*;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Mazen
 */
public class mainWIndow extends javax.swing.JFrame {

    DrawerClass engine;

    /**
     * Creates new form mainWIndow
     */
    public mainWIndow() {
        engine = new DrawerClass();
        initComponents();
        this.setTitle("Vector Drawing Application");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        SwingUtilities.invokeLater(() -> {
            updateBoundaryLabels();
        });
        
        engine.loadObjects();
        bindShapesToComboBox();
       
    }

    private void updateBoundaryLabels() {
    int Width = this.drawingArea.getWidth();
    int Height = this.drawingArea.getHeight();
    String boundaryText1 = "Welcome to برنامج الرسام \n";
    this.welcomeLabel2.setText("The allowed drawing boundaries are from");
    this.welcomeLabel1.setText(boundaryText1);
    this.welcomeLabel.setText("(0,0) (top left) to (" + (Width - 1) + "," + (Height - 1) + ")");
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ShapeChooserComboBox = new javax.swing.JComboBox<>();
        colorizeButton = new javax.swing.JButton();
        shapeDeleterButton = new javax.swing.JButton();
        welcomeLabel = new javax.swing.JLabel();
        welcomeLabel1 = new javax.swing.JLabel();
        welcomeLabel2 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        resizeButton = new javax.swing.JButton();
        moveButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        drawCircle = new javax.swing.JButton();
        drawLineSegment = new javax.swing.JButton();
        drawSquare = new javax.swing.JButton();
        drawRect = new javax.swing.JButton();
        drawingArea = new javax.swing.JPanel(){protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            engine.refresh(g);
        }};

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Select Shape");

        ShapeChooserComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose a shape" }));
        ShapeChooserComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShapeChooserComboBoxActionPerformed(evt);
            }
        });

        colorizeButton.setText("Colorize");
        colorizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorizeButtonActionPerformed(evt);
            }
        });

        shapeDeleterButton.setText("Delete");
        shapeDeleterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapeDeleterButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        loadButton.setText("Load");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        resizeButton.setText("Resize");
        resizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizeButtonActionPerformed(evt);
            }
        });

        moveButton.setText("Move");
        moveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcomeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(resizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ShapeChooserComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(colorizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(shapeDeleterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(welcomeLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(welcomeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadButton)
                    .addComponent(saveButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShapeChooserComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorizeButton)
                    .addComponent(shapeDeleterButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resizeButton)
                    .addComponent(moveButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        drawCircle.setText("Circle");
        drawCircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawCircleActionPerformed(evt);
            }
        });

        drawLineSegment.setText("Line Segment");
        drawLineSegment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawLineSegmentActionPerformed(evt);
            }
        });

        drawSquare.setText("Square");
        drawSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawSquareActionPerformed(evt);
            }
        });

        drawRect.setText("Rectangle");
        drawRect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawRectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(drawCircle, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(drawLineSegment)
                .addGap(18, 18, 18)
                .addComponent(drawSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(drawRect, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drawCircle)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(drawLineSegment)
                        .addComponent(drawSquare)
                        .addComponent(drawRect))))
        );

        drawingArea.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout drawingAreaLayout = new javax.swing.GroupLayout(drawingArea);
        drawingArea.setLayout(drawingAreaLayout);
        drawingAreaLayout.setHorizontalGroup(
            drawingAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 856, Short.MAX_VALUE)
        );
        drawingAreaLayout.setVerticalGroup(
            drawingAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drawingArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(drawingArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        drawingArea.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void drawRectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawRectActionPerformed
        RectangleWindow w = new RectangleWindow(this);
        w.setVisible(true);
        
    }//GEN-LAST:event_drawRectActionPerformed

    private void drawSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawSquareActionPerformed
        SquareWindow w = new SquareWindow(this);
        w.setVisible(true);
    }//GEN-LAST:event_drawSquareActionPerformed

    public JPanel getDrawingArea() {
        return drawingArea;
    }

    private void drawLineSegmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawLineSegmentActionPerformed
        LineSegmentWindow l = new LineSegmentWindow(this);
        l.setVisible(true);
    }//GEN-LAST:event_drawLineSegmentActionPerformed

    private void drawCircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawCircleActionPerformed
        CircleWindow c = new CircleWindow(this);
        c.setVisible(true);
    }//GEN-LAST:event_drawCircleActionPerformed

    private void moveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveButtonActionPerformed

        if (ShapeChooserComboBox.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(this, "Please select a valid shape", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }


        try {
            //engine.removeShape(engine.getShapes()[shapeIndex]);
            
           // System.out.println(engine.getShapes()[ShapeChooserComboBox.getSelectedIndex()]);
            

            
            MoveShapeWindow w = new MoveShapeWindow(engine.getShapes()[ShapeChooserComboBox.getSelectedIndex()],this);
            w.setVisible(true);
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Failed to move shape. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);

        }
        
        
        
    }//GEN-LAST:event_moveButtonActionPerformed

    private void resizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizeButtonActionPerformed
      
        if(ShapeChooserComboBox.getSelectedIndex()!=-1){
        Shape shape = engine.getShapes()[ShapeChooserComboBox.getSelectedIndex()];
        if(shape instanceof Circle){
            ResizeCircleWindow r = new ResizeCircleWindow(this, shape);
            r.setVisible(true);
        }else if(shape instanceof LineSegment){
            ResizeLineSegmentWindow r = new ResizeLineSegmentWindow(shape,this);
            r.setVisible(true);
        }else if(shape instanceof Rectangle && !(shape instanceof Square)){
            
            ResizeRectangleWindow r = new ResizeRectangleWindow(this, shape);
            r.setVisible(true);
            
        }else if((shape instanceof Square)){
            ResizeSquareWindow w = new ResizeSquareWindow(this, shape);
            w.setVisible(true);
            
        }
        }else{
            JOptionPane.showMessageDialog(this, "Failed to resize shape. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        
        }

    }//GEN-LAST:event_resizeButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        engine.loadObjects();
        repaint();
    }//GEN-LAST:event_loadButtonActionPerformed

    private void shapeDeleterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapeDeleterButtonActionPerformed
        int selectedIndex = ShapeChooserComboBox.getSelectedIndex()+1;

        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a valid shape to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int shapeIndex = selectedIndex - 1;

        try {
            engine.removeShape(engine.getShapes()[shapeIndex]);
            bindShapesToComboBox();
            JOptionPane.showMessageDialog(this, "Shape successfully deleted.", "Success", JOptionPane.INFORMATION_MESSAGE);
            repaint();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Failed to delete shape. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_shapeDeleterButtonActionPerformed

    private void colorizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorizeButtonActionPerformed
      if(ShapeChooserComboBox.getSelectedIndex()!=-1){
        ColorChooser c = new ColorChooser(this, engine.getShapes()[ShapeChooserComboBox.getSelectedIndex()]);
        c.setVisible(true);
      }else{
            JOptionPane.showMessageDialog(this, "Failed to colorize shape. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
      
      }
    }//GEN-LAST:event_colorizeButtonActionPerformed

    private void ShapeChooserComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShapeChooserComboBoxActionPerformed

        if (ShapeChooserComboBox.getSelectedIndex() == 0) {
            ShapeChooserComboBox.removeItem("Select an option...");
        }
    }//GEN-LAST:event_ShapeChooserComboBoxActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        engine.saveObjects();
        repaint();
    }//GEN-LAST:event_saveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(mainWIndow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWIndow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWIndow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWIndow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainWIndow().setVisible(true);

            }
        });
    }

    public void bindShapesToComboBox() {
    Shape[] shapesArray = this.engine.getShapes();  
    
    ShapeChooserComboBox.removeAllItems();

    int circleCount = 1;
    int rectangleCount = 1;
    int lineSegmentCount = 1;
    int squareCount = 1;

    for (Shape shape : shapesArray) {
        String shapeName = shape.getClass().getSimpleName();

        
        String displayName = "";
        if (shapeName.equals("Circle")) {
            displayName = "Circle " + circleCount++;
        } else if (shapeName.equals("Rectangle")) {
            displayName = "Rectangle " + rectangleCount++;
        } else if (shapeName.equals("LineSegment")) {
            displayName = "LineSegment " + lineSegmentCount++;
        }else if (shapeName.equals("Square")){
            displayName = "Square " + squareCount++;
        
        }
        ShapeChooserComboBox.addItem(displayName);
    }
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ShapeChooserComboBox;
    private javax.swing.JButton colorizeButton;
    private javax.swing.JButton drawCircle;
    private javax.swing.JButton drawLineSegment;
    private javax.swing.JButton drawRect;
    private javax.swing.JButton drawSquare;
    private javax.swing.JPanel drawingArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loadButton;
    private javax.swing.JButton moveButton;
    private javax.swing.JButton resizeButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton shapeDeleterButton;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JLabel welcomeLabel1;
    private javax.swing.JLabel welcomeLabel2;
    // End of variables declaration//GEN-END:variables
}

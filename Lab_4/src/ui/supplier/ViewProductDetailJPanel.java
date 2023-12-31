/*
 * CreateProductJPanel.java
 *
 */
package ui.supplier;

import model.Product;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Feature;
import model.Supplier;

/**
 *
 * @author Rushabh
 */
public class ViewProductDetailJPanel extends javax.swing.JPanel {

    JPanel workArea;
    Product product;
    Supplier supplier;
    
    /**
     * Creates new form CreateProductJPanel
     */
    public ViewProductDetailJPanel(JPanel workArea, Product product, Supplier supplier) {
        initComponents();
        this.workArea = workArea;
        this.product = product;
        this.supplier = supplier;
        
        txtName.setText(this.product.getName());
        txtId.setText(String.valueOf(this.product.getId()));
        txtPrice.setText(String.valueOf(this.product.getPrice()));
        
        if(product.getLogoImage() != null) imgLogo.setIcon(product.getLogoImage());
        else imgLogo.setText("No Logo");
                
        populateExistingFeaturesTable();
        refreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFeatures = new javax.swing.JTable();
        btnAddFeature = new javax.swing.JButton();
        btnRemoveFeature = new javax.swing.JButton();
        imgLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblExistingFeatures = new javax.swing.JTable();
        btnAddExistingFeature = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 600));

        lblTitle.setText("View Product Details");

        lblName.setText("Product Name:");

        txtName.setEditable(false);

        lblPrice.setText("Price:");

        txtPrice.setEditable(false);

        btnUpdate.setText("Update Product");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        backButton1.setText("<< Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        txtId.setEditable(false);

        lblId.setText("ID:");

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tblFeatures.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Feature Name", "Value"
            }
        ));
        tblFeatures.setEnabled(false);
        jScrollPane1.setViewportView(tblFeatures);

        btnAddFeature.setText("Add Feature");
        btnAddFeature.setEnabled(false);
        btnAddFeature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFeatureActionPerformed(evt);
            }
        });

        btnRemoveFeature.setText("Remove Feature");
        btnRemoveFeature.setEnabled(false);
        btnRemoveFeature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFeatureActionPerformed(evt);
            }
        });

        imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add existing feature"));

        tblExistingFeatures.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Feature Name", "Value", "Product Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblExistingFeatures);
        if (tblExistingFeatures.getColumnModel().getColumnCount() > 0) {
            tblExistingFeatures.getColumnModel().getColumn(0).setResizable(false);
            tblExistingFeatures.getColumnModel().getColumn(1).setResizable(false);
            tblExistingFeatures.getColumnModel().getColumn(2).setResizable(false);
        }

        btnAddExistingFeature.setText("Add");
        btnAddExistingFeature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddExistingFeatureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAddExistingFeature, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddExistingFeature)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAddFeature)
                            .addGap(18, 18, 18)
                            .addComponent(btnRemoveFeature)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate)
                            .addGap(18, 18, 18)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(23, 23, 23))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(backButton1)
                            .addGap(38, 38, 38)
                            .addComponent(lblTitle)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblName)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblId)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPrice)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 8, 8))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtId, txtName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(backButton1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnAddFeature)
                    .addComponent(btnRemoveFeature))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtId, txtName, txtPrice});

    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtName.setEditable(true);
        txtPrice.setEditable(true);
        btnSave.setEnabled(true);
        tblFeatures.setEnabled(true);
        btnAddFeature.setEnabled(true);
        btnRemoveFeature.setEnabled(true);

}//GEN-LAST:event_btnUpdateActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_backButton1ActionPerformed

    private void backAction() {
        ManageProductCatalogJPanel manageProductCatalogJPanel;
        workArea.remove(this);
        Component[] componentArray = workArea.getComponents();
        // TODO: Change this to the Instance of the Component
        // Component component = componentArray[componentArray.length - 2];
        for(Component c : componentArray){
            if(c instanceof ManageProductCatalogJPanel manageProductCatalogJPanel1){
                manageProductCatalogJPanel = manageProductCatalogJPanel1;
                manageProductCatalogJPanel.refreshTable();
            }
        }
        //ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        product.setPrice(Integer.parseInt(txtPrice.getText()));
        product.setName(txtName.getText());
        saveFeatures();
        
        txtName.setEditable(false);
        txtPrice.setEditable(false);
        btnSave.setEnabled(false);
        tblFeatures.setEnabled(false);
        btnAddFeature.setEnabled(false);
        btnRemoveFeature.setEnabled(false);
        
        JOptionPane.showMessageDialog(this,"Product information saved.","Information", JOptionPane.INFORMATION_MESSAGE);
        refreshTable();
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void saveFeatures() {
        DefaultTableModel model = (DefaultTableModel) tblFeatures.getModel();
        for(int i = 0 ; i< model.getRowCount(); i++){
            Feature currentFeature = product.getFeatures().get(i);
            currentFeature.setName(tblFeatures.getValueAt(i,0).toString());
            currentFeature.setValue(tblFeatures.getValueAt(i,1).toString());
        }
    }

    private void btnAddFeatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFeatureActionPerformed
        // TODO add your handling code here:
        Feature newFeature = product.addFeature();
        newFeature.setName("New Feature");
        newFeature.setValue("Type Value here");
        
        saveFeatures();
        refreshTable();
        

        
       
    }//GEN-LAST:event_btnAddFeatureActionPerformed

    private void btnRemoveFeatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFeatureActionPerformed
        // TODO add your handling code here:
        saveFeatures();
        
        int selectedRow = tblFeatures.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(this,"Please Select Row First.","Warning", JOptionPane.WARNING_MESSAGE);
        }
        product.getFeatures().remove(selectedRow);
        refreshTable();

       
    }//GEN-LAST:event_btnRemoveFeatureActionPerformed

    private void btnAddExistingFeatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddExistingFeatureActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblExistingFeatures.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(this,"Please Select Row First.","Warning", JOptionPane.WARNING_MESSAGE);
        }
        Feature selectedFeature = (Feature) tblExistingFeatures.getValueAt(selectedRow, 0);
        Feature newFeature = product.addFeature();
        newFeature.setName(selectedFeature.getName());
        newFeature.setValue(selectedFeature.getValue());
        
        saveFeatures();
        refreshTable();
    }//GEN-LAST:event_btnAddExistingFeatureActionPerformed

    public void refreshTable() {

        DefaultTableModel model = (DefaultTableModel) tblFeatures.getModel();
        model.setRowCount(0);
        
        for(Feature f : product.getFeatures()){
            Object row[] = new Object[2];
            row[0] = f;
            row[1] = f.getValue() == null? "Empty" : f.getValue().toString();
            model.addRow(row);
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JButton btnAddExistingFeature;
    private javax.swing.JButton btnAddFeature;
    private javax.swing.JButton btnRemoveFeature;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblExistingFeatures;
    private javax.swing.JTable tblFeatures;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

    private void populateExistingFeaturesTable() {
        DefaultTableModel model = (DefaultTableModel)tblExistingFeatures.getModel();
        model.setRowCount(0);
        
        for(Product p : supplier.getProductCatalog().getProductCatalog()) {
            for(Feature f : p.getFeatures()){
                Object row[] = new Object[3];
                row[0] = f;
                row[1] = f.getValue();
                row[2] = p;
                
                model.addRow(row);
            }
        }
    }
}

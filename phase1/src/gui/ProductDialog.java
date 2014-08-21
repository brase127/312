/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.DAOException;
import dao.ProductDAO;
import domain.Product;
import gui.helpers.SimpleListModel;
import gui.helpers.ValidationHelper;
import java.awt.Window;
import javax.swing.JOptionPane;

/**
 *
 * @author Kendall Lauren Chin
 */
public class ProductDialog extends javax.swing.JDialog {

    ProductDAO dao;
    ValidationHelper validHelp = new ValidationHelper();
    Product product = new Product();

    public ProductDialog(Window parent, boolean modal, ProductDAO aDao) {
        super(parent);
        setModal(modal);
        dao = aDao;
        initComponents();
        cmbCategory.setEditable(true);
        cmbCategory.setModel(new SimpleListModel(dao.getCategories()));
        validHelp.addTypeFormatter(txtId, "#0", Integer.class);
        validHelp.addTypeFormatter(txtPrice, "#.00", Double.class);
        validHelp.addTypeFormatter(txtQuantity, "#0", Integer.class);

    }

    public ProductDialog(Window parent, boolean modal, Product productToEdit, ProductDAO aDao) {

        this(parent, modal, aDao);
        this.product = productToEdit;
        txtId.setValue(productToEdit.getId());
        txtName.setText(productToEdit.getName());
        txtDescription.setText(productToEdit.getDescription());
        cmbCategory.setSelectedItem(productToEdit.getCategory());
        txtPrice.setValue(productToEdit.getPrice());
        txtQuantity.setValue(productToEdit.getQuantity());
        txtId.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextField();
        lblCategory = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox();
        lblPrice = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        txtId = new javax.swing.JFormattedTextField();
        txtPrice = new javax.swing.JFormattedTextField();
        txtQuantity = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("productDialog"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(67, 38, 127));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Product Editor");

        btnSave.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setContentAreaFilled(false);
        btnSave.setName("btnSave"); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.setContentAreaFilled(false);
        btnCancel.setName("btnCancel"); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblId.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblId.setText("ID:");
        lblId.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name:");
        lblName.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtName.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txtName.setForeground(new java.awt.Color(67, 38, 127));
        txtName.setName("txtName"); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblDescription.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription.setText("Description:");
        lblDescription.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtDescription.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(67, 38, 127));
        txtDescription.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDescription.setName("txtDescription"); // NOI18N
        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescription);

        lblCategory.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(255, 255, 255));
        lblCategory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategory.setText("Category:");
        lblCategory.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        cmbCategory.setEditable(true);
        cmbCategory.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        cmbCategory.setForeground(new java.awt.Color(67, 38, 127));
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCategory.setName("cmbCategory"); // NOI18N

        lblPrice.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrice.setText("Price:");
        lblPrice.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblQuantity.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuantity.setText("Quantity:");
        lblQuantity.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtId.setForeground(new java.awt.Color(67, 38, 127));
        txtId.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txtId.setName("txtId"); // NOI18N

        txtPrice.setForeground(new java.awt.Color(67, 38, 127));
        txtPrice.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txtPrice.setName("txtPrice"); // NOI18N

        txtQuantity.setForeground(new java.awt.Color(67, 38, 127));
        txtQuantity.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txtQuantity.setName("txtQuantity"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDescription)
                            .addComponent(lblCategory)
                            .addComponent(lblPrice)
                            .addComponent(lblQuantity)
                            .addComponent(lblName)
                            .addComponent(lblId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName)
                            .addComponent(cmbCategory, 0, 360, Short.MAX_VALUE)
                            .addComponent(txtId)
                            .addComponent(txtPrice)
                            .addComponent(txtQuantity)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategory))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuantity)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDescription)
                        .addGap(104, 104, 104)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            if (txtId.isEditable()) {
                if (dao.getById((Integer) txtId.getValue()) == null) {
                    product.setId((Integer) txtId.getValue());
                    product.setName(txtName.getText());
                    product.setDescription(txtDescription.getText());
                    product.setCategory((String) cmbCategory.getSelectedItem());
                    product.setPrice((Double) txtPrice.getValue());
                    product.setQuantity((Integer) txtQuantity.getValue());
                } else {
                    JOptionPane.showMessageDialog(this, "This ID already exists.");
                }
            } else {
                product.setName(txtName.getText());
                product.setDescription(txtDescription.getText());
                product.setCategory((String) cmbCategory.getSelectedItem());
                product.setPrice(Double.parseDouble(txtPrice.getText()));
                product.setQuantity(Integer.parseInt(txtQuantity.getText()));
            }
            if (validHelp.isObjectValid(product)) {
                dao.save(product);
                System.out.println(product);
                this.dispose();
            }
        } catch (DAOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(),"Storage problem.", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbCategory;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JFormattedTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JFormattedTextField txtPrice;
    private javax.swing.JFormattedTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}

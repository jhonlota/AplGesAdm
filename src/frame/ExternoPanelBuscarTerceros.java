/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ExternoPanelFktercero.java
 *
 * Created on 16/02/2012, 09:45:23 PM
 */
package frame;

import clases.ClaseGeneral;
import entidades.Terceros;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Jhon Lopez
 */
public class ExternoPanelBuscarTerceros extends javax.swing.JPanel {

    public List listaTercero = new ArrayList();
    public String tercero = "";
    public int posicion;
    private PanelTerceros panelTerceros = new PanelTerceros();

    /**
     * Creates new form ExternoPanelFktercero
     */
    public ExternoPanelBuscarTerceros(PanelTerceros panelTerceros) {
        initComponents();
        this.panelTerceros = panelTerceros;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        parametro = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        texto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        scrollLista = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();

        setMaximumSize(new java.awt.Dimension(550, 300));
        setMinimumSize(new java.awt.Dimension(550, 300));
        setPreferredSize(new java.awt.Dimension(550, 300));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setBackground(ClaseGeneral.titulo);
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Criterios de Búsqueda");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(540, 25));
        add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(540, 10));
        add(jLabel2);

        jLabel3.setText("CRITERIO : ");
        jLabel3.setPreferredSize(new java.awt.Dimension(90, 25));
        add(jLabel3);

        parametro.setBackground(ClaseGeneral.campo);
        parametro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        parametro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IDENTIFICACION [id]", "NOMBRE COMPLETO [nombre]", "DEPENDENCIA [dependencia]" }));
        parametro.setSelectedItem("COORDINACIÓN DE ÁREA ADMINISTRATIVA");
        parametro.setPreferredSize(new java.awt.Dimension(445, 25));
        add(parametro);

        jLabel4.setText("TEXTO : ");
        jLabel4.setPreferredSize(new java.awt.Dimension(65, 25));
        add(jLabel4);

        texto.setBackground(ClaseGeneral.campo);
        texto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        texto.setMargin(new java.awt.Insets(2, 4, 2, 4));
        texto.setPreferredSize(new java.awt.Dimension(470, 25));
        texto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TexyFieldTerceroKeyReleased(evt);
            }
        });
        add(texto);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setPreferredSize(new java.awt.Dimension(540, 10));
        add(jLabel5);

        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 20));
        jSeparator1.setPreferredSize(new java.awt.Dimension(540, 10));
        add(jSeparator1);

        scrollLista.setMaximumSize(new java.awt.Dimension(540, 150));
        scrollLista.setMinimumSize(new java.awt.Dimension(540, 150));
        scrollLista.setPreferredSize(new java.awt.Dimension(540, 150));

        lista.setSelectionBackground(ClaseGeneral.campo);
        lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaValueChanged(evt);
            }
        });
        scrollLista.setViewportView(lista);

        add(scrollLista);
    }// </editor-fold>//GEN-END:initComponents

    private void TexyFieldTerceroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TexyFieldTerceroKeyReleased
        javax.swing.JTextField componente = (javax.swing.JTextField) evt.getComponent();
        String text = componente.getText();
        componente.setText(text.toUpperCase());

        ClaseGeneral.parametro = parametro.getSelectedItem().toString().substring(parametro.getSelectedItem().toString().indexOf("[") + 1, parametro.getSelectedItem().toString().indexOf("]"));
        ClaseGeneral.valor = componente.getText();
        listaTercero = ClaseGeneral.controlTerceros.findAllInTercerosBy();

        DefaultListModel modeloLista = new DefaultListModel();
        for (int i = 0; i < listaTercero.size(); i++) {
            ClaseGeneral.terceros = (Terceros) listaTercero.get(i);
            modeloLista.addElement(ClaseGeneral.terceros.getId()+ " - " + ClaseGeneral.terceros.getNombre());
        }

        lista.setModel(modeloLista);
}//GEN-LAST:event_TexyFieldTerceroKeyReleased

    private void listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        JList laLista = (JList) evt.getSource();
        if (laLista.isSelectionEmpty()) {
            tercero = "";
            posicion = -1;
            return;
        } else {
            tercero = "" + laLista.getSelectedValue();
            posicion = laLista.getSelectedIndex();
            ClaseGeneral.terceros = (Terceros) listaTercero.get(posicion);
            panelTerceros.metodoConsultar();
        }
}//GEN-LAST:event_listaValueChanged
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList lista;
    private javax.swing.JComboBox parametro;
    private javax.swing.JScrollPane scrollLista;
    private javax.swing.JTextField texto;
    // End of variables declaration//GEN-END:variables
}

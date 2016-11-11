/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * IFrameContrato.java
 *
 * Created on 4/01/2012, 09:52:57 AM
 */
package frame;

import clases.ClaseBaseDatos;
import clases.ClaseGeneral;
import clases.ClaseInformacion;
import clases.ClaseMensaje;
import entidades.Soportescomprobantes;
import java.awt.Rectangle;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhon Lopez
 */
public class IFrameSoportescomprobantes extends javax.swing.JInternalFrame {

    private List lista = new ArrayList();
    private int posicion;
    private PanelSoportescomprobantes panelPrincipal = new PanelSoportescomprobantes();
    private ClaseBaseDatos datos = new ClaseBaseDatos();

    /**
     * Creates new form IFrameContrato
     */
    public IFrameSoportescomprobantes() {
        initComponents();
        //datos.conectar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar = new javax.swing.JToolBar();
        botonNuevo = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        botonConsultar = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        botonActualizar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        botonReiniciar = new javax.swing.JButton();
        jToolBarConsultar = new javax.swing.JToolBar();
        botonBuscar = new javax.swing.JButton();
        textoPosicionBuscar = new javax.swing.JTextField();
        botonAnterior = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        jPanel = new javax.swing.JPanel();

        setTitle("Soportes");
        setName(""); // NOI18N

        jToolBar.setFloatable(false);

        botonNuevo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos48/new_page.png"))); // NOI18N
        botonNuevo.setText("Nuevo");
        botonNuevo.setFocusable(false);
        botonNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonNuevo.setIconTextGap(1);
        botonNuevo.setMargin(new java.awt.Insets(2, 2, 2, 2));
        botonNuevo.setMaximumSize(new java.awt.Dimension(75, 65));
        botonNuevo.setMinimumSize(new java.awt.Dimension(75, 65));
        botonNuevo.setPreferredSize(new java.awt.Dimension(75, 65));
        botonNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });
        jToolBar.add(botonNuevo);

        botonGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos48/save.png"))); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.setFocusable(false);
        botonGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonGuardar.setIconTextGap(1);
        botonGuardar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        botonGuardar.setMaximumSize(new java.awt.Dimension(75, 65));
        botonGuardar.setMinimumSize(new java.awt.Dimension(75, 65));
        botonGuardar.setPreferredSize(new java.awt.Dimension(75, 65));
        botonGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        jToolBar.add(botonGuardar);
        jToolBar.add(jSeparator5);

        botonConsultar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos48/search.png"))); // NOI18N
        botonConsultar.setText("Consultar");
        botonConsultar.setFocusable(false);
        botonConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonConsultar.setIconTextGap(1);
        botonConsultar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        botonConsultar.setMaximumSize(new java.awt.Dimension(75, 65));
        botonConsultar.setMinimumSize(new java.awt.Dimension(75, 65));
        botonConsultar.setPreferredSize(new java.awt.Dimension(75, 65));
        botonConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });
        jToolBar.add(botonConsultar);
        jToolBar.add(jSeparator6);

        botonActualizar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos48/save_edit.png"))); // NOI18N
        botonActualizar.setText("Actualizar");
        botonActualizar.setFocusable(false);
        botonActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonActualizar.setIconTextGap(1);
        botonActualizar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        botonActualizar.setMaximumSize(new java.awt.Dimension(75, 65));
        botonActualizar.setMinimumSize(new java.awt.Dimension(75, 65));
        botonActualizar.setPreferredSize(new java.awt.Dimension(75, 65));
        botonActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });
        jToolBar.add(botonActualizar);

        botonEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos48/delete.png"))); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.setFocusable(false);
        botonEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonEliminar.setIconTextGap(1);
        botonEliminar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        botonEliminar.setMaximumSize(new java.awt.Dimension(75, 65));
        botonEliminar.setMinimumSize(new java.awt.Dimension(75, 65));
        botonEliminar.setPreferredSize(new java.awt.Dimension(75, 65));
        botonEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jToolBar.add(botonEliminar);
        jToolBar.add(jSeparator7);

        botonReiniciar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos48/refresh.png"))); // NOI18N
        botonReiniciar.setText("Reiniciar");
        botonReiniciar.setFocusable(false);
        botonReiniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonReiniciar.setIconTextGap(1);
        botonReiniciar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        botonReiniciar.setMaximumSize(new java.awt.Dimension(75, 65));
        botonReiniciar.setMinimumSize(new java.awt.Dimension(75, 65));
        botonReiniciar.setPreferredSize(new java.awt.Dimension(75, 65));
        botonReiniciar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReiniciarActionPerformed(evt);
            }
        });
        jToolBar.add(botonReiniciar);

        getContentPane().add(jToolBar, java.awt.BorderLayout.NORTH);

        jToolBarConsultar.setFloatable(false);

        botonBuscar.setBackground(ClaseGeneral.boton);
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos24/search.png"))); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.setEnabled(false);
        botonBuscar.setFocusable(false);
        botonBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonBuscar.setMaximumSize(new java.awt.Dimension(100, 25));
        botonBuscar.setMinimumSize(new java.awt.Dimension(100, 25));
        botonBuscar.setPreferredSize(new java.awt.Dimension(100, 25));
        jToolBarConsultar.add(botonBuscar);

        textoPosicionBuscar.setFocusable(false);
        textoPosicionBuscar.setMaximumSize(new java.awt.Dimension(150, 25));
        textoPosicionBuscar.setMinimumSize(new java.awt.Dimension(150, 25));
        textoPosicionBuscar.setPreferredSize(new java.awt.Dimension(150, 25));
        jToolBarConsultar.add(textoPosicionBuscar);

        botonAnterior.setBackground(ClaseGeneral.boton);
        botonAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos24/back.png"))); // NOI18N
        botonAnterior.setText("Anterior");
        botonAnterior.setFocusable(false);
        botonAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botonAnterior.setMaximumSize(new java.awt.Dimension(100, 25));
        botonAnterior.setMinimumSize(new java.awt.Dimension(100, 25));
        botonAnterior.setPreferredSize(new java.awt.Dimension(100, 25));
        botonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnteriorActionPerformed(evt);
            }
        });
        jToolBarConsultar.add(botonAnterior);

        botonSiguiente.setBackground(ClaseGeneral.boton);
        botonSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos24/next.png"))); // NOI18N
        botonSiguiente.setText("Siguiente");
        botonSiguiente.setFocusable(false);
        botonSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonSiguiente.setMaximumSize(new java.awt.Dimension(100, 25));
        botonSiguiente.setMinimumSize(new java.awt.Dimension(100, 25));
        botonSiguiente.setPreferredSize(new java.awt.Dimension(100, 25));
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });
        jToolBarConsultar.add(botonSiguiente);

        getContentPane().add(jToolBarConsultar, java.awt.BorderLayout.SOUTH);

        jPanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        metodoLimpiar();

        panelPrincipal = new PanelSoportescomprobantes();
        jPanel.add(panelPrincipal, java.awt.BorderLayout.CENTER);
        jPanel.setVisible(false);
        jPanel.setVisible(true);
        metodoEstado("nuevo");
}//GEN-LAST:event_botonNuevoActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        if (ClaseInformacion.ValidarCUENTA("" + panelPrincipal.cuenta.getText())
                && ClaseInformacion.ValidarACTIVIDAD("" + panelPrincipal.actividad.getText())
                && ClaseInformacion.ValidarSUBGRUPO("" + panelPrincipal.subgrupo.getSelectedItem())
                && ClaseInformacion.ValidarCCOSTOS("" + panelPrincipal.ccostos.getText())
                && ClaseInformacion.ValidarCINFO("" + panelPrincipal.cinfo.getSelectedItem())
                && ClaseInformacion.ValidarCUENTAINTERNA("" + panelPrincipal.cuentainterna.getSelectedItem())
                && (panelPrincipal.cuentainterna.getSelectedItem().equals(ClaseInformacion.ValidarIngresoCUENTAINTERNA("" + panelPrincipal.cinfo.getSelectedItem(),
                                "000",
                                "" + panelPrincipal.actividad.getText(),
                                "" + panelPrincipal.ccostos.getText())))) {
            panelPrincipal.metodoInsertar();
            if (ClaseGeneral.controlSoportescomprobantes.verify(ClaseGeneral.soportescomprobantes)) {
                metodoLimpiar();
                metodoEstado("guardar");
            } else {
                ClaseMensaje.error("Error - Falta completar información.\n\n" + ClaseGeneral.errorValidacion);
            }
        } else {
            ClaseMensaje.error("Error en la imputacion.");
        }
}//GEN-LAST:event_botonGuardarActionPerformed

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        metodoLimpiar();

        panelPrincipal = new PanelSoportescomprobantes();
        jPanel.add(panelPrincipal, java.awt.BorderLayout.CENTER);
        jPanel.setVisible(false);
        jPanel.setVisible(true);
        jToolBarConsultar.setVisible(true);

        lista = ClaseGeneral.controlSoportescomprobantes.findAllInSoportescomprobantesByFkcomprobanteAno(ClaseGeneral.comprobantes.getId(), ClaseGeneral.comprobantes.getAno());

        if (!lista.isEmpty()) {
            posicion = 0;
            ClaseGeneral.soportescomprobantes = (Soportescomprobantes) lista.get(posicion);
            panelPrincipal.metodoConsultar();
        } else {
            posicion = -1;
        }

        textoPosicionBuscar.setText((posicion + 1) + " / " + lista.size());
        panelPrincipal.jTable.changeSelection(posicion, 0, false, false);
        metodoEstado("consultar");
}//GEN-LAST:event_botonConsultarActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        if (ClaseInformacion.ValidarCUENTA("" + panelPrincipal.cuenta.getText())
                && ClaseInformacion.ValidarACTIVIDAD("" + panelPrincipal.actividad.getText())
                && ClaseInformacion.ValidarSUBGRUPO("" + panelPrincipal.subgrupo.getSelectedItem())
                && ClaseInformacion.ValidarCCOSTOS("" + panelPrincipal.ccostos.getText())
                && ClaseInformacion.ValidarCINFO("" + panelPrincipal.cinfo.getSelectedItem())
                && ClaseInformacion.ValidarCUENTAINTERNA("" + panelPrincipal.cuentainterna.getSelectedItem())
                && (panelPrincipal.cuentainterna.getSelectedItem().equals(ClaseInformacion.ValidarIngresoCUENTAINTERNA("" + panelPrincipal.cinfo.getSelectedItem(),
                                "000",
                                "" + panelPrincipal.actividad.getText(),
                                "" + panelPrincipal.ccostos.getText())))) {
            if (!lista.isEmpty()) {
                panelPrincipal.metodoActualizar();
            }
            if (ClaseGeneral.controlSoportescomprobantes.verify(ClaseGeneral.soportescomprobantes)) {
                metodoLimpiar();
                metodoEstado("actualizar");
            } else {
                ClaseMensaje.error("Error - Falta completar información.\n\n" + ClaseGeneral.errorValidacion);
            }
        } else {
            ClaseMensaje.error("Error en la imputacion.");
        }
}//GEN-LAST:event_botonActualizarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int opcion = -1;
        opcion = ClaseMensaje.preguntar();
        if (opcion == JOptionPane.YES_OPTION) {
            if (!lista.isEmpty()) {
                panelPrincipal.metodoEliminar();
            }
            metodoLimpiar();
            metodoEstado("eliminar");
        }
}//GEN-LAST:event_botonEliminarActionPerformed

    private void botonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReiniciarActionPerformed
        metodoLimpiar();
        metodoEstado("reiniciar");
}//GEN-LAST:event_botonReiniciarActionPerformed

    private void botonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnteriorActionPerformed
        try {
            posicion--;
            if (posicion < 0) {
                posicion = lista.size() - 1;
            }
            textoPosicionBuscar.setText((posicion + 1) + " / " + lista.size());
            ClaseGeneral.soportescomprobantes = (Soportescomprobantes) lista.get(posicion);
            panelPrincipal.metodoConsultar();
            Rectangle r = panelPrincipal.jTable.getCellRect(posicion, 0, true);
            panelPrincipal.jScrollPane.getViewport().scrollRectToVisible(r);
            panelPrincipal.jTable.changeSelection(posicion, 0, false, false);
        } catch (Exception e) {
        }
}//GEN-LAST:event_botonAnteriorActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        try {
            posicion++;
            if (posicion == lista.size()) {
                posicion = 0;
            }
            if (lista.isEmpty()) {
                posicion = -1;
            }
            textoPosicionBuscar.setText((posicion + 1) + " / " + lista.size());
            ClaseGeneral.soportescomprobantes = (Soportescomprobantes) lista.get(posicion);
            panelPrincipal.metodoConsultar();
            Rectangle r = panelPrincipal.jTable.getCellRect(posicion, 0, true);
            panelPrincipal.jScrollPane.getViewport().scrollRectToVisible(r);
            panelPrincipal.jTable.changeSelection(posicion, 0, false, false);
        } catch (Exception e) {
        }
}//GEN-LAST:event_botonSiguienteActionPerformed

    public void metodoEstado(String estado) {
        try {
            datos.query("SELECT * FROM ESTADOS " + "WHERE " + "VENTANA = '" + panelPrincipal.getName() + "' AND " + "USUARIO = '" + ClaseGeneral.perfil + "' AND " + "ESTADO = '" + estado + "'");
            while (ClaseBaseDatos.resultado.next()) {
                botonNuevo.setEnabled(Boolean.parseBoolean(ClaseBaseDatos.resultado.getString("NUEVO")));
                botonGuardar.setEnabled(Boolean.parseBoolean(ClaseBaseDatos.resultado.getString("GUARDAR")));
                botonConsultar.setEnabled(Boolean.parseBoolean(ClaseBaseDatos.resultado.getString("CONSULTAR")));
                botonActualizar.setEnabled(Boolean.parseBoolean(ClaseBaseDatos.resultado.getString("ACTUALIZAR")));
                botonEliminar.setEnabled(Boolean.parseBoolean(ClaseBaseDatos.resultado.getString("ELIMINAR")));
                botonReiniciar.setEnabled(Boolean.parseBoolean(ClaseBaseDatos.resultado.getString("REINICIAR")));
            }

            if (botonNuevo.isEnabled()) {
                botonNuevo.setBackground(ClaseGeneral.boton);
            } else {
                botonNuevo.setBackground(ClaseGeneral.gris);
            }
            if (botonGuardar.isEnabled()) {
                botonGuardar.setBackground(ClaseGeneral.boton);
            } else {
                botonGuardar.setBackground(ClaseGeneral.gris);
            }
            if (botonConsultar.isEnabled()) {
                botonConsultar.setBackground(ClaseGeneral.boton);
            } else {
                botonConsultar.setBackground(ClaseGeneral.gris);
            }
            if (botonActualizar.isEnabled()) {
                botonActualizar.setBackground(ClaseGeneral.boton);
            } else {
                botonActualizar.setBackground(ClaseGeneral.gris);
            }
            if (botonEliminar.isEnabled()) {
                botonEliminar.setBackground(ClaseGeneral.boton);
            } else {
                botonEliminar.setBackground(ClaseGeneral.gris);
            }
            if (botonReiniciar.isEnabled()) {
                botonReiniciar.setBackground(ClaseGeneral.boton);
            } else {
                botonReiniciar.setBackground(ClaseGeneral.gris);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IFrameSoportescomprobantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void metodoLimpiar() {
        jPanel.removeAll();
        jPanel.setVisible(false);
        jPanel.setVisible(true);
        jToolBarConsultar.setVisible(false);

        textoPosicionBuscar.setText("");
        ClaseInformacion.LimpiarSecundarios();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonAnterior;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonReiniciar;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JPanel jPanel;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar;
    private javax.swing.JToolBar jToolBarConsultar;
    private javax.swing.JTextField textoPosicionBuscar;
    // End of variables declaration//GEN-END:variables
}

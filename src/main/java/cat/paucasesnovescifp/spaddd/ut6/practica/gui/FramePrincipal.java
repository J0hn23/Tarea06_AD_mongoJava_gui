package cat.paucasesnovescifp.spaddd.ut6.practica.gui;

import cat.paucasesnovescifp.spaddd.ut6.practica.POJOs.Actor;
import cat.paucasesnovescifp.spaddd.ut6.practica.POJOs.Categoria;
import cat.paucasesnovescifp.spaddd.ut6.practica.auxiliar.ExcepcionMongo;
import cat.paucasesnovescifp.spaddd.ut6.practica.consultasBD.BaseDatos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.bson.Document;

public class FramePrincipal extends javax.swing.JFrame {

    BaseDatos db = new BaseDatos("mongodb://localhost:27017", "practicaUT6", "sakila");
    Integer actorSeleccionado = null;
    Integer categoriaSeleccionada = null;

    public FramePrincipal() throws ExcepcionMongo {
        initComponents();
        setLocationRelativeTo(null);

        cargarComboActores();
        cargarComboCategorias();

    }

    private void cargarComboActores() throws ExcepcionMongo {

        for (Actor a : db.getActores()) {
            cmbActores.addItem(a);
        }

    }

    private void cargarComboCategorias() throws ExcepcionMongo {

        for (Categoria a : db.getCategorias()) {
            cmbCategorias.addItem(a);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblActores = new javax.swing.JLabel();
        lblCategorias = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnTodosActores = new javax.swing.JButton();
        btnTodasCategorias = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResultado = new javax.swing.JTextArea();
        cmbActores = new javax.swing.JComboBox<>();
        cmbCategorias = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName(""); // NOI18N
        setSize(new java.awt.Dimension(600, 400));

        lblActores.setText("Actores");

        lblCategorias.setText("Categoria");

        lblTitulo.setText("                                        UT6   practica ");

        btnTodosActores.setText("Todos");
        btnTodosActores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActoresActionPerformed(evt);
            }
        });

        btnTodasCategorias.setText("Todas");
        btnTodasCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodasCategoriasActionPerformed(evt);
            }
        });

        txaResultado.setColumns(20);
        txaResultado.setRows(5);
        jScrollPane1.setViewportView(txaResultado);

        cmbActores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbActoresActionPerformed(evt);
            }
        });

        cmbCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(lblCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(lblActores, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbActores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTodosActores))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbCategorias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTodasCategorias))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 69, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblTitulo)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblActores)
                    .addComponent(btnTodosActores)
                    .addComponent(cmbActores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategorias)
                    .addComponent(btnTodasCategorias)
                    .addComponent(cmbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbActoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbActoresActionPerformed

        consultaActores();

    }//GEN-LAST:event_cmbActoresActionPerformed

    private void cmbCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriasActionPerformed

        consultaCategorias();

    }//GEN-LAST:event_cmbCategoriasActionPerformed

    private void btnTodosActoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActoresActionPerformed
        categoriaSeleccionada = null;
        consultaActores();
    }//GEN-LAST:event_btnTodosActoresActionPerformed

    private void btnTodasCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodasCategoriasActionPerformed
        actorSeleccionado = null;
        consultaCategorias();
    }//GEN-LAST:event_btnTodasCategoriasActionPerformed

    private void consultaActores() {

        try {
            Actor actor = new Actor();
            actor = (Actor) cmbActores.getSelectedItem();
            actorSeleccionado = Integer.parseInt(actor.getId());

            System.out.println("Actor: " + actorSeleccionado);
            System.out.println("Categoria: " + categoriaSeleccionada);

            ArrayList<Document> peliculas = db.filtrarPorActorYCategoria(actorSeleccionado, categoriaSeleccionada);

            StringBuilder sb = new StringBuilder();

            for (Document doc : peliculas) {
                sb.append("ID: ").append(doc.getInteger("_id")).append("\n");
                sb.append("Título: ").append(doc.getString("title")).append("\n");
                sb.append("Descripción: ").append(doc.getString("description")).append("\n");
                sb.append("Año de estreno: ").append(doc.getString("releaseYear")).append("\n");
                sb.append("Duración: ").append(doc.getInteger("length")).append(" minutos").append("\n");
                sb.append("--------------------------\n");
            }

            txaResultado.setText(sb.toString());

        } catch (ExcepcionMongo ex) {
            JOptionPane.showInputDialog(this, "Error en la consulta");
        }

    }

    private void consultaCategorias() {

        try {
            Categoria categoria = new Categoria();
            categoria = (Categoria) cmbCategorias.getSelectedItem();
            categoriaSeleccionada = Integer.parseInt(categoria.getId());

            System.out.println("Actor: " + actorSeleccionado);
            System.out.println("Categoria: " + categoriaSeleccionada);

            ArrayList<Document> peliculas = db.filtrarPorActorYCategoria(actorSeleccionado, categoriaSeleccionada);

            StringBuilder sb = new StringBuilder();

            for (Document doc : peliculas) {
                sb.append("ID: ").append(doc.getInteger("_id")).append("\n");
                sb.append("Título: ").append(doc.getString("title")).append("\n");
                sb.append("Descripción: ").append(doc.getString("description")).append("\n");
                sb.append("Año de estreno: ").append(doc.getString("releaseYear")).append("\n");
                sb.append("Duración: ").append(doc.getInteger("length")).append(" minutos").append("\n");
                sb.append("--------------------------\n");
            }

            txaResultado.setText(sb.toString());

        } catch (ExcepcionMongo ex) {
            JOptionPane.showInputDialog(this, "Error en la consulta");
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTodasCategorias;
    private javax.swing.JButton btnTodosActores;
    private javax.swing.JComboBox<Actor> cmbActores;
    private javax.swing.JComboBox<Categoria> cmbCategorias;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblActores;
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txaResultado;
    // End of variables declaration//GEN-END:variables
}

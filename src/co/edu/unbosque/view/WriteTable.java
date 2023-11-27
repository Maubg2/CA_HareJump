package co.edu.unbosque.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class WriteTable extends JPanel{
	
	private JTable table;
	private DefaultTableModel model;
	
	public  WriteTable() {
		setLayout(new GridBagLayout());
	//	setVisible(true);
        model = new DefaultTableModel();
        table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 1.0; // Hace que la tabla se expanda horizontalmente
        constraints.weighty = 1.0; // Hace que la tabla se expanda verticalmente
        constraints.fill = GridBagConstraints.BOTH; // Hace que la tabla se expanda en ambas direcciones
        add(scrollPane, constraints);

    //    add(scrollPane);
        
    }
	
	public void actualizarTabla(Object[][] data, String[] columnNames) {
        model.setDataVector(data, columnNames);
    }

}

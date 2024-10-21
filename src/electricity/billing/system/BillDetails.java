package electricity.billing.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class BillDetails extends JFrame {
    String meter;
    BillDetails(String  meter){
        this.meter = meter;
        setSize(700,650);
        setLocation(400,150);;
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JTable table = new JTable();
        try{
            database c = new database();
            String query = "SELECT * FROM bill WHERE meter_no = '"+meter+"'";
            ResultSet resultSet = c.statement.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch(Exception exc){
            exc.printStackTrace();
        }

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0,0,700,650);
        add(scrollPane);


        setVisible(true);

    }

    public static void main(String[] args) {
        new BillDetails("");
    }
}

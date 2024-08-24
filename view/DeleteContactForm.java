package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

class DeleteContactForm extends JFrame {
    private JLabel lblTitle;
    private JTextField searchTxtField;
    private JButton btnSearch;

    private JLabel lblContactId;
    private JLabel lblName;
    private JLabel lblContactNumber;
    private JLabel lblCompany;
    private JLabel lblSalary;
    private JLabel lblBirthday;

    private JLabel displayLblContactId;
    private JLabel displayLblName;
    private JLabel displayLblContactNumber;
    private JLabel displayLblCompany;
    private JLabel displayLblSalary;
    private JLabel displayLblBirthday;

    private JButton btnDelete;
    private JButton btnCancel;
    private JButton btnBack;

    DeleteContactForm() {
        setSize(400, 450);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel titlePanel = new JPanel(new GridLayout(2, 1));

        lblTitle = new JLabel("DELETE CONTACT");
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        lblTitle.setFont(new Font("SansSerif", Font.BOLD, 30));
        JPanel txtTitlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        txtTitlePanel.setBackground(Color.decode("#99cdfd"));
        txtTitlePanel.setBorder(new EmptyBorder(10, 0, 10, 0));
        txtTitlePanel.add(lblTitle);
        titlePanel.add(txtTitlePanel);

        JPanel searchPanel = new JPanel(new FlowLayout());
        searchPanel.setBorder(new EmptyBorder(10, 0, 10, 0));

        searchTxtField = new JTextField(20);
        searchTxtField.setFont(new Font("SansSerif", Font.PLAIN, 12));
        searchTxtField.setMargin(new Insets(3, 0, 3, 0));
        searchPanel.add(searchTxtField);

        btnSearch = new JButton("Search");
        searchPanel.add(btnSearch);

        titlePanel.add(searchPanel);

        add("North", titlePanel);

        // west panel
        JPanel txtLabelPanel = new JPanel(new GridLayout(6, 1));
        txtLabelPanel.setBorder(new EmptyBorder(0, 50, 0, 0));

        lblContactId = new JLabel("Contact ID");
        lblName = new JLabel("Name");
        lblContactNumber = new JLabel("Contact Number");
        lblCompany = new JLabel("Company");
        lblSalary = new JLabel("Salary");
        lblBirthday = new JLabel("Birthday");

        JLabel[] labels = { lblContactId, lblName, lblContactNumber, lblCompany, lblSalary, lblBirthday };

        for (JLabel label : labels) {
            label.setFont(new Font("SansSerif", Font.BOLD, 15));
            JPanel labelPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            labelPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
            labelPanel.add(label);
            txtLabelPanel.add(labelPanel);
        }
        add("West", txtLabelPanel);

        // buttons
        JPanel buttonPanel = new JPanel(new GridLayout(2, 1));
        buttonPanel.setBorder(new EmptyBorder(20, 0, 20, 10));

        JPanel firstRow = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        // Add Contact Button
        btnDelete = new JButton("DELETE");
        firstRow.add(btnDelete);
        // Cancel Button
        btnCancel = new JButton("Cancel");
        firstRow.add(btnCancel);

        buttonPanel.add(firstRow);

        // Back to Home Page Btn

        JPanel secondRow = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        btnBack = new JButton("Back to Home Page");
        btnBack.setPreferredSize(new Dimension(155, 25));
        secondRow.add(btnBack);
        buttonPanel.add(secondRow);

        add("South", buttonPanel);

        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new HomePage().setVisible(true);
                DeleteContactForm.this.dispose();
            }
        });
    }
}
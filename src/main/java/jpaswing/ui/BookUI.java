package jpaswing.ui;

import javax.swing.*;

import jpaswing.entity.Book;
import jpaswing.repository.*;


public class BookUI extends JFrame {
    private JTextField idField;
    private JTextField nameField;
    private JPanel panel1;
    private Book book;

    public BookUI(){
        setTitle("Book Maintenance");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        initComponents();
    }

    public BookUI(BookRepository bookRepository){
        setTitle("Book Maintenance");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        initComponents();

        this.book = bookRepository.findFirstByOrderByIdAsc();
        updateData();
    }

    private void updateData(){
        idField.setText(Long.toString(this.book.getId()));
        nameField.setText(this.book.getName());

    }

    private void initComponents(){
        panel1 = new JPanel();
        idField = new JTextField(10);
        nameField = new JTextField(10);
        JLabel l;

        this.setLayout(null);
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 500, 650);

        l = new JLabel("ID:");
        l.setBounds(10, 10, 70, 20);
        panel1.add(l);
        idField.setEnabled(false);
        idField.setBounds(10 + 80, 10, 200, 20);
        panel1.add(idField);

        l = new JLabel("Name:");
        l.setBounds(10, 40, 70, 20);
        panel1.add(l);
        nameField.setBounds(10 + 80, 40, 200, 20 );
        panel1.add(nameField);
        this.add(panel1);
    }
}

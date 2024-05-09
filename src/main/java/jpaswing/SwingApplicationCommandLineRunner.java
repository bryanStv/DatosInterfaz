package jpaswing;

import jpaswing.repository.BookRepository;
import jpaswing.ui.BookUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import javax.swing.*;
import java.awt.*;

/**
 * This CommandLineRunner fires off at runtime and boots up our GUI.
 */

@Component
public class SwingApplicationCommandLineRunner implements CommandLineRunner {

    private final BookRepository bookRepository;

    @Autowired
    public SwingApplicationCommandLineRunner(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) {
        //This boots up the GUI.
        //EventQueue.invokeLater(()  ->  JOptionPane.showMessageDialog(null, "FUNCIONA"));
        EventQueue.invokeLater(() -> new BookUI(bookRepository).setVisible(true));
    }
}

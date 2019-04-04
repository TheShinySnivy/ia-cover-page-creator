package main.java.com.cwidden.gui;

import main.java.com.cwidden.IACoverPageCreatorController;

import javax.swing.*;
import java.awt.*;

public class ErrorBoxPanel extends JPanel {
    private JTextArea jTextArea;

    private IACoverPageCreatorController iaCoverPageCreatorController = IACoverPageCreatorController.getInstance();

    public ErrorBoxPanel() {

        this.setPreferredSize(new Dimension(290, 160));

        jTextArea = new JTextArea(8,25);
        jTextArea.setLineWrap(true);

        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        this.add(jScrollPane);
    }

    public void displayError(String error) {
        jTextArea.append(error);
    }
}

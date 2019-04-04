/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.cwidden;

import main.java.com.cwidden.dao.CoverPageCreatorDao;
import main.java.com.cwidden.dao.CoverPageCreatorDaoImpl;
import main.java.com.cwidden.gui.ContentPanel;
import main.java.com.cwidden.gui.ErrorBoxPanel;
import main.java.com.cwidden.models.CoverPageContent;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author widdchr19
 */
public class IACoverPageCreatorController {
    private static final IACoverPageCreatorController INSTANCE = new IACoverPageCreatorController();
    private CoverPageCreatorDao coverPageCreatorDao = CoverPageCreatorDaoImpl.getInstance();

    private ErrorBoxPanel errorBoxPanel;

    public static IACoverPageCreatorController getInstance() {
        return INSTANCE;
    }

    private IACoverPageCreatorController() {
        //coverPageCreatorDao.buildHtmlCoverPage(new CoverPageContent());
    }

    public void buildGui(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e){
            System.out.println("Oops");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("IA Cover Page Creator");
        frame.setLocation(new Point(100, 100));
        ContentPanel contentPanel = new ContentPanel();
        frame.add(contentPanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JFrame errorBoxFrame = new JFrame("Error Box");
        errorBoxPanel = new ErrorBoxPanel();
        errorBoxFrame.getContentPane().add(errorBoxPanel);
        errorBoxFrame.setLocation(new Point(600, 200));
        errorBoxFrame.pack();
        errorBoxFrame.setVisible(true);
    }

    public void createCoverPage(CoverPageContent coverPageContent) {
        displayError(coverPageCreatorDao.buildHtmlCoverPage(coverPageContent));
    }

    public void displayError(String error){
        errorBoxPanel.displayError(error);
    }
}

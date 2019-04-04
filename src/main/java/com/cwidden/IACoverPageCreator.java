package main.java.com.cwidden;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author widdchr19
 */
public class IACoverPageCreator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IACoverPageCreatorController iaCoverPageCreatorController = IACoverPageCreatorController.getInstance();
        iaCoverPageCreatorController.buildGui();
    }
    
}

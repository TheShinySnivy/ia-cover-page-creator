package main.java.com.cwidden.gui;

import main.java.com.cwidden.IACoverPageCreator;
import main.java.com.cwidden.IACoverPageCreatorController;
import main.java.com.cwidden.models.CoverPageContent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContentPanel extends JPanel implements ActionListener {

    private IACoverPageCreatorController iaCoverPageCreatorController = IACoverPageCreatorController.getInstance();

    private JTextField candidateNameField;
    private JTextField schoolNumberField;
    private JTextField solutionTitleField;
    private JTextField candidateSessionNumberField;
    private JTextField loginInformationField;
    private JTextField directionsField;
    private JTextField additionalInformationField;
    private JTextField planningField;
    private JTextField designField;
    private JTextField developmentField;
    private JTextField recordOfTasksField;
    private JTextField functionalityField;
    private JTextField evaluationField;
    private JTextField appendixField;
    private JTextField wordCountField;

    private JButton createFileButton;

    public ContentPanel() {
        super(new BorderLayout());
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        this.setPreferredSize(new Dimension(450, 600));

        JLabel candidateNameLabel = new JLabel("Candidate name: ");
        this.add(candidateNameLabel);

        candidateNameField = new JTextField();
        candidateNameField.setPreferredSize(new Dimension(60, 25));
        this.add(candidateNameField);


        JLabel schoolNumberLabel = new JLabel("School number: ");
        this.add(schoolNumberLabel);

        schoolNumberField = new JTextField("1064");
        schoolNumberField.setPreferredSize(new Dimension(60, 25));
        this.add(schoolNumberField);


        JLabel solutionTitleLabel = new JLabel("Solution title: ");
        this.add(solutionTitleLabel);

        solutionTitleField = new JTextField();
        solutionTitleField.setPreferredSize(new Dimension(60, 25));
        this.add(solutionTitleField);


        JLabel candidateSessionNumberLabel = new JLabel("Candidate session number: ");
        this.add(candidateSessionNumberLabel);

        candidateSessionNumberField = new JTextField();
        candidateSessionNumberField.setPreferredSize(new Dimension(60, 25));
        this.add(candidateSessionNumberField);


        JLabel loginInformationLabel = new JLabel("Login information: ");
        this.add(loginInformationLabel);

        loginInformationField = new JTextField();
        loginInformationField.setPreferredSize(new Dimension(60, 25));
        this.add(loginInformationField);


        JLabel directionsLabel = new JLabel("Directions for running product: ");
        this.add(directionsLabel);

        directionsField = new JTextField("Open the Product\\dist folder to run the jar file (edit as appropriate for your project)");
        directionsField.setPreferredSize(new Dimension(60, 25));
        this.add(directionsField);


        JLabel additionalInformationLabel = new JLabel("Additional information: ");
        this.add(additionalInformationLabel);

        additionalInformationField = new JTextField();
        additionalInformationField.setPreferredSize(new Dimension(60, 25));
        this.add(additionalInformationField);


        JLabel planningLabel = new JLabel("Planning: ");
        this.add(planningLabel);

        planningField = new JTextField("Documentation/Crit_A_Planning.pdf");
        planningField.setPreferredSize(new Dimension(60, 25));
        this.add(planningField);


        JLabel designLabel = new JLabel("Design: ");
        this.add(designLabel);

        designField = new JTextField("Documentation/Crit_B_Design.pdf");
        designField.setPreferredSize(new Dimension(60, 25));
        this.add(designField);


        JLabel recordOfTasksLabel = new JLabel("Record of tasks: ");
        this.add(recordOfTasksLabel);

        recordOfTasksField = new JTextField("Documentation/Crit_B_Record_of_tasks.pdf");
        recordOfTasksField.setPreferredSize(new Dimension(60, 25));
        this.add(recordOfTasksField);


        JLabel developmentLabel = new JLabel("Development: ");
        this.add(developmentLabel);

        developmentField = new JTextField("Documentation/Crit_C_Development.pdf");
        developmentField.setPreferredSize(new Dimension(60, 25));
        this.add(developmentField);


        JLabel functionalityLabel = new JLabel("Functionality: ");
        this.add(functionalityLabel);

        functionalityField = new JTextField("Documentation/Crit_D_Video.mp4");
        functionalityField.setPreferredSize(new Dimension(60, 25));
        this.add(functionalityField);


        JLabel evaluationLabel = new JLabel("Evaluation: ");
        this.add(evaluationLabel);

        evaluationField = new JTextField("Documentation/Crit_E_Evaluation.pdf");
        evaluationField.setPreferredSize(new Dimension(60, 25));
        this.add(evaluationField);


        JLabel appendixLabel = new JLabel("Appendix: ");
        this.add(appendixLabel);

        appendixField = new JTextField("Documentation/Appendix.pdf");
        appendixField.setPreferredSize(new Dimension(60, 25));
        this.add(appendixField);


        JLabel wordCountLabel = new JLabel("Word count: ");
        this.add(wordCountLabel);

        wordCountField = new JTextField();
        wordCountField.setPreferredSize(new Dimension(60, 25));
        this.add(wordCountField);

        createFileButton = new JButton("Create file");
        createFileButton.addActionListener(this);
        this.add(createFileButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(createFileButton)) {
            CoverPageContent coverPageContent = new CoverPageContent();
            coverPageContent.setAdditionalInformation(additionalInformationField.getText());
            coverPageContent.setAppendix(appendixField.getText());
            coverPageContent.setCandidateName(candidateNameField.getText());
            coverPageContent.setCandidateSessionNumber(candidateSessionNumberField.getText());
            coverPageContent.setDesign(designField.getText());
            coverPageContent.setDevelopment(developmentField.getText());
            coverPageContent.setDirections(directionsField.getText());
            coverPageContent.setRecordOfTasks(recordOfTasksField.getText());
            coverPageContent.setEvaluation(evaluationField.getText());
            coverPageContent.setFunctionality(functionalityField.getText());
            coverPageContent.setLoginInformation(loginInformationField.getText());
            coverPageContent.setSchoolNumber(schoolNumberField.getText());
            coverPageContent.setSolutionTitle(solutionTitleField.getText());
            coverPageContent.setPlanning(planningField.getText());
            coverPageContent.setWordCount(wordCountField.getText());

            iaCoverPageCreatorController.createCoverPage(coverPageContent);
        }
    }

}

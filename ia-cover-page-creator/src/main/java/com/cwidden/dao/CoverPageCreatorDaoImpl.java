package main.java.com.cwidden.dao;

import main.java.com.cwidden.models.CoverPageContent;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.Charset;

/**
 *
 */
public class CoverPageCreatorDaoImpl implements CoverPageCreatorDao {

    private static final CoverPageCreatorDao INSTANCE = new CoverPageCreatorDaoImpl();
    private static final String HTML_TEMPLATE_FILE_NAME = "/coverPage.html";
    private static String newHtmlFileName = "newCoverPage.html";

    private CoverPageCreatorDaoImpl() {
    }

    public static CoverPageCreatorDao getInstance() {
        return INSTANCE;
    }

    @Override
    public String buildHtmlCoverPage(CoverPageContent coverPageContent) {
        StringBuilder errorStringBuilder = new StringBuilder();

        //File htmlTemplateFile = new File(getFilePath(HTML_TEMPLATE_FILE_NAME));
        //File htmlTemplateFile = getFile(HTML_TEMPLATE_FILE_NAME);

        Class thisClass = this.getClass();
        ClassLoader classLoader = this.getClass().getClassLoader();


        InputStream htmlTemplateFile = thisClass.getResourceAsStream(HTML_TEMPLATE_FILE_NAME);

        String htmlString = "";
        try {
            //htmlString = FileUtils.readFileToString(htmlTemplateFile, Charset.defaultCharset());
            htmlString = IOUtils.toString(htmlTemplateFile, Charset.defaultCharset());
            System.out.println(htmlString);
        } catch (Exception e) {
            e.printStackTrace();
            errorStringBuilder.append(e.toString() + "\n");
        }
        htmlString = htmlString.replace("$candidateName", coverPageContent.getCandidateName());
        htmlString = htmlString.replace("$schoolNumber", coverPageContent.getSchoolNumber());
        htmlString = htmlString.replace("$solutionTitle", coverPageContent.getSolutionTitle());
        htmlString = htmlString.replace("$candidateSessionNumber", coverPageContent.getCandidateSessionNumber());
        htmlString = htmlString.replace("$loginInformation", coverPageContent.getLoginInformation());
        htmlString = htmlString.replace("$directions", coverPageContent.getDirections());
        htmlString = htmlString.replace("$additionalInformation", coverPageContent.getAdditionalInformation());
        htmlString = htmlString.replace("$planningLink", coverPageContent.getPlanning());
        htmlString = htmlString.replace("$designLink", coverPageContent.getDesign());
        htmlString = htmlString.replace("$recordOfTasksLink", coverPageContent.getRecordOfTasks());
        htmlString = htmlString.replace("$developmentLink", coverPageContent.getDevelopment());
        htmlString = htmlString.replace("$functionalityLink", coverPageContent.getFunctionality());
        htmlString = htmlString.replace("$evaluationLink", coverPageContent.getEvaluation());
        htmlString = htmlString.replace("$appendixLink", coverPageContent.getAppendix());
        htmlString = htmlString.replace("$wordCount", coverPageContent.getWordCount());


        File newHtmlFile = new File(newHtmlFileName);

        //File jarFile = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI());
        try {
            FileUtils.writeStringToFile(newHtmlFile, htmlString, Charset.defaultCharset());
            errorStringBuilder.append("New file written." + "\n");
        } catch (IOException e) {
            e.printStackTrace();
            errorStringBuilder.append(e.toString() + "\n");
        }

        System.out.println("Done");

        return errorStringBuilder.toString();
    }

    private String getFilePath(String fileName){

        String result = "";

        ClassLoader classLoader = getClass().getClassLoader();
        try {
            InputStream inputStream = classLoader.getResourceAsStream(fileName);
            result = IOUtils.toString(inputStream, Charset.defaultCharset());
            System.out.println("Result: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    private File getFile(String fileName){
        ClassLoader classLoader = this.getClass().getClassLoader();
        fileName = classLoader.getResource(fileName).getFile();
        System.out.println(fileName);
        File file = new File(fileName);

        //ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        //String resource = classloader.getResource("fileName").getFile();
        //System.out.println(resource);
        //File file = new File(resource);

        return file;
    }
}

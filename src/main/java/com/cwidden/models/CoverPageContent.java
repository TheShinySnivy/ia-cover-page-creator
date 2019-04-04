package main.java.com.cwidden.models;

public class CoverPageContent {
    private String candidateName;
    private String schoolNumber;
    private String solutionTitle;
    private String candidateSessionNumber;
    private String loginInformation;
    private String directions;
    private String additionalInformation;
    private String label;
    private String planning;
    private String design;
    private String development;
    private String recordOfTasks;
    private String functionality;
    private String evaluation;
    private String appendix;
    private String wordCount;

    public CoverPageContent() {
        this.candidateName = "";
        this.schoolNumber = "";
        this.solutionTitle = "";
        this.candidateSessionNumber = "";
        this.loginInformation = "";
        this.directions = "";
        this.additionalInformation = "";
        //this.label = "";
        this.planning = "";
        this.design = "";
        this.development = "";
        this.recordOfTasks = "";
        this.functionality = "";
        this.evaluation = "";
        this.appendix = "";
        this.wordCount = "";
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public String getSolutionTitle() {
        return solutionTitle;
    }

    public void setSolutionTitle(String solutionTitle) {
        this.solutionTitle = solutionTitle;
    }

    public String getCandidateSessionNumber() {
        return candidateSessionNumber;
    }

    public void setCandidateSessionNumber(String candidateSessionNumber) {
        this.candidateSessionNumber = candidateSessionNumber;
    }

    public String getLoginInformation() {
        return loginInformation;
    }

    public void setLoginInformation(String loginInformation) {
        this.loginInformation = loginInformation;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getPlanning() {
        return planning;
    }

    public void setPlanning(String planning) {
        this.planning = planning;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getRecordOfTasks() {
        return recordOfTasks;
    }

    public void setRecordOfTasks(String recordOfTasks) {
        this.recordOfTasks = recordOfTasks;
    }

    public String getFunctionality() {
        return functionality;
    }

    public void setFunctionality(String functionality) {
        this.functionality = functionality;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public String getAppendix() {
        return appendix;
    }

    public void setAppendix(String appendix) {
        this.appendix = appendix;
    }

    public String getWordCount() {
        return wordCount;
    }

    public void setWordCount(String wordCount) {
        this.wordCount = wordCount;
    }

    public String getDevelopment() {
        return development;
    }

    public void setDevelopment(String development) {
        this.development = development;
    }
}

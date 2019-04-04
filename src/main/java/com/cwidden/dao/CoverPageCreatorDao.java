package main.java.com.cwidden.dao;

import main.java.com.cwidden.models.CoverPageContent;

/**
 * @author Christine Widden
 */
public interface CoverPageCreatorDao {
    String buildHtmlCoverPage(CoverPageContent coverPageContent);
}

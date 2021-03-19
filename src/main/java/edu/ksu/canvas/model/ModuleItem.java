package edu.ksu.canvas.model;

import java.io.Serializable;

public class ModuleItem extends BaseCanvasModel implements Serializable {
    public static final long serialVersionUID = 1L;

    private Long id;
    private Long moduleID;
    private String title;
    private Long position;
    private Long indent;
    private String type;
    private Long contentID;
    private String htmlURL;
    private String url;
    private String pageURL;
    private String externalURL;
    private Boolean newTab;
    private Boolean published;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Long getModuleID() {
        return moduleID;
    }

    public void setModuleID(final Long id) {
        this.moduleID = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public Long getPosition() {
        return position;
    }

    public void setPosition(final Long position) {
        this.position = position;
    }

    public Long getIndent() {
        return indent;
    }

    public void setIndent(Long indent) {
        this.indent = indent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getContentID() {
        return contentID;
    }

    public void setContentID(Long contentID) {
        this.contentID = contentID;
    }

    public String getHtmlURL() {
        return htmlURL;
    }

    public void setHtmlURL(String htmlURL) {
        this.htmlURL = htmlURL;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPageURL() {
        return pageURL;
    }

    public void setPageURL(String pageURL) {
        this.pageURL = pageURL;
    }

    public String getExternalURL() {
        return externalURL;
    }

    public void setExternalURL(String externalURL) {
        this.externalURL = externalURL;
    }

    public Boolean getNewTab() {
        return newTab;
    }

    public void setNewTab(Boolean newTab) {
        this.newTab = newTab;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

}

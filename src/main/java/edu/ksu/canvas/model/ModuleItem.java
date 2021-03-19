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
    private String htmlUrl;
    private String url;
    private String pageUrl;
    private String externalUrl;
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

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
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

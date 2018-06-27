package com.rcnjtech.action;

import com.opensymphony.xwork2.ActionSupport;

public class ShowImageAction extends ActionSupport {
    private String url;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

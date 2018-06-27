package com.rcnjtech.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

import java.util.HashMap;
import java.util.Map;

public class ShowImageAction extends ActionSupport {
    private String url;

    @Override
    public String execute() throws Exception {
        ValueStack stack = ActionContext.getContext().getValueStack();
        Map<String, Object> context = new HashMap<String,Object>();
        context.put("key1",new String("This is key1"));
        context.put("key2",new String("This is key2"));
        stack.push(context);
        return SUCCESS;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

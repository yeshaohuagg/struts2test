package com.rcnjtech.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        String output = "Pre-processing";
        System.out.println(output);

        String result = actionInvocation.invoke();

        output = "Post-processing";
        System.out.println(output);
        return result;
    }
}

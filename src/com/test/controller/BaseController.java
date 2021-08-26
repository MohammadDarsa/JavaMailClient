package com.test.controller;

import com.test.EmailManager;
import com.test.view.ViewFactory;

interface Hello {

}

public abstract class BaseController implements Hello {
    protected EmailManager emailManager;
    protected ViewFactory viewFactory;
    private String fxmlFileName;

    public BaseController(EmailManager emailManager, ViewFactory viewFactory, String fxmlFileName) {
        this.emailManager = emailManager;
        this.viewFactory = viewFactory;
        this.fxmlFileName = fxmlFileName;
    }

    public EmailManager getEmailManager() {
        return emailManager;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }

    public String getFxmlFileName() {
        return fxmlFileName;
    }
}

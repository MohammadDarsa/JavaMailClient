package com.test.model;

import javax.mail.Store;
import java.util.Properties;

public class EmailAccount {

    private String address;
    private String password;
    private Properties properties;
    private Store store;

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Properties getProperties() {
        return properties;
    }

    public Store getStore() {
        return store;
    }

    public EmailAccount(String address, String password) {
        address = address;
        password = password;
        properties = new Properties();
        properties.put("incomingHost", "imap.gmail.com");
        properties.put("mail.store.protocol", "imaps");

        properties.put("mail.transport.protocol", "smtps");
        properties.put("mail.smtps.host", "smtp.gmail.com");
        properties.put("mail.smtps.auth", "true");
        properties.put("outgoingHost", "smtp.gmail.com");
    }
}
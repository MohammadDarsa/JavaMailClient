module JavaMailClient {

    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires java.mail;
    requires activation;

    opens com.test;
    opens com.test.view;
    opens com.test.controller;
    opens com.test.model;
}
package com.test;

import com.test.controller.services.FetchFoldersService;
import com.test.model.EmailAccount;
import com.test.model.EmailTreeItem;
import javafx.scene.control.TreeItem;

public class EmailManager {


    //Folder Handling
    private EmailTreeItem<String> foldersRoot = new EmailTreeItem<>("");

    public TreeItem<String> getFoldersRoot() {
        return foldersRoot;
    }

    public void setFoldersRoot(EmailTreeItem<String> foldersRoot) {
        this.foldersRoot = foldersRoot;
    }

    public void addEmailAccount(EmailAccount emailAccount) {
        EmailTreeItem<String> treeItem = new EmailTreeItem<>(emailAccount.getAddress());
        FetchFoldersService fetchFoldersService = new FetchFoldersService(emailAccount.getStore(), treeItem);
        fetchFoldersService.start();
        foldersRoot.getChildren().add(treeItem);
    }

}

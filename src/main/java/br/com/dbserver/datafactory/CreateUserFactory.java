package br.com.dbserver.datafactory;

import br.com.dbserver.models.CreateUserModel;

public class CreateUserFactory {
    public static CreateUserModel createUser() {
        return CreateUserModel.builder().name("TestNG").job("Dell").build();
    }
}
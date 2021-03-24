package br.com.dbserver.testcases;

import br.com.dbserver.utils.Rest;
import br.com.dbserver.utils.Endpoint;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

public class ListaDosUsuariosTestCase extends Endpoint {
    private Rest rest = new Rest(BASE_URI);

    @Description("Metodo de GET para buscar a lista dos usuario.")
    @Feature("GET Usuario")
    @Test
    public void getListUsers200() {
        rest.get(BASE_PATH_LIST_USERS, HttpStatus.SC_OK)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/ListUsers.json"));
    }

    @Test(
            description = "Metodo de GET para buscar o unico usuario.",
            groups = {"GET"},
            priority = 2
    )
    public void getSingleUser200() {
        rest.get(BASE_PATH_SINGLE_USER, HttpStatus.SC_OK)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/SingleUser.json"));
    }

    @Test(
            description = "Metodo de GET para buscar se usuario nao encontrado.",
            groups = {"GET"},
            priority = 3
    )
    public void getSingleUserNotFound404() {
        rest.get(BASE_PATH_SINGLE_USER_NOT_FOUND, HttpStatus.SC_NOT_FOUND);
    }
}
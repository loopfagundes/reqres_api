package br.com.dbserver.testcases;

import br.com.dbserver.datafactory.CreateUserFactory;
import br.com.dbserver.utils.Endpoint;
import br.com.dbserver.utils.PropertiesData;
import br.com.dbserver.utils.Rest;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

public class CreateUserTestCase extends Endpoint {

    private Rest rest = new Rest(BASE_URI);

    @Test(
            description = "Metodo de POST para criar um usuario.",
            groups = {"POST"},
            priority = 4
    )
    public void postCreateUser() {
        idUser =
                rest.post(BASE_PATH_CREATE_USER, HttpStatus.SC_CREATED, CreateUserFactory.createUser().getClass())
                        .extract().path("id");
        PropertiesData.setPropertiesData("idUser", "ID_USER", idUser);
    }

    // testado...
    @Test
    public void delete() {
        rest.delete("/api/users/" + DELETE_ID_USER, HttpStatus.SC_NO_CONTENT);
    }
}
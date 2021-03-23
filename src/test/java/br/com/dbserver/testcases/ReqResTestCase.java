package br.com.dbserver.testcases;

import br.com.dbserver.support.Rest;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.apache.http.HttpStatus;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ExtentITestListenerClassAdapter.class})
public class ReqResTestCase {

    @Test(
            description = "Metodo de GET para buscar a lista dos usuarios.",
            groups = {"TESTE DE API"}
    )
    public void getListUsers() {
        Rest rest = new Rest("https://reqres.in");
        rest.get("/api/users?page=2", HttpStatus.SC_OK);
    }
}
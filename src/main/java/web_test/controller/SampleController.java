package web_test.controller;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import web_test.beans.UserPreference;
import web_test.service.UserPreferencesService;

@Controller("smapleController")
public class SampleController {

    private UserPreferencesService ups;
    // ~~~~~~~~~~~~~~~~~~~~~~~ public methods ~~~~~~~~~~~~~~~~~~~~~~~~~~

    @RequestMapping(value = "/a", method = RequestMethod.GET)
    @ResponseBody
    public String zzz() {
        return "sssss";
    }

    @RequestMapping(value = "/userPreference/{param}", method = RequestMethod.GET)
    @ResponseBody
    public String getMsg(@PathVariable("param") String msg) {
        StringBuilder sb = new StringBuilder();
        List<UserPreference> u = ups.getAllUserPreferences4User(1);
        u.forEach(up -> {
            System.out.println("     " + up);
            sb.append(up);
            sb.append("\n");
        });

        return "OUTPUT WILL BE:" + sb;
    }

	// ~~~~~~~~~~~~~~~~~~~~~~~ protected methods ~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~ private methods ~~~~~~~~~~~~~~~~~~~~~~~~~
}

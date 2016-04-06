package web_test.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import web_test.beans.UserPreference;
import web_test.service.UserPreferencesService;

@Controller("smapleController")
@RestController
public class SampleController {

    @Autowired
    private UserPreferencesService ups;
    // ~~~~~~~~~~~~~~~~~~~~~~~ public methods ~~~~~~~~~~~~~~~~~~~~~~~~~~

    @RequestMapping(value = "/rest/userPreferences/{userID}", method = RequestMethod.GET, headers = {"Accept=application/json"}, produces = "application/json")
    @ResponseBody
    public List<UserPreference> getUserPreferences4User(@PathVariable("userID") String user_id) {
        StringBuilder sb = new StringBuilder();
        int id = Integer.parseInt(user_id);
        if (id > 0) {
            List<UserPreference> u = ups.getAllUserPreferences4User(id);
            u.forEach(up -> {
                System.out.println("     " + up);
                sb.append(up);
                sb.append("\n");
            });
            return u;
        }
        return null;
    }

    /**
     *
     * @param user_id
     * @return List of History UserPreference json , the filter do not sort base
     */
    @RequestMapping(value = "/rest/historyUserPreferences/{userID}", method = RequestMethod.GET, headers = {"Accept=application/json"}, produces = "application/json")
    @ResponseBody
    public List<UserPreference> getHistoryUserPreferences4User(@PathVariable("userID") String user_id) {
        int id = Integer.parseInt(user_id);
        if (id > 0) {
            StringBuilder sb = new StringBuilder();
            List<UserPreference> u = ups.getHistoryUserPreferences4User(id);
            u.forEach(up -> {
                System.out.println("     " + up);
                sb.append(up);
                sb.append("\n");
            });
            return u;
        }
        return null;
    }

    @RequestMapping(value = "/rest/findUserPreference4User/{userID}/{searchkey}", method = RequestMethod.GET, headers = {"Accept=application/json"}, produces = "application/json")
    @ResponseBody
    public List<UserPreference> findUserPreference4User(@PathVariable("userID") String user_id, @PathVariable("searchkey") String search) {
        int id = Integer.parseInt(user_id);
        if (id > 0) {
            StringBuilder sb = new StringBuilder();
            List<UserPreference> u = ups.FindUserPreference4User(search, id);
            u.forEach(up -> {
                System.out.println("     " + up);
                sb.append(up);
                sb.append("\n");
            });
            return u;
        }
        return null;
    }

    //------------------- add a User Preference------------------------------
    @RequestMapping(value = "/rest/userPreference4User/", method = RequestMethod.POST, headers = {"Accept=application/json"}, produces = "application/json")
    @ResponseBody
    public ResponseEntity<Void> addUserPreference4User(@RequestBody UserPreference userP) {

        return null;
    }

    //------------------- update a User Preference------------------------------
    @RequestMapping(value = "/rest/userPreference4User/{id}", method = RequestMethod.PUT, headers = {"Accept=application/json"}, produces = "application/json")
    @ResponseBody
    public ResponseEntity<Void> updateUserPreference4User(@PathVariable("id") long id, @RequestBody UserPreference userP) {

        return null;
    }

    //------------------- deactive a User Preference----------------------------
    @RequestMapping(value = "/rest/userPreference4User/{id}", method = RequestMethod.DELETE, headers = {"Accept=application/json"}, produces = "application/json")
    @ResponseBody
    public ResponseEntity<Void> deactiveUserPreference4User(@PathVariable("id") int id) {

        return null;
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~ protected methods ~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~ private methods ~~~~~~~~~~~~~~~~~~~~~~~~~
}

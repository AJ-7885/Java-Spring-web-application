
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import web_test.controller.SampleController;
import web_test.service.UserPreferencesService;


/**
 * 
 * @author https://github.com/AJ-7885
 */
public class UserPreferencesDAOTest {
    
     @Autowired
    private UserPreferencesService service;

    @Autowired
    private SampleController rs;


    @org.junit.Test
    @SuppressWarnings({"unchecked", "empty-statement"})
    public final void testCRUD() {
        Response response;

    
    }
}

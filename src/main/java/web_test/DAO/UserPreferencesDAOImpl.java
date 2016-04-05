package web_test.DAO;

import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Repository;

import web_test.beans.UserPreferences;

@Repository
public class UserPreferencesDAOImpl implements UserPreferencesDAO {

    private UserPreferences uPreferences;

    private List<UserPreferences> listOfUserPreferences;

    public UserPreferencesDAOImpl() {
        UserPreferences up1 = new UserPreferences(1, "ScreenSize", "1024X760", 1, new Date(), true);
        UserPreferences up2 = new UserPreferences(2, "Preference 01", "PValue 01", 2, new Date(), true);
        UserPreferences up3 = new UserPreferences(3, "Preference 02", "PValue 02", 1, new Date(), true);
        UserPreferences up3a = new UserPreferences(3, "Preference 02", "PValue 02-a", 1, new Date(), true);
        UserPreferences up3b = new UserPreferences(3, "Preference 02", "PValue 02-b", 1, new Date(), true);
        UserPreferences up3c = new UserPreferences(3, "Preference 02", "PValue 02-c", 1, new Date(), true);
        UserPreferences up4 = new UserPreferences(4, "Preference 03", "PValue 03", 2, new Date(), true);
        UserPreferences up5 = new UserPreferences(5, "Preference 04", "PValue 04", 1, new Date(), false);
        UserPreferences up6 = new UserPreferences(6, "Preference 05", "PValue 05", 1, new Date(), true);
        listOfUserPreferences.add(up1);
        listOfUserPreferences.add(up2);
        listOfUserPreferences.add(up3);
        listOfUserPreferences.add(up3a);
        listOfUserPreferences.add(up3b);
        listOfUserPreferences.add(up3c);
        listOfUserPreferences.add(up4);
        listOfUserPreferences.add(up5);
        listOfUserPreferences.add(up6);
    }

    @Override
    public List<UserPreferences> getHistoryUserPerferences4User(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserPreferences> getAllUserPerferences4User(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserPreferences> getHostoryUserPerferences4User(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addUserPerferences(UserPreferences up, int user_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateUserPerferences(UserPreferences up) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

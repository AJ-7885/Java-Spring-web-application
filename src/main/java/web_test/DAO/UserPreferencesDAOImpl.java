package web_test.DAO;

import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Repository;

import web_test.beans.UserPreference;

@Repository
class UserPreferencesDAOImpl implements UserPreferencesDAO {

    private UserPreference uPreferences;

    private List<UserPreference> listOfUserPreferences;

    public UserPreferencesDAOImpl() {
        UserPreference up1 = new UserPreference(1, "ScreenSize", "1024X760", 1, new Date(), true);
        UserPreference up2 = new UserPreference(2, "Preference 01", "PValue 01", 2, new Date(), true);
        UserPreference up3 = new UserPreference(3, "Preference 02", "PValue 02", 1, new Date(), true);
        UserPreference up3a = new UserPreference(3, "Preference 02", "PValue 02-a", 1, new Date(), true);
        UserPreference up3b = new UserPreference(3, "Preference 02", "PValue 02-b", 1, new Date(), true);
        UserPreference up3c = new UserPreference(3, "Preference 02", "PValue 02-c", 1, new Date(), true);
        UserPreference up4 = new UserPreference(4, "Preference 03", "PValue 03", 2, new Date(), true);
        UserPreference up5 = new UserPreference(5, "Preference 04", "PValue 04", 1, new Date(), false);
        UserPreference up6 = new UserPreference(6, "Preference 05", "PValue 05", 1, new Date(), true);
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
    public List<UserPreference> getHistoryUserPerferences4User(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserPreference> getAllUserPerferences4User(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserPreference> getHostoryUserPerferences4User(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addUserPerferences(UserPreference up, int user_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateUserPerferences(UserPreference up) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

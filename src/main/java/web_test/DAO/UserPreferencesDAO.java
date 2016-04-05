package web_test.DAO;

import java.util.List;

import web_test.beans.UserPreferences;

public interface UserPreferencesDAO {

    public List<UserPreferences> getHistoryUserPerferences4User(int id);

    public List<UserPreferences> getAllUserPerferences4User(int id);

    public List<UserPreferences> getHostoryUserPerferences4User(int id);

    public boolean addUserPerferences(UserPreferences up, int user_id);

    public boolean updateUserPerferences(UserPreferences up);

}

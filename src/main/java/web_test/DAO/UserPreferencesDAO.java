package web_test.DAO;

import java.util.List;

import web_test.beans.UserPreference;

public interface UserPreferencesDAO {

   List<UserPreference> getHistoryUserPerferences4User(int id);

    List<UserPreference> getAllUserPerferences4User(int id);

   List<UserPreference> getHostoryUserPerferences4User(int id);

   boolean addUserPerferences(UserPreference up, int user_id);

    boolean updateUserPerferences(UserPreference up);

}

package web_test.DAO;

import java.util.List;

import web_test.beans.UserPreference;

public interface UserPreferencesDAO {

    List<UserPreference> getHistoryUserPreferences4User(int user_id);

    List<UserPreference> getAllUserPreferences4User(int user_id);

    List<UserPreference> FindUserPreference4User(String userPreferenceKey, int user_id);

    boolean addUserPreference(UserPreference up, int user_id);

    boolean updateUserPreference(UserPreference up);

    public boolean deactivateUserPreference(int up_id);
}

package web_test.service;

import java.util.List;

import web_test.beans.UserPreference;

public interface UserPreferencesService {

    public List<UserPreference> getHistoryUserPerferences4User(int id);

    public List<UserPreference> getAllUserPerferences4User(int id);

    public List<UserPreference> getHostoryUserPerferences4User(int id);

    public boolean addUserPerferences(UserPreference up, int user_id);

    public boolean updateUserPerferences(UserPreference up);
}

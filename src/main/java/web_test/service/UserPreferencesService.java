package web_test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import web_test.beans.UserPreferences;

@Service
public interface UserPreferencesService {

    public List<UserPreferences> getHistoryUserPerferences4User(int id);

    public List<UserPreferences> getAllUserPerferences4User(int id);

    public List<UserPreferences> getHostoryUserPerferences4User(int id);

    public boolean addUserPerferences(UserPreferences up, int user_id);

    public boolean updateUserPerferences(UserPreferences up);
}

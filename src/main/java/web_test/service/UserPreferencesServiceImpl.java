package web_test.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import web_test.DAO.UserPreferencesDAO;
import web_test.beans.UserPreference;

@Service
class UserPreferencesServiceImpl implements UserPreferencesService {

    @Autowired
    private UserPreferencesDAO DAO;

    @Override
    public List<UserPreference> getHistoryUserPreferences4User(int user_id) {
        return DAO.getHistoryUserPreferences4User(user_id);
    }

    @Override
    public List<UserPreference> getAllUserPreferences4User(int user_id) {
        return DAO.getAllUserPreferences4User(user_id);
    }

    @Override
    public List<UserPreference> FindUserPreference4User(String userPreferenceKey, int user_id) {
        return DAO.FindUserPreference4User(userPreferenceKey, user_id);
    }

    @Override
    public boolean addUserPreference(UserPreference up, int user_id) {
        return DAO.addUserPreference(up, user_id);
    }

    @Override
    public boolean updateUserPreference(UserPreference up) {
        return DAO.updateUserPreference(up);
    }

    @Override
    public boolean deactivateUserPreference(long up_id) {
        return DAO.deactivateUserPreference(up_id);
    }

    @Override
    public boolean updateUserPreference(long id, UserPreference up) {
        return DAO.updateUserPreference(id , up);
    }
}

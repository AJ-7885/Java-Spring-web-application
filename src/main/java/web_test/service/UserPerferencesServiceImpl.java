package web_test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import web_test.DAO.UserPreferencesDAO;
import web_test.beans.UserPreferences;

@Service
public class UserPerferencesServiceImpl implements UserPreferencesService {

    private UserPreferencesDAO DAO;

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

package web_test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import web_test.DAO.UserPreferencesDAO;
import web_test.beans.UserPreference;

@Service
class UserPerferencesServiceImpl implements UserPreferencesService {

    private UserPreferencesDAO DAO;

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

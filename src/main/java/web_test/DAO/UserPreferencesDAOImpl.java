package web_test.DAO;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import org.springframework.stereotype.Repository;
import web_test.beans.UserPreference;

@Repository
class UserPreferencesDAOImpl implements UserPreferencesDAO {

    public List<UserPreference> listOfUserPreferences = new ArrayList<UserPreference>();

    public UserPreferencesDAOImpl() {
        Calendar calendar = Calendar.getInstance();
        UserPreference up1 = new UserPreference(1, "ScreenSize", "1024X760", 1, calendar.getTime(), true);
        calendar.add(Calendar.DAY_OF_YEAR, 5);
        UserPreference up2 = new UserPreference(2, "Preference 01", "PValue 01", 2, calendar.getTime(), true);
        calendar.add(Calendar.DAY_OF_YEAR, 11);
        UserPreference up3 = new UserPreference(5, "Preference 02", "PValue 02", 1, calendar.getTime(), true);
        calendar.add(Calendar.DAY_OF_YEAR, 12);
        UserPreference up3a = new UserPreference(8, "Preference 02", "PValue 02-a", 1, calendar.getTime(), true);
        calendar.add(Calendar.DAY_OF_YEAR, 11);
        UserPreference up3b = new UserPreference(10, "Preference 02", "PValue 02-b", 1, calendar.getTime(), true);
        calendar.add(Calendar.DAY_OF_YEAR, 11);
        UserPreference up3c = new UserPreference(12, "Preference 02", "PValue 02-c", 1, calendar.getTime(), true);
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        UserPreference up4 = new UserPreference(4, "Preference 03", "PValue 03", 2, calendar.getTime(), true);
        calendar.add(Calendar.DAY_OF_YEAR, 9);
        UserPreference up5 = new UserPreference(3, "Preference 04", "PValue 04", 1, calendar.getTime(), false);
        calendar.add(Calendar.DAY_OF_YEAR, 2);
        UserPreference up6 = new UserPreference(6, "Preference 05", "PValue 05", 1, calendar.getTime(), true);
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
    public List<UserPreference> getHistoryUserPreferences4User(int user_id) {
        return filterUserPreferences(listOfUserPreferences, user_id, true, null);
    }

    @Override
    public List<UserPreference> getAllUserPreferences4User(int user_id) {
        Map<String, UserPreference> mask = new HashMap();
        filterUserPreferences(listOfUserPreferences, user_id, false, null).forEach(obj -> {
            System.out.println(obj);
            if (mask.get(obj.getKey()) == null) {
                mask.put(obj.getKey(), obj);
            } else if (mask.get(obj.getKey()).getTimeStamp().getTime() < obj.getTimeStamp().getTime()) {
                mask.put(obj.getKey(), obj);
            }
        }
        );
        return new ArrayList<UserPreference>(mask.values());
    }

    @Override

    public List<UserPreference> FindUserPreference4User(String userPreferenceKey, int user_id) {
        return filterUserPreferences(listOfUserPreferences, user_id, false, userPreferenceKey);
    }

    @Override
    public boolean addUserPreference(UserPreference up, int user_id) {
        return true;
    }

    @Override
    public boolean updateUserPreference(UserPreference up) {
        return true;
    }

    @Override
    public boolean deactivateUserPreference(int up_id) {
        Predicate<UserPreference> upById = (up) -> up.getId() == up_id;
        listOfUserPreferences.forEach(up -> {
            if (upById.test(up)) {
                up.setIsActive(false);
            }
        });
        return true;
    }

    private static boolean filterActive(UserPreference u) {
        return u.isIsActive();
    }

    private static List<UserPreference> filterUserPreferences(List<UserPreference> userPre, final int user_ID, final boolean history, final String search) {
        Predicate<UserPreference> userID = (up) -> up.getUserID() == user_ID;
        Predicate<UserPreference> active = (up) -> up.isIsActive() == true;
        Predicate<UserPreference> searchKey = (up) -> (up.getKey().toLowerCase()).contains(search.toLowerCase());
        List<UserPreference> userPreFiltered = new ArrayList<UserPreference>();
        userPre.forEach(up -> {
            if (history) {
                if (userID.test(up)) {
                    userPreFiltered.add(up);
                }
            } else if (search == null) {
                if (userID.test(up) && active.test(up)) {
                    userPreFiltered.add(up);
                }
            } else if (userID.test(up) && active.test(up) && searchKey.test(up)) {
                userPreFiltered.add(up);
            }
        });
        Collections.sort(userPreFiltered, new Comparator<UserPreference>() {
            @Override
            public int compare(UserPreference up2, UserPreference up1) {
                return up1.getTimeStamp().compareTo(up2.getTimeStamp());
            }
        });
        return userPreFiltered;
    }
}

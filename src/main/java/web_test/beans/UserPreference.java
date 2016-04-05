package web_test.beans;

import java.util.Date;

@lombok.Data
public class UserPreference {

    private int id;
    private String key;
    private String value;
    private int UserIDl;
    private Date timeStamp;
    private boolean isActive;

    public UserPreference() {
        super();
    }

    public UserPreference(int id, String key, String value, int userIDl, Date timeStamp, boolean isActive) {
        this();
        this.id = id;
        this.key = key;
        this.value = value;
        UserIDl = userIDl;
        this.timeStamp = timeStamp;
        this.isActive = isActive;
    }

}

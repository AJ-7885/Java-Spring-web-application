package web_test.beans;

import java.util.Date;
import java.util.Objects;

public class UserPreference {

    private int id;
    private String key;
    private String value;
    private int userID;
    private Date timeStamp;
    private boolean isActive;

    public UserPreference() {
        super();
    }

    public UserPreference(int id, String key, String value, int userID, Date timeStamp, boolean isActive) {
        this();
        this.id = id;
        this.key = key;
        this.value = value;
        this.userID = userID;
        this.timeStamp = timeStamp;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.id;
        hash = 83 * hash + Objects.hashCode(this.key);
        hash = 83 * hash + Objects.hashCode(this.value);
        hash = 83 * hash + this.userID;
        hash = 83 * hash + Objects.hashCode(this.timeStamp);
        hash = 83 * hash + (this.isActive ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UserPreference other = (UserPreference) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.key, other.key)) {
            return false;
        }
        if (!Objects.equals(this.value, other.value)) {
            return false;
        }
        if (this.userID != other.userID) {
            return false;
        }
        if (!Objects.equals(this.timeStamp, other.timeStamp)) {
            return false;
        }
        if (this.isActive != other.isActive) {
            return false;
        }
        return true;
    }

}

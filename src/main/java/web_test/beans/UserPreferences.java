package web_test.beans;

import java.util.Date;

public class UserPreferences {

    private int id;
    private String key;
    private String value;
    private int UserIDl;
    private Date timeStamp;
    private boolean isActive;

    public UserPreferences() {
        super();
    }

    public UserPreferences(int id, String key, String value, int userIDl, Date timeStamp, boolean isActive) {
        super();
        this.id = id;
        this.key = key;
        this.value = value;
        UserIDl = userIDl;
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

    public int getUserIDl() {
        return UserIDl;
    }

    public void setUserIDl(int userIDl) {
        UserIDl = userIDl;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + UserIDl;
        result = prime * result + id;
        result = prime * result + (isActive ? 1231 : 1237);
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        result = prime * result + ((timeStamp == null) ? 0 : timeStamp.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        UserPreferences other = (UserPreferences) obj;
        if (UserIDl != other.UserIDl) {
            return false;
        }
        if (id != other.id) {
            return false;
        }
        if (isActive != other.isActive) {
            return false;
        }
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        if (timeStamp == null) {
            if (other.timeStamp != null) {
                return false;
            }
        } else if (!timeStamp.equals(other.timeStamp)) {
            return false;
        }
        if (value == null) {
            if (other.value != null) {
                return false;
            }
        } else if (!value.equals(other.value)) {
            return false;
        }
        return true;
    }
}

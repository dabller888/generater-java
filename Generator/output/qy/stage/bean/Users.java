package qy.stage.bean;

/**
* 文件名：Users.java
* 功能描述：Users类描述
* 作者：iceld
* 创建时间：2018-07-22 20:00:29
* 版本：v1.0
* 版权信息：版权归作者本人所有
*/
public class Users {
    private long id;
    private String userLogin;
    private String userPass;
    private String userNicename;
    private String userEmail;
    private String userUrl;
    private Date userRegistered;
    private String userActivationKey;
    private int userStatus;
    private String displayName;

    public long getId() {
        return id;
    }
	
    public long setId(long id) {
        this.id = id;
    }

    public String getUserLogin() {
        return userLogin;
    }
	
    public String setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPass() {
        return userPass;
    }
	
    public String setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserNicename() {
        return userNicename;
    }
	
    public String setUserNicename(String userNicename) {
        this.userNicename = userNicename;
    }

    public String getUserEmail() {
        return userEmail;
    }
	
    public String setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserUrl() {
        return userUrl;
    }
	
    public String setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public Date getUserRegistered() {
        return userRegistered;
    }
	
    public Date setUserRegistered(Date userRegistered) {
        this.userRegistered = userRegistered;
    }

    public String getUserActivationKey() {
        return userActivationKey;
    }
	
    public String setUserActivationKey(String userActivationKey) {
        this.userActivationKey = userActivationKey;
    }

    public int getUserStatus() {
        return userStatus;
    }
	
    public int setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public String getDisplayName() {
        return displayName;
    }
	
    public String setDisplayName(String displayName) {
        this.displayName = displayName;
    }

}


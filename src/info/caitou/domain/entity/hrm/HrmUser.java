package info.caitou.domain.entity.hrm;

import org.springframework.stereotype.Component;

@Component
public class HrmUser {
	private int userId;
	private int uType;
	private int deptId;
	private String firstName;
	private String lastname;
	private String userName;
	private String dispName;
	private String userLogin;
	private String userPwd;
	private int accState;
	private String lastLoginTime;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getuType() {
		return uType;
	}

	public void setuType(int uType) {
		this.uType = uType;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDispName() {
		return dispName;
	}

	public void setDispName(String dispName) {
		this.dispName = dispName;
	}

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public int getAccState() {
		return accState;
	}

	public void setAccState(int accState) {
		this.accState = accState;
	}

	public String getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	@Override
	public String toString() {
		return "HrmUser [userId=" + userId + ", uType=" + uType + ", deptId=" + deptId + ", firstName=" + firstName
				+ ", lastname=" + lastname + ", userName=" + userName + ", dispName=" + dispName + ", userLogin="
				+ userLogin + ", userPwd=" + userPwd + ", accState=" + accState + ", lastLoginTime=" + lastLoginTime
				+ "]";
	}

}

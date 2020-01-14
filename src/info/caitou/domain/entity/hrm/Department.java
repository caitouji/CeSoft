package info.caitou.domain.entity.hrm;

import org.springframework.stereotype.Component;

@Component
public class Department {
	private int deptId;
	private String dptNo;
	private String deptName;
	private int superId;
	private String path;
	private String DispName;
	private String FullName;
	private String IsOrg;
	private String IsOuter;
	private String AdminName;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDptNo() {
		return dptNo;
	}

	public void setDptNo(String dptNo) {
		this.dptNo = dptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getSuperId() {
		return superId;
	}

	public void setSuperId(int superId) {
		this.superId = superId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getDispName() {
		return DispName;
	}

	public void setDispName(String dispName) {
		DispName = dispName;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getIsOrg() {
		return IsOrg;
	}

	public void setIsOrg(String isOrg) {
		IsOrg = isOrg;
	}

	public String getIsOuter() {
		return IsOuter;
	}

	public void setIsOuter(String isOuter) {
		IsOuter = isOuter;
	}

	public String getAdminName() {
		return AdminName;
	}

	public void setAdminName(String adminName) {
		AdminName = adminName;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", dptNo=" + dptNo + ", deptName=" + deptName + ", superId=" + superId
				+ ", path=" + path + ", DispName=" + DispName + ", FullName=" + FullName + ", IsOrg=" + IsOrg
				+ ", IsOuter=" + IsOuter + ", AdminName=" + AdminName + "]";
	}

}

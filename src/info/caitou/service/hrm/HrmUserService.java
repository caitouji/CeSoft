package info.caitou.service.hrm;

import java.util.List;

import info.caitou.domain.entity.hrm.HrmUser;

public interface HrmUserService {
	public List<HrmUser> getUsersToList();

	public List<HrmUser> getUserByDeptIdToList(int deptId);

	public HrmUser getUserByUserId(int userId);

	public int modifyUser(HrmUser hrmUser);

}

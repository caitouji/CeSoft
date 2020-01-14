package info.caitou.dao.hrm;

import java.util.List;

import org.springframework.stereotype.Repository;

import info.caitou.domain.entity.hrm.HrmUser;

@Repository
public interface HrmUserDao {
	public List<HrmUser> getUsersToList();

	public List<HrmUser> getUserByDeptIdToList(int deptId);
	
	public HrmUser getUserByUserId(int userId);

	public int modifyUser(HrmUser hrmUser);
	
}

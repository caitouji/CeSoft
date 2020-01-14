package info.caitou.service.hrm.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.caitou.dao.hrm.HrmUserDao;
import info.caitou.domain.entity.hrm.HrmUser;
import info.caitou.service.hrm.HrmUserService;

@Service
public class HrmUserServiceImpl implements HrmUserService {

	@Autowired
	private HrmUserDao hrmUserDao;

	@Override
	public List<HrmUser> getUsersToList() {
		return hrmUserDao.getUsersToList();
	}

	@Override
	public List<HrmUser> getUserByDeptIdToList(int deptId) {
		return hrmUserDao.getUserByDeptIdToList(deptId);
	}

	@Override
	public HrmUser getUserByUserId(int userId) {
		int i=1/2;
		return hrmUserDao.getUserByUserId(userId);
	}

	@Override
	public int modifyUser(HrmUser hrmUser) {
		return hrmUserDao.modifyUser(hrmUser);
	}

}

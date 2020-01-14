package info.caitou.controller.hrm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import info.caitou.domain.entity.hrm.HrmUser;
import info.caitou.service.hrm.HrmUserService;

@RestController
public class HrmUserController {

	@Autowired
	private HrmUserService hrmUserService;

	@RequestMapping(value = "getUsersToList", method = RequestMethod.GET)
	public Object getUsersToList() {
		return hrmUserService.getUsersToList();
	}

	@RequestMapping(value = "getUserByDeptIdToList/{deptId}", method = RequestMethod.GET)
	public Object getUserByDeptIdToList(@PathVariable int deptId) {
		return hrmUserService.getUserByDeptIdToList(deptId);
	}

	@RequestMapping(value = "getUserByUserId/{userId}", method = RequestMethod.GET)
	public HrmUser getUserByUserId(@PathVariable int userId) {
		return hrmUserService.getUserByUserId(userId);
	}

}

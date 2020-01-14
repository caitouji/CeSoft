package info.caitou.controller.hrm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import info.caitou.domain.entity.hrm.Department;
import info.caitou.service.hrm.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@RequestMapping(value = "getDepartmentsToMap", method = RequestMethod.GET)
	public Object getDepartmentsToMap() {
		return departmentService.getDepartmentsToMap();
	}

	@RequestMapping(value = "getDepartmentsToList", method = RequestMethod.GET)
	public Object getDepartmentsToList() {
		return departmentService.getDepartmentsToList();
	}

	@RequestMapping(value = "getDepartmentById/{deptId}", method = RequestMethod.GET)
	public Department getDepartmentById(@PathVariable int deptId) {
		return departmentService.getDepartmentByDeptId(deptId);
	}

	@RequestMapping(value = "getDepartmentsToTreeNode", method = RequestMethod.GET)
	public Object getDepartmentsToTreeNode() {
		return departmentService.getDepartmentsToTreeNode();
	}

}

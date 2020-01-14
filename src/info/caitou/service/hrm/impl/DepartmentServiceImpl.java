package info.caitou.service.hrm.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.caitou.dao.hrm.DepartmentDao;
import info.caitou.domain.entity.hrm.Department;
import info.caitou.domain.entity.hrm.DepartmentNode;
import info.caitou.service.hrm.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;

	@Override
	public Map<Integer, Department> getDepartmentsToMap() {
		return departmentDao.getDepartmentsToMap();
	}

	@Override
	public List<Department> getDepartmentsToList() {
		return departmentDao.getDepartmentsToList();
	}

	@Override
	public Department getDepartmentByDeptId(int deptId) {
		return departmentDao.getDepartmentByDeptId(deptId);
	}

	@Override
	public List<DepartmentNode> getDepartmentsToTreeNode() {
		Map<Integer, Department> departmentsToMap = departmentDao.getDepartmentsToMap();
		List<DepartmentNode> tmpDptList = new ArrayList<DepartmentNode>();
		for (Iterator<Integer> it = departmentsToMap.keySet().iterator(); it.hasNext();) {
			Department tmpDpt = departmentsToMap.get(it.next());
			if (tmpDpt.getSuperId() == 0) {

				DepartmentNode childNode = new DepartmentNode();
				childNode.setTitle(tmpDpt.getFullName());
				childNode.setId(tmpDpt.getDeptId());
				childNode.setField(tmpDpt.getFullName());
				childNode.setSpread(true);

				List<DepartmentNode> children = getChildren(departmentsToMap, tmpDpt.getDeptId());
				if (children.size() > 0) {
					childNode.setChildren(children);
				}
				tmpDptList.add(childNode);
			}
		}

		return tmpDptList;
	}

	public List<DepartmentNode> getChildren(Map<Integer, Department> hrmDeptMap, Integer id) {
		List<DepartmentNode> deptNodes = new ArrayList<DepartmentNode>();
		for (Iterator<Integer> it = hrmDeptMap.keySet().iterator(); it.hasNext();) {
			Integer tmpDptId = it.next();
			Department tmpDept = hrmDeptMap.get(tmpDptId);
			if (tmpDept.getSuperId() == id) {
				DepartmentNode childNode = new DepartmentNode();
				childNode.setTitle(tmpDept.getFullName());
				childNode.setId(tmpDptId);
				childNode.setField(tmpDept.getFullName());
				List<DepartmentNode> children = getChildren(hrmDeptMap, childNode.getId());
				if (children.size() > 0) {
					childNode.setChildren(children);
				}
				deptNodes.add(childNode);
			}
		}
		return deptNodes;
	}

}

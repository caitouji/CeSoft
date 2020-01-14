package info.caitou.service.hrm;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import info.caitou.domain.entity.hrm.Department;
import info.caitou.domain.entity.hrm.DepartmentNode;

@Service
public interface DepartmentService {

	public Map<Integer, Department> getDepartmentsToMap();

	public List<Department> getDepartmentsToList();

	public Department getDepartmentByDeptId(int deptId);

	public List<DepartmentNode> getDepartmentsToTreeNode();

}

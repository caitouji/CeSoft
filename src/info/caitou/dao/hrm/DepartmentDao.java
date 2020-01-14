package info.caitou.dao.hrm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.springframework.stereotype.Repository;

import info.caitou.domain.entity.hrm.Department;

@Repository
public interface DepartmentDao {

	@MapKey("deptId")
	public Map<Integer, Department> getDepartmentsToMap();

	public List<Department> getDepartmentsToList();

	public Department getDepartmentByDeptId(int deptId);
}

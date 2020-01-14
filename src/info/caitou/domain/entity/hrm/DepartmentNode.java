package info.caitou.domain.entity.hrm;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DepartmentNode {
	private String title;
	private int id;
	private String field;
	private List<DepartmentNode> children;
	private String href;
	private boolean spread;
	private boolean checked;
	private boolean disabled;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public List<DepartmentNode> getChildren() {
		return children;
	}

	public void setChildren(List<DepartmentNode> children) {
		this.children = children;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public boolean isSpread() {
		return spread;
	}

	public void setSpread(boolean spread) {
		this.spread = spread;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	@Override
	public String toString() {
		return "DepartmentNode [title=" + title + ", id=" + id + ", field=" + field + ", children=" + children
				+ ", href=" + href + ", spread=" + spread + ", checked=" + checked + ", disabled=" + disabled + "]";
	}

}

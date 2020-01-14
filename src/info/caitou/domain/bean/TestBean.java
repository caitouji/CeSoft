package info.caitou.domain.bean;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

public class TestBean {

	@Min(1)
	@Max(100)
	private int id;

	@Length(min = 3, max = 10)
	private String name;

	private int age;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "TestBean [id=" + id + ", name=" + name + ", age=" + age + ", birthday=" + birthday + "]";
	}

}

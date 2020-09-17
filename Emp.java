package ibm.home4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Date;

//1、创建Emp类
//定义私有属性: 
//String name，int age，String gender ，int salary， Date hiredate;//入职时间
//	定义构造方法，以及属性get,set方法.
//	定义toString方法，格式如:
//   	姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2020-01-11
//	定义equals方法，要求名字，年龄，性别，薪资都相同，则认为内容一致。
//	实现序列化接口，并定义版本号。
//

public class Emp {
	// 定义私有属性
	private String name, gender;
	private int age, salary;
	private Date hiredate;

	// 定义构造方法
	public Emp(String name, String gender, int age, int salary, Date hiredate) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.hiredate = hiredate;
	}

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\26097\\Desktop\\2233" + File.separator + "emp.txt");
		OutputStream out = new FileOutputStream(file, true);
		String str = "\n实现序列化接口";
		byte[] test = str.getBytes("utf-8");
		for (int i = 0; i < test.length; i++) {
			out.write(test[i]);
		}
		out.close();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	@Override
	public String toString() {
		return "Emp [姓名：" + name + ", 性别：" + gender + ",年龄：" + age + ", 薪资：" + salary + ",入职时间：" + hiredate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (age != other.age)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

}

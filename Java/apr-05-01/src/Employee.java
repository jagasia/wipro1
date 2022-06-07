
public class Employee implements Comparable<Employee>
{
	private Integer id;
	private String name;
	private Float salary;
	
	public Employee() {}
	
	public Employee(Integer id, String name, Float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
//		return this.getId()-o.getId();
		return o.getId().compareTo(this.getId());		//id is Integer. it has compareTo method
	}
	
}
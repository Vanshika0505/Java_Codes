package SetterGetter;

public class Employee {
	private int id;
	private String name;
	private double salary;
	public Employee(String n1,int i,double sal)
	{
		name=n1;
		id=i;
		salary=sal;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name =name;
	}
	public int getid()
	{
		return id; 
	}
	public void setid(int id)
	{
		this.id =id;
	}
	public double getsalary()
	{
		return salary;
	}
	public void setsalary(double salary)
	{
		if (salary>=0)
			this.salary =salary;
		else
		{
			System.out.println("Salary cannot be negative.");
			this.salary=0;
		}
	}
	public static void main(String[] args) {
		Employee e=new Employee("Vanshika",355,238965);
		System.out.println("Employee name="+ e.getname());
		System.out.println("Employee ID="+ e.getid());
		System.out.println("Employee salary="+ e.getsalary());
		e.setsalary(10000000);
		System.out.println("updated Employee salary="+ e.getsalary());
		e.setsalary(-1000);
		System.out.println("updated Employee salary="+ e.getsalary());
	}

}

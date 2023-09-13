package com.java8;

public class Employee {
int id;
String name;
int age;
String gender;
String department;
int year;
double salary;
public Employee(int id, String name, int age, String gender, String department, int year, double salary) {
	
	this.id = id;
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.department = department;
	this.year = year;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
			+ department + ", year=" + year + ", salary=" + salary + "]";
}

public int getId() 
{
    return id;
}
 
public String getName() 
{
    return name;
}
 
public int getAge() 
{
    return age;
}
 
public String getGender() 
{
    return gender;
}
 
public String getDepartment() 
{
    return department;
}
 
public int getYear() 
{
    return getYear();
}
 
public double getSalary() 
{
    return salary;
}
 
public String toString1() 
{
    
	return "Id : "+id
            +", Name : "+name
            +", age : "+age
            +", Gender : "+gender
            +", Department : "+department
            +", Year Of Joining : "+year
            +", Salary : "+salary;
}
}

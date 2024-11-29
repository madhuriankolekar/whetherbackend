package com.example.demo;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "p_isg_info")  // Specify table name if needed
public class PIsgInfo implements Serializable {

    public PIsgInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
    
   
    

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")  // Specify the column name
    private Long id;

    @Column(name = "name")  // Specify the column name
    private String name;

    @Column(name = "age")  // Specify the column name
    private int age;

    @Column(name = "email")  // Specify the column name
    private String email;

    
    
    @Column(name = "password")  // Specify the column name
    private String password;
    @Column(name = "is_advisory_only") // Assuming the column name is `is_advisory_only` in the database
    private Boolean isAdvisoryOnly;
    // Constructor
    public PIsgInfo(Long id, String name, int age, String email, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.isAdvisoryOnly=isAdvisoryOnly;
    }
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getIsAdvisoryOnly() {
		return isAdvisoryOnly;
	}
	public void setIsAdvisoryOnly(Boolean isAdvisoryOnly) {
		this.isAdvisoryOnly = isAdvisoryOnly;
	}




	

}










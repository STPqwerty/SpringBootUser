package com.websystique.springboot.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="user")
public class User implements Serializable{

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Column(name="first_name", nullable=false)
	private String first_name;

	@NotEmpty
	@Column(name="last_name", nullable=false)
	private String last_name;

	@NotEmpty
	@Column(name="middle_name", nullable=false)
	private String middle_name;

	@Column(name="phone_num")
	private String phone_num;

	@Column(name="email")
	private String email;

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	//<------------->
//	@OneToMany(mappedBy = "user")
////	@Column(name="adress_id") //какая аннотация другой таблицы
//	private Adress adress;
	@OneToOne(optional = false, mappedBy = "user")
	private Adress adress;
//<------------->

	@Column(name="birth_date")//нулабле тру нужно ??
	private Date birth_date;// ?какой тип параметра? чтоб он мог менять дату? просто стринг?

//
//	@join(name="SALARY", nullable=false)
//	private Address address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}


		@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		User user = (User) o;

//		if (Double.compare(user.salary, salary) != 0) return false;
		if (id != null ? !id.equals(user.id) : user.id != null) return false;
		if (first_name != null ? !first_name.equals(user.first_name) : user.first_name != null) return false;
		if (last_name != null ? !last_name.equals(user.last_name) : user.last_name != null) return false;
		if (middle_name != null ? !middle_name.equals(user.middle_name) : user.middle_name != null) return false;
		if (phone_num != null ? !phone_num.equals(user.phone_num) : user.phone_num != null) return false;
		if (email != null ? !email.equals(user.email) : user.email != null) return false;
//		return (birth_date != null ? !birth_date.equals(user.birth_date) : user.birth_date != null) == null;
		return birth_date != null ? birth_date.equals(user.birth_date) : user.birth_date == null;
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = id != null ? id.hashCode() : 0;
		result = 31 * result + (first_name != null ? first_name.hashCode() : 0);
        result = 31 * result + (last_name != null ? last_name.hashCode() : 0);
        result = 31 * result + (middle_name != null ? middle_name.hashCode() : 0);
        result = 31 * result + (phone_num != null ? phone_num.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
		result = 31 * result + (birth_date != null ? birth_date.hashCode() : 0);
//		temp = Double.doubleToLongBits(salary);
//		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + first_name + middle_name + last_name + ", phone number: " + phone_num
				+ ", email: " + email + ", birth year: " +  birth_date + ", Address: " + adress + "]";
	}


}

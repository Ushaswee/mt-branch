package com.cts.project.user.pojo;
import javax.persistence.*;
@Entity
@Table(name="user")
public class User {
		@Id
		private String username;
		private String password;
		private String firstname;
		private String lastname;
		private String email;
		private String address;
		private long phone;
		private int age;
		private String usertype;
		private String confirm;
		private String profileimage;
		@Override
		public String toString() {
			return "User [username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname="
					+ lastname + ", email=" + email + ", address=" + address + ", phone=" + phone + ", age=" + age
					+ ", usertype=" + usertype + ", confirm=" + confirm + ", profileimage=" + profileimage + "]";
		}
		public long getPhone() {
			return phone;
		}
		
		public void setPhone(long phone) {
			this.phone = phone;
		}
		
		
		public String getProfileimage() {
			return profileimage;
		}
		public void setProfileimage(String profileimage) {
			this.profileimage = profileimage;
		}
		
		public String getConfirm() {
			return confirm;
		}

		public void setConfirm(String confirm) {
			this.confirm = confirm;
		}


		public String getUsertype() {
			return usertype;
		}

		public void setUsertype(String usertype) {
			this.usertype = usertype;
		}
	  public String getUsername() {
	  return username;
	  }
	  public void setUsername(String username) {
	  this.username = username;
	  }
	  public String getPassword() {
	  return password;
	  }
	  public void setPassword(String password) {
	  this.password = password;
	  }
	  public String getFirstname() {
	  return firstname;
	  }
	  public void setFirstname(String firstname) {
	  this.firstname = firstname;
	  }
	  public String getLastname() {
	  return lastname;
	  }
	  public void setLastname(String lastname) {
	  this.lastname = lastname;
	  }
	  public String getEmail() {
	  return email;
	  }
	  public void setEmail(String email) {
	  this.email = email;
	  }
	  public String getAddress() {
	  return address;
	  }
	  public void setAddress(String address) {
	  this.address = address;
	  }
	  public int getAge() {
		  return age;
	  }
		  public void setAge(int age) {
		  this.age = age;
	 }
	}


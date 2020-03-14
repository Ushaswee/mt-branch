package com.cts.project.pojos;
	import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
	@Entity
	@Table(name="users")
	public class User {
			
			@Id
		private int id;
			private String username;
			@Column(name="password",nullable=false,length=100)
			private String password;
			private String email;
			private int phone;
			private int confirm;
			private String usertype;
			@Override
			public String toString() {
				return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
						+ ", phone=" + phone + ", confirm=" + confirm + "]";
			}
		public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
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
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public int getPhone() {
				return phone;
			}
			public void setPhone(int phone) {
				this.phone = phone;
			}
			public int getConfirm() {
				return confirm;
			}
			public void setConfirm(int confirm) {
				this.confirm = confirm;
			}
		
		
		


}

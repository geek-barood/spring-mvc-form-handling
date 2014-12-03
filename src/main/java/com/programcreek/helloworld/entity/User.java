package com.programcreek.helloworld.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {
		private static final long serialVersionUID = 1L;
		private int id;
		private String username;
		private String password;
		private String fullname;
		private String address;
		public User() {
			
		}
		
		public User(int id, String username, String password, String fullname, String address) {
			this.id = id;
			this.username = username;
			this.password = password;
			this.fullname = fullname;
			this.address = address;
		}
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id", unique=true, nullable=false)
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		@Column(name="username", nullable=false, unique=true)
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		
		@Column(name="password", nullable=false)
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		@Column(name="fullname", nullable=false)
		public String getFullname() {
			return fullname;
		}
		public void setFullname(String fullname) {
			this.fullname = fullname;
		}
		
		@Column(name="address", nullable=true)
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
}

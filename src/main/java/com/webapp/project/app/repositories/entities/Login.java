package com.webapp.project.app.repositories.entities;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "LOGIN_")
public class Login {

	@Id
	@TableGenerator(name = "table", table = "sequences_", pkColumnName = "PK_NAME", valueColumnName = "PK_VALUE", initialValue = 0, allocationSize = 1)
	@GeneratedValue(generator = "table", strategy = GenerationType.TABLE)

	@Column(name = "LOGIN_ID")
	private Long id;
	
	@Column(name = "LOGIN_EMAIL_")
	private String email;
	
	@Column(name = "LOGIN_PASSWORD_")
	private String password;
	
	@Column(name = "LOGIN_DATETIME_")
	private LocalDateTime logindatetime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public LocalDateTime getLogindatetime() {
		return logindatetime;
	}

	public void setLogindatetime(LocalDateTime logindatetime) {
		this.logindatetime = logindatetime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, logindatetime, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(logindatetime, other.logindatetime) && Objects.equals(password, other.password);
	} 
}

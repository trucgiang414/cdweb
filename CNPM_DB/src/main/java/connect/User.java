package connect;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements java.io.Serializable {
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
 
    @Column(name = "userName")
    private String username;
 
    @Column(name = "password")
    private String password;
 
    @Column(name = "email")
    private String email;
 
    @Column(name = "roleID")
    private String roleID;
 
    
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", roleID="
				+ roleID + "]";
	}

	public User() {
	}

	public User(Integer id, String username, String password, String email, String roleID) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.roleID = roleID;
	}

	public User(String username, String password, String email, String roleID) {
		super();
		
		this.username = username;
		this.password = password;
		this.email = email;
		this.roleID = roleID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getRoleID() {
		return roleID;
	}

	public void setRoleID(String roleID) {
		this.roleID = roleID;
	}

}

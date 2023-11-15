package com.wishcart.users.model;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="admin_user")
public class Admin {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String userName;
	private String password;
	private String FullName;
	private String email;
	private int active;
	private int level;
	private int role;
	@Builder.Default
	private LocalDateTime createdDate=LocalDateTime.now();
	private LocalDateTime updateDate;
	
	

}

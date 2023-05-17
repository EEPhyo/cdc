package com.ai.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	 @Column
    private String role_name;
    
    @OneToMany(mappedBy = "user",fetch=FetchType.LAZY,
    		cascade = CascadeType.ALL)
    private Set<User> user;
    
    public Role() {}
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRole_name() {
        return role_name;
    }
    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
    

   

}

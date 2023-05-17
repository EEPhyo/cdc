package com.ai.persistant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.ai.persistant.dto.UserDto;

@Service("userDao")
public class UserDao {
	
	public static Connection con=null;
	
	static {
		con = MyConnection.getConnection();
	}
	
	
	//insert
	public int insertData(UserDto user) {
		int result =0;
		String sql = "INSERT INTO user(id,name,email,password,phone_number,address,created_date,updated_date,created_user,updated_user,enabled,locked) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,user.getId());
			ps.setString(2,user.getName());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPassword());
			ps.setString(5, user.getPhone_number());
			ps.setString(6, user.getAddress());
			ps.setString(7, user.getCreated_date());
			ps.setString(8, user.getUpdated_date());
			ps.setString(9, user.getCreated_user());
			ps.setString(10, user.getUpdated_user());
			ps.setBoolean(11,user.isEnabled());
			ps.setBoolean(12, user.isLocked());
			result=ps.executeUpdate();			
		}catch (SQLException e) {
			System.out.println("Database error");
			e.printStackTrace();
		}
		return result;
		
	}
	
	//update
	public int updateData(UserDto user) {
		int result =0;
		String sql = "UPDATE user SET name=?,email=?,password=?,phone_number=?,address=?,created_date=?,updated_date=?updated_user=?,enabled=?,locked=? WHERE id=?";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1,user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getPhone_number());
			ps.setString(5, user.getAddress());
			ps.setString(6, user.getCreated_date());
			ps.setString(7, user.getUpdated_date());
			ps.setString(8, user.getCreated_user());
			ps.setString(9, user.getUpdated_user());
			ps.setBoolean(10,user.isEnabled());
			ps.setBoolean(11, user.isLocked());
			result=ps.executeUpdate();			
		}catch (SQLException e) {
			System.out.println("Database error");
		}
		return result;
		
	}
	
	//delete
	public int deleteData(UserDto user) {
		int result=0;
		String sql = "DELETE FROM user where id=?";		
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,user.getId());
			result=ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Database error");
		}
		return result;
	}
	//select single book
	public UserDto selectOne(UserDto user) {
		UserDto res = new UserDto();
		String sql = "SELECT * from user where id=?";
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				rs.getInt("id");
				res.setName(rs.getString("name"));
				res.setEmail(rs.getString("email"));
				res.setPassword(rs.getString("password"));	
				res.setPhone_number(rs.getString("phone_number"));
				res.setAddress(rs.getString("address"));
				res.setCreated_date(rs.getString("created_date"));
				res.setUpdated_date(rs.getString("updated_date"));
				res.setCreated_user(rs.getString("created_user"));
				res.setUpdated_user(rs.getString("updated_user"));
				res.setEnabled(rs.getBoolean("enabled"));
				res.setLocked(rs.getBoolean("locked"));
				
			}
		} catch (SQLException e) {
			System.out.println("Database error");
		}
		return res;			
	}
	
	//selectAll
	public ArrayList<UserDto> selectAll() {
		ArrayList<UserDto> list = new ArrayList();
		String sql = "SELECT * FROM user";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				UserDto res = new UserDto();
				rs.getInt("id");
				res.setName(rs.getString("name"));
				res.setEmail(rs.getString("email"));
				res.setPassword(rs.getString("password"));	
				res.setPhone_number(rs.getString("phone_number"));
				res.setAddress(rs.getString("address"));
				res.setCreated_date(rs.getString("created_date"));
				res.setUpdated_date(rs.getString("updated_date"));
				res.setCreated_user(rs.getString("created_user"));
				res.setUpdated_user(rs.getString("updated_user"));
				res.setEnabled(rs.getBoolean("enabled"));
				res.setLocked(rs.getBoolean("locked"));
			}
			
		} catch (SQLException e) {
			System.out.println("Database error");
		}
		return list;
	}
		
	}


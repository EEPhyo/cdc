package com.ai.persistant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.ai.persistant.dto.CategoryDto;

@Service("CategoryDao")
public class CategoryDao {
    public static Connection con=null;
	
	static {
		con = MyConnection.getConnection();
	}
	
	
	//insert
	public int insertData(CategoryDto user) {
		int result =0;
		String sql = "INSERT INTO user(id,name VALUES (?,?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,user.getId());
			ps.setString(2,user.getName());
			result=ps.executeUpdate();			
		}catch (SQLException e) {
			System.out.println("Database error");
			e.printStackTrace();
		}
		return result;
		
	}
	
	//update
	public int updateData(CategoryDto user) {
		int result =0;
		String sql = "UPDATE user SET name=? WHERE id=?";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1,user.getName());
			result=ps.executeUpdate();			
		}catch (SQLException e) {
			System.out.println("Database error");
		}
		return result;
		
	}
	
	//delete
	public int deleteData(CategoryDto user) {
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
	public CategoryDto selectOne(CategoryDto category) {
		CategoryDto res = new CategoryDto();
		String sql = "SELECT * from user where id=?";
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				rs.getInt("id");
				res.setName(rs.getString("name"));				
			}
		} catch (SQLException e) {
			System.out.println("Database error");
		}
		return res;			
	}
	
	//selectAll
	public ArrayList<CategoryDto> selectAll() {
		ArrayList<CategoryDto> list = new ArrayList();
		String sql = "SELECT * FROM user";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				CategoryDto res = new CategoryDto();
				rs.getInt("id");
				res.setName(rs.getString("name"));
			}
			
		} catch (SQLException e) {
			System.out.println("Database error");
		}
		return list;
	}
		
	}



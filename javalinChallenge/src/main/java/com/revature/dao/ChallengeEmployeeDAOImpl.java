package com.revature.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.ChallengeEmployee;
import com.revature.util.ConnectionUtil;

public class ChallengeEmployeeDAOImpl implements ChallengeEmployeesDAO {

	@Override
	public void createChallengeEmployee(ChallengeEmployee challengeEmployee) {
		
		try(Connection conn  = ConnectionUtil.getConnection()) {
		String sql = "INSERT INTO challenge_employees (e_fname, e_lname, e_role, e_age) values (?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, challengeEmployee.getE_fname());
		ps.setString(2, challengeEmployee.getE_lname());
		ps.setString(3, challengeEmployee.getE_role());
		ps.setInt(4, challengeEmployee.getE_age());
		
		ps.executeUpdate();
		
		System.out.println("Added to Database");		
		
		} catch(SQLException e) {
			System.out.println("Creating the employee has failed.");
			e.printStackTrace();
		}
	}

	@Override
	public List<ChallengeEmployee> getAllChallengeEmployees() {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM challenge_employees";
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery(sql);

			List<ChallengeEmployee> challengeEmployeesList = new ArrayList<>();
			
			while(rs.next()) {
				ChallengeEmployee c = new ChallengeEmployee(
						rs.getInt("e_id"),
						rs.getString("e_fname"),
						rs.getString("e_lname"),
						rs.getString("e_role"),
						rs.getInt("e_age")
						);
				
				challengeEmployeesList.add(c);
			}
			
			return challengeEmployeesList;
		} catch(SQLException e) {
			System.out.println("Gathering the employees has failed.");
			e.printStackTrace();
		}
		return null;
	
	}

	@Override
	public ChallengeEmployee getChallengeEmployeeById(int e_id) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM challenge_employees WHERE e_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, e_id);
			
			ResultSet rs = ps.executeQuery();

			ChallengeEmployee resultChallengeEmployee = new ChallengeEmployee();
			
			while(rs.next()) {
					ChallengeEmployee c = new ChallengeEmployee(
						rs.getInt("e_id"),
						rs.getString("e_fname"),
						rs.getString("e_lname"),
						rs.getString("e_role"),
						rs.getInt("e_age")
						);
				
					resultChallengeEmployee = c;
					if(resultChallengeEmployee.getE_id() == 0) {
						return null;
					}
				}
			return resultChallengeEmployee;
		} catch(SQLException e) {
			System.out.println("Gathering the employee! has failed.");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ChallengeEmployee updateChallengeEmployee(ChallengeEmployee challengeEmployee) {
		try(Connection conn  = ConnectionUtil.getConnection()) {
			String sql = "UPDATE challenge_employees SET e_fname= ?, e_lname = ?, e_role = ?, e_age = ? WHERE e_id  = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, challengeEmployee.getE_fname());
			ps.setString(2, challengeEmployee.getE_lname());
			ps.setString(3, challengeEmployee.getE_role());
			ps.setInt(4, challengeEmployee.getE_age());
			ps.setInt(5, challengeEmployee.getE_id());
			
			ps.executeUpdate();
			
			String sqlCheck = "SELECT * FROM challenge_employees WHERE e_id = ?";
			PreparedStatement psc = conn.prepareStatement(sqlCheck);
			
			psc.setInt(1, challengeEmployee.getE_id());
			
			ResultSet rs = psc.executeQuery();
			
			while(rs.next()) {
				
				
				ChallengeEmployee updatedChallengeEmployee = new ChallengeEmployee(
						rs.getInt("e_id"),
						rs.getString("e_fname"),
						rs.getString("e_lname"),
						rs.getString("e_role"),
						rs.getInt("e_age")
					);
				return updatedChallengeEmployee;
			} 
				
			} catch(SQLException e) {
				System.out.println("Updating has failed.");
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public boolean deleteChallengeEmployee(int id) {
		try(Connection conn  = ConnectionUtil.getConnection()) {
			String sql = "delete from challenge_employees WHERE e_id  = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
		
			ps.setInt(1, id);
			
			ps.executeUpdate();
			
			return true;
			
			} catch(SQLException e) {
				System.out.println("Updating has failed.");
				e.printStackTrace();
				return false;
			}
	}

}

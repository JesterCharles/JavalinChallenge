package com.revature.dao;

import java.util.List;

import com.revature.models.ChallengeEmployee;

public interface ChallengeEmployeesDAO {

		// CREATE
		public void createChallengeEmployee(ChallengeEmployee challengeEmployee);
		
		// READ
		public List<ChallengeEmployee> getAllChallengeEmployees();
		public ChallengeEmployee getChallengeEmployeeById(int e_id);
		
		// UPDATE
		public ChallengeEmployee updateChallengeEmployee(ChallengeEmployee challengeEmployee);

		// Delete
		public boolean deleteChallengeEmployee(int id);
		
		
}

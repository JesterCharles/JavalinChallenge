package com.revature.services;

import java.util.List;

import com.revature.dao.ChallengeEmployeeDAOImpl;
import com.revature.dao.ChallengeEmployeesDAO;
import com.revature.models.ChallengeEmployee;

public class ChallengeEmployeeServices implements ChallengeEmployeesDAO {

	ChallengeEmployeeDAOImpl ceDao = new ChallengeEmployeeDAOImpl();
	
	@Override
	public void createChallengeEmployee(ChallengeEmployee challengeEmployee) {
		ceDao.createChallengeEmployee(challengeEmployee);

	}

	@Override
	public List<ChallengeEmployee> getAllChallengeEmployees() {
		return ceDao.getAllChallengeEmployees();
	}

	@Override
	public ChallengeEmployee getChallengeEmployeeById(int e_id) {
		return ceDao.getChallengeEmployeeById(e_id);
	}

	@Override
	public ChallengeEmployee updateChallengeEmployee(ChallengeEmployee challengeEmployee) {
		return ceDao.updateChallengeEmployee(challengeEmployee);
	}

	@Override
	public boolean deleteChallengeEmployee(int id) {
		return ceDao.deleteChallengeEmployee(id);
	}

}

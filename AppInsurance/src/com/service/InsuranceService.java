package com.service;

import java.util.List;

import com.model.Buy;
import com.model.Policy;
import com.model.PolicyDetails;
import com.model.PolicyHolder;
import com.repository.PolicyHolderRepository;

public class InsuranceService {

	private PolicyHolderRepository InsuranceRepo=new PolicyHolderRepository();
	public void insertUser(PolicyHolder policyHolder) {

		InsuranceRepo.insertUser(policyHolder);
	}

	public boolean doLogin(String userName, String password) {

		return InsuranceRepo.doLogin(userName, password);
	}
	public List<Policy> fetchAllPolicies() {

		return InsuranceRepo.fetchAllPolicies();
	}

	public PolicyDetails fetchPolicyDetails(int id) {
		// TODO Auto-generated method stub
		return InsuranceRepo.fetchPolicyDetails(id);
	}
	public void buyPolicy(Buy buy) {
		InsuranceRepo.buyPolicy(buy);
	}
	public Buy fetchUserId(String username) {
		return InsuranceRepo.fetchUserId(username);
	}
}
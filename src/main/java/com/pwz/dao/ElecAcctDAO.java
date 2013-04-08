package com.pwz.dao;

import java.util.List;

import com.pwz.model.ElecAccount;

public interface ElecAcctDAO {
	/**
	 * @param account an instance of ElecAccount class
	 * @return		  the primary key generated by database
	 */
	int addAccount(ElecAccount account);
	ElecAccount getAccount(int acctId);
	void updateAccount(ElecAccount account);
	List<ElecAccount> listAccounts(int userId);
	void deleteAccount(int acctId);	
}

package info.caitou.service.account.impl;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.caitou.dao.account.AccountDao;
import info.caitou.domain.entity.account.Account;
import info.caitou.general.utils.AccountUtils;
import info.caitou.service.account.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;

	@Override
	public Map<String, Account> getAccountsToMap() {
		Map<String, Account> accountsToMap = accountDao.getAccountsToMap();
		initAccountsBeMapParentSubCode(accountsToMap);
		System.out.println(accountsToMap.size());
		return accountsToMap;
	}

	private void initAccountsBeMapParentSubCode(Map<String, Account> accountsToMap) {
		for (Iterator<Entry<String, Account>> it = accountsToMap.entrySet().iterator(); it.hasNext();) {
			Entry<String, Account> entry = it.next();
			Account account = entry.getValue();
			account.setParentsubCode(AccountUtils.getParentSubCode(account.getsubCode()));
		}
	}

}

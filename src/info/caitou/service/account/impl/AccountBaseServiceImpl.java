package info.caitou.service.account.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.caitou.dao.account.AccountBaseDao;
import info.caitou.domain.entity.account.AccountBase;
import info.caitou.service.account.AccountBaseService;

@Service
public class AccountBaseServiceImpl implements AccountBaseService {

	@Autowired
	private AccountBaseDao accountBaseDao;

	@Override
	public Map<String, AccountBase> getAccountBasesToMap() {
		return accountBaseDao.getAccountBasesToMap();
	}
}

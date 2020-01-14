package info.caitou.service.account;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Service;

import info.caitou.domain.entity.account.Account;

@Service
public interface AccountService {
	public Map<String, Account> getAccountsToMap();
}

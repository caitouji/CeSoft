package info.caitou.controller.account;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import info.caitou.domain.entity.account.Account;
import info.caitou.domain.entity.account.AccountBase;
import info.caitou.service.account.AccountBaseService;
import info.caitou.service.account.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;

	@Autowired
	private AccountBaseService accountBaseService;

	@RequestMapping(value = "getAccountsToMap", method = RequestMethod.GET)
	public Map<String, Account> getAccountsToMap() {
		return accountService.getAccountsToMap();
	}

	@RequestMapping(value = "getAccountBasesToMap", method = RequestMethod.GET)
	public Map<String, AccountBase> getAccountBasesToMap() {
		return accountBaseService.getAccountBasesToMap();
	}
}

package info.caitou.service.account;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Service;

import info.caitou.domain.entity.account.AccountBase;

@Service
public interface AccountBaseService {
	public Map<String, AccountBase> getAccountBasesToMap();
}

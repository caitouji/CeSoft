package info.caitou.dao.account;

import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.springframework.stereotype.Repository;

import info.caitou.domain.entity.account.Account;

@Repository
public interface AccountDao {

	@MapKey("subCode")
	public Map<String, Account> getAccountsToMap();

}

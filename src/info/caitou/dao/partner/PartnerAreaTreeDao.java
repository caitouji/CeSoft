package info.caitou.dao.partner;

import java.util.List;

import org.springframework.stereotype.Repository;

import info.caitou.service.partner.PartnerAreaTreeService;

@Repository
public interface PartnerAreaTreeDao {

	List<PartnerAreaTreeService> getPartnerAreaTreesToList();

}

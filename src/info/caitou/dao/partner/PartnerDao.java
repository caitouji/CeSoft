package info.caitou.dao.partner;

import java.util.List;

import org.springframework.stereotype.Repository;

import info.caitou.domain.entity.partner.Partner;

@Repository
public interface PartnerDao {

	public Partner getPartnerById(int partnerCode);

	public List<Partner> getPartnersToList();

	public List<Partner> getPartnersByAreaToList(String area);

}

package info.caitou.service.partner;

import java.util.List;

import org.springframework.stereotype.Service;

import info.caitou.domain.entity.partner.Partner;

@Service
public interface PartnerService {

	public Partner getPartnerById(int partnerId);

	public List<Partner> getPartnersToList();

	public List<Partner> getPartnersByAreaToList(String area);

}

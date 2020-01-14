package info.caitou.service.partner.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.caitou.dao.partner.PartnerDao;
import info.caitou.domain.entity.partner.Partner;
import info.caitou.service.partner.PartnerService;

@Service
public class PartnerServiceImpl implements PartnerService {

	@Autowired
	private PartnerDao partnerDao;

	@Override
	public Partner getPartnerById(int partnerId) {
		return partnerDao.getPartnerById(partnerId);
	}

	@Override
	public List<Partner> getPartnersToList() {
		return partnerDao.getPartnersToList();
	}

	@Override
	public List<Partner> getPartnersByAreaToList(String area) {
		return partnerDao.getPartnersByAreaToList(area);
	}

}

package info.caitou.service.partner.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.caitou.dao.partner.PartnerAreaTreeDao;
import info.caitou.service.partner.PartnerAreaTreeService;

@Service
public class PartnerAreaTreeImpl implements PartnerAreaTreeService {

	@Autowired
	private PartnerAreaTreeDao partnerAreaTreeDao;

	@Override
	public List<PartnerAreaTreeService> getPartnerAreaTreesToList() {
		return partnerAreaTreeDao.getPartnerAreaTreesToList();
	}

}

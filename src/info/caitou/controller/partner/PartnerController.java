package info.caitou.controller.partner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sun.org.glassfish.gmbal.ParameterNames;

import info.caitou.service.partner.PartnerAreaTreeService;
import info.caitou.service.partner.PartnerService;

@RestController
public class PartnerController {

	@Autowired
	private PartnerService partnerService;
	@Autowired
	private PartnerAreaTreeService PartnerAreaTreeService;

	@RequestMapping("getPartnersToList")
	public Object getPartnersToList() {
		return partnerService.getPartnersToList();
	}

	@RequestMapping(value = "getPartnersByAreaToList")
	public Object getPartnersByAreaToList(String area) {
		 return partnerService.getPartnersByAreaToList(area);

	}

	@RequestMapping(value = "getPartnerAreaTreesToList", method = RequestMethod.POST)
	public Object getPartnerAreaTreesToList() {
		return PartnerAreaTreeService.getPartnerAreaTreesToList();
	}

	@RequestMapping(value = "ajax", method = RequestMethod.POST)
	public Object ajax(@RequestBody String userId) {
		System.out.println("ajax");
		System.out.println(userId);
		return userId;
	}

}

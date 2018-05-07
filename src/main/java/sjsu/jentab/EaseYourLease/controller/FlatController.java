package sjsu.jentab.EaseYourLease.controller;

//import com.microsoft.aad.adal4j.AuthenticationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import sjsu.jentab.EaseYourLease.config.AuthHelper;
import sjsu.jentab.EaseYourLease.model.Apartment;
import sjsu.jentab.EaseYourLease.model.ApartmentVO;
import sjsu.jentab.EaseYourLease.model.Flat;
import sjsu.jentab.EaseYourLease.model.Tenant;
import sjsu.jentab.EaseYourLease.service.ApartmentService;
import sjsu.jentab.EaseYourLease.service.FlatService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
public class FlatController {


	@Autowired
	private FlatService flatService;

	@Autowired
	private ApartmentService apartmentService;

//	@RequestMapping(value = "/saveflat", method = RequestMethod.POST)
//	public String flatSave(@RequestBody Flat flat) {
//		return flatService.flatSave(flat);
//	}

//	@RequestMapping(value = "/viewflat", method = RequestMethod.POST)
//	public List<Flat> flatslist(@RequestParam Integer apartmentId) {
//		return flatService.flatslist(apartmentId);
//	}

	@RequestMapping(value = "/viewflats", method = RequestMethod.GET)
	public String viewflattypePage(@RequestParam("apartmentId")Integer apartmentId,ModelMap model,HttpServletRequest httpRequest) {
		System.out.println("Apartment ID received : "+apartmentId);
		//apartmentService.getApartment(apartmentId);
//		HttpSession session = httpRequest.getSession();
//		AuthenticationResult result = (AuthenticationResult) session.getAttribute(AuthHelper.PRINCIPAL_SESSION_NAME);
//		if (result == null) {
//			model.addAttribute("error", new Exception("AuthenticationResult not found in session."));
//			return "/error";
//		} else {
//			try {
//				model.put("userInfo", result.getUserInfo());
//			} catch (Exception e) {
//				model.addAttribute("error", e);
//				return "/error";
//			}
//		}

		model.put("apartmentName",apartmentService.getApartment(apartmentId).getApartmentName());
		model.put("apartmentid",apartmentId);
		model.put("flats",flatService.flatslist(apartmentId));
		return "viewflats";
	}

	@RequestMapping(value = "/addflat", method = RequestMethod.GET)
	@ModelAttribute("Flat")
	public ModelAndView addflatPage(@RequestParam("apartmentid") Integer apartmentid,ModelMap model) {
		model.put("apartmentid",apartmentid);
		return new ModelAndView("addflat", "flat", new Flat());
	}

	@RequestMapping(value = "/saveFlat", method = RequestMethod.POST)
	public ModelAndView saveFlatPage(@Valid @ModelAttribute("flat")Flat flat,
								   BindingResult result, ModelMap model) {
		flatService.flatSave(flat);

		Integer aid=flat.getApartment().getId();
		System.out.println("apartmentid:" +flat.getApartment().getId());
		model.put("flats",flatService.flatslist(aid));
		//return "viewflats";
		return new ModelAndView("redirect:" + "viewflats?apartmentId="+aid);
	}

	
}

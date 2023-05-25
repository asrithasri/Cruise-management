package com.cruise.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pricing.entity.PricingDetails;
import com.pricing.service.PricingDetailsService;


@Controller
public class PricingController {
	
	@Autowired
	private PricingDetailsService pricingDetails;

	public PricingController(PricingDetailsService pricingDetails) {
		super();
		this.pricingDetails = pricingDetails;
	}
	
	@GetMapping("/pricing_header/new")
	public String createPricingDetailsForm(Model model) {
	
    PricingDetails pricingDetails = new PricingDetails();
	model.addAttribute(pricingDetails);
	return "redirect:/pricing_header";
	}
	
	
}

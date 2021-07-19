package com.manav.drools.controller;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manav.drools.entity.OrderRequest;

@RestController
public class RequestController {

	@Autowired
	KieContainer kieContainer;

	@PostMapping(value = "discount", consumes = { "application/json" })
	public ResponseEntity<?> getDiscount(@RequestBody OrderRequest order) {

		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("discount-session");
		kSession.insert(order);
		kSession.fireAllRules();
		// kSession.dispose();
		return ResponseEntity.status(HttpStatus.OK).body(order);
	}

}

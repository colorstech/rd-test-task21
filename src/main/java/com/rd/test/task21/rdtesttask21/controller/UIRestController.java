/**
 * 
 */
package com.rd.test.task21.rdtesttask21.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rd.test.task21.rdtesttask21.cache.CveCache;
import com.rd.test.task21.rdtesttask21.processor.CsvProcessor;
import com.rd.test.task21.rdtesttask21.service.CveService;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * @author hemak
 *
 */
@Slf4j
@RestController
@Component
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api")
public class UIRestController {

	@Autowired
	CronController cronController;
	
	@Autowired
	CveCache cveCache;
	
	@Autowired
	CveService cveService;
	
	@Autowired
	CsvProcessor csvProcessor;
	
	@ApiOperation(value = "To read the CVE CSV file", response = String.class)
	@GetMapping("/readFile")
	public String readFile() {
		log.info("readFile");
		cronController.readCsv();
		Gson gson = new GsonBuilder().create();
		String jsonInString = gson.toJson(cveCache.getCves());
		log.debug("readFile Data : [{}]",jsonInString);
		return jsonInString;
	}
	
	@ApiOperation(value = "To get the all CVE items from file", response = String.class)
	@GetMapping("/getCveItems")
	public String cveItems() {
		log.info("getCveItems");
		cronController.readCsv();
		Gson gson = new GsonBuilder().create();
		String jsonInString = gson.toJson(cveCache.getCveItems());
		log.debug("getCveItems Data : [{}]",jsonInString);
		return jsonInString;
	}
	
	@ApiOperation(value = "To get Severities by posting date", response = String.class)
	@GetMapping("/getSeverityAndPostingDate")
	public String getSeverityAndPostingDate() {
		log.info("getSeverityAndPostingDate");
		cronController.readCsv();
		Gson gson = new GsonBuilder().create();
		String jsonInString = gson.toJson(cveCache.getSeverityAndPostingDate());
		log.debug("getSeverityAndPostingDate Data : [{}]",jsonInString);
		return jsonInString;
	}
	
	@ApiOperation(value = "To get Severities by year", response = String.class)

	@GetMapping("/yearlySeverity")
	public String yearlySeverity() {
		log.info("yearlySeverity");
		Gson gson = new GsonBuilder().create();
		String jsonInString = gson.toJson(cveService.getYearlySeverity());
		log.debug("yearlySeverity Data : [{}]",jsonInString);
		return jsonInString;
	}
	
	@ApiOperation(value = "To get Severities by month and year", response = String.class)

	@GetMapping("/monthlyYearSeverity")
	public String monthlySeverity() {
		log.info("monthlyYearSeverity");
		String jsonInString = cveService.getMonthYearSeverity();
		log.debug("monthlyYearSeverity Data : [{}]",jsonInString);
		return jsonInString;
	}
}

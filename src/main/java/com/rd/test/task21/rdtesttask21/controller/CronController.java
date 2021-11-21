/**
 * 
 */
package com.rd.test.task21.rdtesttask21.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.rd.test.task21.rdtesttask21.cache.CveCache;
import com.rd.test.task21.rdtesttask21.domain.Cve;
import com.rd.test.task21.rdtesttask21.processor.CsvProcessor;
import com.rd.test.task21.rdtesttask21.service.repository.CveServiceRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hemak
 *
 */
@Slf4j
@Component
public class CronController {

	@Autowired
	CsvProcessor csvReaderProcessor;
	
	@Autowired
	CveCache cveCache;
	
	@Autowired
	CveServiceRepository cveServiceRepository;
	
	@Scheduled(cron = "0 * 9 * * ?")
	public void readCsv() {
		log.info("Reading File");
		List<Cve> cves=csvReaderProcessor.readFile();
		cveCache.setCves(cves);
		cveCache.cveItems();;
		cveCache.severityAndPostingDate();
		cveServiceRepository.saveAll(cveCache.getSeverityAndPostingDate());
	}
	
}

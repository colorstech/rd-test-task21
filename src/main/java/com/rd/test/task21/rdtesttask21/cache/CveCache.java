/**
 * 
 */
package com.rd.test.task21.rdtesttask21.cache;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.rd.test.task21.rdtesttask21.domain.CVEItem;
import com.rd.test.task21.rdtesttask21.domain.Cve;
import com.rd.test.task21.rdtesttask21.domain.Severity;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hemak
 *
 */
@Slf4j
@Component
public class CveCache {
	List<Cve> cves = null;
	List<CVEItem> cveItems;
	List<Severity> severityAndPostingDate;
	
	public String clearAll() {
		cves = null;
		cveItems = null;
		severityAndPostingDate = null;
		return "All Cache cleared";
	}

	public CveCache() {
		super();
		this.cves = new ArrayList<Cve>();
		this.cveItems = new ArrayList<CVEItem>();
		this.severityAndPostingDate = new ArrayList<Severity>();
				
	}

	public List<Cve> getCves() {
		return cves;
	}

	public void setCves(List<Cve> cves) {
		this.cves = cves;
	}

	public List<CVEItem> getCveItems() {
		return cveItems;
	}

	public void setCveItems(List<CVEItem> cveItems) {
		this.cveItems = cveItems;
	}

	public List<Severity> getSeverityAndPostingDate() {
		return severityAndPostingDate;
	}

	public void setSeverityAndPostingDate(List<Severity> severityAndPostingDate) {
		this.severityAndPostingDate = severityAndPostingDate;
	}
	
	public void cveItems() {
		List<CVEItem> cveItems = cves.get(0).getCVEItems();
		setCveItems(cveItems);
		
		log.info("cveCache : {}",getCveItems().size());
		
	}

	public void severityAndPostingDate() {
		List<Severity> severityAnalysedInformation = new ArrayList<Severity>();
		List<CVEItem> cveItemlist = getCveItems();
		cveItemlist.stream().forEach(itm -> {

			String id = itm.getCve().getCVEDataMeta().getId();
			LocalDate publishedDate = convertToLocalDateViaInstant(itm.getPublishedDate());
			if (!ObjectUtils.isEmpty(itm.getImpact().getBaseMetricV2())
					&& !ObjectUtils.isEmpty(itm.getImpact().getBaseMetricV2().getSeverity())) {

				String severityValue = itm.getImpact().getBaseMetricV2().getSeverity();
				String cacheKey = cacheKeyGen(id, severityValue, publishedDate);

				Severity severity = new Severity();
				severity.setCacheKey(cacheKey);
				severity.setId(id);
				severity.setPublishedDate(publishedDate);
				severity.setSeverity(severityValue);

				severityAnalysedInformation.add(severity);
			}
		});

		setSeverityAndPostingDate(severityAnalysedInformation);
		
		log.info("severityAnalysedInformation : {}",severityAnalysedInformation.size());
	}


	public String cacheKeyGen(String id, String severityValue, LocalDate publishedDate) {
		MessageDigest md;
		String cacheKey = new Date().toString().hashCode() + "";
		try {
			md = MessageDigest.getInstance("SHA-256");
			String input = id + severityValue + publishedDate.toString();
			cacheKey = md.digest(input.getBytes(StandardCharsets.UTF_8)).toString();
		} catch (NoSuchAlgorithmException e) {
			log.error("Unable to create cachekey: {}" + ExceptionUtils.getFullStackTrace(e));
		}

		return cacheKey;
	}

	public LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
		return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}
}

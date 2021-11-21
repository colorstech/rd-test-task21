/**
 * 
 */
package com.rd.test.task21.rdtesttask21.processor;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rd.test.task21.rdtesttask21.domain.Cve;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hemak
 *
 */
@Slf4j
@Component
public class CsvProcessor {

	public List<Cve> readFile() {
		List<Cve> cves = new ArrayList<Cve>();
		try {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		mapper.setDateFormat(df);

		TypeReference<List<Cve>> typeReference = new TypeReference<List<Cve>>() {
		};

		InputStream inputStream = TypeReference.class.getResourceAsStream("/CVE.json");
		
		cves = mapper.readValue(inputStream, typeReference);
		log.info("CVE read Completed!");
		
		
		} catch (IOException e) {
			log.error("Unable to read CVE: {}" + ExceptionUtils.getFullStackTrace(e) );
		}
		return cves;
	}
	
}

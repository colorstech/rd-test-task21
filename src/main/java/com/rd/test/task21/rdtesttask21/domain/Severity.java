/**
 * 
 */
package com.rd.test.task21.rdtesttask21.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author hemak
 *
 */

@Entity
public class Severity {

	@Id
	String cacheKey;

	String id;

	String severity;

	LocalDate publishedDate;
	
	public String getCacheKey() {
		return cacheKey;
	}

	public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public LocalDate getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}

}

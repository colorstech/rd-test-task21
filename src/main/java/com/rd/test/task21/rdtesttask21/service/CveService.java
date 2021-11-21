/**
 * 
 */
package com.rd.test.task21.rdtesttask21.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rd.test.task21.rdtesttask21.domain.CustomSeverity;
import com.rd.test.task21.rdtesttask21.domain.Severity;
import com.rd.test.task21.rdtesttask21.service.repository.CveServiceRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hemak
 *
 */
@Slf4j
@Service
public class CveService {
	@Autowired
	JdbcTemplate jdbcTemplate;

	private CveServiceRepository repository;

	public CveService(CveServiceRepository repository) {
		this.repository = repository;
	}
	
	public Iterable<Severity> list() {
		log.info("list()");
		return repository.findAll();
	}

	public Severity save(Severity severity) {
		log.info("save()");
		return repository.save(severity);
	}

	public void save(List<Severity> severities) {
		log.info("saveAll()");
		repository.saveAll(severities);
	}
	
	public List<CustomSeverity> getYearlySeverity() {
		String sql = "SELECT count(1) count,to_char(PUBLISHED_DATE ,'yyyy') PUBLISHED_DATE ,SEVERITY   FROM SEVERITY group by PUBLISHED_DATE ,SEVERITY ";
		List<CustomSeverity> cslist = jdbcTemplate.query(sql, new RowMapper<CustomSeverity>() {
			@Override
			public CustomSeverity mapRow(ResultSet rs, int rownumber) throws SQLException {
				CustomSeverity e = new CustomSeverity();
				log.debug(rs.getString(2));
				e.setCount(rs.getInt(1));
				e.setYear(rs.getString(2));
				e.setSeverity(rs.getString(3));
				return e;
			}
		});

		Map<String, CustomSeverity> tempMap = new HashMap<>();
		cslist.stream().forEach(itm -> tempMap.put(itm.getYear(), new CustomSeverity()));

		cslist.stream().forEach(itm -> {
			CustomSeverity cs = tempMap.get(itm.getYear());
			cs.setYear(itm.getYear());

			String severity = itm.getSeverity();

			if ("LOW".equalsIgnoreCase(severity)) {
				cs.setLow(itm.getCount());
			} else if ("MEDIUM".equalsIgnoreCase(severity)) {
				cs.setMedium(itm.getCount());
			} else if ("HIGH".equalsIgnoreCase(severity)) {
				cs.setHigh(itm.getCount());
			} else if ("CRITICAL".equalsIgnoreCase(severity)) {
				cs.setCritical(itm.getCount());
			}
			tempMap.put(itm.getYear(), cs);

		});

		return new ArrayList<CustomSeverity>(tempMap.values());
	}
	
	public String getMonthYearSeverity() {
		String sql = "SELECT count(1) count,to_char(PUBLISHED_DATE ,'yyyy-Mon') PUBLISHED_DATE ,SEVERITY   FROM SEVERITY group by PUBLISHED_DATE ,SEVERITY  ";
		List<CustomSeverity> list = jdbcTemplate.query(sql, new RowMapper<CustomSeverity>() {
			@Override
			public CustomSeverity mapRow(ResultSet rs, int rownumber) throws SQLException {
				CustomSeverity e = new CustomSeverity();
				e.setCount(rs.getInt(1));
				e.setMonthYear(rs.getString(2));
				e.setSeverity(rs.getString(3));
				log.debug("Month Year : {}, Severity : {}, Count: ", e.getMonthYear(), e.getSeverity(), e.getCount());
				return e;
			}
		});

		TreeMap<String, CustomSeverity> monthlyMap = new TreeMap<>();
		list.forEach(itm->{
		String mnYr=itm.getMonthYear();
		CustomSeverity cs=new CustomSeverity();
		cs.setMonthYear(itm.getMonthYear());
		monthlyMap.put(mnYr, cs);
		});

		list.forEach(itm->{
		String mnYr=itm.getMonthYear();
		CustomSeverity cs=monthlyMap.get(mnYr);
		
		String serverity=itm.getSeverity().trim();
		if("Low".equalsIgnoreCase(serverity)) {
			cs.setLow(itm.getCount());
		}else if("Medium".equalsIgnoreCase(serverity)) {
			cs.setMedium(itm.getCount());
		}else if("High".equalsIgnoreCase(serverity)) {
			cs.setHigh(itm.getCount());
		}else if("CRITICAL".equalsIgnoreCase(serverity)) {
			cs.setCritical(itm.getCount());
		}		
		monthlyMap.put(mnYr, cs);
		});
		
		log.info("monthlySeverity Data list: [{}]",list);
		Gson gson = new GsonBuilder().create();
		String jsonInString = gson.toJson(monthlyMap);
		log.debug("monthlySeverity Data : [{}]",jsonInString);
		return jsonInString;
	}
}

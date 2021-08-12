package com.capeelectric.service;

import java.util.List;

import com.capeelectric.exception.CompanyDetailsException;
import com.capeelectric.model.Site;

public interface SiteService {
	public void addSite(Site site) throws CompanyDetailsException;

	public void updateSite(Site site) throws CompanyDetailsException;

	public void deleteSite(Integer site) throws CompanyDetailsException;

	public List<Site> retriveSite(String clientName,String departmentName)throws CompanyDetailsException;
}

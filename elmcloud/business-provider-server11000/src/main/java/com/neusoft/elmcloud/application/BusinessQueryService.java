package com.neusoft.elmcloud.application;

import com.neusoft.elmcloud.po.Business;

import java.util.List;

public interface BusinessQueryService {

	List<Business> listBusinessByOrderTypeId(Integer orderTypeId);
	Business getBusinessById(Integer businessId);
}

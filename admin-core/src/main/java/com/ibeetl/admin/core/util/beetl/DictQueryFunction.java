package com.ibeetl.admin.core.util.beetl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.beetl.core.Context;
import org.beetl.core.Function;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibeetl.admin.core.entity.CoreDict;
import com.ibeetl.admin.core.service.CoreDictService;
@Component
public class DictQueryFunction implements Function {

	@Autowired
	CoreDictService dictService;
	
	@Override
	public List<CoreDict> call(Object[] paras, Context arg1) {
		
		String type =(String)paras[0];
		return dictService.findAllByType(type);
		
	    
	}

}
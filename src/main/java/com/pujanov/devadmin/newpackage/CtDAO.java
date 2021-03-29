package com.pujanov.devadmin.newpackage;

import java.util.List;

import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import com.pujanov.devadmin.dto.CityDTO;

public interface CtDAO {	
	
	@SqlQuery(":queryString")
    public String runQuery(@Bind("queryString") String queryString);
	
}

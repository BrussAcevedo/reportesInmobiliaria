package com.praxis.reportesInmobiliaria.dao;

import java.util.List;

import com.praxis.reportesInmobiliaria.entity.PermissionEntity;

public interface PermissionDao {

	
	List<PermissionEntity>findall();
	PermissionEntity findById(Integer permissionID);
	void save(PermissionEntity permission);
	void deleteByID(Integer permissionID);
	Boolean existById(Integer permissionId);
	
}

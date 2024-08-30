package com.praxis.reportesInmobiliaria.service;

import java.util.List;

import com.praxis.reportesInmobiliaria.controller.dto.UserDTO;

public interface UserService {

		public List<UserDTO>findAll();
		public UserDTO findById(Integer idUser);
		public boolean save(UserDTO user);
		public boolean deleteByID(Integer idUser);
		public boolean existById(Integer idUser);
		
}

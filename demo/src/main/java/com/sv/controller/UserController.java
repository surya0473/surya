package com.sv.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sv.bean.req.UserReqBean;
import com.sv.bean.res.UserResBean;
import com.sv.constants.ControllerConstants;
import com.sv.entity.User;
import com.sv.exception.UserException;
import com.sv.service.UserService;

@RestController
@RequestMapping(ControllerConstants.USER_CONTROLLER)
@RestControllerAdvice
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping(ControllerConstants.GET_USER)
	public ResponseEntity<?> getUser(@PathVariable(ControllerConstants.PATH_VAR_USER_ID) String userId) {
		User user = service.getUser(userId);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@ExceptionHandler({ UserException.class })
	@PostMapping(ControllerConstants.REGISTER_USER)
	public ResponseEntity<?> registerUser(@Valid @RequestBody UserReqBean reqBean) {
		UserResBean resBean = service.createUser(reqBean);
		return ResponseEntity.status(HttpStatus.OK).body(resBean);
	}
}

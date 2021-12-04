package com.example.mypractice.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.mypractice.domain.BoardVO;
import com.example.mypractice.service.BoardService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Controller
public class BoardController {

	@Autowired
	private BoardService service;
	
	@GetMapping("/board")
	public void mapping() {}
	
	@SuppressWarnings("deprecation")
	@ResponseBody
	@RequestMapping(value="/board/lists", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE,
													   MediaType.APPLICATION_XML_VALUE })
	public String list(HttpServletRequest request) {
		
		/* PageHelper.startPage(request); */
		
		
		Gson gson = new GsonBuilder().create();
		
		/* String json = gson.toJson(PageInfo.of(service.getList())); */
		
		String json = gson.toJson(service.getList());
		
		return json;
	}
}

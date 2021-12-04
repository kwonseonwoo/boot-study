package com.example.mypractice.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mypractice.domain.BoardVO;
import com.example.mypractice.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
class PracticeProjectApplicationTests {

	@Autowired
	private BoardService service;
	
	@Test
	void contextLoads() {
	}

	@Test
	@DisplayName("new test")
	void lambdaExpressions() {
		
		List<Integer> numbers = Arrays.asList(1,2,3);
		
		assertTrue(numbers.stream().mapToInt(i -> i).sum() > 5, "sum should be greater than 5");
	}
	
	@Test
	@DisplayName("custome test")
	public void new_t() {
		
		List<BoardVO> list = service.getList();
		
		assertNotNull(list);
		System.out.println(list);
	}
}

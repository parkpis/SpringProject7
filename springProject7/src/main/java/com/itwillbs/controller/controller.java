package com.itwillbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class controller {
		
		@RequestMapping(value = "/test2", method = RequestMethod.GET)
		public void test2() {
			
		}
	
		@RequestMapping(value = "/test3", method = RequestMethod.GET)
		public void test3() {
			
		}
		
		@RequestMapping(value = "/test4", method = RequestMethod.GET)
		public void test4() {
			
		}

		@RequestMapping(value = "/test5", method = RequestMethod.GET)
		public void test5_home() {
			
		}
		@RequestMapping(value = "/test6", method = RequestMethod.GET)
		public void test6_home() {
			
		}
	
	
}

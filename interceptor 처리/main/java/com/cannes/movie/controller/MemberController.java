package com.cannes.movie.controller;

import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cannes.movie.domain.MemberVO;
import com.cannes.movie.service.MemberService;

@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberService memberService;
	
	@ResponseBody
	@PostMapping(value = "/login")
	public String login(HttpServletRequest request, MemberVO vo) {
		logger.info("login() 호출");
		System.out.println(vo);
		MemberVO result = memberService.readDetail(vo);
		System.out.println(result);
		if(result != null) {
			HttpSession session = request.getSession();
			session.setAttribute("memberId", vo.getMemberId());
			return "success";
		} else {
			return "fail";
		}
		
	} // end login()
	
	@GetMapping(value = "/logout")
	public String logout(HttpServletRequest request) {
		logger.info("logout() 호출");
		HttpSession session = request.getSession();
		session.removeAttribute("memberId");
		return "main";
	} // end logout()
	
	@GetMapping(value = "/tos")
	public String tos() {
		logger.info("tos() 호출");
		return "member/tos";
	} // end tos()
	
	@GetMapping(value = "/joinInfo")
	public String joinInfo(HttpServletRequest request, Model model) {
		logger.info("joinInfo() 호출");
		String check = request.getParameter("step1");
		System.out.println("check의 값 : " + check);
		
		if(check == null) {
			return "error";
		} else {
			model.addAttribute("step1", check);
			return "member/joinInfo";
		}
	} // end joinInfo()
	
	@PostMapping(value = "/join")
	public String join(@RequestBody MemberVO vo) {
		logger.info("join() 호출");
		System.out.println(vo);
		
		return "redirect:/welcome";
	}
	
	@GetMapping(value = "/welcome")
	public String welcome() {
		logger.info("welcome() 호출");
		return "member/welcome";
	}
} // end LoginController

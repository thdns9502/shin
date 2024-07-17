package kr.co.dong;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.dong.domain.LoginVO;

@Controller
public class LoginController{
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
//	LoginForm 가는 것
//	@GetMapping(value = "login/loginForm")
	public String loginForm() {
		logger.info("로그인폼으로 이동");
		return "login/loginForm";
	}

	//getMapping
//	request받는 방법 1_STRING 생성 및 파라미터 받는 것
//	@PostMapping(value = "login/login")
	public String login(HttpServletRequest request,
						HttpServletResponse respone,
						Model model) throws UnsupportedEncodingException {
		logger.info("login");
		request.setCharacterEncoding("utf-8");
		String userID = request.getParameter("userID");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		model.addAttribute("userID", userID);
		model.addAttribute("name", name);
		model.addAttribute("password", password);
		
		return "login/result";
	}//end login1
	
//	request 받는 방법 2_@REQUEST파라미터 로 각각의 변수를 받는것이용
//	@PostMapping(value = "login/login2")
	public String login2(@RequestParam("userID") String userID,
						@RequestParam("name") String name,
						@RequestParam("password")String password,
						Model model) {
		model.addAttribute("userID", userID);
		model.addAttribute("name", name);
		model.addAttribute("password", password);
		return "login/result";
	}
	
//	request 받는 방법 3_map이용_medelandview를 이용하여 따로 model생성x
//	@PostMapping(value = "login/login3")
//	public String login3(@RequestParam Map<String, String> info, Model model) {
//  	logger.info("login3");
// 	 model.addAttribute("info", info);// info이 map형태인것
//  	return "login/result";
//}
	public ModelAndView login3(@RequestParam Map<String, String> info) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("info", info);
		mav.setViewName("login/result");//결과 출력값 보낼 곳
		return mav;
	}
	
//	request 받는방법 4_bean 클래스
//	@PostMapping(value = "login/login4")
	public String login4(@ModelAttribute("info") LoginVO loginVO) {
		return "login/result";
	}
	
}//end class
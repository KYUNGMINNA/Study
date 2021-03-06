package stu.Spring0620_;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.myweb.command.UserVO;
import com.spring.myweb.user.service.IUserService;
import com.spring.myweb.util.MailSendService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	//도로명주소 승인 키->devU01TX0FVVEgyMDIyMDYyMjE2MTc1MjExMjcxNjM=
	
	@Autowired
	private IUserService service;
	
	@Autowired
	private MailSendService mailService;
	
	
	//회원가입 페이지로 이동 
	@GetMapping("/userJoin")
	public void userJoin() {
		
	}
	
	//아아디 중복 확인(비동기)
	@ResponseBody   //RestController가 아닌 경우에는 아노테이션을 붙여야 비동기 통신이 가능하다.
	@PostMapping("/idCheck")
	public String check(@RequestBody String userId) {
		System.out.println(userId);
		
		int result=service.idCheck(userId);
		
		if(result ==1) {
			return "duplicated";
		}else {
			return "ok";
		}
	}
	
	
	//이메일 인증 
	@GetMapping("/mailCheck")
	@ResponseBody			//파라미터 name명과  ,매개변수명이 똑같으면 @requestParam 작성안해도 된다.
	public String mailCheck(String email) {
		System.out.println("이메일 인증 요청 들어옴!");
		System.out.println("인증 이메일 :"+email);
		return mailService.joinEmail(email);
		
	}
	//회원 가입 처리 
	@PostMapping("/join")
	public String join(UserVO vo,RedirectAttributes ra) {
		System.out.println("param : "+vo);
		service.join(vo);
		ra.addFlashAttribute("msg", "joinSuccess");
		return "redirect:/user/userLogin";
		
	}
	//로그인 페이지로 이동 요청
	@GetMapping("/userLogin")
	public void userLogin() {
		
	}
	
	//로그인 이벤트 처리
	@PostMapping("/login")
	public String login(String userId,String userPw,Model model) {
	      //mapper의 login 메서드 리턴 타입이 UserVO죠?
	      //그거 모델에 담으세요.
	      //리턴은 /user/userLogin으로 세팅을 하세요.
	      //util 패키지 안에 interceptor 패키지를 생성해서
	      //UserLoginSuccessHandler 클래스를 하나 생성해 주세요.
	      //UserLoginSuccessHandler는 로그인 처리 이후에 실행되는 핸들러를 
	      //오버라이딩 해서 -> 모델을 꺼내오세요.
	      //모덜 내의 데이터가 null인지 아닌지를 확인하셔서 
	      //null이라면 로그인 실패입니다. msg라는 이름으로 loginFail을 담아서
	      //userLogin.jsp 파일로 응답하도록 viewName을 세팅하시고,
	      //null이 아니라면 세션 만드셔서 홈 화면으로 이동시켜 주세요.
		model.addAttribute("user", service.login(userId,userPw));
		return "/user/userLogin";
	}
	
	//마이 페이지 이동 요청
	@GetMapping("/userMypage")
	public void userMyPage(HttpSession session,Model model) {
		//세션 데이터에서 id를 뽑아야 sql문을 돌릴 수 있겠죠?
		String id=((UserVO)session.getAttribute("login")).getUserId();
		UserVO vo=service.getInfo(id);
		System.out.println("join의 결과 :"+vo);
		model.addAttribute("userInfo", vo);
		
		
	}
	
	//수정 로직
	@PostMapping("/userUpdate")
	public String userUpdate(UserVO vo,RedirectAttributes ra) {
		System.out.println("pram :"+vo);
		service.updateUser(vo);
		
		ra.addFlashAttribute("msg", "수정이 완료되었습니다");
		
		return "redirect:/user/userMypage";
		
	}
	
	
	
	

}

<%@page import="kr.co.jsp.user.model.UserVO"%>
<%@page import="kr.co.jsp.user.model.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <%
    
    
    /*
    1. 폼 데이터 처리하세요.
    2. DAO 연동을 통해 updateUser() 메서드를 호출하여 회원 정보를 수정합니다.
     회원 정보 수정을 성공했다면 세션을 다시 제작해 주셔야 합니다.
     이름은 똑같이 해서 저장해 주시면 되겠습니다.
    3. 수정 후 "회원 정보가 수정되었습니다." 를 출력 후 마이페이지로 이동.
    */
    	request.setCharacterEncoding("utf-8");
    	
    	String id=request.getParameter("id");
    	String name=request.getParameter("name");
    	String email=request.getParameter("email");
    	String address=request.getParameter("address");
    	
    	UserVO vo=new UserVO();
    	vo.setId(id);
    	vo.setName(name);
    	vo.setEmail(email);
    	vo.setAddress(address);
    	
    	UserDAO dao=UserDAO.getInstance();
    	
    	
    	dao.updateUser(vo);
    	
    	session.setAttribute("user", dao.getUserInfo(vo.getId()));
    	
    %>
    	<script>
    	alert("회원 정보가 수정되었습니다.");
    	location.href="user_mypage.jsp";
    	</script>
    
    

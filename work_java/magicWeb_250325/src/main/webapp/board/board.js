function check_ok(){
	if(reg_frm.b_name.value.length == 0){
		alert("이름을 써주세요.");
		reg_frm.b_name.focus();
		return;
	}	
	if(reg_frm.b_title.value.length == 0){
		alert("제목을 써주세요.");
		reg_frm.b_title.focus();
		return;
	}	
	if(reg_frm.b_content.value.length == 0){
		alert("내용을 써주세요.");
		reg_frm.b_content.focus();
		return;
	}	
	if(reg_frm.b_pwd.value.length == 0){
		alert("비밀번호를 써주세요.");
		reg_frm.b_pwd.focus();
		return;
	}	
	
	//	폼이름이 reg_frm 에서 action 속성의 파일을 호출
	document.reg_frm.submit();
}

function delete_ok(){
	if(del_frm.b_pwd.value.length == 0){
		alert("비밀번호를 써주세요.");
		del_frm.b_pwd.focus();
		return;
	}	
	
	document.del_frm.submit();
}

//폼이름에 name 값으로 찾아감
	/*if(reg_frm.bor_title.value.length < 4){
	alert("아이디는 4글자이상이어야 합니다.");
	reg_frm.mem_uid.focus();
	return;
	}
	if(reg_frm.mem_pwd.value.length == 0){
	alert("패스워드는 반드시 입력해야 합니다.");
	reg_frm.mem_pwd.focus();
	return;
	}
if(reg_frm.mem_pwd.value != reg_frm.pwd_check.value){
	alert("패스워드가 일치하지 않습니다.");
	reg_frm.pwd_check.focus();
	return;
	}
	if(reg_frm.bor_title.value.length == 0){
	alert("글 제목을  써주세요.");
	reg_frm.bor_title.focus();
	return;
	}	
	if(reg_frm.mem_email.value.length == 0){
	alert("Email을  써주세요.");
	reg_frm.mem_email.focus();
	return;
	}	*/
	
	//폼 이름이 reg_frm에서 action 속성의 파일을 모두 호출


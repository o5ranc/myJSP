/**
 * 
 */
function joinCheck() {
	if(document.frm.userid.value.length == 0) {
		alert("아이디를 넣어주세요.");
		frm.userid.focus();
		return false;
	}
	
	if(document.frm.pwd.value.length == 0) {
		alert("비밀번호를 넣어주세요.");
		frm.pwd.focus();
		return false;
	}
	
	return true;
}

function loginCheck() {
	if(document.frm.userid.value.length < 4) {
		alert("아이디는 4글자이상이어야 합니다.");
		frm.userid.focus();
		return false;
	}
	
	if(document.frm.pwd.value != document.frm.pwd_check.value) {
		alert("비밀번호가 일치하지 않습니다.");
		frm.pwd.focus();
		return false;
	}
	
	if(document.frm.reid.value.length == 0) {
		alert("아이디 중복 체크를 해 주세요.");
		frm.userid.focus();
		return false;
	}
	return true;
}

function idCheck() {
	if(document.frm.userid.value.length == 0) {
		alert("아이디를 넣어주세요.");
		frm.userid.focus();
		return;
	}
	
	// queryString 으로 idCheck.do를 호출하므로 get방식
	let url = "idCheck.do?userid=" + document.frm.userid.value;
	window.open(url, "_black", "toolbar=no, menubar=no, scrollbars=yes, resizeable=no, width=450, height=200");
}

function idok() {
	// 사용가능한 아이디인 경우 팝업창에서 부모창 닫기
	console.log("aa " + "");
	window.opener.frm.userid.value = document.frm.userid.value;
	window.opener.frm.reid.value = document.frm.userid.value;
	
	self.close(); // 자기 자신은 닫기
}
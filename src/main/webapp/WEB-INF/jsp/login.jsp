<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
    <link rel = "stylesheet" href = "static/css/base.css">
    <link rel = "stylesheet" href = "static/css/login.css">
</head>
<body>
    <div class =  "login_board">
        <div class = "title">Bowis</div>
        <form id = "login">
            <input type = "text" placeholder="ID" name = "id" class = "input">
            <input type = "password" placeholder="Password" name = "pwd" class = "input">
            <input type = "submit" value = "로그인" class = "btn">
            <div class = "links">
                <div id = "to_sign_in" class = "link">회원가입</div>
                <div id = "to_forget_id_pw" class = "link">비밀번호 찾기</div>
            </div>
        </form>
    </div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>�α���</title>
    <link rel = "stylesheet" href = "base.css">
    <link rel = "stylesheet" href = "login.css">
</head>
<body>
    <div class =  "login_board">
        <div class = "title">Bowis</div>
        <form id = "login">
            <input type = "text" placeholder="ID" name = "id" class = "input">
            <input type = "password" placeholder="Password" name = "pwd" class = "input">
            <input type = "submit" value = "�α���" class = "btn">
            <div class = "links">
                <div id = "to_sign_in" class = "link">ȸ������</div>
                <div id = "to_forget_id_pw" class = "link">��й�ȣ ã��</div>
            </div>
        </form>
    </div>
</body>
</html>
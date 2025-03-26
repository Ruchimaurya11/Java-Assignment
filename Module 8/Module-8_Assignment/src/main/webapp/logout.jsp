<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script>
        // Logout hone ke baad 3 sec me login page pe redirect
        setTimeout(function() {
            window.location.href = "login.jsp";
        }, 3000);
    </script>
</head>
<body>
 <h2>You have been logged out successfully!</h2>
    <p>Redirecting to login page...</p>s

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>
        .login{
            width: 30%;
            padding: 20px;
            margin-right:auto;
            margin-left:auto;
            margin-top:90px;

        }
        
        h2{			
            text-align: center; 
            margin-bottom:20px;
            font-weight: bold;          
        }
        
        button{
            padding:40%;
        }

        .ml-2{
            margin-left: 150px;
        }

          
    </style>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<body>
</head>
<body>
	 <div class="container">
        <div class="card login">
            <div class="card-body">
            <h2>Login Form</h2>
            
                	
            	<c:if test="${not empty querySuccess }">
            		<div class="error" style="color:#ff0000;">${querySuccess}</div>           	
            	</c:if>
            	
            	<c:if test="${not empty registrationSuccess }">
            		<div class="error" style="color:#ff0000;">${registrationSuccess}</div>           	
            	</c:if>
            	
            	<c:if test="${not empty logout }">
            		<div class="error" style="color: #ff0000;">${logout}</div>           	
            	</c:if>          
            
          
                <form name="loginForm" action="<c:url value="/j_spring_security_check"/>"  method="post">                    
                    
                    <fieldset>
                        <div class="mb-3">
                            <label for="email"  class="form-label">Email</label>
                            <input type="email" class="form-control" name="j_username" aria-describedby="emailHelp"/>
                        </div>
                     
                   
                   
                        <div class="mb-3">
                            <label for="password" class="form-label">Password</label>
                            <input type="password" class="form-control" name="j_password" aria-describedby="emailHelp"/>
                        </div>
                   
                   		<div class="checkbox">
                   			<c:if test="${not empty error }">
                   			
                   				<div class="error" style="color:#ff00000">${error }</div>
                   			</c:if>
                   		
                   		</div>
                    
                        <button type="submit" class="btn btn-primary">Login</button>
                        <button type="reset" class="btn btn-secondary ml-2">Cancel</button>
                    </fieldset>
                    <br>
                    <p>You don't have an account? <a href="<c:url value="/register"/>">Register here</a>.</p>

                </form>
            </div>
        </div>
    </div>
</body>
</html>
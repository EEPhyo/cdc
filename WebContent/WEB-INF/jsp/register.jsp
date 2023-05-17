<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>	
	
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    
    <style>
        .register{
            width: 35%;
            padding: 20px;
            margin-right:auto;
            margin-left:auto;
            margin-top:20px;
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
            margin-left: 220px;
        }
    </style>
</head>
<body>
	<div style="color:red">${error}</div>
	 <div class="container ">
        <div class="card register">
            <div class="card-body">
                <!-- <div class="register"> -->
                   <form:form action="/ClothingProj/registration" modelAttribute="bean" method="post">
                        <h2>Register a new membership</h2>                                 
                         
	                       <fieldset class="form-group">
	                            <div class="mb-3">
	                                <form:label for="name" path="name" class="form-label">Name</form:label>
	                                <form:input type="text" class="form-control" path="name" aria-describedby="emailHelp"/>
	                            </div>
	                        </fieldset>
	                        
	                        <fieldset class="form-group">
	                            <div class="mb-3">
	                                <form:label for="email" path="email" class="form-label">Email</form:label>
	                                <form:input type="email" class="form-control" path="email" aria-describedby="emailHelp"/>
	                            </div>
	                        </fieldset>
	                        
	                        <fieldset class="form-group">
	                            <div class="mb-3">
	                                <form:label for="password" path="password" class="form-label">Password</form:label>
	                                <form:input type="password" class="form-control" path="password" maxlength="10" size="8" aria-describedby="emailHelp"/>
	                            </div>
	                        </fieldset>
	                        
	                        <fieldset class="form-group">
	                            <div class="mb-3">
	                                <form:label for="password" path="password" class="form-label">Confirm Password</form:label>
	                                <form:input type="password" class="form-control" path="password"  maxlength="10" size="8" aria-describedby="emailHelp"/>
	                            </div>
	                        </fieldset>
	                        
	                        <fieldset class="form-group">
	                            <div class="mb-3">
	                                <form:label for="phone_number" path="phone_number" class="form-label">Phone Number</form:label>
	                                <form:input type="tel" class="form-control" path="phone_number" aria-describedby="emailHelp"/>
	                            </div>
	                        </fieldset>
	                        
	                         <fieldset class="form-group">
	                            <div class="mb-3">
	                                <form:label for="address" path="address" class="form-label">Address</form:label>
	                                <form:input type="text" class="form-control" path="address" aria-describedby="emailHelp"/>
	                            </div>
	                        </fieldset>
	                        
	                        <fieldset class="form-group">
	                            <button type="submit" class="btn btn-primary btn-block" >Submit</button>
	                            <button type="reset" class="btn btn-secondary btn-block ml-2">Cancel</button>
	                        </fieldset>
	                        <br>
	                               
	                            <p>Already have an account? <a href="login.jsp">Login here</a>.</p>
                        </form:form>
                        </div>
                    </div>
                </div>
         
</body>
</html>
<!DOCTYPE html>    
<html>    
<head>    
    <title>Sim Group Login Page</title>
   
    <link rel="stylesheet" type="text/css" href="../CardDistributedSystem/resources/css/indexcss/style.css">    
</head>    
<body>    
    <h2>Login Here</h2><br>    
    <div class="login"> 
    <%
String Errormessage="";
try{
	
	String statuscode=(String)request.getAttribute("StatusCode");
	String StatusMessage=(String)request.getAttribute("StatusMessage");
	System.out.println("statuscode  ....."+statuscode);
	if(statuscode.equals("300") && StatusMessage.equals("NOK")){
		 Errormessage = (String)request.getAttribute("ErrorMessage"); 
		 %>
		 <div class="third"><text ><%= Errormessage%></Text>	</div><br/>
		 
		 <%
	}


}catch(Exception e){
	e.printStackTrace();
}


%>
    
     
    <form id="login" action="/CardDistributedSystem/login">
 <label><b>User Name</b></label>  
  <input type="text" id="uname" name="uname" placeholder="Username">
  <br><br>
  <label><b>Password</b></label> 
  <input type="text" id="password" name="password" placeholder="Password">
  <br><br>
<input type="submit" value="Sign In">  
  
</form>
</div>    
</body>    
</html>
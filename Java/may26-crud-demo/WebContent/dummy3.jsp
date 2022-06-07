<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
	function fn1()
	{
		var no1=parseInt(document.getElementById("no1").value);
		var no2=parseInt(document.getElementById("no2").value);
		var op=document.getElementById("op").value;

		  var xhttp = new XMLHttpRequest();
		  xhttp.onreadystatechange = function() {
		    if (this.readyState == 4 && this.status == 200) {
		      document.getElementById("result").innerHTML =
		      this.responseText;
		    }
		  };
		  xhttp.open("GET", "calc?no1="+no1+"&no2="+no2+"&op="+op, true);
		  xhttp.send();
		
			/* document.getElementById("result").innerHTML=result; */
	}
</script>
</head>
<body>
<form>
Number 1: <input type="number" id="no1" /><br/>
Number 2: <input type="number" id="no2" /><br/>
<div id="result"></div>
<select onchange="fn1()" id="op">
	<option>Choose...</option>
	<option>Add</option>
	<option>Subtract</option>
	<option>Multiply</option>
</select>
</form>
</body>
</html>
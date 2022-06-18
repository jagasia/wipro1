<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="my">
Gender: 
<input type="radio" id="rdoFemale" name="gender" value="Female" > <label for="rdoFemale">Female</label>
<input type="radio" id="rdoMale" name="gender" value="Male" > <label for="rdoMale" >Male</label>
<input type="radio" id="rdoOther" name="gender" value="Other" > <label for="rdoOther" >Other</label>


<input type="checkbox" id="chkECE" name="dept" value="ECE"><label for="chkECE">ECE</label>
<input type="checkbox" id="chkEEE" name="dept" value="EEE"><label for="chkEEE">EEE</label>
<input type="checkbox" id="chkMech" name="dept" value="Mech"><label for="chkMech">Mech</label>
<input type="checkbox" id="chkCivil" name="dept" value="Civil"><label for="chkCivil">Civil</label>



<input type="submit" value="Submit" />
</form>
</body>
</html>
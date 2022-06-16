<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<p class="text-right">

<c:if test="${user ne null }">
Welcome!     
</c:if>
${user.firstName }</p> 
<div class="jumbotron text-center">
		<h1>Wipro Batch 3 June 11 Mvc Demo</h1>
		<p>spring boot, jsp, h2 in mem db!</p>
</div>
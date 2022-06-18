<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">WebSiteName</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="#">Page 1</a></li>
			<li><a href="#">Page 2</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="signup"><span class="glyphicon glyphicon-user"></span>
					Sign Up</a></li>
			<c:if test="${customer eq null }">
				<li><a href="login"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</c:if>
			<c:if test="${customer ne null }">
			<li><a href="logout"><span
					class="glyphicon glyphicon-log-in"></span> Logout</a></li>
			</c:if>
		</ul>
	</div>
</nav>
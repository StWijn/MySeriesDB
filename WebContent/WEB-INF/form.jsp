<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>
<title>Serie Toevoegen</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/style.css">

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/add-style.css">

<style>
.error {
	color: red
}
</style>

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>MySeriesDB Manager</h2>
		</div>
	</div>

	<div id="container">

		<h3>Serie toevoegen</h3>

		<!-- action verwijst naar de mapping in controller -->
		<form:form action="saveSerie" modelAttribute="serie" method="POST">

			<!-- UPDATE: om de serie objects up-date-baar te maken moet Hibernate afweten van het bestaande ID -->
			<form:hidden path="id" />

			<table>
				<tbody>
					<tr>
						<td><label>Serie Titel:</label></td>
						<td><form:input path="titel" /> <form:errors path="titel"
								cssClass="error" /></td>

					</tr>

					<tr>
						<td><label>Genre:</label></td>
						<td><form:input path="genre" /></td>
					</tr>

					<tr>
						<td><label>Platform:</label></td>
						<td><form:input path="platform" /> <form:errors
								path="platform" cssClass="error" /></td>
					</tr>

					<tr>
						<td><label>IMDB URL:</label></td>
						<td><form:input path="imdb" /> <form:errors path="imdb"
								cssClass="error" /></td>
					</tr>

					<tr>
						<td><label>MijnSeries URL:</label></td>
						<td><form:input path="mijnseries" /> <form:errors
								path="mijnseries" cssClass="error" /></td>
					</tr>

					<tr>
						<td><label>Status:</label></td>
						<td><form:input path="status" /></td>
					</tr>

					<tr>
						<!-- Terug button -->
						<td><input type="button" value="Terug"
							onclick="window.location.href='return'" ; return
							false;"
			class="save" /></td>
						<!-- submit button -->
						<td><input type="submit" value="Opslaan" class="save" /></td>
					</tr>
				</tbody>

			</table>


		</form:form>

		<div style=""></div>

	</div>


</body>
</html>
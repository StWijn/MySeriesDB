<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
<title>MySeriesDB overview</title>

<!-- reference our style sheet -->

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>MySeriesDB Manager</h2>
		</div>
	</div>

	<div id="container">

		<div id="content">


			<!-- BUTTON  -->
			<input type="button" value="Serie toevoegen"
				onclick="window.location.href='addSerie'" ; return
				false;"
			class="add-button" />


			<!-- TABLE -->
			<table>
				<!-- headings -->
				<tr>
					<th>Titel</th>
					<th>Genre</th>
					<th>Platform</th>
					<th>IMDB</th>
					<th>MijnSeries</th>
					<th>Status</th>
					<th>Wijzig</th>
				</tr>

				<!-- LOOP-->
				<c:forEach var="mySeries" items="${mySeries}">


					<!-- Update en Verwijder functionaliteit
						param wordt meegegeven aan @RequestParam
						value gebruikt om een gespecificeerde link te creeren obv id vh object
						-->

					<!-- update link -->
					<c:url var="updateLink" value="/update">
						<c:param name="serieId" value="${mySeries.id}" />

					</c:url>

					<!--  verwijder link -->
					<c:url var="verwijderLink" value="/delete">
						<c:param name="serieId" value="${mySeries.id}" />
					</c:url>

					<!-- Table data -->
					<tr>
						<td>${mySeries.titel}</td>
						<td>${mySeries.genre}</td>
						<td>${mySeries.platform}</td>
						<td><a href="${mySeries.imdb}">IMDB</a></td>
						<td><a href=${mySeries.mijnseries}>MijnSerie.nl</a></td>
						<td>${mySeries.status}</td>

						<td>
							<!--  display update link  --> <a href="${updateLink}">Update</a>
							| <!-- display delete link --> <a href="${verwijderLink}"
							onclick="if (!(confirm('Serie verwijderen?'))) return false">Verwijder</a>
						</td>

					</tr>

				</c:forEach>

			</table>

		</div>

	</div>

</body>

</html>
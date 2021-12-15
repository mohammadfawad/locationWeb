<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#2d2e2d">
	<div align="center">
		<h1 align="center" style="color:#ffffff;">The Location Web App</h1><br>
		<table  border="0" style=" colorbackground-color:#292929; color:#4aff4a; margin-left:auto; margin-right:auto;">
				<thead>
					<tr>
						<th colspan="6" align="center">
							<h5>List Of All Location</h5>
						</th>
					</tr>
					<tr>
						<td>LocationId</td>
						<td>LocationCode</td>
						<td>LocationName</td>
						<td>LocationType</td>
						<td>Update</td>
						<td>Delete</td>
					</tr>
				</thead>
					<tbody>
						<c:forEach items="${listAllLocations}" var="location">
							<tr>
								<td>${location.locationId}</td>
								<td>${location.locationCode}</td>
								<td>${location.locationName}</td>
								<td>${location.locationType}</td>
								<td><a href="updateLocation?locationId=${location.locationId}">update</a></td>
								<td><a href="deleteLocation?locationId=${location.locationId}">delete</a></td>
							</tr>
						</c:forEach>
					</tbody>
				<tfoot align="center">
					<tr>
						<td colspan="6" align="center"><h6>@Copyrights Reserved</h6></td>
					</tr>
					
					<tr>
						<td colspan="6" align="center"><h6><hr></h6></td>
					</tr>
				</tfoot>
			</table>
	</div>
	<div align="center" style="color:#ffffff;">
		<h3 align="center" style="color:#ffffff;">Add New Location Records</h3><br>
		<a href="createLocation">Create Location</a>
		<a href="loctionsReport">Location Report</a>
	</div>
</body>
</html>
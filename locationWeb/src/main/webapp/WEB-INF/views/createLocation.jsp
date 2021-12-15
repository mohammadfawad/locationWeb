<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Location</title>
</head>
<body bgcolor="#2d2e2d">
	<div align="center">
		<h1 align="center" style="color:#ffffff;">The Location Web App</h1><br>
		<form action="saveLocation" method="post">
			<table  border="0" style=" colorbackground-color:#292929; color:#4aff4a; margin-left:auto;margin-right:auto;">
				<thead>
					<tr>
						<th colspan="2" align="center">
							<h5>Create Location</h5>
						</th>
					</tr>
				</thead>
					<tbody>
						<tr>
							<td>Location ID </td>
							<td>
								<input id="locationId" name="locationId" type="text"/>
							</td>
						</tr>
						<tr>
							<td>Location Code </td>
							<td>
								<input id="locationCode" name="locationCode" type="text"/>
							</td>
						</tr>
						<tr>
							<td>Location Name </td>
							<td>
								<input id="locationName" name="locationName" type="text"/>
							</td>
						</tr>
						<tr>
							<td>location Type</td>
							<td>
								Rural : <input id="locationType" name="locationType" type="radio" value="Rural"/>
								Urban : <input id="locationType" name="locationType" type="radio" value="Urban"/>
							</td>
						</tr>
						<tr>
							<td></td>
							<td>
								<input id="Submit" name="Submit" title="Submit" type="Submit" value="save"/>
							</td>
						</tr>
					</tbody>
				<tfoot align="center">
					<tr>
						<td colspan="2" align="center"><h6>@Copyrights Reserved</h6></td>
					</tr>
					
					<tr>
						<td colspan="2" align="center"><h6><hr></h6></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><h5 align="center" style="color:#ffffff;">${response}</h5></td>
					</tr>
				</tfoot>
			</table>
		</form>
	</div>
	<hr>
	<div align="center" style="color:#ffffff;">
		<h3 align="center" style="color:#ffffff;">View All Database Records</h3><br>
		<a href="viewAlllocations">viewAlllocations</a>
	</div>
</body>
</html>
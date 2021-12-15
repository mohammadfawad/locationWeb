<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Location</title>
</head>
<body>
	<form action="" method="post">
		<table border="1" style="color: teal;">
			<thead>
				<tr>
					<th>
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
							Rural : <input id="locationType" name="locationType" type="radio"/>
							Urban : <input id="locationType" name="locationType" type="radio"/>
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
					<td><h6>@Copyrights Reserved</h6></td>
				</tr>
			</tfoot>
		</table>
	</form>
</body>
</html>
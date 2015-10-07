<html ng-module="demoTestModule">
	<head>
		<title>AngularTest</title>	
		<%@ include file="../includes/_style.jsp" %>
		<%@ include file="../includes/_scripts.jsp" %>
	</head>
	<body>
		<div class="container">
			<tr>
			</tr>
		</div>
		<div ng-app="">
			Agency Home Page : <input type="text" ng-model="testData"/> {{testData}}
		</div>
	</body>
</html>
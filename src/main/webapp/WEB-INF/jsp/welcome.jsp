<!DOCTYPE html>
<html>
<head>
<title>Dashboard</title>
<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<script src="bootstrap/jquery.min.js"></script>
<script src="bootstrap/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script src="js/usercontroller.js"></script>
</head>
<body>
	<div ng-app="myDashboard" ng-controller="myCtrl">
		<div class="jumbotron text-center">
			<h1>Dashboard</h1>
			<p>Dashboard!</p>
		</div>
		<ul class="nav nav-pills">
			<li class="active"><a data-toggle="tab" href="#homePage">Home</a></li>
			<li><a data-toggle="tab" href="#userMgmt">User Mgmt</a></li>
			<li class="dropdown"><a data-toggle="dropdown"
				class="dropdown-toggle" href="#">Dropdown <b class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a data-toggle="tab" href="#dropdown1">Dropdown1</a></li>
					<li><a data-toggle="tab" href="#dropdown2">Dropdown2</a></li>
				</ul></li>
		</ul>
		<div class="tab-content">
			<div id="homePage" class="tab-pane fade in active">
				<h3>Home</h3>
				<div class="row">
					<div class="col-sm-2"></div>
					<div class="col-sm-8">
						<table class="table table-striped table-bordered">
							<thead class="thead-dark">
								<tr>
									<th scope="col">#</th>
									<th scope="col">First Name</th>
									<th scope="col">Last Name</th>
									<th scope="col">Email</th>
									<th scope="col">Mobile</th>
								</tr>
							</thead>
							<tbody>
								<tr ng-repeat="user in userList">
									<td>{{user.id}}</td>
									<td>{{user.firstname}}</td>
									<td>{{user.lastname}}</td>
									<td>{{user.email}}</td>
									<td>{{user.mobile}}</td>
									<td><button type="button" class="btn btn-primary">Edit</button>

										<button type="button" class="btn btn-primary">
											<span class="glyphicon glyphicon-search"></span>
										</button></td>

								</tr>
							</tbody>
						</table>

					</div>
					<div class="col-sm-2"></div>
				</div>
			</div>
			<div id="userMgmt" class="tab-pane fade">
				<h3>Section B</h3>
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">#</th>
							<th scope="col">First Name</th>
							<th scope="col">Last Name</th>
							<th scope="col">Username</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<th scope="row">1</th>
							<td>Mark</td>
							<td>Otto</td>
							<td>@mdo</td>
						</tr>
						<tr>
							<th scope="row">2</th>
							<td>Jacob</td>
							<td>Thornton</td>
							<td>@fat</td>
						</tr>
						<tr>
							<th scope="row">3</th>
							<td>Larry</td>
							<td>the Bird</td>
							<td>@twitter</td>
						</tr>
					</tbody>
				</table>


			</div>
			<div id="dropdown1" class="tab-pane fade">
				<h3>Dropdown 1</h3>
				<p>WInteger convallis, nulla in sollicitudin placerat, ligula
					enim auctor lectus, in mollis diam dolor at lorem. Sed bibendum
					nibh sit amet dictum feugiat. Vivamus arcu sem, cursus a feugiat
					ut, iaculis at erat. Donec vehicula at ligula vitae venenatis. Sed
					nunc nulla, vehicula non porttitor in, pharetra et dolor. Fusce nec
					velit velit. Pellentesque consectetur eros.</p>
			</div>
			<div id="dropdown2" class="tab-pane fade">
				<h3>Dropdown 2</h3>
				<p>Donec vel placerat quam, ut euismod risus. Sed a mi suscipit,
					elementum sem a, hendrerit velit. Donec at erat magna. Sed
					dignissim orci nec eleifend egestas. Donec eget mi consequat massa
					vestibulum laoreet. Mauris et ultrices nulla, malesuada volutpat
					ante. Fusce ut orci lorem. Donec molestie libero in tempus
					imperdiet. Cum sociis natoque penatibus et magnis.</p>
			</div>
		</div>
		<button type="button" class="btn btn-info btn-lg">OPEN MODAL</button>
		<button type="button" class="btn btn-info btn-lg" data-toggle="modal"
			data-target="#myModal">Open Modal</button>
		<div id="myModal" class="modal fade" role="dialog">
			<div class="modal-dialog">

				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">User</h4>
					</div>
					<div class="modal-body">
						<form class="form-horizontal">
						<div class="form-group">
								<label class="control-label col-sm-4" for="firstName">First Name:</label>
								<div class="col-sm-8">
									<input type="text" class="form-control" id="firstName"
										placeholder="First Name">
								</div>
							</div>
							
							<div class="form-group">
								<label class="control-label col-sm-4" for="lastName">Last Name:</label>
								<div class="col-sm-8">
									<input type="text" class="form-control" id="lastName"
										placeholder="Last Name">
								</div>
							</div>
						
						
							<div class="form-group">
								<label class="control-label col-sm-4" for="email">Email:</label>
								<div class="col-sm-8">
									<input type="email" class="form-control" id="email"
										placeholder="Enter email">
								</div>
							</div>
							
							<div class="form-group">
								<label class="control-label col-sm-4" for="mobile">Mobile:</label>
								<div class="col-sm-8">
									<input type="text" class="form-control" id="mobile"
										placeholder="Mobile">
								</div>
							</div>
							
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-info" data-dismiss="modal">Save</button>
						<button type="button" class="btn btn-info" data-dismiss="modal">Cancel</button>
					</div>
				</div>

			</div>



		</div>
</body>
</html>

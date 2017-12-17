var app = angular.module('myDashboard', []);

app.factory("userService", function ($http) {
    var crudService = {};
    crudService.getAll = function () {
    	 var promise = $http({
             method: 'GET',
             url: 'usermgmt/getUsers'
            })
             .then(function (response) {
             	 return response.data.payload;
             },
             function (response) {       	
             });	
        return promise;
    };


});

	app.controller('myCtrl',[ '$scope','$http',function($scope,$http) {
	$scope.form={};
	$scope.userList ={};
    $scope.firstName = "John";
    $scope.lastName = "Doe";
    $scope.show = function(){
		 var promise = $http({
            method: 'GET',
            url: 'usermgmt/getUsers'
           })
            .then(function (response) {
            	 $scope.userList = response.data.payload;
            },
            function (response) {       	
            });	 		
    };
    
    
    $scope.addUser = function(){
		 var promise = $http({
	            method: 'GET',
	            url: 'usermgmt/getUsers'
	           })
	            .then(function (response) {
	            	 $scope.userList = response.data.payload;
	            },
	            function (response) {       	
	            });	 		
	    };
    $scope.show();
   
    
}]);
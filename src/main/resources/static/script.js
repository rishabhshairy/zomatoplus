
var app = angular.module("app", [ "ngRoute" ]);

app.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/home', {
		templateUrl : 'home1.html'
	});
	$routeProvider.when('/restaurants', {
		templateUrl : 'restaurant.html',
		controller : 'restaurantCtrl'
	});
	$routeProvider.when('/items', {
		templateUrl : 'items.html',
		controller : 'itemsCtrl'
	});
	$routeProvider.when('/signup',{
		templateUrl: 'user.html',
		controller: 'userCtrl'
	});
	$routeProvider.when('/userLogin',{
		templateUrl:'login.html',
		controller: 'loginCtrl'
	});
	$routeProvider.otherwise({
		redirectTo : '/home'
	});
} ]);

app.controller("restaurantCtrl", function($scope, $http) {

	$scope.fetchRestaurant = function() {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/restaurant/getAll'
		}).success(function(data, status) {
			console.log(data);
			$scope.status = status;
			$scope.restaurants = data;
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};
	
	
	$scope.saveRestaurant = function() {
		$http({
			method : 'POST',
			url : 'http://localhost:8080/restaurant/create',
			headers: { 'Content-Type': 'application/json' },
			data:$scope.restaurant
		}).success(function(data, status) {
			console.log(data);
			$scope.fetchRestaurant();
			$scope.restaurants = data;
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};

});

app.controller("itemsCtrl", function($scope, $http) {

	$scope.saveItem=function () {
		/* body... */
		$http({
			method: 'POST',
			url : 'http://localhost:8080/restaurant/addItems',
			headers:{'Content-Type':'application/json'},
			data:$scope.item

		}).success(function (data,status) {
			/* body... */
			console.log(data);
			$scope.fetchItem();
			$scope.items=data;
		}).error(function (data,status) {
			/* body... */
			$scope.status=status;
			$scope.data="Request Failed";

		});
	};

		$scope.fetchItem = function() {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/restaurant/allItems'

		}).success(function(data, status) {
			console.log(data);
			$scope.status = status;
			$scope.items = data;
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});

	};
	

	
	

})
//controller for user data

app.controller("userCtrl",function ($scope,$http) {
	/* body... */
	$scope.saveUser=function () {
		/* body... */
		$http({
		method:'POST',
		url:'http://localhost:8080/user/create',
		header :{'contentType':'application/json'}
		,data:$scope.user

	}).success(function (data ,status) {
		/* body... */
		console.log(data);
		$scope.fetchUser()
		$scope.users=data;
	}).error(function (data,status) {
		/* body... */
		$scope.status=status;
		$scope.data="Request Failed";
	})
	};

	$scope.fetchUser=function () {
		/* body... */
		$http({
			method:'GET',
			url:'http://localhost:8080/user/all'

		}).success(function (data,status) {
			/* body... */
			console.log(data);
			$scope.status=status;
			$scope.users=data;

		}).error(function (data,status) {
			/* body... */
			$scope.status=status;
			$scope.data="Request Failed";
		})
	};

	
})

app.controller("loginCtrl", function($scope,$http){
	
	$scope.logIn=function () {
		$http({
			method:'POST',
			url:'http://localhost:8080/user/login',
			headers:{'contentType':'application/json'},
			data:$scope.log
		}).success(function (data,status) {
			/* body... */
			if (data) {
				alert("login Succesfull");
				$scope.log=data;
			} else{
				alert("Please Sign Up!!")
			};
		}).error(function (data,status) {
			/* body... */
			$scope.status=status;
			$scope.data="Request Failed";
		})

	};
})
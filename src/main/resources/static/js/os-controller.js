appCliente.controller("osController", function ($scope, $http) { 
	
	$scope.lista =[];
	$scope.os = {};  
	
	
	$scope.carregarLista = function(){
		$http({method:'GET', url:'http://localhost:8080/TaskManager/os'})
		.then(function (response){
				console.log(response.data);
				console.log(response.status);
				$scope.lista = response.data._embedded.os;
			  }, 
			  function(response){
				console.log('Deu erro!');
		});
	};
	$scope.salvarOs = function(){
		$http({method:'POST', url:'http://localhost:8080/TaskManager/os', data:$scope.os})
		.then(function (response){
				$scope.lista.push(response.data);
			  }, 
			  function(response){
				console.log('Deu erro!');
		});
	};
	
	$scope.carregarLista();
});
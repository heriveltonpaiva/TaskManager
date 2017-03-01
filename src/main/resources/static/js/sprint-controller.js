appCliente.controller("sprintController", function ($scope, $http) { 
	
	$scope.lista =[];
	$scope.sprint = {};  
	$scope.dataInicio = '';
	$scope.dataFinal = '';
	$scope.carregarLista = function(){
		$http({method:'GET', url:'http://localhost:8080/TaskManager/sprint'})
		.then(function (response){
				console.log(response.data);
				console.log(response.status);
				$scope.lista = response.data._embedded.sprint;
			  }, 
			  function(response){
				console.log('Deu erro!');
		});
	};
	$scope.salvarSprint = function(){
		
		 var day = $scope.dataInicio.substring(0,2);
		 var month = $scope.dataInicio.substring(2,4);
		 var year = $scope.dataInicio.substring(4,8);
		
		 var dayEnd = $scope.dataFinal.substring(0,2);
		 var monthEnd = $scope.dataFinal.substring(2,4);
		 var yearEnd = $scope.dataFinal.substring(4,8);
		 
		$scope.sprint.dataInicio = new Date(year,month,day);
		$scope.sprint.dataFinal = new Date(yearEnd,monthEnd,dayEnd);
		
		$http({method:'POST', url:'http://localhost:8080/TaskManager/sprint', data:$scope.sprint})
		.then(function (response){
				$scope.lista.push(response.data);
			  }, 
			  function(response){
				  console.log('Deu erro!');
		});
	};
	
	$scope.carregarLista();
});
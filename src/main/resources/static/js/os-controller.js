//criação de controllers

//um controlador recebe o nome, é a função com o que ele faz.
//chave / função anônima estilo Map<Chave, Function> 
// $scope é um objeto angular que precisa ser passado como parametro na função
// $http encapsula o XmlHttpRequest
appCliente.controller("osController", function ($scope, $http) { 
	
	$scope.nome = 'Herivelton';
	$scope.clientes =[];
	$scope.cliente = {};  // <-- Bind com Form o que adicionar aqui será refletido na tela
	
	
	$scope.carregarClientes = function(){
		$http({method:'GET', url:'http://localhost:8080/TaskManager/os'})
		.then(function (response){
				console.log(response.data);
				console.log(response.status);
				$scope.clientes = response.data._embedded.cliente;
			  }, 
			  function(response){
				console.log('Deu erro!');
		});
	};
	$scope.salvarCliente = function(){
		$http({method:'POST', url:'http://localhost:8080/TaskManager/os', data:$scope.cliente})
		.then(function (response){
				$scope.clientes.push(response.data);
			  }, 
			  function(response){
				console.log('Deu erro!');
		});
	};
	
	$scope.excluirCliente = function (cliente) {
		$http({method:'DELETE', url:'http://localhost:8080/TaskManager/os/'+cliente.id})
		.then(function (response){
				pos = $scope.clientes.indexOf(cliente);
				$scope.clientes.splice(pos, 1);
			  }, 
			  function(response){
				console.log('Deu erro!');
		});
    }
	
	$scope.alterarCliente = function (cli) {
		$scope.cliente = angular.copy(cli);
	};
	
	$scope.cancelarAlteracaoCliente = function () {
		$scope.clientes =[];
    }
	
	
	
	$scope.carregarClientes();
});
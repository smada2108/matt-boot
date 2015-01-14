angular.module('ngAppGreetings', []).controller('Drivers', Drivers);

function Drivers($scope, $http) {
    $http.get('http://localhost:8080/drivers').
        success(function(data) {
            $scope.drivers = data;
        });
}
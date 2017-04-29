'use strict';
var app =  angular.module("internal", ['ngRoute']);

app.config(['routeProvider', function($routeProvider){
    $routeProvider.when('/', {
        templateUrl: 'views/login.html',
        controller: 'LoginCtrl',
    });
    // }).when('/user', {
    //     templateUrl: 'views/userForm.html',
    //     controller: 'UserCtrl',
    // }).when('/teacher', {
    //     templateUrl: 'views/teacherForm.html',
    //     controller: 'TeacherCtrl',
    // }).when('/frequency', {
    //     templateUrl: 'views/frequencyForm.html',
    //     controller: 'FrequencyCtrl',
    // }).when('/lesson', {
    //     templateUrl: 'views/lessonForm.html',
    //     controller: 'LessonCtrl',
    // });
    

}]);

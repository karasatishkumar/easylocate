// Filename: router.js
define(['backbone'], function(Backbone){
  var Router = Backbone.Router.extend({
    routes: {
    	'/student/add' : 'addStudents',
    	'/students' : 'showStudents',
    	'' : 'showStudents',
    	'*action' : 'showStudents'	
    },
    initialize: function(){
      Backbone.history.start(); 
    }
  });
  return Router;
});

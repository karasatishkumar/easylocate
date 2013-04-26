define([ 'backbone' ], function(Backbone) {
	var Student = Backbone.Model.extend({
		urlRoot: 'http://localhost:8080/studentservice/student',
		defaults : {
			rollNo : '123654',
			name : 'Kara Satish Kumar',
			standard : '1st'
		},
		initialize : function() {
			
		},
	});
	return Student;
});
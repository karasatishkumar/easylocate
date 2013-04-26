define(['backbone', '../models/Student'], function(Backbone, Student) {
	var Students = Backbone.Collection.extend({
        model: Student
    });
	return Student;
});
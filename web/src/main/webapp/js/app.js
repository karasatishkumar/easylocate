//Filename: MenuView.js

define([ 'collections/Students','views/MenuView', 'views/HeaderView', 'router' ], function(Students, MenuView,
		HeaderView, Router) {
	var initialize = function() {
		var appRouter = new Router();
		var menuView = new MenuView();
		var headerView = new HeaderView();
		var students = new Students();
		alert(students.attributes);

	}
	return initialize;
});

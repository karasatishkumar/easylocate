//Filename: HeaderView.js

define([ 'backbone', 'text!../../templates/header.tmpl' ], function(Backbone,
		headerTemplate) {
	var HeaderView = Backbone.View.extend({

		template : _.template(headerTemplate),
		el : $('div.page-header'),
		initialize : function() {
			this.render();
		},
		events : {
			'click a#blog' : 'navigateBlog',
			'click a#github' : 'navigateGitHub',
			'click a#login' : 'showLoginWindow',
			'click a#register' : 'showRegisterWindow',
		},

		render : function() {
			$(this.el).html(this.template());
		},

		navigateBlog : function() {
			window.open("http://www.techiekernel.com");
		},
		
		navigateGitHub : function() {
			window.open("https://github.com/karasatishkumar");
		}
	});
	return HeaderView;
});
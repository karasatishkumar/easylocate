//Filename: MenuView.js

define(['backbone', 'text!../../templates/menu.tmpl'], function(Backbone, menuTemplate){
	  var HeaderView = Backbone.View.extend({

		template : _.template(menuTemplate),
		el: $('div.menu'),
		initialize : function() {
			//Var headtmpl =$("#headtmpl").html();
			//this.template=headTemplString;
			this.render();
		},
		
		render : function() {
			$(this.el).html(this.template());
		}
	});
	return HeaderView;
});
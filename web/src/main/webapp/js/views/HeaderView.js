//Filename: HeaderView.js

define(['backbone', 'text!../../templates/header.tmpl'], function(Backbone, headerTemplate){
	  var HeaderView = Backbone.View.extend({

		template : _.template(headerTemplate),
		el: $('div.head'),
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
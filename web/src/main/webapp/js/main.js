// Filename: main.js

require.config({
   shim: {
        'underscore': {
            exports: '_'
        },
        'jquery':{
            exports: 'jquery'
        },
        'backbone': {
            deps: ['underscore', 'jquery'],
            exports: 'Backbone'
        }
   },
  paths: {
    jquery: 'libs/jquery-1.9.1',
    underscore: 'libs/underscore-min',
    backbone: 'libs/backbone-min',
    text:'libs/text'
  }

});

require(['app'], function(App){
	$('document').ready(function(){
	  App();
	});
});
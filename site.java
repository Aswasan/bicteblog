$(function() {

	// // Parallax Background Image
	var lFollowX = 0,
    lFollowY = 0,
    x = 0,
    y = 0,
    friction = 1 / 35;

	function moveBackground() {
		x += (lFollowX - x) * friction;
		y += (lFollowY - y) * friction;

		translate = 'translate(' + x + 'px, ' + y + 'px) scale(1.1)';

		$('.hero-bg').css({
			'-webit-transform': translate,
			'-moz-transform': translate,
			'transform': translate
		});

		window.requestAnimationFrame(moveBackground);
	}

	$(window).on('mousemove click', function(e) {

		var lMouseX = Math.max(-100, Math.min(100, $(window).width() / 2 - e.clientX));
		var lMouseY = Math.max(-100, Math.min(100, $(window).height() / 2 - e.clientY));
		lFollowX = (-10 * lMouseX) / 100; // 100 : 12 = lMouxeX : lFollow
		lFollowY = (-5 * lMouseY) / 100;
	});

	moveBackground();
	
	
	// Portfolio Box Expand
	
	
	
	
	// jQuery for page scrolling feature - requires jQuery Easing plugin
	$('a.page-scroll').bind('click', function(event) {
		var $anchor = $(this);
		$('html, body').stop().animate({
			scrollTop: ($($anchor.attr('href')).offset().top - 79)
		}, 1250, 'easeInOutExpo');
		event.preventDefault();
	});
	
	

	// // Highlight the top nav as scrolling occurs
	$('body').scrollspy({
		target: "#myNav",
		offset: 80
	});

	
	
	// Fixed Nav Menu Navbar Shrink on Scroll

	
	
	// Closes the Responsive Menu on Menu Item Click
	$('.navbar-collapse ul li a:not(.dropdown-toggle)').click(function() {
		$('.navbar-toggle:visible').click();
	});

	
	
	// Skills Bars Animation
	setTimeout(function() {
		$('#html-percent').html('100%');
	}, 2800);

	setTimeout(function() {
		$('#css-percent').html('90%');
	}, 3500);

	setTimeout(function() {
		$('#javascript-percent').html('50%');
	}, 4200);
	
	setTimeout(function() {
		$('#git-percent').html('70%');
	}, 4200);

	setTimeout(function() {
		$('#php-percent').html('35%');
	}, 4900);

	setTimeout(function() {
		$('#nodejs-percent').html('25%');
	}, 5600);
	
	setTimeout(function() {
		$('#wordpress-percent').html('65%');
	}, 5600);

	
	
	// Fit Text Plugin for Main Header
	// $("h1").fitText(
	// 	1.2, {
	// 		minFontSize: '35px',
	// 		maxFontSize: '65px'
	// 	}
	// );

	// // Offset for Main Navigation
	// $('#mainNav').affix({
	// 	offset: {
	// 		top: 100
	// 	}
	// })
	
	
	
	// Touch Events
	function onTouch(evt) {
  evt.preventDefault();
  if (evt.touches.length > 1 || (evt.type == "touchend" && evt.touches.length > 0))
    return;

  var newEvt = document.createEvent("MouseEvents");
  var type = null;
  var touch = null;

  switch (evt.type) {
    case "touchstart": 
      type = "mousedown";
      touch = evt.changedTouches[0];
      break;
    case "touchmove":
      type = "mousemove";
      touch = evt.changedTouches[0];
      break;
    case "touchend":        
      type = "mouseup";
      touch = evt.changedTouches[0];
      break;
  }

  newEvt.initMouseEvent(type, true, true, evt.originalTarget.ownerDocument.defaultView, 0,
    touch.screenX, touch.screenY, touch.clientX, touch.clientY,
    evt.ctrlKey, evt.altKey, evt.shiftKey, evt.metaKey, 0, null);
  evt.originalTarget.dispatchEvent(newEvt);
	}
	


	// Initialize WOW.js Scrolling Animations
	new WOW().init();

});
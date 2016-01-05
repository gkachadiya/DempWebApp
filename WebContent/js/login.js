$(document).ready(function() {

			//validation rules
			//by default it will append a <label class="error> element to the invalid input
			//and will add a "error" class to the input
			$("#login").validate({
				rules : {
					"login-email" : {
						required : true,
						email : true
					},
					"login-password" : {
						required : true,
						minlength : 5
					}
				}
			});
		});
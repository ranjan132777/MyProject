<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<div class="container">
		<div class="card">
			<div class="card-header">
				<h3>Welcome to OrderMethod Register Page</h3>
			</div>
			<div class="card-body">
				<form action="#" method="POST">

					<div class="row">
						<div class="col-4">
							<label>Order Mode </label>
						</div>
						</div>
						
						<div class="col-4">
							<input type="radio" name="Ordermode" id="Ordermode1" value="Sale" />Sale
							<input type="radio" name="Ordermode" id="Ordermode1"
								value="Purchase" />Purchase
						</div>
						<div class="col-4">
							<span id="OrdermodeError"></span>
						</div>

						<div class="row">
							<div class="col-4">
								<label for="orderCode"> Order Code </label>
							</div>


							<div class="col-4">
								<input type="text" name="orderCode" id="orderCode"
									class="form-control" placeholder="Enter order Code" />
							</div>
							<div class="col-4">
								<span id="orderCodeError"></span>
							</div>
						</div>



						<div class="row">
							<div class="col-4">
								<label for="orderMethod">User Order Method</label>
							</div>
							<div class="col-4">
								<select name="orderMethod" id="orderMethod" class="form-control">
									<option value="">-SELECT-</option>
									<option value="FIFO">FIFO</option>
									<option value="LIFO">LIFO</option>
									<option value="FCFO">FCFO</option>
									<option value="FEFO">FEFO</option>
								</select>
							</div>
							<div class="col-4">
								<span id="orderMethodError"></span>
							</div>
						</div>



						<div class="col-4">
							<input type="checkbox" name="orderAccept" value="multi-model" />
							multi-model <input type="checkbox" name="orderAccept"
								value="accept-return" /> accept-return

						</div>
						<div class="col-4">
							<span id="orderAcceptError"></span>
						</div>

						<input type="submit" value="Register" id="register"
							class="btn btn-success" />
				</form>
			</div>
			<div class="card-footer"></div>
		</div>
	</div>




	<script>
$(document).ready(function(){
  $("#orderModeError").hide();
  $("#orderCodeError").hide();
  $("#orderMethodError").hide();
  $("#orderAcceptError").hide();
  
  var orderModeError = false;
  var orderCodeError = false;
  var orderMethodError = false;
  var orderAcceptError = false;
  
	
	
  $('input[type="radio"][name="orderMode"]').change(function(){
	     validate_orderMode();
	  });
	  $("#orderCode").keyup(function(){
	     validate_orderCode();
	  });

	  $("#orderMethod").keyup(function(){
		 validate_orderMethod();
	  });

	  $("#orderAccept").keyup(function(){
	     validate_orderAccept();
	  });

	  function validate_orderMode(){
		    var val=$('input[type="radio"][name="orderMode"]:checked').length;
			//if one radio button is selected then length=1 else length is zero
			if(val==0){
			  $("#orderModeError").show();
		  	  $("#orderModeError").html("Please choose <b>order Method</b>");
		 	  $("#orderModeError").css("color","red");
		 	 orderModeError = false;
			}else{
			  $("#orderModeError").hide();
			  orderModeError = true;
			}
		    return orderModeError;
		  }
	  
	  
	  function validate_orderCode(){
		    var val=$('input[type="radio"][name="orderCode"]:checked').length;
			//if one radio button is selected then length=1 else length is zero
			if(val==0){
			  $("#orderCodeError").show();
		  	  $("#orderCodeError").html("Please choose <b>order Method</b>");
		 	  $("#orderCodeError").css("color","red");
		 	 orderCodeError = false;
			}else{
			  $("#orderCodeError").hide();
			  orderCodeError = true;
			}
		    return orderCodeError;
		  }
	  
	  
	  function validate_orderMethod(){
		    var val=$('input[type="radio"][name="orderMethod"]:checked').length;
			//if one radio button is selected then length=1 else length is zero
			if(val==0){
			  $("#orderMethodError").show();
		  	  $("#orderMethodError").html("Please choose <b>order Method</b>");
		 	  $("#orderMethodError").css("color","red");
		 	 orderMethodError = false;
			}else{
			  $("#orderMethod").hide();
			  orderMethodError = true;
			}
		    return orderModeError;
		  }
	  
	  
	  function validate_orderMethod(){
		    var val=$('input[type="radio"][name="orderMethod"]:checked').length;
			//if one radio button is selected then length=1 else length is zero
			if(val==0){
			  $("#orderMethodError").show();
		  	  $("#orderMethodError").html("Please choose <b>order Method</b>");
		 	  $("#orderMethodError").css("color","red");
		 	 orderMethodError = false;
			}else{
			  $("#orderMethod").hide();
			  orderMethodError = true;
			}
		    return orderModeError;
		  }
	  
	  
	  function validate_orderAccept(){
		    var val=$('input[type="radio"][name="orderAccept"]:checked').length;
			//if one radio button is selected then length=1 else length is zero
			if(val==0){
			  $("#orderAcceptError").show();
		  	  $("#orderAcceptError").html("Please choose <b>order Method</b>");
		 	  $("#orderAcceptError").css("color","red");
		 	 orderAcceptError = false;
			}else{
			  $("#orderAccept").hide();
			  orderAcceptError = true;
			}
		    return orderAcceptError;
		  }
	  
	  
	  function validate_orderCode(){
		    var val=$("#orderCode").val();
			var exp=/^[A-Z]{2,8}$/;
		    if(val==''){
			  $("#orderCodeError").show();
			  $("#orderCodeError").html("Enter <b>User Code</b>");
		   	  $("#orderCodeError").css("color","red");
		   	orderCodeError = false;
			}else if(!exp.test(val)) {
			  $("#orderCodeError").show();
			  $("#orderCodeError").html("Enter <b>Upper Case (2-8)</b> letters only");
		   	  $("#orderCodeError").css("color","red");
		   	orderCodeError = false;
			}else{
			  $("#orderCodeError").hide();
			  orderCodeError = true;
			}
		    return orderCodeError;
		  }
		
	
	
	  function validate_orderMethod(){
		    var val = $("#orderMethod").val();
			if(val==''){
			  $("#orderMethodError").show();
			  $("#orderMethodError").html("Choose <b>Order Method </b>");
		  	  $("#orderMethodError").css("color","red");
		  	orderMethodError = false;
			}else{
		      $("#orderMethod").hide();
		      orderMethodError = true;
	
		      function validate_orderAccept(){
				    var val = $("#orderAccept").val();
					if(val==''){
					  $("#orderAcceptError").show();
					  $("#orderAcceptError").html("Choose <b>Order Method </b>");
				  	  $("#orderAcceptError").css("color","red");
				  	orderAcceptError = false;
					}else{
				      $("#orderMethod").hide();
				      orderAcceptError = true;
			
			
	
				      // **************on click submit button****************
				      $("#register").click(function(){
				         	orderModeError = false;
				  		orderCodeError = false;
				          orderMethodError = false;
				          orderAcceptError = false;
				         
				  		validate_orderMode();
				          validate_orderCode();
				  		validate_orderMethod();
				  		validate_orderAccept();
				  		
				  		if(orderModeError && orderCodeError &&  orderMethodError && orderAcceptError)
				  		  return true;
				          else 
				  		  return false;

				  	});
				      // ******************  (^^)  **************************
				    

				  });
				  </script>
</body>
</html>


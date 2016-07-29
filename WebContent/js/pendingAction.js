/**
 * 
 */
$(document).ready(function(){
	 $( "#accordion" ).accordion();
     $('.buttonLink').click(function (event) {
    	 	

    	 	var id = $("#commentInterview").val();	 

    	 	var score=$('.score').val();

    	 	

    	 	var idItem = $('.score').attr('id');

    	 	

    	 	var appid = idItem.substring(14);	

    	 	

    	 	var typeItem=$('.score').attr('name');

    	 	var type=typeItem.substring(14);

    	 	

    	 	var dataString ='commentInterview='+ id +'&score=' + score +'&appid=' + appid +'&type=' + type;

    	 	
			 $.ajax({  
				    type: "POST",  
				    url: "CommentSubmit",
	             data: dataString,
	             success: function(data){
	               }                
			 });		 		 
	 });
});
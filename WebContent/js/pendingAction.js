/**
 * 
 */
$(document).ready(function(){
	 $( "#accordion" ).accordion();
     $('.buttonLink').click(function (event) {
    	 	
    	 	var id = $("#commentInterview").val();	 

    	 	

    	 	var dataString ='commentInterview='+ id;
    	 	
    	 	$.ajax({  
 			    type: "POST",  
 			    url: "CommentSubmit",
            data: dataString,
            success: function(data){   
                
              }                
 			  });
 		
 	 
 	 
 });
     
     $('.match').click(function (event) {
 	 	
 	 	var idItem = $(this).attr('id');	 
 	 	var id = idItem.substring(5);	
 	 	

 	 	var dataString ='jobid='+ id;
 	 	
 	 	$.ajax({  
			    type: "POST",  
			    url: "ViewApplications",
         data: dataString,
         success: function(data){   
             
           }                
			  });
		
	 
	 
});  
     
});
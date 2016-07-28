/**
 * 
 */
$(document).ready(function(){
	 $( "#accordion" ).accordion();
     $('.buttonLink').click(function (event) {
			 var id = $("#commentInterview").val();			 
			 var score=document.getElementsByClassName("score").val();
			 alert("score= "+score);
			 var idItem = document.getElementsByClassName("score").attr('id');
			 var appid = idItem.substring(14);	
			 alert("appid= "+appid);
			 var typeItem=document.getElementsByClassName("score").attr('name');
			 var type=typeItem.substring(14);
			 alert("type= "+type);
			 var dataString ='commentInterview='+ id "&score=" + score "&appid=" + appid "&type=" + type;
			 
			 $.ajax({  
				    type: "POST",  
				    url: "CommentSubmit",
	             data: dataString,
	             success: function(data){
	               }                
			 });		 		 
	 });
});
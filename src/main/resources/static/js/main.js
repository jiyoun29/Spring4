alert("테스트");


$.ajax({
    url :
    success : function(re){
        $("#pbox").html(re);
    }
});
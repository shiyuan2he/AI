var chat = {
    doChat : function() {
        $.ajax({
            url: base + '/chat/chat.do',
            type: 'post',
            dataType:'json',
            data: {"content":$("#content").val()},
            async: false,
            beforeSend: function() {},
            success: function(json){
                console.log(json) ;
            },
            error: function(error){
                console.log(error);
            }
        });
    }
}
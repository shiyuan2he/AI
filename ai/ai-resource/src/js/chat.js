
var chat = {
    doChat : function () {
        var date = new Date();
        var requestBodyBean = {
            key: '',
            requestTime: date.getTime(),
            param: {
                chatInfo: $('#chatInfo').val()
            }
        };
        $.ajax({
            url: base + '/chat/chat.do',
            type: 'post',
            contentType:'application/json;charset=UTF-8',
            dataType: 'json',
            data: JSON.stringify(requestBodyBean),
            async: true,
            beforeSend: function () {},
            success: function (json) {
                if (json.success) {
                    $("#chatContent").append("<li>"+json.data+"</li> <br/>")
                }
            },
            error: function (error) {
                console.log(error);
            }
        });
    }
}
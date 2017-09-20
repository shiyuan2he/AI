$(function () {
    // 点击登录按钮
    $('#getCode').click(function () {
        login.getCode();
    });
    // 回车事件
    /*$('#username, #password').keypress(function (event) {
     if (13 == event.keyCode) {
     login.doLogin();
     }
     });*/
});


var login = {
    doLogin: function () {
        var date = new Date();
        var jsonstr = {
            key: '',
            requestTime: date.getTime(),
            param: {
                tel: $('#tel').val(),
                code: $('#code').val()
            }
        };
        jsonstr = JSON.stringify(jsonstr) ;
        console.log(jsonstr) ;
        $.ajax({
            url: base + '/sso/login.do',
            type: 'post',
            contentType:'application/json;charset=UTF-8',
            dataType:'json',
            data: jsonstr,
            async: true,
            beforeSend: function () {},
            success: function (jsonStr) {
                console.log(jsonStr);
                if (jsonStr.success) {
                    window.location.href = base + '/chat/chatView.do';
                } else {
                    alert(jsonStr.msg);
                }
            },
            error: function (error) {
                console.log(error);
            }
        });
    },
    getCode: function () {
        $.ajax({
            url: base + '/code/getCode.do',
            type: 'post',
            dataType: 'json',
            data: {},
            async: false,
            beforeSend: function () {
            },
            success: function (json) {
                console.log(json);
                if (json.success) {
                    $('#code').val(json.data);
                } else {
                    alert(json.msg);
                }
            },
            error: function (error) {
                console.log(error);
            }
        });
    }
}
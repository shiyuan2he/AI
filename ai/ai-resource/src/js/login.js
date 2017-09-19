$(function() {
    // 点击登录按钮
    $('#getCode').click(function() {
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
    judgeLoginOrNot : function() {
        if($('#code').val() == $('#hiddenInput').val()){
            return true ;
        }
        return false ;
    },
    doLogin : function() {
       $('#loginForm').submit() ;
    },
    getCode : function() {
        $.ajax({
            url: base + '/code/getCode.do',
            type: 'post',
            dataType:'json',
            data: {},
            async: false,
            beforeSend: function() {

            },
            success: function(json){
                console.log(json) ;
                if (json.success) {
                    $('#code').val(json.data) ;
                    $('#hiddenInput').val(json.data) ;
                } else {
                    alert(json.msg);
                }
            },
            error: function(error){
                console.log(error);
            }
        });
    }
}
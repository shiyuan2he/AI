/**
 * Created by Administrator on 2017/7/17.
 */
$(function(){
    /*演出信息*/
    $(".whole-sh .aselect").click(function(){
        $(".show-layer-za").show();
        $("#show-day").show();
    });
    $(".month-sh .aselect").click(function(){
        $(".show-layer-za").show();
        $("#show-option").show();
    });
    $(".show-layer a").click(function(){
        $(this).parent().children().removeClass("aselected");
        $(this).addClass("aselected");
        $(this).parent().hide();
        $(".show-layer-za").hide();
    });
    /*订单确认页面*/
    $(".flow-dis-box a").click(function(){
        var aindex=$(this).index();
        $(this).addClass("a-hover");
        $(this).siblings().removeClass("a-hover");
        $(".flow-option").css("display","none");
        $(".flow-option").eq(aindex).css("display","block");
    });
    /*立即购买*/
    $(".buy-payselect span").click(function(){
        if($(this).attr("class")=="spanselected"){
            return;
        }
        else{
            $(this).addClass("spanselected");
            var ahtml=$(this).html();
            var bhtml='<div class="buy-numberoption">'+'<p class="buy-money">'+ahtml+'</p>'+'<p class="buy-moneydetails">'+'<input type="button" value="-">'+'<input type="text" class="input-number"/>'+'<input type="button" value="+">'+'</p>'+'<p class="buy-delete"><img src="images/detele.jpg" alt="" class="delete-img"/></p>'+'</div>'
            $('.buy-number').prepend(bhtml);
        }
    });
    $(".buy-delete").click(function(){
        var ahtml=$(this).parent().find(".buy-money").html();

    })
})

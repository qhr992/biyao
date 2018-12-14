$(function () {
    $(".productInfo").click(function () {
        $(".productInfoView").removeClass("none").siblings(".product_border").addClass("none");
        $(".checkedLine").animate({
            left: '0'
        });
    });
    $(".productReview").click(function () {
        $(".productReviewView").removeClass("none").siblings(".product_border").addClass("none");
        $(".checkedLine").animate({
            left: '130px'
        });
    });
    $(".supplierInfo").click(function () {
        $(".supplierInfoView").removeClass("none").siblings(".product_border").addClass("none");
        $(".checkedLine").animate({
            left: '260px'
        });
    });
    $(".specs_bth").click(function () {
        $(this).addClass("click").siblings().removeClass("click");
    });
    $(".panel-minus").click(function () {
        var number = $(".panel-number").html();
        $(".panel-number").html("");
        if (parseInt(number) <= 1) {
            $(".panel-number").html("1");
            alert("亲!已经是最后一件了");
        } else {
            var newNum = parseInt(number) - 1;
            $(".panel-number").html(newNum);
        }
    });
    $(".panel-add").click(function () {
        var number = $(".panel-number").html();
        $(".panel-number").html("");
        if (parseInt(number) >= 5) {
            $(".panel-number").html("5");
            alert("亲!最多只能购买5件哦..");
        } else {
            var newNum = parseInt(number) + 1;
            $(".panel-number").html(newNum);
        }
    });
})

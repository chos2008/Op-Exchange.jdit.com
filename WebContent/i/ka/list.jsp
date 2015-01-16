<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>这是一种新的支付方式, 为用户提供一种新的支付服务. 它应该是怎样一种服务呢?</title>
<link rel="stylesheet" type="text/css" href="ext/resources/css/ext-all.css"/>

<script type="text/javascript" src="ext/adapter/ext/ext-base.js"></script>
<script type="text/javascript" src="ext/ext-core.js"></script>
<script type="text/javascript" src="ext/ext-all.js"></script>

<script type="text/javascript" src="js/budget/budgetItem_add.js"></script>
<script type="text/javascript" src="js/portal.js"></script>
<style type="text/css">
#header {
    /*
    background: #7F99BE url(images/top1.jpg) repeat-x center;
    */
    /*
    background: #7F99BE url(images/top_title2.jpg) no-repeat right center;
    */
    background: #7F99BE url(images/top_title_bg.jpg) repeat right center;
}
#header2 {
    /*
    background: #7F99BE url(images/top1.jpg) repeat-x center;
    */
    background: url(images/top_title2.jpg) no-repeat right bottom;
}
#header h1 {
    font-size: 16px;
    color: #fff;
    font-weight: normal;
    padding: 5px 10px;
}

</style>
<style type="text/css">
#topMenu
{
float:left;
width:100%;
padding:0;
margin:0;
list-style-type:none;
}
#topMenu li a
{
float:left;
/*width:7em;*/
text-decoration:none;
color:white;
/*background-color:purple;*/
padding: 0px 4px;
border-right:0px solid white;
}
/*#topMenu li a:hover {background-color:#ff3300}*/
#topMenu li {display:inline;}
</style>
<script language="javascript">
<!--
function calljojoo() {
    window.open('http://www.google.cn/','calljojoo','top=0,left=0,width=200,height=600,status=no,resizable=no,scrollbars=no, toolbar=no, menubar=no, location=no');
}
function login() {
    window.open('login.jsp', 'login', 'width=420, height=500');
}

function showLoginForm() {
	var e = document.getElementById('login_form');

	var left = (document.body.clientWidth - e.clientWidth) / 2;
	var top = (document.body.clientHeight - e.clientHeight) / 2;
	left += document.body.scrollLeft;
	top += document.body.scrollTop;
	e.style.left = left;
	e.style.top = top;
	
	var display = e.style.display == 'block';
	if (display == true) {
		e.style.display = 'none';
	} else {
		e.style.display = 'block';
		
	}
}

function calljojoo2() {
	window.open('http://www.google.cn/','_blnak','top=100,left=100,width=200,height=600,status=no,resizable=no,scrollbars=no, toolbar=no, menubar=no, location=no');
}

function register3() {
	window.open('register.jsp','_blnak','top=100,left=100,width=800,height=600,status=no,resizable=no,scrollbars=yes, toolbar=no, menubar=no, location=no, titlebar=no');
}

function calljojoo4() {
	vReturnValue=window.showModalDialog('http://www.google.cn/',[],'dialogWidth:200, dialogHeight:600, center=yes, resizable=yes, status=yes, edge=sunken, help=yes');
}
function register() {
	window.showModalDialog('register.jsp',[],'dialogWidth:200, dialogHeight:600, center=yes, resizable=yes, status=yes, edge=sunken, help=yes');
}
//-->
</script>
</head>
<body topmargin="0" rightmargin="0" bottommargin="0" leftmargin="0" style="margin: 0px; padding: 0px;">
	<div style="width: 100%; height: 26px; background: linear-gradient(-90deg, #FCFCFC 0px, #F5F5F5 100%) repeat scroll 0 0 transparent; border-bottom: 1px solid #DCDCDC;">
		<div style="width: 990px; height: inherit; line-height: 26px; margin: 0px auto;">
			<p style="float: left; height: 14px; line-height: 14px; padding: 6px 0; width: 300px;">
				<a style="display: block; font-size: 12px; height: 14px; line-height: 14px; vertical-align: middle;">
					<i style="font-size: 12px; line-height: 14px; display: block; float: left; height: 14px; margin-right: 4px; width: 14px; background-position: -578px -40px; background-image: url('https://i.alipayobjects.com/e/201305/PrarBa94X.png');"></i>手机版
				</a>
			</p>
			<ul style="list-style-type: none; color: #666666; float: right; padding: 6px 0; position: relative; z-index: 1000;">
				<li style="float: left; line-height: 12px; padding: 1px 15px; font-size: 12px;">
					<a>登录</a>
					<b>-</b>
					<a>注册</a>
				</li>
				<li style="float: left; line-height: 12px; padding: 1px 15px; font-size: 12px;"><a>我的账户</a></li>
				<li style="float: left; line-height: 12px; padding: 1px 15px; font-size: 12px;"><a>帮助中心</a></li>
			</ul>
		</div>
	</div>
	<header style="height: 80px;  background-color: #FFFFFF; width: 100%; display: block; margin: 0; padding: 0;">
		<div style="height: 60px; width: 990px; padding-top: 18px; margin: 0px auto;">
		
		</div>
	</header>
	
	<div style="width: 100%;">
	<div style="width: 990px; height: inherit; line-height: 26px; margin: 0px auto;">
	
	<div style="width: 100%; margin-top: 10px;">
		<div style="width: 100%">
			<div style="height: 14px; line-height: 16px; padding: 9px 10px;; background-color: rgb(239, 240, 241); font-family: tahoma, arial, 'Hiragino Sans GB', 'Microsoft Yahei', 宋体;">
				<h3 style="display: inline;"></h3>
				<div style="display: inline; float: right;"></div>
			</div>
			<div style="width: 100%;">
				<table style="width: 100%;">
					<tr style="line-height: 1.5;">
						<td style="width: 180px; line-height: 1.5;">Ka号</td>
						<td style="line-height: 1.5; word-break: break-all; word-wrap: break-word;">面值</td>
						<td style="line-height: 1.5;">发放时间</td>
						<td style="line-height: 1.5;">逾期时间</td>
						<td style="line-height: 1.5;">详情/激活/使用</td>
					</tr>
				</table>
			</div>
		</div>
	</div>
	
	</div>
	</div>
	<footer style="background-color: #EDEDED; height: 280px; width: 100%; display: block; margin: 0; padding: 0;">
		<div style="background-repeat: repeat-x; height: 20px; width: 100%; background-repeat: repeat-x; height: 20px; width: 100%; background-image: url('https://i.alipayobjects.com/e/201303/2NwD1Q6ihZ.png');">
		
		</div>
	</footer>
</body>
</html>
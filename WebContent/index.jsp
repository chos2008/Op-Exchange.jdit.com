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

<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="js/budget/budgetItem_add.js"></script>
<script type="text/javascript" src="js/portal.js"></script>
<style type="text/css">
body {
	font: 12px/1.5 tahoma,arial,Hiragino Sans GB,宋体;
}

a {
	text-decoration: none;
	color: #666666;
}

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

<script type="text/javascript" src="js/main.js"></script>
<body topmargin="0" rightmargin="0" bottommargin="0" leftmargin="0" style="margin: 0px; padding: 0px;">
	<div style="width: 100%; height: 26px; background: linear-gradient(-90deg, #FCFCFC 0px, #F5F5F5 100%) repeat scroll 0 0 transparent; border-bottom: 1px solid #DCDCDC;">
		<div style="width: 990px; height: inherit; line-height: 26px; margin: 0px auto; border-bottom: 1px solid #DCDCDC;">
			<p style="float: left; height: 14px; line-height: 14px; padding: 6px 0; width: 300px;">
				<a style="display: block; font-size: 12px; height: 14px; line-height: 14px; vertical-align: middle;">
					<i style="font-size: 12px; line-height: 14px; display: block; float: left; height: 14px; margin-right: 4px; width: 14px; background-position: -578px -40px; background-image: url('https://i.alipayobjects.com/e/201305/PrarBa94X.png');"></i>手机版
				</a>
			</p>
			<ul style="list-style: none outside none; color: #666666; float: right; padding: 6px 0; position: relative; z-index: 1000;">
				<li style="line-height: 12px;border: 1px solid transparent; padding: 1px 15px; font-size: 12px; float: left;">
					<a href="recharge.jsp">登录</a>
					<b>-</b>
					<a href="recharge.jsp">注册</a>
				</li>
				<li id="menuitem-i" style="line-height: 12px; padding: 1px 15px; border: 1px solid transparent; border-left: 1px solid #E2E2E2; border-right: 1px solid #E2E2E2; position: relative; float: left;">
					<a href="i.do" style="text-decoration: none; color: #666666;">我的账户</a>
					<i style="background-position: -592px -40px; display: inline-block; height: 12px; line-height: 10px; overflow: hidden; vertical-align: middle; width: 12px; background-image: url('https://i.alipayobjects.com/e/201305/PrarBa94X.png');"></i>
					<ul id="menuitem-i-sub" style="background-color: #FFFFFF; list-style: none outside none; margin: 0; padding: 0; font-size: 12px; display: none;">
						<li><a href="recharge.jsp">充值</a></li>
						<li><a>交易记录</a></li>
						<li><a href="transfer.jsp">转账</a></li>
						<li><hr></hr></li>
						<li><a href="i.jsp">我的账户</a></li>
					</ul>
				</li>
				<li style="float: left; line-height: 12px; padding: 1px 15px; font-size: 12px;"><a href="javascript: void(0);" style="text-decoration: none; color: #666666;">帮助中心</a></li>
			</ul>
		</div>
	</div>
	
	<script language="javascript">
		$("#menuitem-i").mouseover(function() {
			$(this).css("border", "1px solid #CCCCCC");
			$(this).css("border-bottom", "1px solid #E2E2E2");
			//$(this).css("background-color", "#FFFFFF");
			$(this).css("padding-top", "3px");
			//$(this).css("top", "-3px");
			$("#menuitem-i-sub").css("display", "block");
		});
		$("#menuitem-i").mouseout(function() {
			$(this).css("border", "1px solid #E2E2E2");
			$(this).css("border-bottom", "0px solid transparent");
			$(this).css("border-top", "0px solid transparent");
			//$(this).css("background", "");
			$(this).css("padding-top", "3px");
			//$(this).css("top", "-3px");

			$("#menuitem-i-sub").css("display", "none");
		});
	</script>
	<header style="height: 80px;  background-color: #FFFFFF; width: 100%; display: block; margin: 0; padding: 0;">
		<div style="height: 60px; width: 990px; padding-top: 18px; margin: 0px auto;">
		
		</div>
	</header>
	<div style="background-color: #F9F9F9; border-bottom: 1px solid #FFFFFF; margin: 0 auto; min-width: 990px; overflow: hidden; position: relative; width: 100%; z-index: 100;">
		<ul style="width: 100%; height: 400px;">
			<li style="left: 0; opacity: 1; top: 0; z-index: 0; height: 400px;">
				<div style="background-position: 50% 50%; background-repeat: no-repeat; height: 100%; left: 0; opacity: 1; overflow: hidden; position: absolute; text-align: center; top: 0; transition: opacity 800ms ease-in-out 0s; vertical-align: middle; width: 100%; background-image: url('https://i.alipayobjects.com/e/201305/F4knLnqWL_src.jpg');">
				</div>
				<div style="width: 990px; height: 100%; margin: 0px auto; position: relative;">
				
				</div>
			</li>
		</ul>
	</div>
	<div id="header" style="margin: 0px; padding: 0px; float: right; width: 100%">
		<div id="header2" style="margin: 0px; padding: 0px; height: 60px">
			<ul id="topMenu">
			<li>
			<a href="#">
				<div align="center">
				<img src='images/IMG_0015.jpg' width="40" height="40" 
	                alt='圈子Logo' title='音乐推荐，津津乐道: 只谈音乐' /><br/>
	            <font style="font-size: x-small;">我的</font>
	            </div>
	        </a>
	        </li>
			<li>
			<a href="#">
				<div align="center">
				<img src='images/IMG_0015.jpg' width="40" height="40" 
	                alt='圈子Logo' title='音乐推荐，津津乐道: 只谈音乐' /><br/>
	            <font style="font-size: x-small;">系统消息</font>
	            </div>
	        </a>
	        </li>
			<li>
			<a href="#">
				<div align="center">
				<img src='images/IMG_0015.jpg' width="40" height="40" 
	                alt='圈子Logo' title='音乐推荐，津津乐道: 只谈音乐' /><br/>
	            <font style="font-size: x-small;">系统设置</font>
	            </div>
	        </a>
	        </li>
	        <li>
			<a href="#">
				<div align="center">
				<img src='images/IMG_0015.jpg' onclick='showLoginForm();' width="40" height="40" 
	                alt='登录' title='登录' /><br/>
				<!-- 
				<img src='images/IMG_0015.jpg' onclick='_show();' width="40" height="40" 
	                alt='登录' title='登录' /><br/>
	             -->
	            <font style="font-size: x-small;">登录</font>
	            </div>
	        </a>
	        </li>
	        <li>
			<a href="#">
				<div align="center">
				<img src='images/IMG_0015.jpg' onclick='register();' width="40" height="40" 
	                alt='注册' title='注册'/><br/>
	            <font style="font-size: x-small;">注册</font>
	            </div>
	        </a>
	        </li>
	        <li>
			<A href="javascript: calljojoo()">点击测试</a>
	        </li>
	        <li>
			<A href="javascript: login()">登录</a>
	        </li>
	        <li>
			<A href="javascript: calljojoo2()">点击测试2</a>
	        </li>
	        <li>
			<A href="javascript: register3()">注册</a>
	        </li>
	        <li>
			<A href="javascript: calljojoo4()">点击测试4</a>
	        </li>
			</ul>
		</div>
	</div>
	<div id="__center" style="display: block; width: 100%; height: 400px; background-color: blue;">
		
	</div>
	<div id='login_form' align="center" style="border-style: outset; display: none; width: 300px; height: 200px; background-color: window; position: absolute; top: 200px; left: 200px;">
		<div style="background-image: url('images/IMG_0015.jpg'); background-repeat: repeat; width: 100%; height: 50px;"></div>
		<br/>
		<div align="center" style="width: 220px;">
		<form method="post" action="CheckImageServlet">
			<p>
			<label style="float:left; width:60px; color:#6E6E6E; font-size:12px;" for="name">帐户：<em></em></label>
			<input type="text" name="rand" maxlength="6" value="" style="width: 150px;"/>
			<!--
			如果用户不支持javascript ,默认显示的feedback,支持的话，在javascript中设置，每个规则都有对应的出错串
			-->
			<span class='feedback'></span>
			</p>
			
			<p>
			<label style="float:left; width:60px; color:#6E6E6E; font-size:12px;" for="name">密码：<em></em></label>
			<input type="password" name="rand" maxlength="6" value="" style="width: 150px;"/>
			<!--
			如果用户不支持javascript ,默认显示的feedback,支持的话，在javascript中设置，每个规则都有对应的出错串
			-->
			<span class='feedback'></span>
			</p>
			
			<p align="center">
			<input type="submit" value="登录"/>
			<!--
			如果用户不支持javascript ,默认显示的feedback,支持的话，在javascript中设置，每个规则都有对应的出错串
			-->
			</p>
		</form>
		<br/>
		</div>
		<hr>
		<div style="background-repeat: repeat; width: 100%; height: 20px; text-align: right;">忘记密码|<a  href="register.jsp">注册新用户</a></div>
	</div>
	<section style="background-color: #F9F9F9; width: 100%; display: block; margin: 0; padding: 0;">
		<div style="width: 990px; margin: 0px auto;">
			<div style="background-color: #F9F9F9; border-bottom: 1px solid #E6E6E6; height: 160px;">
			
			</div>
			<div style="background-color: #F9F9F9; border-top: 1px solid #FFFFFF; height: 58px; padding: 20px 0;">
				<article style="float: left; height: 55px; margin-right: 90px; position: relative; width: 270px;">
					<i style="display: block; height: 46px; left: 0; position: absolute; top: 3px; width: 46px; background: url('https://i.alipayobjects.com/e/201305/PrarBa94X.png') 0px 0px;"></i>
					<h3 style="background-position: -316px -30px; width: 155px; height: 30px; margin-bottom: 2px; margin-left: 60px;">
						<a href="pay.jsp" onclick="javascript: void(0);" style="text-decoration: none;">获取Ka卡</a>
					</h3>
				</article>
			</div>
		</div>
	</section>
	<footer style="background-color: #EDEDED; height: 280px; width: 100%; display: block; margin: 0; padding: 0;">
		<div style="background-repeat: repeat-x; height: 20px; width: 100%; background-repeat: repeat-x; height: 20px; width: 100%; background-image: url('https://i.alipayobjects.com/e/201303/2NwD1Q6ihZ.png');">
		
		</div>
	</footer>
</body>
</html>
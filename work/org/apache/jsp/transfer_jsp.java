package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class transfer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>这是一种新的支付方式, 为用户提供一种新的支付服务. 它应该是怎样一种服务呢?</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"ext/resources/css/ext-all.css\"/>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"ext/adapter/ext/ext-base.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"ext/ext-core.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"ext/ext-all.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/budget/budgetItem_add.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/portal.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#header {\r\n");
      out.write("    /*\r\n");
      out.write("    background: #7F99BE url(images/top1.jpg) repeat-x center;\r\n");
      out.write("    */\r\n");
      out.write("    /*\r\n");
      out.write("    background: #7F99BE url(images/top_title2.jpg) no-repeat right center;\r\n");
      out.write("    */\r\n");
      out.write("    background: #7F99BE url(images/top_title_bg.jpg) repeat right center;\r\n");
      out.write("}\r\n");
      out.write("#header2 {\r\n");
      out.write("    /*\r\n");
      out.write("    background: #7F99BE url(images/top1.jpg) repeat-x center;\r\n");
      out.write("    */\r\n");
      out.write("    background: url(images/top_title2.jpg) no-repeat right bottom;\r\n");
      out.write("}\r\n");
      out.write("#header h1 {\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    font-weight: normal;\r\n");
      out.write("    padding: 5px 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#topMenu\r\n");
      out.write("{\r\n");
      out.write("float:left;\r\n");
      out.write("width:100%;\r\n");
      out.write("padding:0;\r\n");
      out.write("margin:0;\r\n");
      out.write("list-style-type:none;\r\n");
      out.write("}\r\n");
      out.write("#topMenu li a\r\n");
      out.write("{\r\n");
      out.write("float:left;\r\n");
      out.write("/*width:7em;*/\r\n");
      out.write("text-decoration:none;\r\n");
      out.write("color:white;\r\n");
      out.write("/*background-color:purple;*/\r\n");
      out.write("padding: 0px 4px;\r\n");
      out.write("border-right:0px solid white;\r\n");
      out.write("}\r\n");
      out.write("/*#topMenu li a:hover {background-color:#ff3300}*/\r\n");
      out.write("#topMenu li {display:inline;}\r\n");
      out.write("</style>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("function calljojoo() {\r\n");
      out.write("    window.open('http://www.google.cn/','calljojoo','top=0,left=0,width=200,height=600,status=no,resizable=no,scrollbars=no, toolbar=no, menubar=no, location=no');\r\n");
      out.write("}\r\n");
      out.write("function login() {\r\n");
      out.write("    window.open('login.jsp', 'login', 'width=420, height=500');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function showLoginForm() {\r\n");
      out.write("\tvar e = document.getElementById('login_form');\r\n");
      out.write("\r\n");
      out.write("\tvar left = (document.body.clientWidth - e.clientWidth) / 2;\r\n");
      out.write("\tvar top = (document.body.clientHeight - e.clientHeight) / 2;\r\n");
      out.write("\tleft += document.body.scrollLeft;\r\n");
      out.write("\ttop += document.body.scrollTop;\r\n");
      out.write("\te.style.left = left;\r\n");
      out.write("\te.style.top = top;\r\n");
      out.write("\t\r\n");
      out.write("\tvar display = e.style.display == 'block';\r\n");
      out.write("\tif (display == true) {\r\n");
      out.write("\t\te.style.display = 'none';\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\te.style.display = 'block';\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function calljojoo2() {\r\n");
      out.write("\twindow.open('http://www.google.cn/','_blnak','top=100,left=100,width=200,height=600,status=no,resizable=no,scrollbars=no, toolbar=no, menubar=no, location=no');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function register3() {\r\n");
      out.write("\twindow.open('register.jsp','_blnak','top=100,left=100,width=800,height=600,status=no,resizable=no,scrollbars=yes, toolbar=no, menubar=no, location=no, titlebar=no');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function calljojoo4() {\r\n");
      out.write("\tvReturnValue=window.showModalDialog('http://www.google.cn/',[],'dialogWidth:200, dialogHeight:600, center=yes, resizable=yes, status=yes, edge=sunken, help=yes');\r\n");
      out.write("}\r\n");
      out.write("function register() {\r\n");
      out.write("\twindow.showModalDialog('register.jsp',[],'dialogWidth:200, dialogHeight:600, center=yes, resizable=yes, status=yes, edge=sunken, help=yes');\r\n");
      out.write("}\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body topmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\" leftmargin=\"0\" style=\"margin: 0px; padding: 0px;\">\r\n");
      out.write("\t<div style=\"width: 100%; height: 26px; background: linear-gradient(-90deg, #FCFCFC 0px, #F5F5F5 100%) repeat scroll 0 0 transparent; border-bottom: 1px solid #DCDCDC;\">\r\n");
      out.write("\t\t<div style=\"width: 990px; height: inherit; line-height: 26px; margin: 0px auto;\">\r\n");
      out.write("\t\t\t<p style=\"float: left; height: 14px; line-height: 14px; padding: 6px 0; width: 300px;\">\r\n");
      out.write("\t\t\t\t<a style=\"display: block; font-size: 12px; height: 14px; line-height: 14px; vertical-align: middle;\">\r\n");
      out.write("\t\t\t\t\t<i style=\"font-size: 12px; line-height: 14px; display: block; float: left; height: 14px; margin-right: 4px; width: 14px; background-position: -578px -40px; background-image: url('https://i.alipayobjects.com/e/201305/PrarBa94X.png');\"></i>手机版\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<ul style=\"list-style-type: none; color: #666666; float: right; padding: 6px 0; position: relative; z-index: 1000;\">\r\n");
      out.write("\t\t\t\t<li style=\"float: left; line-height: 12px; padding: 1px 15px; font-size: 12px;\">\r\n");
      out.write("\t\t\t\t\t<a>登录</a>\r\n");
      out.write("\t\t\t\t\t<b>-</b>\r\n");
      out.write("\t\t\t\t\t<a>注册</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li style=\"float: left; line-height: 12px; padding: 1px 15px; font-size: 12px;\"><a>我的账户</a></li>\r\n");
      out.write("\t\t\t\t<li style=\"float: left; line-height: 12px; padding: 1px 15px; font-size: 12px;\"><a>帮助中心</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<header style=\"height: 80px;  background-color: #FFFFFF; width: 100%; display: block; margin: 0; padding: 0;\">\r\n");
      out.write("\t\t<div style=\"height: 60px; width: 990px; padding-top: 18px; margin: 0px auto;\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"width: 100%;\">\r\n");
      out.write("\t<div style=\"width: 990px; height: inherit; line-height: 26px; margin: 0px auto;\">\r\n");
      out.write("\t<div style=\"width: 100%; display: inline-block;\">\r\n");
      out.write("\t\t<div style=\"width: 420px; position: relative; display: inline-block; font-family: tahoma, arial, 'Hiragino Sans GB', 'Microsoft Yahei', 宋体;\">\r\n");
      out.write("\t\t\t<h3 style=\"\">账户余额</h3>\r\n");
      out.write("\t\t\t<div style=\"\">\r\n");
      out.write("\t\t\t\t<strong style=\"color: #4c4c4c; line-height: 40px; font-size: 40px; font-weight: 700; font-family: Arial;\">0.00</strong>元\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"width: 290px;  float: right;\">\r\n");
      out.write("\t\t\t<h3 style=\"\">其他</h3>\r\n");
      out.write("\t\t\t<div style=\"\">\r\n");
      out.write("\t\t\t\t<strong style=\"color: #4c4c4c; line-height: 40px; font-size: 40px; font-weight: 700; font-family: Arial;\">0.00</strong>元\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"width: 100%; margin-top: 10px;\">\r\n");
      out.write("\t\t<div style=\"width: 100%; padding-top: 10px; background-color: #F9F9F9;\">\r\n");
      out.write("\t\t\t<div style=\"width: 100%; padding: 10px 5px; margin-bottom: 10px; display: inline-block;\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li title=\"Ka\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"ka-ka-pay\" type=\"radio\" name=\"ka-pay-type\" checked=\"checked\" style=\"height: 36px; width: 10px; float: left;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"ka-ka-pay\"><span style=\"width: 60px; height: 36px; margin-left: 5px; display: block; float: left; background: url('https://i.alipayobjects.com/combo.png?d=cashier&t=INST_ALIPAY&stamp=1369756800000') 0px 0px no-repeat;\"></span></label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li title=\"银行卡\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"alipay-ka-pay\" type=\"radio\" name=\"ka-pay-type\" disabled=\"disabled\" style=\"height: 36px; width: 10px; float: left;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"alipay-ka-pay\"><span style=\"width: 60px; height: 36px; margin-left: 5px; display: block; float: left; background: url('https://i.alipayobjects.com/combo.png?d=cashier&t=INST_ALIPAY&stamp=1369756800000') 0px 0px no-repeat;\"></span></label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<p style=\"width: 100%; height: 45px; margin-top: 6px;\">\r\n");
      out.write("\t\t\t\t\t<span style=\"width: 160px; height: 45px; line-height: 45px; color: #4C4C4C; float: left; font-family: Arial; font-size: 40px; font-weight: 700;\">Ka账户:</span>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" maxlength=\"16\" style=\"width: 380px; height: 45px; line-height: 45px; color: #4C4C4C; font-family: Arial; font-size: 40px; font-weight: 700;\"/>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p style=\"width: 100%; height: 45px; margin-top: 6px; margin-bottom: 6px;\">\r\n");
      out.write("\t\t\t\t\t<span style=\"width: 160px; height: 45px; line-height: 45px; float: left; color: #4C4C4C; font-family: Arial; font-size: 40px; font-weight: 700;\">金额:</span>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" maxlength=\"16\" style=\"width: 380px; height: 45px; line-height: 45px; color: #4C4C4C; font-family: Arial; font-size: 40px; font-weight: 700;\"/>元\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<div style=\"padding: 20px 15px; background-color: rgb(244, 246, 252);\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"转账\" style=\"height: 31px;\"/>(大写：******圆*角*分)\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"width: 100%; margin-top: 10px;\">\r\n");
      out.write("\t\t<div style=\"width: 100%\">\r\n");
      out.write("\t\t\t<div style=\"height: 14px; line-height: 16px; padding: 9px 10px;; background-color: rgb(239, 240, 241); font-family: tahoma, arial, 'Hiragino Sans GB', 'Microsoft Yahei', 宋体;\">\r\n");
      out.write("\t\t\t\t<h3 style=\"display: inline;\">收支记录</h3>\r\n");
      out.write("\t\t\t\t<div style=\"display: inline; float: right;\">电子对账单</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr style=\"line-height: 1.5;\">\r\n");
      out.write("\t\t\t\t\t\t<td style=\"width: 60px; line-height: 1.5;\">交易时间</td>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"line-height: 1.5; word-break: break-all; word-wrap: break-word;\">淘宝购物-131-2098-4792 上海联通50元快充 上海联通充值卡50元 上海联通手机话费充值</td>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"line-height: 1.5;\">交易金额</td>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"line-height: 1.5;\">交易状态</td>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"line-height: 1.5;\">详情</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"width: 100%; margin-top: 10px;\">\r\n");
      out.write("\t\t<div style=\"width: 100%\">\r\n");
      out.write("\t\t\t<div style=\"height: 14px; line-height: 16px; padding: 9px 10px;; background-color: rgb(239, 240, 241); font-family: tahoma, arial, 'Hiragino Sans GB', 'Microsoft Yahei', 宋体;\">\r\n");
      out.write("\t\t\t\t<h3 style=\"display: inline;\">充值记录</h3>\r\n");
      out.write("\t\t\t\t<div style=\"display: inline; float: right;\">电子对账单</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr style=\"line-height: 1.5;\">\r\n");
      out.write("\t\t\t\t\t\t<td style=\"width: 60px; line-height: 1.5;\">交易时间</td>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"line-height: 1.5; word-break: break-all; word-wrap: break-word;\">淘宝购物-131-2098-4792 上海联通50元快充 上海联通充值卡50元 上海联通手机话费充值</td>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"line-height: 1.5;\">交易金额</td>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"line-height: 1.5;\">交易状态</td>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"line-height: 1.5;\">详情</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"width: 100%; margin-top: 10px;\">\r\n");
      out.write("\t\t<div style=\"width: 100%\">\r\n");
      out.write("\t\t\t<div style=\"height: 14px; line-height: 16px; padding: 9px 10px;; background-color: rgb(239, 240, 241); font-family: tahoma, arial, 'Hiragino Sans GB', 'Microsoft Yahei', 宋体;\">\r\n");
      out.write("\t\t\t\t<h3 style=\"display: inline;\">提现记录</h3>\r\n");
      out.write("\t\t\t\t<div style=\"display: inline; float: right;\">电子对账单</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr style=\"line-height: 1.5;\">\r\n");
      out.write("\t\t\t\t\t\t<td style=\"width: 60px; line-height: 1.5;\">交易时间</td>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"line-height: 1.5; word-break: break-all; word-wrap: break-word;\">淘宝购物-131-2098-4792 上海联通50元快充 上海联通充值卡50元 上海联通手机话费充值</td>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"line-height: 1.5;\">交易金额</td>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"line-height: 1.5;\">交易状态</td>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"line-height: 1.5;\">详情</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<footer style=\"background-color: #EDEDED; height: 280px; width: 100%; display: block; margin: 0; padding: 0;\">\r\n");
      out.write("\t\t<div style=\"background-repeat: repeat-x; height: 20px; width: 100%; background-repeat: repeat-x; height: 20px; width: 100%; background-image: url('https://i.alipayobjects.com/e/201303/2NwD1Q6ihZ.png');\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

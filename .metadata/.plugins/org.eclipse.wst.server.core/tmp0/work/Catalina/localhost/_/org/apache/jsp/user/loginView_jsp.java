/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.55
 * Generated at: 2021-11-16 02:14:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("\t\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"EUC-KR\">\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 참조 : http://getbootstrap.com/css/   참조 -->\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("\t\r\n");
      out.write("\t<!--  ///////////////////////// Bootstrap, jQuery CDN ////////////////////////// -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" >\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" >\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" ></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!--  ///////////////////////// CSS ////////////////////////// -->\r\n");
      out.write("\t<style>\r\n");
      out.write("    \t body >  div.container{ \r\n");
      out.write("        \tborder: 3px solid #D6CDB7;\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    \r\n");
      out.write("    <!--  ///////////////////////// JavaScript ////////////////////////// -->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t\t//============= \"로그인\"  Event 연결 =============\r\n");
      out.write("\t\t$( function() {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#userId\").focus();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//==> DOM Object GET 3가지 방법 ==> 1. $(tagName) : 2.(#id) : 3.$(.className)\r\n");
      out.write("\t\t\t$(\"button\").on(\"click\" , function() {\r\n");
      out.write("\t\t\t\tvar id=$(\"input:text\").val();\r\n");
      out.write("\t\t\t\tvar pw=$(\"input:password\").val();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(id == null || id.length <1) {\r\n");
      out.write("\t\t\t\t\talert('ID 를 입력하지 않으셨습니다.');\r\n");
      out.write("\t\t\t\t\t$(\"#userId\").focus();\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(pw == null || pw.length <1) {\r\n");
      out.write("\t\t\t\t\talert('패스워드를 입력하지 않으셨습니다.');\r\n");
      out.write("\t\t\t\t\t$(\"#password\").focus();\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"form\").attr(\"method\",\"POST\").attr(\"action\",\"/user/login\").attr(\"target\",\"_parent\").submit();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//============= 회원원가입화면이동 =============\r\n");
      out.write("\t\t$( function() {\r\n");
      out.write("\t\t\t//==> DOM Object GET 3가지 방법 ==> 1. $(tagName) : 2.(#id) : 3.$(.className)\r\n");
      out.write("\t\t\t$(\"a[href='#' ]\").on(\"click\" , function() {\r\n");
      out.write("\t\t\t\tself.location = \"/user/addUser\"\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\t\t\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!-- ToolBar Start /////////////////////////////////////-->\r\n");
      out.write("\t<div class=\"navbar  navbar-default\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("        \t<a class=\"navbar-brand\" href=\"/index.jsp\">Model2 MVC Shop</a>\r\n");
      out.write("   \t\t</div>\r\n");
      out.write("   \t</div>\r\n");
      out.write("   \t<!-- ToolBar End /////////////////////////////////////-->\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!--  화면구성 div Start /////////////////////////////////////-->\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<!--  row Start /////////////////////////////////////-->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t<img src=\"/images/logo-spring.png\" class=\"img-rounded\" width=\"100%\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t   \t \t\r\n");
      out.write("\t \t \t<div class=\"col-md-6\">\r\n");
      out.write("\t \t \t\r\n");
      out.write("\t\t \t \t<br/><br/>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"jumbotron\">\t \t \t\r\n");
      out.write("\t\t \t \t\t<h1 class=\"text-center\">로 &nbsp;&nbsp;그 &nbsp;&nbsp;인</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t        <form class=\"form-horizontal\">\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t    <label for=\"userId\" class=\"col-sm-4 control-label\">아 이 디</label>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t      <input type=\"text\" class=\"form-control\" name=\"userId\" id=\"userId\"  placeholder=\"아이디\" >\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t    <label for=\"password\" class=\"col-sm-4 control-label\">패 스 워 드</label>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t      <input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\" placeholder=\"패스워드\" >\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-sm-offset-4 col-sm-6 text-center\">\r\n");
      out.write("\t\t\t\t\t      <button type=\"button\" class=\"btn btn-primary\"  >로 &nbsp;그 &nbsp;인</button>\r\n");
      out.write("\t\t\t\t\t      <a class=\"btn btn-primary btn\" href=\"#\" role=\"button\">회 &nbsp;원 &nbsp;가 &nbsp;입</a>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t   \t </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("  \t \t</div>\r\n");
      out.write("  \t \t<!--  row Start /////////////////////////////////////-->\r\n");
      out.write("  \t \t\r\n");
      out.write(" \t</div>\r\n");
      out.write(" \t<!--  화면구성 div end /////////////////////////////////////-->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
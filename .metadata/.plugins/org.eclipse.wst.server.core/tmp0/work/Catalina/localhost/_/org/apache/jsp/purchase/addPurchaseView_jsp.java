/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.55
 * Generated at: 2021-11-16 02:34:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.purchase;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addPurchaseView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("\r\n");
      out.write(" \t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" >\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" >\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" ></script>\r\n");
      out.write("\r\n");
      out.write("\t<link href=\"/css/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"/css/bootstrap-dropdownhover.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<script src=\"/javascript/bootstrap-dropdownhover.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.13.0/themes/base/jquery-ui.css\">\r\n");
      out.write("\t<script src=\"https://code.jquery.com/ui/1.13.0/jquery-ui.js\"></script> \r\n");
      out.write("\t<style>\r\n");
      out.write("\t  body {\r\n");
      out.write("\t      padding-top : 100px;\r\n");
      out.write("\t  }\r\n");
      out.write("\t</style>\r\n");
      out.write("\r\n");
      out.write("\t<title>?????? ??????</title>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\tfunction fncAddPurchase() {\r\n");
      out.write("\t\t$(\"form\").attr(\"method\",\"POST\").attr(\"action\",\"/purchase/addPurchase\").submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t    $(\"#divyDate\").datepicker({\r\n");
      out.write("\t        dateFormat: 'yy-mm-dd' \r\n");
      out.write("\t    });      \r\n");
      out.write("\t    \r\n");
      out.write("\t    $('#divyDate').datepicker('setDate', 'today');            \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t$(\"a[href='#' ]\").on(\"click\", function() {\r\n");
      out.write("\t\t\t$(\"form\")[0].reset();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"button\").on(\"click\", function() {\r\n");
      out.write("\t\t\tfncAddPurchase();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/layout/toolbar.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"page-header text-center\">\r\n");
      out.write("\t\t\t<h3 class=\" text-info\">?????? ??????</h3>\r\n");
      out.write("\t\t\t<h5 class=\"text-muted\">????????? ????????? <strong class=\"text-danger\">??????</strong>?????????.</h5>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<form class=\"form-horizontal\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"purchaseProd\" class=\"col-sm-offset-1 col-sm-3 control-label\">????????????</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"purchaseProd\" name=\"purchaseProd\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.prodNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" readonly=\"readonly\"> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"prodName\" class=\"col-sm-offset-1 col-sm-3 control-label\">?????????</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.prodName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" readonly=\"readonly\"> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"prodDetail\" class=\"col-sm-offset-1 col-sm-3 control-label\">??????????????????</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.prodDetail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" readonly=\"readonly\"> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"manuDate\" class=\"col-sm-offset-1 col-sm-3 control-label\">????????????</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.manuDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" readonly=\"readonly\"> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"price\" class=\"col-sm-offset-1 col-sm-3 control-label\">??????</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" readonly=\"readonly\"> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"regDate\" class=\"col-sm-offset-1 col-sm-3 control-label\">????????????</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.regDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" readonly=\"readonly\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"buyer\" class=\"col-sm-offset-1 col-sm-3 control-label\">??????????????????</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"buyer\" name=\"buyer\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" readonly=\"readonly\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"paymentOption\" class=\"col-sm-offset-1 col-sm-3 control-label\">????????????</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 \">\r\n");
      out.write("\t\t\t\t\t<select class=\"form-control\" id=\"paymentOption\" name=\"paymentOption\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"1\" selected=\"selected\">????????????</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">????????????</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"receiverName\" class=\"col-sm-offset-1 col-sm-3 control-label\">???????????????</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"receiverName\" name=\"receiverName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"receiverPhone\" class=\"col-sm-offset-1 col-sm-3 control-label\">??????????????????</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"receiverPhone\" name=\"receiverPhone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"divyAddr\" class=\"col-sm-offset-1 col-sm-3 control-label\">???????????????</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"divyAddr\" name=\"divyAddr\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.addr}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"divyRequest\" class=\"col-sm-offset-1 col-sm-3 control-label\">??????????????????</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"divyRequest\" name=\"divyRequest\" placeholder=\"????????????????????? ??????????????????.\"> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"divyDate\" class=\"col-sm-offset-1 col-sm-3 control-label\">??????????????????</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"divyDate\" name=\"divyDate\"/> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t    <div class=\"col-sm-offset-4  col-sm-4 text-center\">\r\n");
      out.write("\t\t\t      <button type=\"button\" class=\"btn btn-primary\"  >??????</button>\r\n");
      out.write("\t\t\t\t  <a class=\"btn btn-primary btn\" href=\"#\" role=\"button\">??????</a>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t    </div>\t\r\n");
      out.write("\t\t    \t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
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

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.55
 * Generated at: 2021-11-16 02:15:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\t<meta charset=\"EUC-KR\">\r\n");
      out.write("\t\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" >\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" >\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" ></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<link href=\"/css/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"/css/bootstrap-dropdownhover.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"/javascript/bootstrap-dropdownhover.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("\t<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<style>\r\n");
      out.write("\t  body {\r\n");
      out.write("\t      padding-top : 50px;\r\n");
      out.write("\t  }\r\n");
      out.write("\t</style>\r\n");
      out.write("\r\n");
      out.write("<title>상품수정</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("function fncAddProduct(){\r\n");
      out.write("\t//Form 유효성 검증\r\n");
      out.write(" \tvar name = $(\"input[name='prodName']\").val();\r\n");
      out.write("\tvar detail = $(\"input[name='prodDetail']\").val();\r\n");
      out.write("\tvar manuDate = $(\"input[name='manuDate']\").val();\r\n");
      out.write("\tvar price = $(\"input[name='price']\").val();\r\n");
      out.write("\r\n");
      out.write("\tif(name == null || name.length<1){\r\n");
      out.write("\t\talert(\"상품명은 반드시 입력하여야 합니다.\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(detail == null || detail.length<1){\r\n");
      out.write("\t\talert(\"상품상세정보는 반드시 입력하여야 합니다.\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(manuDate == null || manuDate.length<1){\r\n");
      out.write("\t\talert(\"제조일자는 반드시 입력하셔야 합니다.\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(price == null || price.length<1){\r\n");
      out.write("\t\talert(\"가격은 반드시 입력하셔야 합니다.\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"form\").attr(\"method\",\"POST\").attr(\"action\",\"/product/updateProduct\").submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t $(\"#manuDate\").datepicker({\r\n");
      out.write("\t\t\t dateFormat: 'yy-mm-dd'\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t$(\"a[href='#']\").on(\"click\", function() {\r\n");
      out.write("\t\t\thistory.go(-1);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"button\").on(\"click\", function() {\r\n");
      out.write("\t\t\tfncAddProduct();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"#ffffff\" text=\"#000000\">\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/layout/toolbar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"page-header text-center\">\r\n");
      out.write("\t    <h3 class=\" text-info\">상품수정</h3>\r\n");
      out.write("\t    <h5 class=\"text-muted\">상품정보를 <strong class=\"text-danger\">최신정보로 관리</strong>해 주세요.</h5>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<form class=\"form-horizontal\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<label for=\"prodName\" class=\"col-sm-offset-1 col-sm-3 control-label\">상품명</label>\r\n");
      out.write("\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t  \t\t<input type=\"text\" class=\"form-control\" id=\"prodName\" name=\"prodName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.prodName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<label for=\"prodDetail\" class=\"col-sm-offset-1 col-sm-3 control-label\">상품상세정보</label>\r\n");
      out.write("\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t  \t\t<input type=\"text\" class=\"form-control\" id=\"prodDetail\" name=\"prodDetail\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.prodDetail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<label for=\"manuDate\" class=\"col-sm-offset-1 col-sm-3 control-label\">제조일자</label>\r\n");
      out.write("\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t  \t\t<input type=\"text\" class=\"form-control\" id=\"manuDate\" name=\"manuDate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.manuDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<label for=\"price\" class=\"col-sm-offset-1 col-sm-3 control-label\">가격</label>\r\n");
      out.write("\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t  \t\t<input type=\"text\" class=\"form-control\" id=\"price\" name=\"price\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<label for=\"fileName\" class=\"col-sm-offset-1 col-sm-3 control-label\">상품이미지</label>\r\n");
      out.write("\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" class=\"form-control\" id=\"fileName\" name=\"fileName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.fileName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t<img src=\"/images/uploadFiles/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.fileName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t  \t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t    <div class=\"col-sm-offset-4  col-sm-4 text-center\">\r\n");
      out.write("\t\t      <button type=\"button\" class=\"btn btn-primary\"  >수정</button>\r\n");
      out.write("\t\t\t  <a class=\"btn btn-primary btn\" href=\"#\" role=\"button\">취소</a>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"prodNo\" name=\"prodNo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.prodNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div>\r\n");
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

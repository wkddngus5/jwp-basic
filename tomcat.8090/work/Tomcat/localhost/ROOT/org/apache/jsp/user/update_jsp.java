/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.15
 * Generated at: 2017-04-07 02:53:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/include/navigation.jsp", Long.valueOf(1491533570000L));
    _jspx_dependants.put("jar:file:/Users/Naver/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("file:/Users/Naver/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar", Long.valueOf(1491359686000L));
    _jspx_dependants.put("/include/header.jsp", Long.valueOf(1491494288000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write(" <head>\n");
      out.write("  ");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>SLiPP Java Web Programming</title>\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("  content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("<link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("\t\t\t<script src=\"//html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("<link href=\"../css/styles.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  ");
      out.write(" \n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-fixed-top header\">\n");
      out.write("    <div class=\"col-md-12\">\n");
      out.write("      <div class=\"navbar-header\">\n");
      out.write("\n");
      out.write("        <a href=\"/\" class=\"navbar-brand\">SLiPP</a>\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle\"\n");
      out.write("          data-toggle=\"collapse\" data-target=\"#navbar-collapse1\">\n");
      out.write("          <i class=\"glyphicon glyphicon-search\"></i>\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbar-collapse1\">\n");
      out.write("        <form class=\"navbar-form pull-left\">\n");
      out.write("          <div class=\"input-group\" style=\"max-width: 470px;\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Search\"\n");
      out.write("              name=\"srch-term\" id=\"srch-term\">\n");
      out.write("            <div class=\"input-group-btn\">\n");
      out.write("              <button class=\"btn btn-default btn-primary\" type=\"submit\">\n");
      out.write("                <i class=\"glyphicon glyphicon-search\"></i>\n");
      out.write("              </button>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("          <li><a href=\"#\" class=\"dropdown-toggle\"\n");
      out.write("            data-toggle=\"dropdown\"><i\n");
      out.write("              class=\"glyphicon glyphicon-bell\"></i></a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("              <li><a href=\"https://slipp.net\" target=\"_blank\">SLiPP</a></li>\n");
      out.write("              <li><a href=\"https://facebook.com\" target=\"_blank\">Facebook</a></li>\n");
      out.write("            </ul></li>\n");
      out.write("          <li><a href=\"../user/list.html\"><i\n");
      out.write("              class=\"glyphicon glyphicon-user\"></i></a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("  <div class=\"navbar navbar-default\" id=\"subnav\">\n");
      out.write("    <div class=\"col-md-12\">\n");
      out.write("      <div class=\"navbar-header\">\n");
      out.write("        <a href=\"#\" style=\"margin-left: 15px;\"\n");
      out.write("          class=\"navbar-btn btn btn-default btn-plus dropdown-toggle\"\n");
      out.write("          data-toggle=\"dropdown\"><i class=\"glyphicon glyphicon-home\"\n");
      out.write("          style=\"color: #dd1111;\"></i> Home <small><i\n");
      out.write("            class=\"glyphicon glyphicon-chevron-down\"></i></small></a>\n");
      out.write("        <ul class=\"nav dropdown-menu\">\n");
      out.write("          <li><a href=\"../user/profile.html\"><i\n");
      out.write("              class=\"glyphicon glyphicon-user\" style=\"color: #1111dd;\"></i>\n");
      out.write("              Profile</a></li>\n");
      out.write("          <li class=\"nav-divider\"></li>\n");
      out.write("          <li><a href=\"#\"><i class=\"glyphicon glyphicon-cog\"\n");
      out.write("              style=\"color: #dd1111;\"></i> Settings</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbar-collapse2\">\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("          ");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  ");
      out.write("\n");
      out.write("  <div class=\"container\" id=\"main\">\n");
      out.write("    <div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("      <div class=\"panel panel-default content-main\">\n");
      out.write("        <form name=\"question\" method=\"post\" action=\"/user/update\">\n");
      out.write("          <input type=\"hidden\" class=\"form-control\" id=\"userId\"\n");
      out.write("            name=\"userId\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"password\">비밀번호</label> <input type=\"password\"\n");
      out.write("              class=\"form-control\" id=\"password\" name=\"password\"\n");
      out.write("              placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.password}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"name\">이름</label> <input class=\"form-control\"\n");
      out.write("              id=\"name\" name=\"name\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"email\">이메일</label> <input type=\"email\"\n");
      out.write("              class=\"form-control\" id=\"email\" name=\"email\"\n");
      out.write("              placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("          </div>\n");
      out.write("          <button type=\"submit\"\n");
      out.write("            class=\"btn btn-success clearfix pull-right\">수정</button>\n");
      out.write("          <div class=\"clearfix\" />\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- script references -->\n");
      out.write("  <script src=\"../js/jquery-2.2.0.min.js\"></script>\n");
      out.write("  <script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"../js/scripts.js\"></script>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("          ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /include/navigation.jsp(61,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty sessionScope.user}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("              <li><a href=\"/user/logout\" role=\"button\">로그아웃</a></li>\n");
        out.write("              <li><a href=\"/user/update\" role=\"button\">개인정보수정</a></li>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("              <li><a href=\"user/login\" role=\"button\">로그인</a></li>\n");
        out.write("              <li><a href=\"user/form.html\" role=\"button\">회원가입</a></li>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.38
 * Generated at: 2020-10-10 17:28:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customLogout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1602305560911L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1602302258925L));
    _jspx_dependants.put("/WEB-INF/views/common/js.jsp", Long.valueOf(1602346927701L));
    _jspx_dependants.put("/WEB-INF/views/common/css.jsp", Long.valueOf(1602346917338L));
    _jspx_dependants.put("/WEB-INF/views/common/loader.jsp", Long.valueOf(1602303431609L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap\" rel=\"stylesheet\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.theme.default.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/magnific-popup.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-timepicker/1.10.0/jquery.timepicker.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/equipo/css/flaticon.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/equipo/css/animate.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/equipo/css/style.css\" />");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("<div class=\"py-3\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row d-flex align-items-start align-items-center px-3 px-md-0\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 d-flex mb-2 mb-md-0\">\r\n");
      out.write("\t\t\t\t\t<a class=\"navbar-brand d-flex align-items-center\" href=\"/\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"flaticon flaticon-road-roller\"></span>\r\n");
      out.write("\t\t\t\t\t\t<span>TT Rental<small>Rental Vehicle</small></span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 d-flex topper mb-md-0 mb-2 align-items-center\">\r\n");
      out.write("\t\t\t\t\t<div class=\"icon d-flex justify-content-center align-items-center\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"fa fa-map\"></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"pr-md-4 pl-md-3 pl-3 text\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"con\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>Free Call</span> <span>+82 000-0000-0000</span>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"con\">Call Us Now 24/7 Customer Support</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 d-flex topper mb-md-0 align-items-center\">\r\n");
      out.write("\t\t\t\t\t<div class=\"icon d-flex justify-content-center align-items-center\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"fa fa-paper-plane\"></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"text pl-3 pl-md-3\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"hr\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>Our Location</span>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"con\">1 ,Cheongwadae-ro Jongno-gu Seoul, Korea</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark ftco-navbar-light\" id=\"ftco-navbar\">\r\n");
      out.write("\t\t<div class=\"container d-flex align-items-center\">\r\n");
      out.write("\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#ftco-nav\" aria-controls=\"ftco-nav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t\t<span class=\"fa fa-bars\"></span> Menu\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"ftco-nav\">\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav m-auto\">\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item active\"><a href=\"/\" class=\"nav-link\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a href=\"/long/list\" class=\"nav-link\">LONGTERM</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a href=\"/short/inlandList\" class=\"nav-link\">SHORTTERM</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a href=\"/user/login\" class=\"nav-link\">LOGIN</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item cta\"><a href=\"contact.html\" class=\"nav-link\">Request A Quote</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<!-- END nav -->\r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("\t<article>\r\n");
      out.write("\t\t<h1>Logout Page</h1>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<form action=\"/customLogout\" method=\"post\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t<button>Logout</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</article>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<footer class=\"ftco-footer\">\r\n");
      out.write("\t<div class=\"container mb-5 pb-4\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-lg col-md-6\">\r\n");
      out.write("\t\t\t\t<div class=\"ftco-footer-widget\">\r\n");
      out.write("\t\t\t\t\t<h2 class=\"ftco-heading-2 logo d-flex align-items-center\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"flaticon-road-roller flaticon\"></span><span>Equipo</span></a>\r\n");
      out.write("\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t<p>Far far away, behind the word mountains, far from the\r\n");
      out.write("\t\t\t\t\t\tcountries.</p>\r\n");
      out.write("\t\t\t\t\t<ul class=\"ftco-footer-social list-unstyled mt-4\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-twitter\"></span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-facebook\"></span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-instagram\"></span></a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-lg col-md-6\">\r\n");
      out.write("\t\t\t\t<div class=\"ftco-footer-widget\">\r\n");
      out.write("\t\t\t\t\t<h2 class=\"ftco-heading-2\">Links</h2>\r\n");
      out.write("\t\t\t\t\t<ul class=\"list-unstyled\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-chevron-right mr-2\"></span>Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-chevron-right mr-2\"></span>About\r\n");
      out.write("\t\t\t\t\t\t\t\tUs</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-chevron-right mr-2\"></span>Rental\r\n");
      out.write("\t\t\t\t\t\t\t\tServices</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-chevron-right mr-2\"></span>Blog</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-chevron-right mr-2\"></span>Contact</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-lg col-md-6\">\r\n");
      out.write("\t\t\t\t<div class=\"ftco-footer-widget\">\r\n");
      out.write("\t\t\t\t\t<h2 class=\"ftco-heading-2\">Services</h2>\r\n");
      out.write("\t\t\t\t\t<ul class=\"list-unstyled\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-chevron-right mr-2\"></span>Customer\r\n");
      out.write("\t\t\t\t\t\t\t\tServices</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-chevron-right mr-2\"></span>Prompt\r\n");
      out.write("\t\t\t\t\t\t\t\tDelivery</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-chevron-right mr-2\"></span>Reliable\r\n");
      out.write("\t\t\t\t\t\t\t\tEquipment</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-chevron-right mr-2\"></span>New\r\n");
      out.write("\t\t\t\t\t\t\t\tHeavy Equipment</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-lg col-md-6\">\r\n");
      out.write("\t\t\t\t<div class=\"ftco-footer-widget\">\r\n");
      out.write("\t\t\t\t\t<h2 class=\"ftco-heading-2\">Have a Questions?</h2>\r\n");
      out.write("\t\t\t\t\t<div class=\"block-23 mb-3\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><span class=\"fa fa-map-marker mr-3\"></span><span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"text\">203 Fake St. Mountain View, San Francisco,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tCalifornia, USA</span></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-phone mr-3\"></span><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"text\">+2 392 3929 210</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-paper-plane mr-3\"></span><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"text\">info@yourdomain.com</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"container-fluid bg-primary py-5\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-12 text-center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<p class=\"mb-0\">\r\n");
      out.write("\t\t\t\t\t<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("\t\t\t\t\tCopyright &copy;\r\n");
      out.write("\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\tdocument.write(new Date().getFullYear());\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\tAll rights reserved | This template is made with <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-heart\" aria-hidden=\"true\"></i> by <a\r\n");
      out.write("\t\t\t\t\t\thref=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\r\n");
      out.write("\t\t\t\t\t<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</footer>");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("<!-- loader -->\r\n");
      out.write("<div id=\"ftco-loader\" class=\"show fullscreen\">\r\n");
      out.write("\t<svg class=\"circular\" style=\"height: 48px;width: 48px;\">\r\n");
      out.write("\t\t<circle class=\"path-bg\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\"\r\n");
      out.write("\t\t\tstroke-width=\"4\" stroke=\"#eeeeee\" />\r\n");
      out.write("\t\t<circle class=\"path\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\"\r\n");
      out.write("\t\t\tstroke-width=\"4\" stroke-miterlimit=\"10\" stroke=\"#F96D00\" /></svg>\r\n");
      out.write("</div>");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-migrate/3.3.1/jquery-migrate.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.5.3/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-animateNumber/0.0.14/jquery.animateNumber.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-timepicker/1.10.0/jquery.timepicker.min.css\"></script>\r\n");
      out.write("<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false\"></script>\r\n");
      out.write("<script src=\"/resources/equipo/js/jquery.waypoints.min.js\"></script>\r\n");
      out.write("<script src=\"/resources/equipo/js/jquery.stellar.min.js\"></script>\r\n");
      out.write("<script src=\"/resources/equipo/js/scrollax.min.js\"></script>\r\n");
      out.write("<script src=\"/resources/equipo/js/google-map.js\"></script>\r\n");
      out.write("<script src=\"/resources/equipo/js/main.js\"></script>");
      out.write("\r\n");
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

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.84
 * Generated at: 2024-03-04 01:53:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1426003893000L));
    _jspx_dependants.put("jar:file:/C:/laptrinhlop/resfulweb/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/heii/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425953470000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("	ustora by freshdesignweb.com\r\n");
      out.write("	Twitter: https://twitter.com/freshdesignweb\r\n");
      out.write("	URL: https://www.freshdesignweb.com/ustora/\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Ustora Demo</title>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Google Fonts -->\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Font Awesome -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsive.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->	\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("   /*\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"mainmenu-area\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div> \r\n");
      out.write("                <div class=\"navbar-collapse collapse\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li class=\"active\"><a href=\"index.html\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"shop.html\">Shop page</a></li>\r\n");
      out.write("                        <li><a href=\"single-product.html\">Single product</a></li>\r\n");
      out.write("                        <li><a href=\"cart.html\">Cart</a></li>\r\n");
      out.write("                        <li><a href=\"checkout.html\">Checkout</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Category</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Others</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Contact</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>  \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> <!-- End mainmenu area -->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"maincontent-area\">\r\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <div class=\"latest-product\">\r\n");
      out.write("                        <h2 class=\"section-title\">Latest Products</h2>\r\n");
      out.write("                        <div class=\"product-carousel\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                           \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> <!-- End main content area -->\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"brands-area\">\r\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <div class=\"brand-wrapper\">\r\n");
      out.write("                        <div class=\"brand-list\">\r\n");
      out.write("                            <img src=\"img/brand1.png\" alt=\"\">\r\n");
      out.write("                            <img src=\"img/brand2.png\" alt=\"\">\r\n");
      out.write("                            <img src=\"img/brand3.png\" alt=\"\">\r\n");
      out.write("                            <img src=\"img/brand4.png\" alt=\"\">\r\n");
      out.write("                            <img src=\"img/brand5.png\" alt=\"\">\r\n");
      out.write("                            <img src=\"img/brand6.png\" alt=\"\">\r\n");
      out.write("                            <img src=\"img/brand1.png\" alt=\"\">\r\n");
      out.write("                            <img src=\"img/brand2.png\" alt=\"\">                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> <!-- End brands area -->\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"product-widget-area\">\r\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <div class=\"single-product-widget\">\r\n");
      out.write("                        <h2 class=\"product-wid-title\">Top Sellers</h2>\r\n");
      out.write("                        <a href=\"\" class=\"wid-view-more\">View All</a>\r\n");
      out.write("                        <div class=\"single-wid-product\">\r\n");
      out.write("                            <a href=\"single-product.html\"><img src=\"img/product-thumb-1.jpg\" alt=\"\" class=\"product-thumb\"></a>\r\n");
      out.write("                            <h2><a href=\"single-product.html\">Sony Smart TV - 2015</a></h2>\r\n");
      out.write("                            <div class=\"product-wid-rating\">\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"product-wid-price\">\r\n");
      out.write("                                <ins>$400.00</ins> <del>$425.00</del>\r\n");
      out.write("                            </div>                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"single-wid-product\">\r\n");
      out.write("                            <a href=\"single-product.html\"><img src=\"img/product-thumb-2.jpg\" alt=\"\" class=\"product-thumb\"></a>\r\n");
      out.write("                            <h2><a href=\"single-product.html\">Apple new mac book 2015</a></h2>\r\n");
      out.write("                            <div class=\"product-wid-rating\">\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"product-wid-price\">\r\n");
      out.write("                                <ins>$400.00</ins> <del>$425.00</del>\r\n");
      out.write("                            </div>                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"single-wid-product\">\r\n");
      out.write("                            <a href=\"single-product.html\"><img src=\"img/product-thumb-3.jpg\" alt=\"\" class=\"product-thumb\"></a>\r\n");
      out.write("                            <h2><a href=\"single-product.html\">Apple new i phone 6</a></h2>\r\n");
      out.write("                            <div class=\"product-wid-rating\">\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"product-wid-price\">\r\n");
      out.write("                                <ins>$400.00</ins> <del>$425.00</del>\r\n");
      out.write("                            </div>                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <div class=\"single-product-widget\">\r\n");
      out.write("                        <h2 class=\"product-wid-title\">Recently Viewed</h2>\r\n");
      out.write("                        <a href=\"#\" class=\"wid-view-more\">View All</a>\r\n");
      out.write("                        <div class=\"single-wid-product\">\r\n");
      out.write("                            <a href=\"single-product.html\"><img src=\"img/product-thumb-4.jpg\" alt=\"\" class=\"product-thumb\"></a>\r\n");
      out.write("                            <h2><a href=\"single-product.html\">Sony playstation microsoft</a></h2>\r\n");
      out.write("                            <div class=\"product-wid-rating\">\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"product-wid-price\">\r\n");
      out.write("                                <ins>$400.00</ins> <del>$425.00</del>\r\n");
      out.write("                            </div>                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"single-wid-product\">\r\n");
      out.write("                            <a href=\"single-product.html\"><img src=\"img/product-thumb-1.jpg\" alt=\"\" class=\"product-thumb\"></a>\r\n");
      out.write("                            <h2><a href=\"single-product.html\">Sony Smart Air Condtion</a></h2>\r\n");
      out.write("                            <div class=\"product-wid-rating\">\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"product-wid-price\">\r\n");
      out.write("                                <ins>$400.00</ins> <del>$425.00</del>\r\n");
      out.write("                            </div>                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"single-wid-product\">\r\n");
      out.write("                            <a href=\"single-product.html\"><img src=\"img/product-thumb-2.jpg\" alt=\"\" class=\"product-thumb\"></a>\r\n");
      out.write("                            <h2><a href=\"single-product.html\">Samsung gallaxy note 4</a></h2>\r\n");
      out.write("                            <div class=\"product-wid-rating\">\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"product-wid-price\">\r\n");
      out.write("                                <ins>$400.00</ins> <del>$425.00</del>\r\n");
      out.write("                            </div>                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <div class=\"single-product-widget\">\r\n");
      out.write("                        <h2 class=\"product-wid-title\">Top New</h2>\r\n");
      out.write("                        <a href=\"#\" class=\"wid-view-more\">View All</a>\r\n");
      out.write("                        <div class=\"single-wid-product\">\r\n");
      out.write("                            <a href=\"single-product.html\"><img src=\"img/product-thumb-3.jpg\" alt=\"\" class=\"product-thumb\"></a>\r\n");
      out.write("                            <h2><a href=\"single-product.html\">Apple new i phone 6</a></h2>\r\n");
      out.write("                            <div class=\"product-wid-rating\">\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"product-wid-price\">\r\n");
      out.write("                                <ins>$400.00</ins> <del>$425.00</del>\r\n");
      out.write("                            </div>                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"single-wid-product\">\r\n");
      out.write("                            <a href=\"single-product.html\"><img src=\"img/product-thumb-4.jpg\" alt=\"\" class=\"product-thumb\"></a>\r\n");
      out.write("                            <h2><a href=\"single-product.html\">Samsung gallaxy note 4</a></h2>\r\n");
      out.write("                            <div class=\"product-wid-rating\">\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"product-wid-price\">\r\n");
      out.write("                                <ins>$400.00</ins> <del>$425.00</del>\r\n");
      out.write("                            </div>                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"single-wid-product\">\r\n");
      out.write("                            <a href=\"single-product.html\"><img src=\"img/product-thumb-1.jpg\" alt=\"\" class=\"product-thumb\"></a>\r\n");
      out.write("                            <h2><a href=\"single-product.html\">Sony playstation microsoft</a></h2>\r\n");
      out.write("                            <div class=\"product-wid-rating\">\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"product-wid-price\">\r\n");
      out.write("                                <ins>$400.00</ins> <del>$425.00</del>\r\n");
      out.write("                            </div>                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> <!-- End product widget area -->\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"footer-top-area\">\r\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer-about-us\">\r\n");
      out.write("                        <h2>u<span>Stora</span></h2>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Perferendis sunt id doloribus vero quam laborum quas alias dolores blanditiis iusto consequatur, modi aliquid eveniet eligendi iure eaque ipsam iste, pariatur omnis sint! Suscipit, debitis, quisquam. Laborum commodi veritatis magni at?</p>\r\n");
      out.write("                        <div class=\"footer-social\">\r\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-youtube\"></i></a>\r\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-linkedin\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer-menu\">\r\n");
      out.write("                        <h2 class=\"footer-wid-title\">User Navigation </h2>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">My account</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Order history</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Wishlist</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Vendor contact</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Front page</a></li>\r\n");
      out.write("                        </ul>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer-menu\">\r\n");
      out.write("                        <h2 class=\"footer-wid-title\">Categories</h2>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">Mobile Phone</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Home accesseries</a></li>\r\n");
      out.write("                            <li><a href=\"#\">LED TV</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Computer</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Gadets</a></li>\r\n");
      out.write("                        </ul>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer-newsletter\">\r\n");
      out.write("                        <h2 class=\"footer-wid-title\">Newsletter</h2>\r\n");
      out.write("                        <p>Sign up to our newsletter and get exclusive deals you wont find anywhere else straight to your inbox!</p>\r\n");
      out.write("                        <div class=\"newsletter-form\">\r\n");
      out.write("                            <form action=\"#\">\r\n");
      out.write("                                <input type=\"email\" placeholder=\"Type your email\">\r\n");
      out.write("                                <input type=\"submit\" value=\"Subscribe\">\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> <!-- End footer top area -->\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"footer-bottom-area\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-8\">\r\n");
      out.write("                    <div class=\"copyright\">\r\n");
      out.write("                        <p>&copy; 2015 uCommerce. All Rights Reserved. <a href=\"http://www.freshdesignweb.com\" target=\"_blank\">freshDesignweb.com</a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <div class=\"footer-card-icon\">\r\n");
      out.write("                        <i class=\"fa fa-cc-discover\"></i>\r\n");
      out.write("                        <i class=\"fa fa-cc-mastercard\"></i>\r\n");
      out.write("                        <i class=\"fa fa-cc-paypal\"></i>\r\n");
      out.write("                        <i class=\"fa fa-cc-visa\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> <!-- End footer bottom area -->\r\n");
      out.write("   \r\n");
      out.write("    <!-- Latest jQuery form server -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Bootstrap JS form CDN -->\r\n");
      out.write("    <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- jQuery sticky menu -->\r\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.sticky.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- jQuery easing -->\r\n");
      out.write("    <script src=\"js/jquery.easing.1.3.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Main Script -->\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Slider -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bxslider.min.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\" src=\"js/script.slider.js\"></script>\r\n");
      out.write("  </body>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /index2.jsp(115,24) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/index2.jsp(115,24) '${productList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${productList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /index2.jsp(115,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("product");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                        <div class=\"single-product\">\r\n");
            out.write("                                <div class=\"product-f-image\">\r\n");
            out.write("                                    <img src=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.image}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" alt=\"\">\r\n");
            out.write("                                    <div class=\"product-hover\">\r\n");
            out.write("                                        <a href=\"#\" class=\"add-to-cart-link\"><i class=\"fa fa-shopping-cart\"></i> Add to cart</a>\r\n");
            out.write("                                        <a href=\"single-product.html\" class=\"view-details-link\"><i class=\"fa fa-link\"></i> See details</a>\r\n");
            out.write("                                    </div>\r\n");
            out.write("                                </div>\r\n");
            out.write("                               \r\n");
            out.write("                                <h2><a href=\"single-product.html\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a></h2>\r\n");
            out.write("                                \r\n");
            out.write("                                <div class=\"product-carousel-price\">\r\n");
            out.write("                                    <ins>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</ins> <del>$100.00</del>\r\n");
            out.write("                                </div> \r\n");
            out.write("                            </div>\r\n");
            out.write("                        ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
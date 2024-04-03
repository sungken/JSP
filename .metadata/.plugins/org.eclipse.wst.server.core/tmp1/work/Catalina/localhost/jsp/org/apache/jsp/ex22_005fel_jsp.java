/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-04-03 07:11:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.test.jsp.Student;
import java.util.HashMap;

public final class ex22_005fel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("com.test.jsp.Student");
    _jspx_imports_classes.add("java.util.HashMap");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://pinnpublic.dothome.co.kr/cdn/example-min.css\">\r\n");
      out.write("<style>\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- ex22_el.jsp -->\r\n");
      out.write("	<h1>EL</h1>\r\n");
      out.write("	\r\n");
      out.write("	");

	
		int a = 10; //자바의 데이터 > 화면 출력
		
		//*** EL은 평번한 출력문이 아니라, 내장 객체의 컬렉션값을 출력하는 전용 출력문이다.
		//pageContext, request, session, application
	
		pageContext.setAttribute("b", 20);
		request.setAttribute("c", 30);
		session.setAttribute("d", 40);
		application.setAttribute("e", 50);
		
		application.setAttribute("d", 400);
		
		
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<h2>표현식</h2>\r\n");
      out.write("	<div>a: ");
      out.print( a );
      out.write("</div>\r\n");
      out.write("	<div>b: ");
      out.print( pageContext.getAttribute("b") );
      out.write("</div>\r\n");
      out.write("	\r\n");
      out.write("	<h2>EL</h2>\r\n");
      out.write("	<div>a: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>b: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.getAttribute(\"b\")}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div> <!-- 에러 아님 -->\r\n");
      out.write("	<div>b: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>c: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>d: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${d}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>d: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${applicationScope.d}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>e: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	");

	
		pageContext.setAttribute("n1", 10);
		pageContext.setAttribute("n2", 3);
	
	
      out.write("\r\n");
      out.write("	<h2>El 기능</h2>\r\n");
      out.write("	\r\n");
      out.write("	<h3>EL 연산기능</h3>\r\n");
      out.write("	\r\n");
      out.write("	<div>n1 + 10 = ");
      out.print( (int)pageContext.getAttribute("n1") + 10 );
      out.write("</div>\r\n");
      out.write("	<div>n1 - 10 = ");
      out.print( (int)pageContext.getAttribute("n1") - 10 );
      out.write("</div>\r\n");
      out.write("	<div>n1 * 10 = ");
      out.print( (int)pageContext.getAttribute("n1") * 10 );
      out.write("</div>\r\n");
      out.write("	<div>n1 / 10 = ");
      out.print( (int)pageContext.getAttribute("n1") / 10 );
      out.write("</div>\r\n");
      out.write("	<div>n1 % 10 = ");
      out.print( (int)pageContext.getAttribute("n1") % 10 );
      out.write("</div>\r\n");
      out.write("	\r\n");
      out.write("	<div>n1 + 10 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n1 + 10}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>n1 - 10 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n1 - 10}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>n1 mod 10 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n1 mod 10}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>n1 * 10 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n1 * 10}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>n1 / 10 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n1 / 10}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>n1 % 10 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n1 % 10}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	\r\n");
      out.write("	<div>n1 + n2 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write('+');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>n1 + n2 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n1 + n2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	\r\n");
      out.write("	<hr>\r\n");
      out.write("	\r\n");
      out.write("	<div>n1 &gt; 0 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n1 > 0}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>n1 &lt; 0 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n1 < 0}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	\r\n");
      out.write("	<div>n1 &gt;= 0 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n1 >= 0}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>n1 &lt;= 0 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n1 <= 0}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>n1 &gt;= 0 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n1 ge 0}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>n1 &lt;= 0 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n1 le 0}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	\r\n");
      out.write("	<div>n1 == 0 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n1 == 0}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>n1 != 0 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n1 != 0}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>n1 == 0 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n1 eq 0}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>n1 != 0 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n1 ne 0}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	\r\n");
      out.write("	<hr>\r\n");
      out.write("	\r\n");
      out.write("	<div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${true && false}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${true || false}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!true}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	\r\n");
      out.write("	<div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${true and false}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${true or false}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not true}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	\r\n");
      out.write("	<hr>\r\n");
      out.write("	\r\n");
      out.write("	<div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n1 > 0 ? \"양수\" : \"음수\"}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${\"홍길동\".equals(\"홍길동\")}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${\"홍길동\" == \"홍길동\"}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	\r\n");
      out.write("	");

		HashMap<String,String> map = new HashMap<String,String>();
	
		map.put("name", "홍길동");
		map.put("age", "20");
		map.put("address", "서울시");
		
		pageContext.setAttribute("map", map); //*** 
		
	
      out.write("\r\n");
      out.write("	<h2>HashMap 출력</h2>\r\n");
      out.write("	\r\n");
      out.write("	<div>이름: ");
      out.print( map.get("name") );
      out.write("</div>\r\n");
      out.write("	<div>나이: ");
      out.print( map.get("age") );
      out.write("</div>\r\n");
      out.write("	<div>주소: ");
      out.print( map.get("address") );
      out.write("</div>\r\n");
      out.write("	\r\n");
      out.write("	<div>이름: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.get(\"name\")}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>이름: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map[\"name\"]}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>나이: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map[\"age\"] - 1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>주소: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	\r\n");
      out.write("	");

	
	Student s1 = new Student();
	
	s1.setName("아무개");
	s1.setAge(22);
	s1.setAddress("인천시");
	
	request.setAttribute("s1", s1);
	
	
      out.write("\r\n");
      out.write("	<h2>객체 출력</h2>\r\n");
      out.write("	\r\n");
      out.write("	<div>이름: ");
      out.print( s1.getName() );
      out.write("</div>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("	<div>주소: ");
      out.print( s1.getAddress() );
      out.write("</div>\r\n");
      out.write("	\r\n");
      out.write("	<div>이름: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s1.getName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>나이: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s1.age}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>주소: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s1.address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>주소: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s1[\"address\"]}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	\r\n");
      out.write("	");

	
	String s2 = null;
	pageContext.setAttribute("s2", s2);
	
	String s3 = "";
	pageContext.setAttribute("s3", s3);
	
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<div>");
      out.print( s2 == null);
      out.write("</div>\r\n");
      out.write("	<div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s2 == null}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty s2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	.\r\n");
      out.write("	<div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s3 == null}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	<div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty s3}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.7.1.js\"></script>\r\n");
      out.write("	<script>\r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
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

#### 1. Tomcat 서버를 시작할 때 웹 애플리케이션이 초기화하는 과정을 설명하라.

1.	 Tomcat(Container)에서 Controller에 따른 인스턴스를 생성해준다. 
2.	 core.mvc.DispatcherServlet에서 core.mvc.RequestMapping class에 매핑된 각각의 요청과 컨트롤러를 초기화해준다. 
3.	 next.support.context.ContextLoaderListner에서 jwp.jql을 읽어 db를 초기화한다. 


#### 2. Tomcat 서버를 시작한 후 http://localhost:8080으로 접근시 호출 순서 및 흐름을 설명하라.
1.	request, response 인스턴스를 생성한다.
2.	Thread pool에서 thread를 꺼내 DispatcherServlet의 Service()를 실행한다.
3.	request header에서 요청의 url을 식별해 알맞은 controller로 보내준다.
4.	Controller에서 가공된 Model을 View 인스턴스를 생성해서 렌더링해준다.
5.	response에 담아 응답해준다.

#### 7. next.web.qna package의 ShowController는 멀티 쓰레드 상황에서 문제가 발생하는 이유에 대해 설명하라.
* 

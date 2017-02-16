<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleLoginProxyid" scope="session" class="com.LoginProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleLoginProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleLoginProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleLoginProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.Login getLogin10mtemp = sampleLoginProxyid.getLogin();
if(getLogin10mtemp == null){
%>
<%=getLogin10mtemp %>
<%
}else{
        if(getLogin10mtemp!= null){
        String tempreturnp11 = getLogin10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String username_1id=  request.getParameter("username16");
            java.lang.String username_1idTemp = null;
        if(!username_1id.equals("")){
         username_1idTemp  = username_1id;
        }
        String password_2id=  request.getParameter("password18");
            java.lang.String password_2idTemp = null;
        if(!password_2id.equals("")){
         password_2idTemp  = password_2id;
        }
        java.lang.String login13mtemp = sampleLoginProxyid.login(username_1idTemp,password_2idTemp);
if(login13mtemp == null){
%>
<%=login13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(login13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 20:
        gotMethod = true;
        String email_3id=  request.getParameter("email23");
            java.lang.String email_3idTemp = null;
        if(!email_3id.equals("")){
         email_3idTemp  = email_3id;
        }
        String firstName_4id=  request.getParameter("firstName25");
            java.lang.String firstName_4idTemp = null;
        if(!firstName_4id.equals("")){
         firstName_4idTemp  = firstName_4id;
        }
        String lastName_5id=  request.getParameter("lastName27");
            java.lang.String lastName_5idTemp = null;
        if(!lastName_5id.equals("")){
         lastName_5idTemp  = lastName_5id;
        }
        String password_6id=  request.getParameter("password29");
            java.lang.String password_6idTemp = null;
        if(!password_6id.equals("")){
         password_6idTemp  = password_6id;
        }
        String userHandle_7id=  request.getParameter("userHandle31");
            java.lang.String userHandle_7idTemp = null;
        if(!userHandle_7id.equals("")){
         userHandle_7idTemp  = userHandle_7id;
        }
        String dob_8id=  request.getParameter("dob33");
            java.lang.String dob_8idTemp = null;
        if(!dob_8id.equals("")){
         dob_8idTemp  = dob_8id;
        }
        String contactNo_9id=  request.getParameter("contactNo35");
            java.lang.String contactNo_9idTemp = null;
        if(!contactNo_9id.equals("")){
         contactNo_9idTemp  = contactNo_9id;
        }
        String location_10id=  request.getParameter("location37");
            java.lang.String location_10idTemp = null;
        if(!location_10id.equals("")){
         location_10idTemp  = location_10id;
        }
        int signup20mtemp = sampleLoginProxyid.signup(email_3idTemp,firstName_4idTemp,lastName_5idTemp,password_6idTemp,userHandle_7idTemp,dob_8idTemp,contactNo_9idTemp,location_10idTemp);
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(signup20mtemp));
        %>
        <%= tempResultreturnp21 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>
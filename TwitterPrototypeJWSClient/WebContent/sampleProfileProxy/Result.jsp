<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleProfileProxyid" scope="session" class="com.ProfileProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleProfileProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleProfileProxyid.getEndpoint();
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
        sampleProfileProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.Profile getProfile10mtemp = sampleProfileProxyid.getProfile();
if(getProfile10mtemp == null){
%>
<%=getProfile10mtemp %>
<%
}else{
        if(getProfile10mtemp!= null){
        String tempreturnp11 = getProfile10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String userId_1id=  request.getParameter("userId16");
            java.lang.String userId_1idTemp = null;
        if(!userId_1id.equals("")){
         userId_1idTemp  = userId_1id;
        }
        String tweetTextId_2id=  request.getParameter("tweetTextId18");
            java.lang.String tweetTextId_2idTemp = null;
        if(!tweetTextId_2id.equals("")){
         tweetTextId_2idTemp  = tweetTextId_2id;
        }
        String tweetData_3id=  request.getParameter("tweetData20");
            java.lang.String tweetData_3idTemp = null;
        if(!tweetData_3id.equals("")){
         tweetData_3idTemp  = tweetData_3id;
        }
        String hashtagData_4id=  request.getParameter("hashtagData22");
            java.lang.String hashtagData_4idTemp = null;
        if(!hashtagData_4id.equals("")){
         hashtagData_4idTemp  = hashtagData_4id;
        }
        String isCreator_5id=  request.getParameter("isCreator24");
            java.lang.String isCreator_5idTemp = null;
        if(!isCreator_5id.equals("")){
         isCreator_5idTemp  = isCreator_5id;
        }
        String currentDate_6id=  request.getParameter("currentDate26");
            java.lang.String currentDate_6idTemp = null;
        if(!currentDate_6id.equals("")){
         currentDate_6idTemp  = currentDate_6id;
        }
        String userHandle_7id=  request.getParameter("userHandle28");
            java.lang.String userHandle_7idTemp = null;
        if(!userHandle_7id.equals("")){
         userHandle_7idTemp  = userHandle_7id;
        }
        int insertTweet13mtemp = sampleProfileProxyid.insertTweet(userId_1idTemp,tweetTextId_2idTemp,tweetData_3idTemp,hashtagData_4idTemp,isCreator_5idTemp,currentDate_6idTemp,userHandle_7idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(insertTweet13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 30:
        gotMethod = true;
        String userId_8id=  request.getParameter("userId33");
            java.lang.String userId_8idTemp = null;
        if(!userId_8id.equals("")){
         userId_8idTemp  = userId_8id;
        }
        java.lang.String retrieveTweet30mtemp = sampleProfileProxyid.retrieveTweet(userId_8idTemp);
if(retrieveTweet30mtemp == null){
%>
<%=retrieveTweet30mtemp %>
<%
}else{
        String tempResultreturnp31 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(retrieveTweet30mtemp));
        %>
        <%= tempResultreturnp31 %>
        <%
}
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
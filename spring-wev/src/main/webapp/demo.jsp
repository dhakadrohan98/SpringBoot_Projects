<h1>From jsp page<h1>
<hr>

<%!
	//declaration
	int a = 20;
	int b = 10;
	
	int count = 0;
%>

<%
	//Scriptlet
	int c = a + b;
%>
<h2>
	The value of a is <%= a%> <br>
	The value of a is <%= b%> <br>
	The sum of a + b is <%= c%> 
	<hr>
	you have visited this page <%= ++count%> times.
<h2>
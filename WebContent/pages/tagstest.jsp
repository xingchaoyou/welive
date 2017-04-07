<?xml version="1.0" encoding="GB18030" ?>
<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030" />
<title>Struts-Tags学习</title>
</head>
<body>

		
		<s:form name="test">
    		<s:doubleselect label="请选择所在省市"
       		name="province" list="{'四川省','山东省'}" doubleName="city"
       		doubleList="top == '四川省' ? {'成都市', '绵阳市'} : {'济南市', '青岛市'}" />
		</s:form>
		
		
	
</body>
</html>
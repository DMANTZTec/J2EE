
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div th:if="${msg}">
<span th:text="${msg}"></span>
</div>
<div>
<span><a href="/">upload more files</a></span>
</div>
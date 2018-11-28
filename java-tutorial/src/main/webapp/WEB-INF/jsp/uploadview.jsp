<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form action="/java-tutorial/uploadstatusview.html" method="post" enctype="multipart/form-data">
<input type="file" name="files" multiple>
<input type="submit" value="Upload Files"></input>
</form>

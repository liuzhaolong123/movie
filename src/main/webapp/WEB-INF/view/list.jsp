<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/index2.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
<title>电影列表</title>
</head>
<body>
<form action="list" method="post">
<input type="hidden" name="pageNum">
影片名称:<input type="text" name="mname" value="${movieVo.mname}"><br>
导演名称:<input type="text" name="mactor" value="${movieVo.mactor}"><br>
电影年代:<input type="text" name="myear" value="${movieVo.myear}"><br>
上映时间:<input type="text" name="s1" value="${movieVo.s1}" onclick="WdatePicker()">-<input type="text" name="s2" value="${movieVo.s2}" onclick="WdatePicker()"><br>
电影价格:<input type="text" name="p1" value="${movieVo.p1}">-<input type="text" name="p2" value="${movieVo.p2}"><br>
电影时长:<input type="text" name="b1" value="${movieVo.b1}">-<input type="text" name="b2" value="${movieVo.b2}"><br>

<button>查询</button>
</form>
<table>
  <tr>
    <td>
      <input type="checkbox" onclick="choose(this)">
    </td>
    <td>编号</td>
    <td>影片名</td>
    <td>导演</td>
    <td><a href="javascript:morder('mprice')">票价</a></td>
    <td>上映时间</td>
    <td><a href="javascript:morder('muptime')">时长</a></td>
    <td>类型</td>
    <td><a href="javascript:morder('myear')">年代</a></td>
    <td>区域</td>
    <td>状态</td>
    <td>操作</td>
  </tr>
  <c:forEach items="${page.list }" var="d" varStatus="count">
  <tr>
    <td>
     <input type="checkbox" name="ck" value="${d.mid}">
    </td>
    <td>${count.count+page.startRow-1}</td>
    <td>${d.mname}</td>
    <td>${d.mactor}</td>
    <td>${d.mprice}</td>
    <td>${d.muptime}</td>
    <td>${d.mtime}</td>
    <td>${d.mtype}</td>
    <td>${d.myear}</td>
    <td>${d.marea}</td>
    <td>${d.mstatus==1?"即将上映":d.mstatus==2?"正在上映":"已经下线"}</td>
    <td>
      <input type="button" value="添加">
      <input type="button" value="修改">
      <input type="button" value="删除" onclick="del(${d.mid})">
    </td>
  </tr>
  </c:forEach>
  <tr>
		<Td colspan="100">
			<button onclick="fenye(1)">首页</button>
			<button onclick="fenye(${page.prePage==0?1:page.prePage})">上一页</button>
			<button onclick="fenye(${page.nextPage==0?page.pages:page.nextPage})">下一页</button>
			<button onclick="fenye(${page.pages})">尾页</button>
			第${page.pageNum}/${page.pages}页，共${page.total}条
			 &nbsp;&nbsp;
			&nbsp;&nbsp;
			<input type="button" value="批量删除" onclick="delBatch()">
		</Td>
	</tr>
</table>
</body>
<script type="text/javascript">

 function fenye(pageNum) {
	$("[name=pageNum]").val(pageNum);
	$("form").submit();
}
 function del(mid){
	 
	 $.post("delete",{mids:mid},function(flag){
		 
		 alert(flag);
		 if (flag) {
			alert("删除成功！");
			location = "list";
		}else {
			alert("删除失败！");
		}
		 
	 },"json")
	 
 }
 function morder(orderName){
	 
	 var orderMethod = '${movieVo.orderMethod}';
	 orderMethod = orderMethod=='desc'?'asc':'desc';
	 location = "/list?orderName="+orderName+"&orderMethod"+orderMethod;
 }
 function choose(own){
	 
	 $("[name=ck]").attr("checked",own.checked);
	 
 }
 function delBatch(){
	 
	 var size = $("[name=ck]:checked").size();
	 if (size>1) {
		 var mids = $("[name=ck]:checked").map(function(){
			 return this.value;
		 }).get().join();
		 $.post("delete",{mids:mids},function(flag){
			 alert(flag);
			 if (flag) {
				alert("批量删除成功！");
				location = "list";
			}else {
				alert("批量删除失败！");
			}
		 },"json")
	}else {
		if (size=0) {
			alert("请选择要删除的数据！");
		}else {
			alert("至少两条数据！");
		}
	}
	 
	 
	 
 }


</script>
</html>
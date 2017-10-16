<%--
  Created by IntelliJ IDEA.
  User: zar
  Date: 2017/10/9
  Time: 上午8:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>

</head>
<body>
<h1>登录成功</h1>
<button class="btn" onclick="func2()" value="1">点我</button>
<button class="btn" onclick="func2()" value="2">点我</button>
<input type="text" id="id" onchange="func2()">
<div id="div1"></div>
<select id="sel" onchange="func3()">
    <option>--请选择--</option>
    <option value="1">北京</option>
    <option value="2">大连</option>
</select>
<select id="select">
    <option>--请选择--</option>
</select>
</body>
<script src="/js/jquery-3.2.1.js" type="text/javascript"></script>
<script type="text/javascript">
    function func2() {
        $.ajax({
            url: "/stuInfo",
            data: {
                id: $("#id").val()
            },
            success: function (result) {
                $("#div1").html(
                        "student.id=" + result.id + " " +
                        "student.name=" + result.name + "<br/>" +
                        "class.id=" + result.classzz.id + " " +
                        "class.name=" + result.classzz.name);
            }
        });
    }
    function func3() {
        $.ajax({
            url: "/provinceInfo",
            data: {
                pid: $("#sel").val()
            },
            success: function (data) {
                var str="<option>--请选择--</option>";
                for (var i = 0; i < data.cities.length; i++) {
                    console.log(data);
                    str += "<option>" + data.cities[i].cname + "</option>"
                }
                $("#select").html(str)
            }
        });
    }
</script>
</html>

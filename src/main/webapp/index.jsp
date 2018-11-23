<%@ page contentType="text/html;charset=GBK" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<form id="confirmInfo" action="/message/confirmInfo" method="get">
    <table>
        <tr>
            <th>姓名：</th>
            <td>
                <input name="uname" id="uname" >
            </td>
        </tr>
        <tr>
            <th>性别：</th>
            <td>
                <input name="sex" id="sex" >
            </td>
        </tr>
        <tr>
            <th>年龄：</th>
            <td>
                <input name="age" id="age" >
            </td>
        </tr>
    </table>
    <input type="submit" value="Get提交" />
</form>


<form id="confirmInfo2" action="/message/confirmInfo2" method="post">
    <table>
        <tr>
            <th>姓名：</th>
            <td>
                <input name="uname" >
            </td>
        </tr>
        <tr>
            <th>性别：</th>
            <td>
                <input name="sex" >
            </td>
        </tr>
        <tr>
            <th>年龄：</th>
            <td>
                <input name="age">
            </td>
        </tr>
    </table>
    <input type="submit" value="Post提交" />
</form>



<a href="javascript:void;" onclick="return showDetail();">显示</a>
</body>

<script>
    function showDetail(){
        var uname = document.getElementById("uname").value;
        var sex = document.getElementById("sex").value;
        var age = document.getElementById("age").value;
        window.open("message/detail/"+uname+"/"+sex+"/"+age);
        return false;
    }
</script>
</html>

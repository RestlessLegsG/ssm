<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*"%>
<html>
<head>

    <title>生产商信息</title>


    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>

    <script type="text/javascript">
        $(document).ready(function(){

            $("#bt").click(function(){




                $.ajax({
                    type : "POST" ,
                    url: "/page/nameCheck",
                    dataType: "json",
                    //传送请求数据
                    data: { "producername": $("#producername1").val()},
                    success: function (data) { //成功后返回的数据
                        //根据返回值进行状态显示
                        if (data.msg== "fail") {
                            alert("生产商名字已经存在！添加失败！");
                            $("#producername1").focus();
                            return false;
                        }
                        else {
                            alert(data.msg);
                        }
                    }

                });
                if($("#email1").val()=="")
                {
                    alert("邮箱不能为空");
                    return false;
                }
                var email=$("#email1").val();
                if(!email.match(/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/))
                {
                    alert("电子邮件格式不正确！请重新输入");
                    $("#email1").focus();
                    return false;
                }
                var totalStaff=$("#totalStaff1").val();
                if(!totalStaff.match(/^[1-9]\d*$/))
                {
                    alert("员工格式不正确！请重新输入");
                    $("#totalStaff1").focus();
                    return false;

                }
                var registeredCapital=$("#registeredCapital1").val();
                if(!registeredCapital.match(/^[1-9]\d*$/))
                {
                    alert("注册资金格式不正确！请重新输入");
                    $("#registeredCapital1").focus();
                    return false;

                }


                var phoneNumber=$("#phoneNumber1").val();

                if(!phoneNumber.match(/^1(3|4|5|7|8)\d{9}$/ ||/^(\(\d{3,4}\)|\d{3,4}-|\s)?\d{7,14}$/))

                {
                    alert("电话号码不正确，请重新输入");

                    $("#phoneNumberl").focus();

                    return false;
                }
                var zipCode=$("#zipCode1").val();

                if(!zipCode.match(/^[1-9][0-9]{5}$/))

                {
                    alert("邮政编码不正确，请重新输入");
                    $("#zipCode1").focus();

                    return false;
                }

            })
        })
    </script>
</head>
<body>
<form method="post" action="nameCheck">
    <div class="int">
        <label for="producername1">生产商名字:</label>
        <input type="text" id="producername1" class="required" />
    </div>
    <div class="int">
        <label for="factoryAddress">工厂地址:</label>
        <input type="text" id="factoryAddress" class="required" />
    </div>
    <div class="int">
        <label for="factoryName">工厂名字:</label>
        <input type="text" id="factoryName" class="required" />
    </div>
    <div class="int">
        <label for="email1">邮箱:</label>
        <input type="text" id="email1" class="required" />
    </div>
    <div class="int">
        <label for="linkMan">联系人:</label>
        <select type="text" id="linkman" >
            <option value="">----------请选择所属项目--------</option>
              <c:forEach var="item" items="${map}">
              <option value="${item.id}">${item.key}</option>
              </c:forEach>
        </select>

    </div>x
    <div class="int">
        <label for="phoneNumber1">电话号码:</label>
        <input type="text" id="phoneNumber1" />
    </div>
    <div class="int">
        <label for="lPosition">联系人职位:</label>
        <input type="text" id="lPosition" />
    </div>
    <div class="int">
        <label for="companyAddress">公司地址</label>
        <input type="text" id="companyAddress" />
    </div>
    <div class="int">
        <label for="zipCode1">邮政编码:</label>
        <input type="text" id="zipCode1" />
    </div>
    <div class="int">
        <label for="website">公司网站:</label>
        <input type="text" id="website" />
    </div>
    <div class="int">
        <label for="institution">公司所有制:</label>
        <input type="text" id="institution" />
    </div>
    <div class="int">
        <label for="createdate">创立日期:</label>
        <input type="text" id="createdate" />
    </div>
    <div class="int">
        <label for="registeredCapital1">注册资金:</label>
        <input type="text" id="registeredCapital1" />
    </div>
    <div class="int">
        <label for="totalStaff1">员工总人数:</label>
        <input type="text" id="totalStaff1" />
    </div>
    <div class="int">
        <label for="cooperationTime">合作时间:</label>
        <input type="text" id="cooperationTime" />
    </div>

    <div class="sub">
        <input type="submit" value="提交" id="bt"/><input type="reset" id="res"/>
    </div>
</form>
</body>
</html>

<%--
<script>
    $(document).ready(function(){
        $("#linkman").click(function(){
            $.ajax({
                type:"post",
                url:"/index/nameCheck",
                datatype:"json",
                data:[],
                success:
                function (data) {
                    for (var i = 0; i < data.namelist.length; i++) {
                        $("#linkman").append("<option >" + data.namelist[i].linkName + "</option>");

                }
                error:alert("出错")
                
                
                
            },})
            
          
            
            
            }
            
          
            
            
            
            
            
        )
        
        
        
    })

</script>
--%>

<%--
  Created by IntelliJ IDEA.
  User: Laptop Rpctech
  Date: 10/07/2023
  Time: 12:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>

<form id="myForm">
    <input type="text" placeholder="Name" class="name" name="name">
    <input type="text" placeholder="Surname" class="surname" name="surname">
    <input type="text" placeholder="Email" class="email" name="email">
    <select class="form-control" name="select">
    <option value="MERDA">merda</option>
    <option value="STRON<O">STORNZO</option>
    <option value="MERDA">merda</option>
    <option value="MERDA">merda</option>
    </select>
    <input type="button" value="submit" id="submitBtn">
</form>

<script>
$(document).ready(function(){
    $('#submitBtn').click(function(){
        let name = $('.name').val();
        console.log(name);
        let surname = $('.surname').val();
        console.log(surname);
        let email = $('.email').val();
        console.log(email);
        let select = $('.form-control').val();
        console.log(select);


        $.ajax({
            type:'POST',
            data: {
                name:name,
                surname:surname,
                email:email,
                select:select
            },
            url: '/test-servlet',
            success:function(result){
                console.log(result);
            }
        })
    })
})

    // function testAjax() {
    //     let n = document.getElementById('nome').value;
    //     let xhttp = new XMLHttpRequest();
    //
    //
    //     xhttp.onreadystatechange = function () {
    //         if (this.readyState == 4 && this.status == 200) {
    //             document.getElementById("res").innerHTML = this.responseText;
    //         }
    //     };
    //     xhttp.open("POST", 'TestAjax', true);
    //     xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    //     xhttp.send("val=" + n);
    // }
</script>
</body>
</html>

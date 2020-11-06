<%--
  Created by IntelliJ IDEA.
  User: alexandru
  Date: 05/11/2020
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<style>
    * {
        box-sizing: border-box;
    }

    body {
        font-family: Arial, Helvetica, sans-serif;
    }

    /* Style the header */
    header {
        background-color: cadetblue;
        padding: 20px;
        text-align: center;
        font-size: 25px;
        color: whitesmoke;
    }
    footer {
        background-color: #777;
        padding: 10px;
        text-align: center;
        color: white;
    }
    article {
        float: left;
        padding: 20px;
        width: 100%;
        background-color: #f1f1f1;
        height: 300px; /* only for demonstration, should be removed */
    }
</style>
<head>
    <title>Calculator</title>
</head>
<header>
    Age Calculator
</header>
<script src=".js/functions.js">

</script>
<article>
    <p> Hello! Please input your birth date according to this example : 1997-05-06 (year/month/date)
    <form  method="post" name="calculator" onsubmit="evaluateAge()">
        <label >Your birth date</label>
        <input type="text" name="birthDate" id="birthDate" >
        <input type="submit" value="Calculate">


    </form>

    <div id="result">

    </div>
</article>


<footer>
    <p>Thank you for visiting my web application!</p>
</footer>
<body>

</body>
</html>

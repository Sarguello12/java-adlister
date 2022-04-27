<%--
  Created by IntelliJ IDEA.
  User: samarguello
  Date: 4/27/22
  Time: 12:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<h1>What would you like on your pizza?</h1>

<form method="post" action="pizza">

    <label for="pizza-size">Size:</label>
    <select name = "pizza-size" id="pizza-size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>
    <br><br>
    <label for="crust-type">Crust Type:</label>
    <select name = "crust-type" id="crust-type">
        <option value="thin">Thin</option>
        <option value="pan">Pan</option>
        <option value="deep-dish">Deep Dish</option>
    </select>
    <br><br>
    <label for="sauce-type">Sauce:</label>
    <select name = "sauce-type" id="sauce-type">
        <option value="traditional">Traditional</option>
        <option value="bbq">BBQ</option>
        <option value="white">White</option>
    </select>
    <br><br>
    <input type="checkbox" id="topping1" name="topping" value="pepperoni">
    <label for="topping1"> Pepperoni</label><br>
    <input type="checkbox" id="topping2" name="topping" value="sausage">
    <label for="topping2"> Sausage</label><br>
    <input type="checkbox" id="topping3" name="topping" value="chicken">
    <label for="topping3"> Chicken</label>
    <br><br>
    <label for="address">Address:</label>
    <input type="text" name="address" id="address">
    <br>
    <button type="submit">Submit</button>
</form>
</body>
</html>

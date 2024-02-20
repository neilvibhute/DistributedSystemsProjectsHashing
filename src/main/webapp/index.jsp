<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Get Hashes</title>
  <link rel="stylesheet" href="CSS/task1.css">
</head>
<body class="index">
<h1 class="title">Compute Hashes</h1>
<form action="ComputeHashes" method="GET">
  <div class="search">
    <input type="text" class="word" name="word" value="" placeholder="Please input a word"/></div>
  <div class="search"><input class="submit" type="submit" value="Click Here"/></div>

  <div class="hashType">
    <input class="hashFunction" id="radio1" type="radio" name="hashFunction" value="MD5" checked="checked">
    <label for="radio1">MD5</label>
    <input class="hashFunction" id="radio2" type="radio" name="hashFunction" value="SHA-1">
    <label for="radio2">SHA-1</label>
  </div>

</form>
</body>
</html>


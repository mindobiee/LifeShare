<%@page import="lifeShare.dao.UsersMapper"%>
<%@page import="lifeShare.dto.Users"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</head>

 <body class="bg-light">
  <div class = "container">
  <div class= "py-5 text-center">
    <form class="form-signin" action = "userLogin" method="post">
      <img class="mb-4" src="https://getbootstrap.com/docs/4.0/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">
      <h1 class="h3 mb-3 font-weight-normal">login</h1>
       <div class="mb-3">
      <label for="inputID" class="sr-only">Users ID</label>
      <input type="text" id="id" name="id" class="form-control" placeholder="Users ID" required="" autofocus="">
      </div>
      <label for="inputPassword" class="sr-only">Password</label>
      <input type="password" id="password"  name="password" class="form-control" placeholder="Password" required="">
     
      
      <br>      
      <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      
      <p class="mt-5 mb-3 text-muted">© 2021-2022</p>
    </form>
  </div>
  </div>

</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>

<%   
String path = request.getContextPath();   
String basePath = request.getScheme()+"://" +request.getServerName()+":" +request.getServerPort()+path+"/" ;   
%>   

<!DOCTYPE html>
<html lang="en">
<head>
	<base href="<%=basePath%>" > 
    <meta charset="utf-8">
    <title>Home</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width">

    <!-- Bootstrap styles -->
    <link rel="stylesheet" href="css/bootstrap.min.css">

    <!-- Font-Awesome -->
    <link rel="stylesheet" href="css/font-awesome/css/font-awesome.min.css">

    <!-- Google Webfonts -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,600|PT+Serif:400,400italic' rel='stylesheet'
          type='text/css'>

    <!-- Styles -->
    <link rel="stylesheet" href="css/style.css" id="theme-styles">

    <!--[if lt IE 9]>
    <script src="js/vendor/google/html5-3.6-respond-1.1.0.min.js"></script>
    <![endif]-->

</head>
<body>

<%@ include file="page/header.jsp" %>

<div class="widewrapper main">


  <div class="container">
    <div class="row">
      
      <div class="col-md-8 blog-main" id="fill">
		<!-- --动态填充到这里 -->
      </div>
      
      <aside class="col-md-4 blog-aside">
        <div class="aside-widget">
          <header>
            <h3>Featured Post</h3>
          </header>
          <div class="body">
            <ul class="clean-list">
              <li><a href="">Clean - Responsive HTML5 Template</a></li>
              <li><a href="">Responsive Pricing Table</a></li>
              <li><a href="">Yellow HTML5 Template</a></li>
              <li><a href="">Blackor Responsive Theme</a></li>
              <li><a href="">Portfolio Bootstrap Template</a></li>
              <li><a href="">Clean Slider Template</a></li>
            </ul>
          </div>
        </div>

        <div class="aside-widget">
          <header>
            <h3>Related Post</h3>
          </header>
          <div class="body">
            <ul class="clean-list">
              <li><a href="">Blackor Responsive Theme</a></li>
              <li><a href="">Portfolio Bootstrap Template</a></li>
              <li><a href="">Clean Slider Template</a></li>
              <li><a href="">Clean - Responsive HTML5 Template</a></li>
              <li><a href="">Responsive Pricing Table</a></li>
              <li><a href="">Yellow HTML5 Template</a></li>
            </ul>
          </div>
        </div>


        <div class="aside-widget">
          <header><!-- --动态填充到这里 -->
            <h3>朝代</h3>
          </header>
          <div class="body clearfix" id="dynasty">
            <ul class="tags">
              <li><a href="">HTML5</a></li>
              <li><a href="#">CSS3</a></li>
              <li><a href="#">COMPONENTS</a></li>
              <li><a href="#">TEMPLATE</a></li>
              <li><a href="#">PLUGIN</a></li>
              <li><a href="#">BOOTSTRAP</a></li>
              <li><a href="#">TUTORIAL</a></li>
              <li><a href="#">UI/UX</a></li>
            </ul>
          </div>
        </div>

      </aside>
    </div>
  </div>
</div>
<%@ include file="page/footer.jsp" %>

<script src="js/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/modernizr.js"></script>
<script src="js/poem.js"></script>
<script src="http://code.jquery.com/mobile/1.0/jquery.mobile-1.0.min.js" type="text/javascript"></script>
<script language="javascript" for="window" event="onload">

</script>
</body>
</html>

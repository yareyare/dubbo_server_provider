<%--
  Created by IntelliJ IDEA.
  User: ivy
  Date: 2017/3/10
  Time: 下午9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<%@ include file="../page/head.jsp" %>
<body>

<%@ include file="../page/header.jsp" %>

<div class="widewrapper main">
  <div class="container">
    <div class="row">
      <div class="col-md-8 blog-main">
        <div class="row">
          <div class="col-md-6 col-sm-6">
            <article class=" blog-teaser">
              <header>
                <img src="../img/1.jpg" alt="">
                <h3><a href="single.jsp">How to Create Template</a></h3>
                <span class="meta">19 August 2015, John Doe</span>
                <hr>
              </header>
              <div class="body">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatum, sit. Doloribus
                dolores neque eos. Velit eveniet, necessitatibus aut sit tenetur perferendis! Commodi
                pariatur dignissimos, quis sequi odit iusto cumque quod!
              </div>
              <div class="clearfix">
                <a href="single.jsp" class="btn btn-clean-one">Read more</a>
              </div>
            </article>
          </div>
          <div class="col-md-6 col-sm-6">
            <article class="blog-teaser">
              <header>
                <img src="../img/2.jpg" alt="">
                <h3><a href="single.jsp">Clean Personal Blog Template</a></h3>
                <span class="meta">19 August 2015, John Doe</span>
                <hr>
              </header>
              <div class="body">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatum, sit. Doloribus
                dolores neque eos. Velit eveniet, necessitatibus aut sit tenetur perferendis! Commodi
                pariatur dignissimos, quis sequi odit iusto cumque quod!
              </div>
              <div class="clearfix">
                <a href="single.jsp" class="btn btn-clean-one">Read more</a>
              </div>
            </article>
          </div>
        </div>

        <div class="copyrights">Collect from <a href="http://www.cssmoban.com/">手机网站模板</a></div>

        <div class="row">
          <div class="col-md-6 col-sm-6">
            <article class="blog-teaser">
              <header>
                <img src="../img/3.jpg" alt="">
                <h3><a href="single.jsp">Blackor - Responsive HTML5 Theme</a></h3>
                <span class="meta">19 August 2015, John Doe</span>
                <hr>
              </header>
              <div class="body">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatum, sit. Doloribus
                dolores neque eos. Velit eveniet, necessitatibus aut sit tenetur perferendis! Commodi
                pariatur dignissimos, quis sequi odit iusto cumque quod!
              </div>
              <div class="clearfix">
                <a href="single.jsp" class="btn btn-clean-one">Read more</a>
              </div>
            </article>
          </div>
          <div class="col-md-6 col-sm-6">
            <article class="blog-teaser">
              <header>
                <img src="../img/4.jpg" alt="">
                <h3><a href="single.jsp">Yellow - HTML5 Template</a></h3>
                <span class="meta">19 August 2015, John Doe</span>
                <hr>
              </header>
              <div class="body">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatum, sit. Doloribus
                dolores neque eos. Velit eveniet, necessitatibus aut sit tenetur perferendis! Commodi
                pariatur dignissimos, quis sequi odit iusto cumque quod!
              </div>
              <div class="clearfix">
                <a href="single.jsp" class="btn btn-clean-one">Read more</a>
              </div>
            </article>
          </div>
        </div>

        <div class="paging">
          <a href="#" class="older">Older Post</a>
        </div>
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
          <header>
            <h3>Tags</h3>
          </header>
          <div class="body clearfix">
            <ul class="tags">
              <li><a href="#">HTML5</a></li>
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
<%@ include file="../page/footer.jsp" %>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/modernizr.js"></script>

</body>
</html>
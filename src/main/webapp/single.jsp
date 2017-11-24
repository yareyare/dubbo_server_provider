<%   
String path = request.getContextPath();   
String basePath = request.getScheme()+"://" +request.getServerName()+":" +request.getServerPort()+path+"/" ;   
%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="cn">
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
                <div class="col-md-8 blog-main">
                    <article class="blog-post">
                        <header>
                           
                            <div class="lead-image">
                                <img src="img/single-post.jpg" alt="" class="img-responsive">
                                
                            </div>
                        </header>
                        <div class="body">
                            <h1>Responsive HTML5 Template</h1>
                            <div class="meta">
                                <i class="fa fa-user"></i> John Doe <i class="fa fa-calendar"></i>23 Agustus 2015<i class="fa fa-comments"></i><span class="data"><a href="#comments">3 Comments</a></span>
                            </div>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Autem quas voluptatem et minima quo amet ducimus. Voluptatum soluta tenetur ducimus fugiat, sint voluptate eveniet adipisci nulla asperiores distinctio laudantium eos. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Provident tenetur, consectetur dolores nostrum, numquam facere a dicta eum nam suscipit consequuntur dolorem aspernatur molestias vero quo id tempore vel possimus.</p>

                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Autem quas voluptatem et minima quo amet ducimus. Voluptatum soluta tenetur ducimus fugiat, sint voluptate eveniet adipisci nulla asperiores distinctio laudantium eos. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Provident tenetur, consectetur dolores nostrum, numquam facere a dicta eum nam suscipit consequuntur dolorem aspernatur molestias vero quo id tempore vel possimus.</p>


                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Autem quas voluptatem et minima quo amet ducimus. Voluptatum soluta tenetur ducimus fugiat, sint voluptate eveniet adipisci nulla asperiores distinctio laudantium eos. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Provident tenetur, consectetur dolores nostrum, numquam facere a dicta eum nam suscipit consequuntur dolorem aspernatur molestias vero quo id tempore vel possimus.</p>

                             <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Autem quas voluptatem et minima quo amet ducimus. Voluptatum soluta tenetur ducimus fugiat, sint voluptate eveniet adipisci nulla asperiores.</p>

                        </div>
                    </article>

                    <aside class="social-icons clearfix">
                        <h3>Share on </h3> 
                        <a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i class="fa fa-twitter"></i></a> <a href="#"><i class="fa fa-google"></i></a>
                    </aside>

                    <aside class="comments" id="comments">
                        <hr>

                        <h2><i class="fa fa-comments"></i> 6 Comments</h2>

                        <article class="comment">
                            <header class="clearfix">
                                <img src="img/avatar.png" alt="A Smart Guy" class="avatar">
                                <div class="meta">
                                    <h3><a href="#">John Doe</a></h3>
                                    <span class="date">
                                        24 August 2015
                                    </span>
                                    <span class="separator">
                                        -
                                    </span>
                                    
                                    <a href="#create-comment" class="reply-link">Reply</a>                
                                </div>
                            </header>
                             <div class="body">
                               Lorem ipsum dolor sit amet, consectetur adipisicing elit. Facere sit perspiciatis debitis, vel ducimus praesentium expedita, assumenda ipsum cum corrupti dolorum modi. Rem ipsam similique sapiente obcaecati tenetur beatae voluptatibus.
                            </div>
                        </article>

                        <article class="comment reply">
                            <header class="clearfix">
                                <img src="img/avatar.png" alt="A Smart Guy" class="avatar">
                                <div class="meta">
                                    <h3><a href="#">John Doe</a></h3>
                                    <span class="date">
                                        24 August 2015
                                    </span>
                                    <span class="separator">
                                        -
                                    </span>
                                    
                                    <a href="#create-comment" class="reply-link">Reply</a>                
                                </div>
                            </header>
                             <div class="body">
                               Lorem ipsum dolor sit amet, consectetur adipisicing elit. Facere sit perspiciatis debitis, vel ducimus praesentium expedita, assumenda ipsum cum corrupti dolorum modi. Rem ipsam similique sapiente obcaecati tenetur beatae voluptatibus.
                            </div>
                        </article>

                        <article class="comment ">
                            <header class="clearfix">
                                <img src="img/avatar.png" alt="A Smart Guy" class="avatar">
                                <div class="meta">
                                    <h3><a href="#">John Doe</a></h3>
                                    <span class="date">
                                        24 August 2015
                                    </span>
                                    <span class="separator">
                                        -
                                    </span>
                                    
                                    <a href="#create-comment" class="reply-link">Reply</a>                
                                </div>
                            </header>
                             <div class="body">
                               Lorem ipsum dolor sit amet, consectetur adipisicing elit. Facere sit perspiciatis debitis, vel ducimus praesentium expedita, assumenda ipsum cum corrupti dolorum modi. Rem ipsam similique sapiente obcaecati tenetur beatae voluptatibus.
                            </div>
                        </article>

                        <article class="comment">
                            <header class="clearfix">
                                <img src="img/avatar.png" alt="A Smart Guy" class="avatar">
                                <div class="meta">
                                    <h3><a href="#">John Doe</a></h3>
                                    <span class="date">
                                        24 August 2015
                                    </span>
                                    <span class="separator">
                                        -
                                    </span>
                                    
                                    <a href="#create-comment" class="reply-link">Reply</a>                
                                </div>
                            </header>
                             <div class="body">
                               Lorem ipsum dolor sit amet, consectetur adipisicing elit. Facere sit perspiciatis debitis, vel ducimus praesentium expedita, assumenda ipsum cum corrupti dolorum modi. Rem ipsam similique sapiente obcaecati tenetur beatae voluptatibus.
                            </div>
                        </article>        
                    </aside>

                    <aside class="create-comment" id="create-comment">
                        <hr>    

                        <h2><i class="fa fa-pencil"></i> Add Comment</h2>

                        <form action="#" method="get" accept-charset="utf-8">
                            <div class="row">
                                <div class="col-md-6">
                                    <input type="text" name="name" id="comment-name" placeholder="Your Name" class="form-control input-lg">    
                                </div>
                                <div class="col-md-6">
                                    <input type="email" name="email" id="comment-email" placeholder="Email" class="form-control input-lg">    
                                </div>
                            </div>

                            <input type="url" name="name" id="comment-url" placeholder="Website" class="form-control input-lg">

                            <textarea rows="10" name="message" id="comment-body" placeholder="Your Message" class="form-control input-lg"></textarea>

                            <div class="buttons clearfix">
                                <button type="submit" class="btn btn-xlarge btn-clean-one">Submit</button>
                            </div>
                        </form>
                    </aside>
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


	<%@ include file="page/footer.jsp" %>

	<script src="js/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/modernizr.js"></script>
	<script src="js/poem.js"></script>
	<script src="http://code.jquery.com/mobile/1.0/jquery.mobile-1.0.min.js" type="text/javascript"></script>

</body>
</html>
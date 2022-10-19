<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ include file="/resources/customer/header/header.jsp" %>

    <!-- Header ================================================== -->
    <header>
    <div class="container-fluid">
        <div class="row">
            <div class="col--md-4 col-sm-4 col-xs-4">
                <a href="index.html" id="logo">
                <img src="<c:url value="resources/customer/img/logo.png"/>" width="190" height="23" alt="" data-retina="true" class="hidden-xs">
                <img src="<c:url value="resources/customer/img/logo_mobile.png"/>" width="59" height="23" alt="" data-retina="true" class="hidden-lg hidden-md hidden-sm">
                </a>
            </div>
            <nav class="col--md-8 col-sm-8 col-xs-8">
            <a class="cmn-toggle-switch cmn-toggle-switch__htx open_close" href="javascript:void(0);"><span>Menu mobile</span></a>
            <div class="main-menu">
                <div id="header_menu">
                    <img src="<c:url value="resources/customer/img/logo.png"/>" width="190" height="23" alt="" data-retina="true">
                </div>
                <a href="#" class="open_close" id="close_in"><i class="icon_close"></i></a>
                <ul>
                    <li class="submenu">
                    <a href="javascript:void(0);" class="show-submenu">Home<i class="icon-down-open-mini"></i></a>
                    <ul>
                        <li><a href="index.html">Home Video background</a></li>
                        <li><a href="index_2.html">Home Static image</a></li>
                        <li><a href="index_3.html">Home Text rotator</a></li>
                        <li><a href="index_8.html">Home Layer slider</a></li>
                        <li><a href="index_4.html">Home Cookie bar</a></li>
                        <li><a href="index_5.html">Home Popup</a></li>
                        <li><a href="index_6.html">Home Mobile synthetic</a></li>
                        <li><a href="index_7.html">Top Menu version 2</a></li>
                    </ul>
                    </li>
                    <li class="submenu">
                    <a href="javascript:void(0);" class="show-submenu">Restaurants<i class="icon-down-open-mini"></i></a>
                    <ul>
                        <li><a href="list_page.html">Row listing</a></li>
                        <li><a href="grid_list.html">Grid listing</a></li>
                        <li><a href="map_listing.html">Map listing</a></li>
                        <li><a href="detail_page.html">Restaurant Menu</a></li>
                        <li><a href="submit_restaurant.html">Submit Restaurant</a></li>
                        <li><a href="cart.html">Order step 1</a></li>
                        <li><a href="cart_2.html">Order step 2</a></li>
                        <li><a href="cart_3.html">Order step 3</a></li>
                        <li><a href="cart_datepicker.html">Order Date/Time picker</a></li>
                    </ul>
                    </li>
                    <li><a href="about.html">About us</a></li>
                    <li><a href="faq.html">Faq</a></li>
                    <li class="submenu">
                    <a href="javascript:void(0);" class="show-submenu">Pages<i class="icon-down-open-mini"></i></a>
                    <ul>
                        <li><a href="RTL_version/index.html">RTL version</a></li>
                        <li><a href="admin.html">Admin section</a></li>
                        <li><a href="submit_driver.html">Submit Driver</a></li>
                        <li><a href="#0" data-toggle="modal" data-target="#login_2">User Login</a></li>
                        <li><a href="#0" data-toggle="modal" data-target="#register">User Register</a></li>
                        <li><a href="detail_page_2.html">Restaurant detail page</a></li>
                        <li><a href="blog.html">Blog</a></li>
                        <li><a href="contacts.html">Contacts</a></li>
                        <li><a href="coming_soon/index.html">Coming soon page</a></li>
                        <li><a href="shortcodes.html">Shortcodes</a></li>
                        <li><a href="icon_pack_1.html">Icon pack 1</a></li>
                        <li><a href="icon_pack_2.html">Icon pack 2</a></li>
                    </ul>
                    </li>
                    <li><a href="#0" data-toggle="modal" data-target="#login_2">Login</a></li>
                    <li><a href="#0">Purchase this template</a></li>
                </ul>
                
                
	
    </div>
   
            </div><!-- End main-menu -->
            </nav>
        </div><!-- End row -->
    <!-- End container -->
    </header>
	<!-- End Header =============================================== -->
    

    <!-- SubHeader =============================================== -->
    <section class="header-video">
    <div id="hero_video">
        <div id="sub_content">
            <h1>Order Takeaway or Delivery Food</h1>
            <p>
                Ridiculus sociosqu cursus neque cursus curae ante scelerisque vehicula.
            </p>
            <form method="post" action="list_page.html">
                <div id="custom-search-input">
                    <div class="input-group">
                        <input type="text" class=" search-query" placeholder="Your Address or postal code">
                        <span class="input-group-btn">
                        <input type="submit" class="btn_search" value="submit">
                        </span>
                    </div>
                </div>
            </form>
        </div><!-- End sub_content -->
    </div>
    <img src="<c:url value="resources/customer/video/intro.mp4"/>" alt="" class="header-video--media" data-video-src="<c:url value="resources/customer/video/intro.mp4"/>" data-teaser-source="<c:url value="resources/customer/video/intro"/>" data-provider="<c:url value="resources/customer/video/intro.mp4"/>" data-video-width="1920" data-video-height="960">
    <div id="count" class="hidden-xs">
        <ul>
            <li><span class="number">2650</span> Restaurant</li>
            <li><span class="number">5350</span> People Served</li>
            <li><span class="number">12350</span> Registered Users</li>
        </ul>
    </div>
    </section><!-- End Header video -->
    <!-- End SubHeader ============================================ -->
    
   <!-- Content ================================================== -->
         <div class="container margin_60">
        
         <div class="main_title">
            <h2 class="nomargin_top" style="padding-top:0">How it works</h2>
            <p>
                Cum doctus civibus efficiantur in imperdiet deterruisset.
            </p>
        </div>
        <div class="row">
            <div class="col-md-3">
                <div class="box_home" id="one">
                    <span>1</span>
                    <h3>Search by address</h3>
                    <p>
                        Find all restaurants available in your zone.
                    </p>
                </div>
            </div>
            <div class="col-md-3">
                <div class="box_home" id="two">
                    <span>2</span>
                    <h3>Choose a restaurant</h3>
                    <p>
                        We have more than 1000s of menus online.
                    </p>
                </div>
            </div>
            <div class="col-md-3">
                <div class="box_home" id="three">
                    <span>3</span>
                    <h3>Pay by card or cash</h3>
                    <p>
                        It's quick, easy and totally secure.
                    </p>
                </div>
            </div>
            <div class="col-md-3">
                <div class="box_home" id="four">
                    <span>4</span>
                    <h3>Delivery or takeaway</h3>
                    <p>
                        You are lazy? Are you backing home?
                    </p>
                </div>
            </div>
        </div><!-- End row -->
        
        <div id="delivery_time" class="hidden-xs">
            <strong><span>2</span><span>5</span></strong>
            <h4>The minutes that usually takes to deliver!</h4>
        </div>
        </div><!-- End container -->
            
    <div class="white_bg">
    <div class="container margin_60">
        
        <div class="main_title">
            <h2 class="nomargin_top">Choose from Most Popular</h2>
            <p>
                Cum doctus civibus efficiantur in imperdiet deterruisset.
            </p>
        </div>
        
        <div class="row">
            <div class="col-md-6">
                <a href="detail_page.html" class="strip_list">
                <div class="ribbon_1">Popular</div>
                    <div class="desc">
                        <div class="thumb_strip">
                            <img src="<c:url value="resources/customer/img/thumb_restaurant.jpg"/>" alt="">
                        </div>
                        <div class="rating">
                            <i class="icon_star voted"></i><i class="icon_star voted"></i><i class="icon_star voted"></i><i class="icon_star voted"></i><i class="icon_star"></i>
                        </div>
                        <h3>Taco Mexican</h3>
                        <div class="type">
                            Mexican / American
                        </div>
                        <div class="location">
                            135 Newtownards Road, Belfast, BT4. <span class="opening">Opens at 17:00</span>
                        </div>
                        <ul>
                            <li>Take away<i class="icon_check_alt2 ok"></i></li>
                            <li>Delivery<i class="icon_check_alt2 ok"></i></li>
                        </ul>
                    </div><!-- End desc-->
                </a><!-- End strip_list-->
               <a href="detail_page.html" class="strip_list">
               <div class="ribbon_1">Popular</div>
                    <div class="desc">
                        <div class="thumb_strip">
                            <img src="<c:url value="resources/customer/img/thumb_restaurant_2.jpg"/>" alt="">
                        </div>
                        <div class="rating">
                            <i class="icon_star voted"></i><i class="icon_star voted"></i><i class="icon_star voted"></i><i class="icon_star voted"></i><i class="icon_star"></i>
                        </div>
                        <h3>Naples Pizza</h3>
                        <div class="type">
                            Italian / Pizza
                        </div>
                        <div class="location">
                            135 Newtownards Road, Belfast, BT4. <span class="opening">Opens at 17:00</span>
                        </div>
                        <ul>
                            <li>Take away<i class="icon_check_alt2 ok"></i></li>
                            <li>Delivery<i class="icon_check_alt2 ok"></i></li>
                        </ul>
                    </div><!-- End desc-->
                </a><!-- End strip_list-->
                <a href="detail_page.html" class="strip_list">
                <div class="ribbon_1">Popular</div>
                    <div class="desc">
                        <div class="thumb_strip">
                            <img src="<c:url value="resources/customer/img/thumb_restaurant_3.jpg"/>" alt="">
                        </div>
                        <div class="rating">
                            <i class="icon_star voted"></i><i class="icon_star voted"></i><i class="icon_star voted"></i><i class="icon_star voted"></i><i class="icon_star"></i>
                        </div>
                        <h3>Japan Food</h3>
                        <div class="type">
                            Sushi / Japanese
                        </div>
                        <div class="location">
                            135 Newtownards Road, Belfast, BT4. <span class="opening">Opens at 17:00</span>
                        </div>
                        <ul>
                            <li>Take away<i class="icon_check_alt2 ok"></i></li>
                            <li>Delivery<i class="icon_check_alt2 ok"></i></li>
                        </ul>
                    </div><!-- End desc-->
                </a><!-- End strip_list-->
            </div><!-- End col-md-6-->
            <div class="col-md-6">
                <a href="detail_page.html" class="strip_list">
                <div class="ribbon_1">Popular</div>
                    <div class="desc">
                        <div class="thumb_strip">
                            <img src="<c:url value="resources/customer/img/thumb_restaurant_4.jpg"/>" alt="">
                        </div>
                        <div class="rating">
                            <i class="icon_star voted"></i><i class="icon_star voted"></i><i class="icon_star voted"></i><i class="icon_star voted"></i><i class="icon_star"></i>
                        </div>
                        <h3>Sushi Gold</h3>
                        <div class="type">
                            Sushi / Japanese
                        </div>
                        <div class="location">
                            135 Newtownards Road, Belfast, BT4. <span class="opening">Opens at 17:00</span>
                        </div>
                        <ul>
                            <li>Take away<i class="icon_check_alt2 ok"></i></li>
                            <li>Delivery<i class="icon_close_alt2 no"></i></li>
                        </ul>
                    </div><!-- End desc-->
                </a><!-- End strip_list-->
                <a href="detail_page.html" class="strip_list">
                <div class="ribbon_1">Popular</div>
                    <div class="desc">
                        <div class="thumb_strip">
                            <img src="<c:url value="resources/customer/img/thumb_restaurant_5.jpg"/>" alt="">
                        </div>
                        <div class="rating">
                            <i class="icon_star voted"></i><i class="icon_star voted"></i><i class="icon_star voted"></i><i class="icon_star voted"></i><i class="icon_star"></i>
                        </div>
                        <h3>Dragon Tower</h3>
                        <div class="type">
                            Chinese / Thai
                        </div>
                        <div class="location">
                            135 Newtownards Road, Belfast, BT4. <span class="opening">Opens at 17:00</span>
                        </div>
                        <ul>
                            <li>Take away<i class="icon_check_alt2 ok"></i></li>
                            <li>Delivery<i class="icon_check_alt2 ok"></i></li>
                        </ul>
                    </div><!-- End desc-->
                </a><!-- End strip_list-->
                <a href="detail_page.html" class="strip_list">
                <div class="ribbon_1">Popular</div>
                    <div class="desc">
                        <div class="thumb_strip">
                            <img src="<c:url value="resources/customer/img/thumb_restaurant_6.jpg"/>" alt="">
                        </div>
                        <div class="rating">
                            <i class="icon_star voted"></i><i class="icon_star voted"></i><i class="icon_star voted"></i><i class="icon_star voted"></i><i class="icon_star"></i>
                        </div>
                        <h3>China Food</h3>
                        <div class="type">
                            Chinese / Vietnam
                        </div>
                        <div class="location">
                            135 Newtownards Road, Belfast, BT4. <span class="opening">Opens at 17:00</span>
                        </div>
                        <ul>
                            <li>Take away<i class="icon_check_alt2 ok"></i></li>
                            <li>Delivery<i class="icon_check_alt2 ok"></i></li>
                        </ul>
                    </div><!-- End desc-->
                </a><!-- End strip_list-->
            </div>
        </div><!-- End row -->   
        
        </div><!-- End container -->
        </div><!-- End white_bg -->
        
       <div class="high_light">
      	<div class="container">
      		<h3>Choose from over 2,000 Restaurants</h3>
            <p>Ridiculus sociosqu cursus neque cursus curae ante scelerisque vehicula.</p>
            <a href="list_page.html">View all Restaurants</a>
        </div><!-- End container -->
      </div><!-- End hight_light -->
                  
    <section class="parallax-window" data-parallax="scroll" data-image-src="<c:url value="resources/customer/img/bg_office.jpg"/>" data-natural-width="1200" data-natural-height="600">
    <div class="parallax-content">
        <div class="sub_content">
            <i class="icon_mug"></i>
            <h3>We also deliver to your office</h3>
            <p>
                Ridiculus sociosqu cursus neque cursus curae ante scelerisque vehicula.
            </p>
        </div><!-- End sub_content -->
    </div><!-- End subheader -->
    </section><!-- End section -->
    <!-- End Content =============================================== -->
    
    <div class="container margin_60">
      <div class="main_title margin_mobile">
            <h2 class="nomargin_top">Work with Us</h2>
            <p>
                Cum doctus civibus efficiantur in imperdiet deterruisset.
            </p>
        </div>
      	<div class="row">
            <div class="col-md-4 col-md-offset-2">
            	<a class="box_work" href="submit_restaurant.html">
                <img src="<c:url value="resources/customer/img/submit_restaurant.jpg"/>" width="848" height="480" alt="" class="img-responsive">
                <h3>Submit your Restaurant<span>Start to earn customers</span></h3>
                <p>Lorem ipsum dolor sit amet, ut virtute fabellas vix, no pri falli eloquentiam adversarium. Ea legere labore eam. Et eum sumo ocurreret, eos ei saepe oratio omittantur, legere eligendi partiendo pro te.</p>
                <div class="btn_1">Read more</div>
                </a>
            </div>
            <div class="col-md-4">
            	<a class="box_work" href="submit_driver.html">
                <img src="<c:url value="resources/customer/img/delivery.jpg"/>" width="848" height="480" alt="" class="img-responsive">
				<h3>We are looking for a Driver<span>Start to earn money</span></h3>
                <p>Lorem ipsum dolor sit amet, ut virtute fabellas vix, no pri falli eloquentiam adversarium. Ea legere labore eam. Et eum sumo ocurreret, eos ei saepe oratio omittantur, legere eligendi partiendo pro te.</p>
                <div class="btn_1">Read more</div>
                </a>
            </div>
      </div><!-- End row -->
      </div><!-- End container -->
    

<%@ include file="/resources/customer/footer/footer.jsp" %>



<!-- SPECIFIC SCRIPTS -->
<script src="<c:url value="resources/customer/js/video_header.js"/>"></script>
<script>
$(document).ready(function() {
	'use strict';
   	  HeaderVideo.init({
      container: $('.header-video'),
      header: $('.header-video--media'),
      videoTrigger: $("#video-trigger"),
      autoPlayVideo: true
    });    

});
</script>

</body>
</html>
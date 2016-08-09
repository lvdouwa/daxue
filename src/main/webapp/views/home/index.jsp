<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>${jbxx.name}</title>

    <!-- Bootstrap -->
    <link href="<%=request.getContextPath()%>/webjars/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/main.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <link rel="icon" type="image/x-icon" href="/favicon.ico" />
    <![endif]-->
</head>
<body >

<div class="container-fluid navbar-wrapper ">
    <nav class="navbar navbar-home">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#cofounderslab-navbar" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>

                <a class="navbar-brand" href="/">
                    <img class="cofounderslab-logo" src="<%=request.getContextPath()%>/resources/img/logo/white.png" alt="[C]oFoundersLab"/>
                </a>
            </div>
            <div class="collapse navbar-collapse" id="cofounderslab-navbar">
                <ul class="nav navbar-nav navbar-right">
                    <li class="navbar-item"><a href="/search">Find A Co-Founder</a></li>
                    <li class="navbar-item"><a href="/events">Events</a></li>
                    <li class="navbar-item"><a href="http://learning.cofounderslab.com/" target="_blank">Learning Center</a></li>
                    <li class="go-pro"><a href="/premium-membership"><span class="btn btn-wired btn-wired-yellow">Go Premium</span></a></li>                                                                                            <li class="navbar-item"><a href="" data-toggle="modal" data-target="#login-modal">LOGIN</a></li>
                    <li class="navbar-item"><a href="" data-toggle="modal" data-target="#signup-modal">SIGNUP</a></li>
                </ul>
            </div>
        </div>
    </nav>
</div>

<div class="modal fade navbar-modal" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="login-modal-label">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <form id="login-form" action="/login-check-ajax" method="post">
                    <div class="row">
                        <div class="col-xs-12">
                            <div id='login-username' class='form-group'>
                                <input type="text" id="login_user_username" name="login_user[username]" class="form-control" placeholder="Email address" required>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-xs-12">
                            <div id='login-password' class='form-group'>
                                <input type="password" id="login_user_username" name="login_user[password]" class="form-control" placeholder="Password" required>
                            </div>
                        </div>
                    </div>
                    <div class="row navbar-modal-block">
                        <div class="col-xs-6">
                            <label class="modal-checkbox"><input type="checkbox"><small>Remember me</small></label>
                        </div>
                        <div class="col-xs-6 text-right">
                            <a href="/forgot-password" class="small-link"><small>Forgot pasword?</small></a>
                        </div>
                    </div>
                    <div class="row navbar-modal-block">
                        <div class="col-xs-12">
                            <button id="login-submit" type="submit" class="btn btn-block btn-cfl-blue">Log in</button>
                        </div>
                    </div>
                </form>
                <div class="row">
                    <div class="col-xs-5 separator-left"></div>
                    <div class="col-xs-1 separator-center"><p class="text-center"><small>or</small></p></div>
                    <div class="col-xs-5 separator-right"></div>
                </div>
                <div class="row navbar-modal-block">
                    <div class="col-xs-12">
                        <a href="/account/social/login/linkedin" class="btn btn-linkedin btn-block">
                            <div class="row">
                                <div class="col-xs-offset-2 col-xs-1">
                                    <i class="fa fa-linkedin"></i>
                                </div>
                                <div class="col-xs-7">Log in with Linkedin</div>
                            </div>
                        </a>
                    </div>
                </div>
                <div class="row navbar-modal-block">
                    <div class="col-xs-12">
                        <a href="/account/social/login/facebook" class="btn btn-facebook btn-block">
                            <div class="row">
                                <div class="col-xs-offset-2 col-xs-1">
                                    <i class="fa fa-facebook"></i>
                                </div>
                                <div class="col-xs-7">Log in with Facebook</div>
                            </div>
                        </a>
                    </div>
                </div>
                <div class="row navbar-modal-block">
                    <div class="col-xs-12">
                        <a href="/account/social/login/google" class="btn btn-google btn-block">
                            <div class="row">
                                <div class="col-xs-offset-2 col-xs-1">
                                    <i class="fa fa-google"></i>
                                </div>
                                <div class="col-xs-7">Log in with Google</div>
                            </div>
                        </a>
                    </div>
                </div>
                <div class="row navbar-modal-block">
                    <div class="col-xs-12"><div class='separator'></div></div>
                </div>
                <div class="row">
                    <div class="col-xs-12">
                        <small>Don't have an account?  <strong><a id="go-signup" href="javascript:;" class="small-link">Sign up</a></strong></small>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="modal fade navbar-modal" id="signup-modal" tabindex="-1" role="dialog" aria-labelledby="signup-modal-label">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <div id="signup-main">
                    <div class="row navbar-modal-block">
                        <div class="col-xs-12">
                            <a id="btn-signup-email" href="javascript:;" class="btn btn-cfl-blue btn-block">
                                <div class="row">
                                    <div class="col-xs-offset-2 col-xs-1">
                                        <i class="fa fa-envelope-o"></i>
                                    </div>
                                    <div class="col-xs-7">Sign up with Email</div>
                                </div>
                            </a>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-xs-5 separator-left"></div>
                        <div class="col-xs-1 separator-center"><p class="text-center"><small>or</small></p></div>
                        <div class="col-xs-5 separator-right"></div>
                    </div>
                    <div class="row navbar-modal-block">
                        <div class="col-xs-12">
                            <a href="/account/social/register/linkedin" class="btn btn-linkedin btn-block">
                                <div class="row">
                                    <div class="col-xs-offset-2 col-xs-1">
                                        <i class="fa fa-linkedin"></i>
                                    </div>
                                    <div class="col-xs-7">Sign up with Linkedin</div>
                                </div>
                            </a>
                        </div>
                    </div>
                    <div class="row navbar-modal-block">
                        <div class="col-xs-12">
                            <a href="/account/social/register/facebook" class="btn btn-facebook btn-block">
                                <div class="row">
                                    <div class="col-xs-offset-2 col-xs-1">
                                        <i class="fa fa-facebook"></i>
                                    </div>
                                    <div class="col-xs-7">Sign up with Facebook</div>
                                </div>
                            </a>
                        </div>
                    </div>
                    <div class="row navbar-modal-block">
                        <div class="col-xs-12">
                            <a href="/account/social/register/google" class="btn btn-google btn-block">
                                <div class="row">
                                    <div class="col-xs-offset-2 col-xs-1">
                                        <i class="fa fa-google"></i>
                                    </div>
                                    <div class="col-xs-7">Sign up with Google</div>
                                </div>
                            </a>
                        </div>
                    </div>
                    <div class="row navbar-modal-block">
                        <div class="col-xs-12">
                            <small>By signing up, I agree to CoFoundersLab's <a class="small-link" href="/terms" target="_blank"><strong>Terms of Service</strong></a> and <a class="small-link" href="/privacy" target="_blank"><strong>Privacy Policy</strong></a></small>
                        </div>
                    </div>
                    <div class="row navbar-modal-block">
                        <div class="col-xs-12"><div class='separator'></div></div>
                    </div>
                    <div class="row">
                        <div class="col-xs-12">
                            <small>Already a CoFoundersLab member?  <strong><a class="go-login small-link" href="javascript:;">Log in</a></strong></small>
                        </div>
                    </div>
                </div>
                <div id='signup-email' style="display:none;">
                    <form id="signup-form" action="/api/v1/signup" method="post">
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="form-group">
                                    <input id="firstName" name="first_name" type="text" class="form-control" placeholder="First name" required>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="form-group">
                                    <input id="lastName" name="last_name" type="text" class="form-control" placeholder="Last name" required>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="form-group">
                                    <label class="modal-checkbox"><input name="alias_check" id="chck-alias" type="checkbox"><small>Hide my real name (optional)</small></label>
                                </div>
                            </div>
                        </div>
                        <div id="input-alias" class="row" style="display: none">
                            <div class="col-xs-12">
                                <div class="form-group">
                                    <input id="alias" name="alias" type="text" class="form-control" placeholder="Alias">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="form-group">
                                    <input id="email" name= "email" type="text" class="form-control" placeholder="Email address" required>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="form-group">
                                    <input id="password" name="password" type="password" class="form-control" placeholder="Password" required>
                                    <p><small>Your password must contains at least 8 characters, one capital letter and one number.</small></p>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="form-group">
                                    <input id="confirm-password" type="password" class="form-control" placeholder="Confirm Password" required>
                                </div>
                            </div>
                        </div>
                        <div class="row navbar-modal-block">
                            <div class="col-xs-12">
                                <button id="signup-submit" type="submit" class="btn btn-block btn-cfl-blue">Sign up</button>
                            </div>
                        </div>
                    </form>
                    <div class="row navbar-modal-block">
                        <div class="col-xs-12">
                            <small>By signing up, I agree to CoFoundersLab's <a class="small-link" href="/terms" target="_blank"><strong>Terms of Service</strong></a> and <a class="small-link" href="/privacy" target="_blank"><strong>Privacy Policy</strong></a></small>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-xs-5 separator-left"></div>
                        <div class="col-xs-1 separator-center"><p class="text-center"><small>or</small></p></div>
                        <div class="col-xs-5 separator-right"></div>
                    </div>
                    <div class="row navbar-modal-block">
                        <div class="col-xs-12">
                            <small>Signing up with <strong><a class="small-link" href="/account/social/register/linkedin">Linkedin</a></strong>, <strong><a class="small-link" href="/account/social/register/facebook">Facebook</a></strong> or <strong><a class="small-link" href="/account/social/register/google">Google</a></strong></small>
                        </div>
                    </div>
                    <div class="row navbar-modal-block">
                        <div class="col-xs-12"><div class='separator'></div></div>
                    </div>
                    <div class="row">
                        <div class="col-xs-12">
                            <small>Already a CoFoundersLab member?  <strong><a class="go-login small-link" href="javascript:;">Log in</a></strong></small>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="container">
</div>

<div class="header header-home" style="background-image: url('<%=request.getContextPath()%>/resources/img/header/header-1.jpg')">
    <div class="header-overlay"></div>
    <div class="header-text">
        <h1>The fastest way to meet 250,000+ entrepreneurs</h1>
    </div>

    <div id="search-form-container" class="search-form">
    </div>
</div>
<div class='container'>
    <div class="row">
        <div class="col-xs-12 col-md-12">
            <h1 class="gallery-title">Connect with people who have expertise as</h1>
            <h3 class="gallery-subtitle">Get access to potential teammates that have complimentary skillsets</h3>
        </div>
    </div>

    <div class="row gallery-row">
        <a href="/search?role=founder&amp;looking_role=founder&amp;area=business-development">
            <div class="col col-xs-12 col-sm-4 col-md-4 col-lg-4">
                <div class="gallery-wrap">
                    <div class="gallery-item gallery-item-square" style="background-image: url('/resources/img/areas/business_developers.jpg')">
                        <div class="gallery-item-overlay"></div>
                        <div class="gallery-item-ribbon"></div>
                        <div class="gallery-item-text text-center">
                            <p>38,323</p>
                            <p>Business Developers</p>
                        </div>
                    </div>
                </div>
            </div>
        </a>
        <a href="/search?role=founder&amp;looking_role=founder&amp;area=product-management">
            <div class="col col-xs-12 col-sm-4 col-md-4 col-lg-4">
                <div class="gallery-wrap">
                    <div class="gallery-item gallery-item-square" style="background-image: url('/resources/img/areas/product_managers.jpg')">
                        <div class="gallery-item-overlay"></div>
                        <div class="gallery-item-ribbon"></div>
                        <div class="gallery-item-text text-center">
                            <p>14,158</p>
                            <p>Product Managers</p>
                        </div>
                    </div>
                </div>
            </div>
        </a>
        <a href="/search?role=founder&amp;looking_role=founder&amp;area=marketing">
            <div class="col col-xs-12 col-sm-4 col-md-4 col-lg-4">
                <div class="gallery-wrap">
                    <div class="gallery-item gallery-item-square" style="background-image: url('/resources/img/areas/marketers.jpg')">
                        <div class="gallery-item-overlay"></div>
                        <div class="gallery-item-ribbon"></div>
                        <div class="gallery-item-text text-center">
                            <p>11,978</p>
                            <p>Marketers</p>
                        </div>
                    </div>
                </div>
            </div>
        </a>
    </div>
    <div class="row gallery-row">
        <a href="/search?role=founder&amp;looking_role=founder&amp;area=programming-development">
            <div class="col col-xs-12 col-sm-4 col-md-4 col-lg-4">
                <div class="gallery-wrap">
                    <div class="gallery-item gallery-item-square" style="background-image: url('/resources/img/resources/areas/programmers_developers.jpg')">
                        <div class="gallery-item-overlay"></div>
                        <div class="gallery-item-ribbon"></div>
                        <div class="gallery-item-text text-center">
                            <p>11,865</p>
                            <p>Programmers/Developers</p>
                        </div>
                    </div>
                </div>
            </div>
        </a>
        <a href="/search?role=founder&amp;looking_role=founder&amp;area=engineering">
            <div class="col col-xs-12 col-sm-4 col-md-4 col-lg-4">
                <div class="gallery-wrap">
                    <div class="gallery-item gallery-item-square" style="background-image: url('/resources/img/areas/engineers.jpg')">
                        <div class="gallery-item-overlay"></div>
                        <div class="gallery-item-ribbon"></div>
                        <div class="gallery-item-text text-center">
                            <p>7,307</p>
                            <p>Engineers</p>
                        </div>
                    </div>
                </div>
            </div>
        </a>
        <a href="/search?role=founder&amp;looking_role=founder&amp;area=design">
            <div class="col col-xs-12 col-sm-4 col-md-4 col-lg-4">
                <div class="gallery-wrap">
                    <div class="gallery-item gallery-item-square" style="background-image: url('/resources/img/areas/designers.jpg')">
                        <div class="gallery-item-overlay"></div>
                        <div class="gallery-item-ribbon"></div>
                        <div class="gallery-item-text text-center">
                            <p>6,597</p>
                            <p>Designers</p>
                        </div>
                    </div>
                </div>
            </div>
        </a>
    </div>
    <div class="row gallery-row">
    </div>
</div>
<div class='container'>
    <div class="row">
        <div class="col-xs-12 col-md-12">
            <h1 class="gallery-title">Pick an industry of interest</h1>
            <h3 class="gallery-subtitle">Connect with like-minded people in your industry who share similar passions</h3>
        </div>
    </div>

    <div class="row gallery-row">
        <a href="/search?role=founder&amp;looking_role=founder&amp;industry=Media">
            <div class="col col-xs-12 col-sm-4 col-md-4 col-lg-4">
                <div class="gallery-wrap">
                    <div class="gallery-item gallery-item-square" style="background-image: url('/resources/img/industry/media.jpg')">
                        <div class="gallery-item-overlay"></div>
                        <div class="gallery-item-ribbon"></div>
                        <div class="gallery-item-text text-center">
                            <p>Media</p>
                        </div>
                    </div>
                </div>
            </div>
        </a>

        <a href="/search?role=founder&amp;looking_role=founder&amp;industry=Real+Estate">
            <div class="col col-xs-12 col-sm-4 col-md-4 col-lg-4">
                <div class="gallery-wrap">
                    <div class="gallery-item gallery-item-square" style="background-image: url('/resources/img/industry/real_estate.jpg')">
                        <div class="gallery-item-overlay"></div>
                        <div class="gallery-item-ribbon"></div>
                        <div class="gallery-item-text text-center">
                            <p>Real Estate</p>
                        </div>
                    </div>
                </div>
            </div>
        </a>

        <a href="/search?role=founder&amp;looking_role=founder&amp;industry=Food+and+Beverage">
            <div class="col col-xs-12 col-sm-4 col-md-4 col-lg-4">
                <div class="gallery-wrap">
                    <div class="gallery-item gallery-item-square" style="background-image: url('/resources/img/industry/food_and_beverage.jpg')">
                        <div class="gallery-item-overlay"></div>
                        <div class="gallery-item-ribbon"></div>
                        <div class="gallery-item-text text-center">
                            <p>Food and Beverage</p>
                        </div>
                    </div>
                </div>
            </div>
        </a>

    </div>
    <div class="row gallery-row">
        <a href="/search?role=founder&amp;looking_role=founder&amp;industry=Technology">
            <div class="col col-xs-12 col-sm-4 col-md-4 col-lg-4">
                <div class="gallery-wrap">
                    <div class="gallery-item gallery-item-square" style="background-image: url('/resources/img/industry/technology.jpg')">
                        <div class="gallery-item-overlay"></div>
                        <div class="gallery-item-ribbon"></div>
                        <div class="gallery-item-text text-center">
                            <p>Technology</p>
                        </div>
                    </div>
                </div>
            </div>
        </a>

        <a href="/search?role=founder&amp;looking_role=founder&amp;industry=Mobile">
            <div class="col col-xs-12 col-sm-4 col-md-4 col-lg-4">
                <div class="gallery-wrap">
                    <div class="gallery-item gallery-item-square" style="background-image: url('/resources/img/industry/mobile.jpg')">
                        <div class="gallery-item-overlay"></div>
                        <div class="gallery-item-ribbon"></div>
                        <div class="gallery-item-text text-center">
                            <p>Mobile</p>
                        </div>
                    </div>
                </div>
            </div>
        </a>

        <a href="/search?role=founder&amp;looking_role=founder&amp;industry=Entertainment">
            <div class="col col-xs-12 col-sm-4 col-md-4 col-lg-4">
                <div class="gallery-wrap">
                    <div class="gallery-item gallery-item-square" style="background-image: url('/resources/img/industry/entertainment.jpg')">
                        <div class="gallery-item-overlay"></div>
                        <div class="gallery-item-ribbon"></div>
                        <div class="gallery-item-text text-center">
                            <p>Entertainment</p>
                        </div>
                    </div>
                </div>
            </div>
        </a>

    </div>
    <div class="row gallery-row">
    </div>
</div>

<div class="container-fluid footer-wrapper">
    <div class="container">
        <div class='footer-top'>
            <div class="row">
                <div class="col-md-4">
                    <p>Company</p>
                    <ul>
                        <li><a href="/about">About</a></li>
                        <li><a href="/team">Team</a></li>
                        <li><a href="/contact">Contact</a></li>
                        <li><a href="http://blog.cofounderslab.com/" target="_blank">Blog</a></li>
                    </ul>
                </div>
                <div class="col-md-4">
                    <p>Community</p>
                    <ul>
                        <li><a href="/premium-membership">Pricing</a></li>
                        <li><a href="/benefits">Member benefits</a></li>
                        <li><a href="http://fundraising.cofounderslab.com/">Fundraise</a></li>
                        <li><a href="/faq">Help</a></li>
                    </ul>
                </div>
                <div class="col-md-4">
                    <p>Sign up for CoFoundersLab updates</p>
                    <div id="subscribe-form-container">
                    </div>
                    <span class="social-icon">
                        <a href="https://twitter.com/CoFoundersLab" title="Follow us on Twitter" target="_blank">
                            <i class="fa fa-twitter" aria-hidden="true"></i>
                        </a>
                    </span>
                    <span class="social-icon">
                        <a href="https://www.facebook.com/CoFoundersLab/" title="Follow us on Facebook" target="_blank">
                            <i class="fa fa-facebook" aria-hidden="true"></i>
                        </a>
                    </span>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-md-12">
                <div class="separator separator-white"></div>
            </div>
        </div>

        <div class='footer-bottom'>
            <div class="row">
                <div class="col-md-4 col-xs-6">
                    <picture>
                        <source srcset="<%=request.getContextPath()%>/resources/img/logo/blue_cropped.png" media="(max-width: 480px)">
                        <img class="cofounderslab-logo" src="<%=request.getContextPath()%>/resources/img/logo/blue.png" alt="[C]oFoundersLab"/>
                    </picture>
                    <span class="copyright">&copy;2016</span>
                </div>
                <div class="col-md-4 col-md-offset-4 col-xs-6 text-right footer-bottom-links">
                    <span><a href="/privacy">Privacy Policy</a></span><span><a href="/terms">Terms of Service</a></span>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<%=request.getContextPath() %>/webjars/jquery/2.1.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="<%=request.getContextPath() %>/webjars//bootstrap/3.1.0/js/bootstrap.min.js"></script>

<script>
    $(function(){
        $('#cofounderslab-navbar').on('show.bs.collapse', function(){
            $(this).closest('.navbar').addClass('navbar-shown');
        });

        $('#cofounderslab-navbar').on('hidden.bs.collapse', function(){
            $(this).closest('.navbar').removeClass('navbar-shown');
        });
    });
</script>

</body>
</html>

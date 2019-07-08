<#import "parts/common.ftl" as c>
<#import "parts/page-head.ftl" as head>
<#import "parts/page-body.ftl" as body>

<@c.page>
    <@head.head title="VISIONZERO">
        <link href="/css/login.css" rel="stylesheet" />
    </@head.head>
    <@body.body>
        <div id="login">
            <h3 class="text-center pt-5">VISION ZERO Вход:</h3>
            <div class="container">
                <div id="login-row" class="row justify-content-center align-items-center">
                    <div id="login-column" class="col-md-6">
                        <div id="login-box" class="col-md-12">
                            <form id="login-form" class="form" action="/login" method="post">
                                <div class="form-group">
                                    <label for="username" class="text-info">Логин:</label><br>
                                    <input type="text" name="username" id="username" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label for="password" class="text-info">Пароль:</label><br>
                                    <input type="password" name="password" id="password" class="form-control">
                                </div>
                                <div class="form-group">
                                    <!--<label for="remember-me" class="text-info"><span>Remember me</span> <span><input id="remember-me" name="remember-me" type="checkbox"></span></label><br>-->
                                    <input type="submit" name="submit" class="btn btn-info btn-md" value="Вход">
                                </div>
                                <input type="hidden" name="_csrf" value="${_csrf.token}">
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </@body.body>
</@c.page>
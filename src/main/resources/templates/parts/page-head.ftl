<#macro head title>
    <meta charset="UTF-8" />
    <link href="/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="/js/bootstrap.min.js"></script>
    <script src="/js/jquery.min.js"></script>
    <#nested />
    <title>${title}</title>
</#macro>
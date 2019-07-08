<#import "parts/common.ftl" as c>
<#import "parts/page-head.ftl" as h>
<#import "parts/page-body.ftl" as b>
<#import "parts/header.ftl" as header>
<#import "parts/qblock.ftl" as qblock>


<@c.page>
    <@h.head title="VISONZERO">
        <link href="/css/form.css" rel="stylesheet" />
    </@h.head>
    <@b.body>
        <@header.header />
        <p>
            <span class="welcome">Добрый день уважаемый,&nbsp;<span class="fio">${user.name}</span></span>
            <h4 style="margin-bottom: 0">Пожалуйста, оцените уровень выполнения "Золотых правил":</h4>
            <ul class="rules">
                <li style="color: green">ЗЕЛЕНЫЙ - Выполняется в полной мере;</li>
                <li style="color: orange">ЖЕЛТЫЙ - Есть над чем поработать;</li>
                <li style="color: red">КРАСНЫЙ - необходимо принять меры.</li>
            </ul>
        </p>
        <#assign colors = ["#c1c1c1"] />
        <#assign blockNum = 1 />
        <#list blocks as block>
        <h2 class="block-name">${block.name}</h2>
            <#assign categoryNum = 1>
            <#list block.categories as category>
                <@qblock.category number=categoryNum text=category.name color=colors[blockNum-1] questions=category.questions />
                <#assign categoryNum++>
            </#list>
        </#list>
    </@b.body>
</@c.page>
<#macro header>
    <nav class="navbar navbar-light bg-light header">
        <div class="navbar-brand">VISION ZERO&nbsp;<span>Семь "золотых правил" производства с нулевым травматизмом и безопасными условиями труда.</span></div>
        <form class="form-inline" action="/logout" method="post">
            <input class="btn btn-outline-success my-2 my-sm-0" type="submit" value="Выход">
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
        </form>
    </nav>
</#macro>
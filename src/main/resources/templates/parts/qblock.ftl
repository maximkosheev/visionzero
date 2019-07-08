<#macro category number text color questions>
    <div>
        <table class="category">
            <thead>
                <tr>
                    <th class="category-name-th" style="background-color: ${color}"><span class="category-num">${number}</span>&nbsp;${text}</th>
                    <th class="category-rating-th">Индивидуальный рейтинг</th>
                    <th class="category-rating-th">Общий рейтинг</th>
                </tr>
            </thead>
            <tbody>
                <#list questions as question>
                    <tr class="question">
                        <td>${question.name}</td>
                        <td></td>
                        <td></td>
                    </tr>
                </#list>
            </tbody>
        </table>
    </div>
</#macro>
<#import "parts/common.ftl" as c>

<@c.page>
<#--    <div class="form-group row">-->
<#--        <form method="post" class="ml-3">-->
<#--            <input type="text" name="speciality" class="form-control mb-3" value="<#if doctor??>${doctor.speciality}</#if>" placeholder="Профессия">-->
<#--            <input type="text" name="name" class="form-control mb-3" value="<#if doctor??>${doctor.name}</#if>" placeholder="ФИО">-->
<#--            <input type="text" name="link" class="form-control mb-3" value="<#if doctor??>${doctor.link}</#if>" placeholder="Ссылка">&ndash;&gt;-->
<#--            <button class="btn btn-primary" type="submit">Добавить</button>-->
<#--        </form>-->
<#--    </div>-->
    <div class="form-row">
    <div class="form-group col-md-6">
        <form method ="get" action="/main" class="form-inline">
            <input type="text" name="filter" class="form-control" value="${filter?if_exists}" placeholder="Найти специалиста">
            <button type="submit" class="btn btn-primary ml-2">Поиск</button>
        </form>
    </div>
    </div>
    <h1>Список врачей:</h1>
    <div class="card-columns">
        <#list doctors as doctor>
            <div class="card my-3">
                <div class="m-2">
                    <span>${doctor.speciality}</span>
                </div>
                <div class="card-footer text-muted">
                    ${doctor.name}
                </div>
            </div>
        <#else>
            Специалист не найден
        </#list>
    </div>
</@c.page>

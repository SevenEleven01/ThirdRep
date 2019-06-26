<#import "parts/common.ftl" as c>

<@c.page>
    <h5>Запись</h5>
    <div>
        <p>Чтобы записаться к специалисту, необходимо выполнить следующие действия:</p>
        <p>1. Выбрать специалиста, к которому вы хотите записаться.</p>
        <p>2. Выбрать подходящее вам время приёма из незанятого.</p>
    </div>
<#--    <div class="form-group row">-->
<#--        <form method="post" class="ml-3">-->
<#--            <input type="text" name="time" class="form-control mb-3" value="<#if busy??>${busy.time}</#if>" placeholder="Время приёма">-->
<#--            <button class="btn btn-primary" type="submit">Добавить</button>-->
<#--        </form>-->
<#--    </div>-->
    <div>
        <div class="dropdown open my-3">
            <input class="btn btn-secondary dropdown-toggle" type="button" value="<#if speciality?? && name??>${speciality} ${name}<#else>Специалист:</#if>" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <div class="dropdown-menu " aria-labelledby="dropdownMenuButton">
                <#list doctors as doctor>
                    <a class="dropdown-item" href="${doctor.link}">${doctor.speciality} ${doctor.name}</a>
                </#list>
            </div>
        </div>
    </div> <#--Выпадающий список-->
    <#if speciality?? && name??>
    <div>
        <div class="mb-3">
            Время приёма специалиста:
        </div>
        <div>
            <#list  busies as busy>
                <button name="${busy.time}" type="submit" class="btn btn-primary ml-2">${busy.time}</button>
            <#else>
                <p>В данный момент к специалисту нет записи.</p>
            </#list>
        </div>
    </div>
    </#if>
</@c.page>
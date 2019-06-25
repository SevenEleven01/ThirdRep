<#import "parts/common.ftl" as c>

<@c.page>
    <h5>Запись</h5>
    <div>
        <p>Чтобы записаться к специалисту, необходимо выполнить следующие действия:</p>
        <p>1. Выбрать специалиста, к которому вы хотите записаться.</p>
        <p>2. Выбрать подходящее вам время приёма из незанятого.</p>
    </div>
    <div>
        <div class="dropdown open my-3">
            <input class="btn btn-secondary dropdown-toggle" type="button" value="<#if speciality?? && name??>${speciality} ${name}<#else>Специалист:</#if>" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <div class="dropdown-menu " aria-labelledby="dropdownMenuButton">
                <#list doctors as doctor>
                    <a class="dropdown-item" href="${doctor.link}">${doctor.speciality} ${doctor.name}</a>
                </#list>
            </div>
        </div>
    </div>
    <#if speciality?? && name??>
    <div>
        Сюда нужно вывести время приёма специалиста: ${speciality} ${name}
    </div>
    </#if>
</@c.page>
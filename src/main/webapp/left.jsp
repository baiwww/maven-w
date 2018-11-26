<%@page pageEncoding="utf-8" %>

<script type="text/javascript">
    $(function () {
        $.getJSON(
            "${pageContext.request.contextPath}/menu/selectmenu.do",
            function (res) {
                console.log(res);
                $.each(res, function (idx, m) {

                    $("#aa").accordion("add", {
                        title: m.title
                    })
                })
            }
        )


    });

</script>


<%--<div data-options="region:'west',title:'导航菜单',split:true" style="width:220px;">--%>
<div id="aa" class="easyui-accordion" data-options="fit:true">

</div>
<%-- </div>--%>
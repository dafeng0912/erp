/*<script type="text/javascript" src="/erp/ui/plugin/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="/erp/ui/plugin/jquery.serializejson.js"></script>
<script type="text/javascript" src="/erp/ui/layui/layui.js"></script>

<script>
layui.use(['element','table','laypage','layer'], function(){
    var element = layui.element;                                
    var table = layui.table;
    var laypage = layui.laypage;
    var layer = layui.layer;


     
   * 表格初始化渲染
   
   var tableIns = table.render({
    elem: '#dep'
    // ,height: 600
    ,skin: 'line'                                            //行边框风格
    ,size: 'sm'                                              //小尺寸的表格
    ,url:'/erp/dep_list'                                     //数据接口
    ,loading: true                                            //分页时出现加载条
    ,toolbar: "toolbar"                                           //打开右侧导航栏
    ,limits:[5,10,20,30,40,50,60,70,80,90]
    ,cols: [[ //表头
     {field: 'uuid', title: '部门编号', sort: true, fixed: 'left'}
    ,{field: 'name', title: '部门名称'}
    ,{field: 'tele', title: '部门电话' }
    ,{title: '操作', 
        templet: function(d){
         return '  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>'
                 +'<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>'
    }}
     ]]
    ,page: true //开启分页
    ,parseData: function(res){                               //res 即为原始返回的数据
      return {
        "code": res.code,                                    //解析接口状态
        "msg": res.msg,                                      //解析提示文本
        "count": res.count,                                  //解析数据长度
        "data": res.data                                     //解析数据列表
      };}
      ,request:{
        pageName: 'curr' //页码的参数名称，默认：page
        ,limitName: 'nums' //每页数据量的参数名，默认：limit
      }
      ,defaultToolbar: [{                                    //为默认加上添加按钮
        title: '添加'                                        //标题
        ,layEvent: 'LAYTABLE_ADD'                           //事件名，用于 toolbar 事件中使用
        ,icon: 'layui-icon-add-1'                           //图标类名
      },'filter', 'print', 'exports']                       //可以控制顺序
    });

    *//**
     * 条件查询语句
     *  layui提供的异步表格重载
     *//* 
    $('#btnSearch').bind('click',function(){
        var formData = $('#searchForm').serializeJSON(); 
        // alert(JSON.stringify(formData));
        
        // 数据重载
        tableIns.reload({
        url: 'dep_search'
        ,contentType: 'application/json'
        ,page: {curr:1}
        ,where: formData         //设定异步数据接口的额外参数
        });
    });

    *//**
     * 监听操作按钮事件
     *//*
    table.on('tool(deptable)', function(obj){                 //注：tool 是工具条事件名
    var data = obj.data;                                    //获得当前行数据
    var layEvent = obj.event;                               //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
    var tr = obj.tr; //获得当前行 tr 的 DOM 对象（如果有的话）
    // alert(data.uuid)
    alert(layEvent);
    if(layEvent === 'del'){ //删除
        layer.confirm('真的删除行么', function(index){
        *//**
         * if（最后一页）
         *    直接删除
         * else
         *    删除以后刷新页面
         *//*
        $.ajax({
            url:'dep_delete'
            ,dataType:'application/json'
            ,data:data
            ,success:function(result){
            alert(result.msg);
            obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
            }
        });
        layer.close(index);
        })
    } else if(layEvent === 'edit'){ //编辑
        //弹出层
        layer.open({
        type: 2
        ,title: '编辑'
        // area: ['700px', '450px']
        ,skin: 'layui-layer-demo' //样式类名
        ,closeBtn: 2 
        ,anim: 2
        ,shadeClose: true //开启遮罩关闭
        ,content: 'editlayer.html'
        ,btn: ['更改', '取消']
        ,yes: function(index, layero){
            //按钮【按钮一】的回调
        },btn2: function(index, layero){
            //按钮【按钮二】的回调
            //return false 开启该代码可禁止点击该按钮关闭
        },cancel: function(){ 
            //右上角关闭回调
            
            //return false 开启该代码可禁止点击该按钮关闭
        },btnAlign: 'c'             //按钮居中对齐
        });
    } else if(layEvent === 'LAYTABLE_ADD'){
        alert('Hi，头部工具栏扩展的右侧图标。');
    }
    })

})
</script>*/
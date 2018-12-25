$.extend($.fn.validatebox.defaults.rules, {  
                CHS: {  
                    validator: function (value, param) {  
                        return /^[\u0391-\uFFE5]+$/.test(value);  
                    },  
                    message: '请输入汉字'  
                },  
                english : {// 验证英语  
                    validator : function(value) {  
                        return /^[A-Za-z]+$/i.test(value);  
                    },  
                    message : '请输入英文'  
                },  
                ip : {// 验证IP地址  
                    validator : function(value) {  
                        return /\d+\.\d+\.\d+\.\d+/.test(value);  
                    },  
                    message : 'IP地址格式不正确'  
                },  
                ZIP: {  
                    validator: function (value, param) {  
                        return /^[0-9]\d{5}$/.test(value);  
                    },  
                    message: '邮政编码不存在'  
                },  
                QQ: {  
                    validator: function (value, param) {  
                        return /^[1-9]\d{4,10}$/.test(value);  
                    },  
                    message: 'QQ号码不正确'  
                },  
                mobile: {  
                    validator: function (value, param) {  
                        return /^(?:1\d)-?\d{6}(\d{3}|\*{3})$/.test(value);  
                    },  
                    message: '手机号码不正确'  
                },  
                tel:{  
                    validator:function(value,param){  
                        return /^(\d{3}-|\d{4}-)?(\d{8}|\d{7})?(-\d{1,6})?$/.test(value);  
                    },  
                    message:'电话号码不正确'  
                },  
                mobileAndTel: {  
                    validator: function (value, param) {  
                        return /(^([0\+]\d{2,3})\d{3,4}\-\d{3,8}$)|(^([0\+]\d{2,3})\d{3,4}\d{3,8}$)|(^([0\+]\d{2,3}){0,1}13\d{9}$)|(^\d{3,4}\d{3,8}$)|(^\d{3,4}\-\d{3,8}$)/.test(value);  
                    },  
                    message: '请正确输入电话号码'  
                },  
                number: {  
                    validator: function (value, param) {  
                        return /^[0-9]+.?[0-9]*$/.test(value);  
                    },  
                    message: '请输入数字'  
                },  
                money:{  
                    validator: function (value, param) {  
                        return (/^(([1-9]\d*)|\d)(\.\d{1,2})?$/).test(value);  
                     },  
                     message:'请输入正确的金额'  
  
                },  
                mone:{  
                    validator: function (value, param) {  
                        return (/^(([1-9]\d*)|\d)(\.\d{1,2})?$/).test(value);  
                     },  
                     message:'请输入整数或小数'  
  
                },  
                integer:{  
                    validator:function(value,param){  
                        return /^[+]?[1-9]\d*$/.test(value);  
                    },  
                    message: '请输入最小为1的整数'  
                },  
                integ:{  
                    validator:function(value,param){  
                        return /^[+]?[0-9]\d*$/.test(value);  
                    },  
                    message: '请输入整数'  
                },  
                range:{  
                    validator:function(value,param){  
                        if(/^[1-9]\d*$/.test(value)){  
                            return value >= param[0] && value <= param[1]  
                        }else{  
                            return false;  
                        }  
                    },  
                    message:'输入的数字在{0}到{1}之间'  
                },  
                minLength:{  
                    validator:function(value,param){  
                        return value.length >=param[0]  
                    },  
                    message:'至少输入{0}个字'  
                },  
                maxLength:{  
                    validator:function(value,param){  
                        return value.length<=param[0]  
                    },  
                    message:'最多{0}个字'  
                },  
                //select即选择框的验证  
                selectValid:{  
                    validator:function(value,param){  
                        if(value == param[0]){  
                            return false;  
                        }else{  
                            return true ;  
                        }  
                    },  
                    message:'请选择'  
                },  
                idCode:{  
                    validator:function(value,param){  
                        return /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/.test(value);  
                    },  
                    message: '请输入正确的身份证号'  
                },  
                loginName: {  
                    validator: function (value, param) {  
                        return /^[\u0391-\uFFE5\w]+$/.test(value);  
                    },  
                    message: '登录名称只允许汉字、英文字母、数字及下划线。'  
                },  
                equalTo: {  
                    validator: function (value, param) {  
                        return value == $(param[0]).val();  
                    },  
                    message: '两次输入的字符不一至'  
                },  
                englishOrNum : {// 只能输入英文和数字  
                    validator : function(value) {  
                        return /^[a-zA-Z0-9_ ]{1,}$/.test(value);  
                    },  
                    message : '请输入英文、数字、下划线或者空格'  
                },  
               xiaoshu:{   
                validator : function(value){   
                return /^(([1-9]+)|([0-9]+\.[0-9]{1,2}))$/.test(value);  
                },   
                message : '最多保留两位小数！'      
                },  
            ddPrice:{  
                validator:function(value,param){  
                    if(/^[1-9]\d*$/.test(value)){  
                        return value >= param[0] && value <= param[1];  
                    }else{  
                        return false;  
                    }  
                },  
                message:'请输入1到100之间正整数'  
            },  
            jretailUpperLimit:{  
                validator:function(value,param){  
                    if(/^[0-9]+([.]{1}[0-9]{1,2})?$/.test(value)){  
                        return parseFloat(value) > parseFloat(param[0]) && parseFloat(value) <= parseFloat(param[1]);  
                    }else{  
                        return false;  
                    }  
                },  
                message:'请输入0到100之间的最多俩位小数的数字'  
            },  
            rateCheck:{  
                validator:function(value,param){  
                    if(/^[0-9]+([.]{1}[0-9]{1,2})?$/.test(value)){  
                        return parseFloat(value) > parseFloat(param[0]) && parseFloat(value) <= parseFloat(param[1]);  
                    }else{  
                        return false;  
                    }  
                },  
                message:'请输入0到1000之间的最多俩位小数的数字'  
            }  ,
            idcard : {// 验证身份证 
                validator : function(value) { 
                    return/^\d{15}(\d{2}[A-Za-z0-9])?$/i.test(value); 
                }, 
                message : '身份证号码格式不正确' 
            },
              minLength: {
                validator: function(value, param){
                    return value.length >= param[0];
                },
                message: '请输入至少（2）个字符.'
            },
            length:{validator:function(value,param){ 
                var len=$.trim(value).length; 
                    return len>=param[0]&&len<=param[1]; 
                }, 
                    message:"输入内容长度必须介于{0}和{1}之间." 
                }, 
            phone : {// 验证电话号码 
                validator : function(value) { 
                    return/^((\(\d{2,3}\))|(\d{3}\-))?(\(0\d{2,3}\)|0\d{2,3}-)?[1-9]\d{6,7}(\-\d{1,4})?$/i.test(value); 
                }, 
                message : '格式不正确,请使用下面格式:020-88888888' 
            }, 
            mobile : {// 验证手机号码 
                validator : function(value) { 
                    return/^(13|15|18)\d{9}$/i.test(value); 
                }, 
                message : '手机号码格式不正确' 
	         }, 
	         phoneNum: {// 验证手机号码+固定电话 
	                validator : function(value) { 
	                    return /^(((((010)|(02\d)))[2-8]\d{7})|(0[3-9]\d{2}[2-8]\d{6,7})|(0?(?:147|1[358]\d)\d{8}))$/i.test(value); 
	                }, 
	                message : '手机号码格式不正确' 
	         }, 
          
            intOrFloat : {// 验证整数或小数 
                validator : function(value) { 
                    return /^\d+(\.\d+)?$/i.test(value); 
                }, 
                message : '请输入数字，并确保格式正确' 
            }, 
            currency : {// 验证货币 
                validator : function(value) { 
                    return /^\d+(\.\d+)?$/i.test(value); 
                }, 
                message : '货币格式不正确' 
            }, 
            qq : {// 验证QQ,从10000开始 
                validator : function(value) { 
                    return /^[1-9]\d{4,9}$/i.test(value); 
                }, 
                message : 'QQ号码格式不正确' 
            }, 
            integer : {// 验证整数 
                validator : function(value) { 
                    return /^[+]?[1-9]+\d*$/i.test(value); 
                }, 
                message : '请输入整数' 
            }, 
            age : {// 验证年龄
                validator : function(value) { 
                    return /^(?:[1-9][0-9]?|1[01][0-9]|120)$/i.test(value); 
                }, 
                message : '年龄必须是0到120之间的整数' 
            }, 
            
            chinese : {// 验证中文 
                validator : function(value) { 
                    return /^[\Α-\￥]+$/i.test(value); 
                }, 
                message : '请输入中文' 
            }, 
            english : {// 验证英语 
                validator : function(value) { 
                    return /^[A-Za-z]+$/i.test(value); 
                }, 
                message : '请输入英文' 
            }, 
            unnormal : {// 验证是否包含空格和非法字符 
                validator : function(value) { 
                    return /.+/i.test(value); 
                }, 
                message : '输入值不能为空和包含其他非法字符' 
            }, 
            username : {// 验证用户名 
                validator : function(value) { 
                    return/^[a-zA-Z][a-zA-Z0-9_]{5,15}$/i.test(value); 
                }, 
                message : '用户名不合法（字母开头，允许6-16字节，允许字母数字下划线）' 
            }, 
            faxno : {// 验证传真 
                validator : function(value) { 
//                    return /^[+]{0,1}(\d){1,3}[]?([-]?((\d)|[ ]){1,12})+$/i.test(value); 
                    return /^((\(\d{2,3}\))|(\d{3}\-))?(\(0\d{2,3}\)|0\d{2,3}-)?[1-9]\d{6,7}(\-\d{1,4})?$/i.test(value); 
                }, 
                message : '传真号码不正确' 
            }, 
            zip : {// 验证邮政编码 
                validator : function(value) { 
                    return /^[1-9]\d{5}$/i.test(value); 
                }, 
                message : '邮政编码格式不正确' 
            }, 
            ip : {// 验证IP地址 
                validator : function(value) { 
                    return /d+.d+.d+.d+/i.test(value); 
                }, 
                message : 'IP地址格式不正确' 
            }, 
            name : {// 验证姓名，可以是中文或英文 
                    validator : function(value) { 
                        return /^[\Α-\￥]+$/i.test(value)|/^\w+[\w\s]+\w+$/i.test(value); 
                    }, 
                    message : '请输入姓名' 
            },
            date : {// 验证姓名，可以是中文或英文 
                validator : function(value) { 
                 //格式yyyy-MM-dd或yyyy-M-d
                    return/^(?:(?!0000)[0-9]{4}([-]?)(?:(?:0?[1-9]|1[0-2])\1(?:0?[1-9]|1[0-9]|2[0-8])|(?:0?[13-9]|1[0-2])\1(?:29|30)|(?:0?[13578]|1[02])\1(?:31))|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)([-]?)0?2\2(?:29))$/i.test(value); 
                },
                message : '清输入合适的日期格式'
            },
            msn:{ 
                validator : function(value){ 
                return/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/.test(value); 
            }, 
            message : '请输入有效的msn账号(例：abc@hotnail(msn/live).com)' 
            },
            same:{ 
                validator : function(value, param){ 
                    if($("#"+param[0]).val() !="" && value != ""){ 
                        return$("#"+param[0]).val() == value; 
                    }else{ 
                        return true; 
                    } 
                }, 
                message : '两次输入的密码不一致！'   
            } 
            });  
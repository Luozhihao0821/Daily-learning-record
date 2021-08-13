// 封装js库
// 定义一个js库，里面封装了一些工具方法，方便之后的开发中直接使用
let $Luo = {
    // 1.判断是否是闰年
    isLeepYear: year => year % 4 === 0 && year % 100 !== 0 || year % 400 === 0,

    // 2.定义一个补零是方法，如果是个位数，在前面加0
    // num += '' //将数字转为字符串
    repair: num => (num + '').length > 1 ? num : '0' + num,

    // 3.定义一个方法，将日期转换成 xxxx-xx-xx
    getMiniDate: function(date = new Date()) {
        let year = date.getFullYear();
        let month = this.repair(date.getMonth() + 1); //使用自己的repair()方法来个位补0，加上 this 表示自己的方法
        let day = this.repair(date.getDate());
        return [year, month, day].join('-');
    },

    // 4.定义一个方法，返回中国日期 xxxx-xx-xx xx:xx:xx 星期(2021-08-10 14:25:30 星期二)
    getChaineseDate: function(date = new Date()) {
        let year = date.getFullYear();
        let month = this.repair(date.getMonth() + 1);
        let day = this.repair(date.getDate());
        // 根据join()里面的字符将元素拼接
        let y_m_d = [year, month, day].join('-');
        let hour = this.repair(date.getHours());
        let minute = this.repair(date.getMinutes());
        let second = this.repair(date.getSeconds());
        let h_m_s = [hour, minute, second].join(':');
        let week = '日一二三四五六'.charAt(date.getDay());
        return y_m_d + ' ' + h_m_s + ' 星期' + week;
    },

    // 5.定义一个方法，将字符串翻转
    reverseStr: val => val.split('').reverse().join(''),

    // 6.定义一个分页方法
    pageData:function(arr,pageIndex,pageSize) {//(元素组、页码、每页数量)
        // 思路：截取原数组中的数据
        let start=(pageIndex-1)*pageSize;
        let end=start+pageSize;
        let data=arr.slice(start,end);
        let totalPage=Math.ceil(arr.length/pageSize);
        return{
            data:data,
            totalPage:totalPage
        }
    },

    // 7.将对象转换成特定格式的字符串
    getStrByObj:function (obj,split='&') {
        return Object.keys(obj).map(key=>[key,obj[key]].join('=')).join(split);
    },

    // 8.将字符串转换成对象
    getObjByStr:function (str,char='&') {
        let obj={};
        str.split(char).forEach(item=>{
            // 将字符串打散成数组
            let kv=item.split('=');
            // console.log(kv); //依次输出 ["name", "华为Nova7"]  ["color", "奇境森林"]...
            obj[kv[0]]=kv[1] // 对象赋值 (循环赋值)
        });
        return obj;
    }
}
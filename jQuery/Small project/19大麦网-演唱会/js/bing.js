let $b = {
    // 判断是否为闰年
    isLeapYear: function (year) {
        return year % 4 === 0 && year % 100 !== 0 || year % 400 === 0
    },
    // 单数补零方法
    repairZero: function (val) {
        return (val + "").length > 1 ? val : "0" + val
    },
    // 手机号码打码方法
    telmosic: function (tel, start = 3, end = 8) {
        return tel.substring(0, start) + "****" + tel.substring(end)
    },
    // 文本打码方法
    textmosic: function (val, len = 10) {
        return val.substring(0, len) + "...."
    },

    // 返回两个日期的时间差
    getHMS: function (endDate, startDate = new Date()) {
        let differ = endDate - startDate;
        if (differ <= 0) {
            differ = 0
        }
        let h = $b.repairZero(Math.floor(differ / 1000 / 60 / 60));
        let m = $b.repairZero(Math.floor(differ / 1000 / 60 % 60));
        let s = $b.repairZero(Math.floor(differ / 1000 % 60));

        return {
            h, m, s
        }
    }
}
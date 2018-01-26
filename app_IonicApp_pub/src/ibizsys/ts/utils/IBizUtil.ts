/**
 * IBizSys平台工具类
 * 
 * @export
 * @class IBizUtil
 */
export class IBizUtil {
    constructor(){

    }

    public testCond(value: any, op: any, value2: any): boolean {
        if (op == 'EQ') { return value == value2; }
        if (op == 'GT') {
            let result: number = this.compare(value, value2);
            if (result != undefined && result > 0)
                return true;
            else
                return false;
        }
        if (op == 'GTANDEQ') {
            let result: number = this.compare(value, value2);
            if (result != undefined && result >= 0)
                return true;
            else
                return false;
        }
        if (op == 'IN') { return this.contains(value, value2); }
        if (op == 'ISNOTNULL') { return (value != null && value != ''); }
        if (op == 'ISNULL') { return (value == null || value == ''); }
        if (op == 'LEFTLIKE') { return (value && value2 && (value.toUpperCase().indexOf(value2.toUpperCase()) == 0)); }
        if (op == 'LIKE') { return (value && value2 && (value.toUpperCase().indexOf(value2.toUpperCase()) != -1)); }
        if (op == 'LT') {
            let result: number = this.compare(value, value2);
            if (result != undefined && result < 0)
                return true;
            else
                return false;
        }
        if (op == 'LTANDEQ') {
            let result: number = this.compare(value, value2);
            if (result != undefined && result <= 0)
                return true;
            else
                return false;
        }
        if (op == 'NOTEQ') { return value != value2; }
        if (op == 'NOTIN') { return !this.contains(value, value2) }
        if (op == 'RIGHTLIKE') {
            if (!(value && value2))
                return false;
            let nPos = value.toUpperCase().indexOf(value2.toUpperCase());
            if (nPos == -1)
                return false;
            return nPos + value2.length == value.length;
        }
        if (op == 'TESTNULL') { }
        if (op == 'USERLIKE') { }

        return false;
    }

    public contains(value, value2): boolean {
        if (value && value2) {
            var arr = new Array(); //定义一数组 
            arr = value2.split(","); //字符分割
            var S = String.fromCharCode(2); //定义正则表达式的连接符
            var reg = new RegExp(S + value + S);
            return (reg.test(S + arr.join(S) + S));
        }
        return false;
    }

    public compare(value: any, value2: any): number {
        var result;
        if (value && (typeof (value) === 'number' || value instanceof Number)) {
            result = this.compareNumber(value, value2);
        } else if (value && (typeof (value) === 'string' || value instanceof String)) {
            result = this.compareString(value, value2);
        } /*else if (value && (typeof (value) === 'date' || value instanceof Date)) {
            result = this.compareDate(value, value2);
        }*/ else if (value && (typeof (value) === 'boolean' || value instanceof Boolean)) {
            result = this.compareBoolean(value, value2);
        }

        return result;
    }

    public compareNumber(value, value2): number {
        if (typeof (value2) === 'number' || value2 instanceof Number) {
            if (value > value2)
                return 1;
            else if (value < value2)
                return -1;
            else
                return 0;
        }
        return undefined;
    }

    public compareString(value, value2): number {
        if (typeof (value2) === 'string' || value2 instanceof String) {
            return value.localeCompare(value2);
        }
        return undefined;
    }

    // public compareDate(value, value2): number {
    //     if (typeof (value2) === 'date' || value2 instanceof Date) {
    //         if (value > value2)
    //             return 1;
    //         else if (value < value2)
    //             return -1;
    //         else
    //             return 0;
    //     }
    //     return undefined;
    // }

    public compareBoolean(value, value2): number {
        if (typeof (value2) === 'boolean' || value2 instanceof Boolean) {
            if (value == value2)
                return 0;
            else
                return -1;
        }
        return undefined;
    }
}
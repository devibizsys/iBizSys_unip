import { IBizAppMenuPortletService } from '../../ts/widget/IBizAppMenuPortletService';

export class ListMenuPortletService extends IBizAppMenuPortletService {

    constructor(props) {
        super(props);
    }

    loadAfter(response){
        let resLength = response.items.length;
        let resArr = [...response.items]; // 返回一个新的数组
        let foodArr = [];
        for (let i = 0, j = 0; i < resLength; i += 8, j++) {
            foodArr[j] = resArr.splice(0, 8);
        }
        this.$items = foodArr;
        super.loadAfter(response);
    }

}
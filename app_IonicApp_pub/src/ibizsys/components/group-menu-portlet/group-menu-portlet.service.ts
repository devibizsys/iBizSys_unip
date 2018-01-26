import { IBizAppMenuPortletService } from '../../ts/widget/IBizAppMenuPortletService';

export class GroupMenuPortlet extends IBizAppMenuPortletService {

    constructor(props) {
        super(props);
    }

    loadAfter(response){
        this.$items = response.items;
        super.loadAfter(response);
    }

}
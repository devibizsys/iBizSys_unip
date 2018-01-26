import { IBizEditViewController } from './IBizEditViewController'

export class IBizWFEditViewController extends IBizEditViewController {
    public segment: string = 'form';

    constructor(props) {
        super(props)
    }
}
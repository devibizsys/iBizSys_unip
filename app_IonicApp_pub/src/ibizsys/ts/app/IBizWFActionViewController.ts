import { IBizWFEditViewController } from './IBizWFEditViewController'

export class IBizWFActionViewController extends IBizWFEditViewController {
    constructor(props) {
        super(props)
    }

    /**
     * 
     * 
     * @param {any} id 
     * @returns {void} 
     * @memberof IBizWFActionViewController
     */
    public clickButton(id): void{
        if(Object.is(id,'OKButton')){
            this.wfsubmit();
            return;
        }
        super.clickButton(id);
    }

    /**
     * 
     * 
     * @memberof IBizWFActionViewController
     */
    public wfsubmit(): void{
        this.getForm().wfsubmit(this.getViewParam());
    }

    /**
     * 
     * 
     * @memberof IBizWFActionViewController
     */
    public onFormWFSubmitted(): void{
        this.setResult({'ret':'OK'});
        super.onFormWFSubmitted();
    }
}
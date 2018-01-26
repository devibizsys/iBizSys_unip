import { IBizWFEditViewController } from './IBizWFEditViewController'

export class IBizWFStartViewController extends IBizWFEditViewController {
    constructor(props) {
        super(props)
    }

    /**
     * 
     * 
     * @param {any} id 
     * @returns {void} 
     * @memberof IBizWFStartViewController
     */
    public clickButton(id): void{
        if(Object.is(id,'OKButton')){
            this.wfstart();
            return;
        }
        super.clickButton(id);
    }

    /**
     * 
     * 
     * @memberof IBizWFStartViewController
     */
    public wfstart(): void{
        this.getForm().wfstart(this.getViewParam());
    }

    /**
     * 
     * 
     * @memberof IBizWFStartViewController
     */
    public onFormWFStarted(): void{
        this.setResult({'ret':'OK'});
        super.onFormWFStarted();
    }
}
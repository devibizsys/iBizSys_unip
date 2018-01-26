import { Injectable } from '@angular/core';

/**
 * 静态数据服务
 * 
 * @export
 * @class IBizStaticVariablesProvider
 */
@Injectable()
export class IBizStaticVariablesProvider {
  /*****************事件声明************************/
  /**
   * 表单加载完成事件
   */
  public FORMLOADED: string = 'FORMLOADED';
  /**
   * 表单属性值变化事件
   */
  public FORMFIELDCHANGED: string = 'FORMFIELDCHANGED';
  /**
   * 表单保存完成
   */
  public FORMSAVED: string = 'FORMSAVED';
  /**
   * 表单删除完成
   */
  public FORMREMOVED: string = 'FORMREMOVED';
  /**
   * 表单工作流启动完成
   */
  public FORMWFSTARTED: string = 'FORMWFSTARTED';
  /**
   * 表单工作流提交完成
   */
  public FORMWFSUBMITTED: string = 'FORMWFSUBMITTED';
  /**
   * 表单权限发生变化
   */
  public DATAACCACTIONCHANGE: string = 'DATAACCACTIONCHANGE';
  /**
   * 选择变化
   */
  public SELECTIONCHANGE: string = 'SELECTIONCHANGE';
  /**
   * 数据加载之前
   */
  public BEFORELOAD: string = 'BEFORELOAD';
  /**
   * 表单数据保存之前
   */
  public FORMBEFORESAVE: string = 'FORMBEFORESAVE';
  /**
   * 
   */
  public UIACTIONFINISHED: string = 'UIACTIONFINISHED';
  /**
   * 
   */
  public DATAACCACTIONCHANGED: string = 'DATAACCACTIONCHANGED';
  /**
   * 默认数据加载事件
   */
  public LOADED: string = 'LOADED';
  /**
   * 
   */
  public FIELDVALUECHANGED: string = 'FIELDVALUECHANGED';
  /**
   * 
   */
  public SAVED: string = 'SAVED';
  /**
   * 表单项更新前事件
   */
  public UPDATEFORMITEMBEFORE: string = 'UPDATEFORMITEMBEFORE';
  /**
   * 搜索表单搜索事件
   */
  public FORMSEARCHED: string = 'FORMSEARCHED';
  /**
   * 搜索表单重置事件
   */
  public FORMRESETED: string = 'FORMRESETED';
  /**
   * 
   */
  public CHANGEEDITSTATE: string = 'CHANGEEDITSTATE';
  /**
   * 计数器变化事件
   */
  public COUNTERCHANGE: string = 'COUNTERCHANGE';
  /**
   * 删除数据之前
   */
  public BEFORREMOVE: string = 'BEFORREMOVE';
  
  constructor() {
    
  }

}

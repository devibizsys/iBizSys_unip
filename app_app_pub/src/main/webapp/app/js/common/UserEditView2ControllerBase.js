var UserEditView2ControllerBase = EditView2ControllerBase.extend({
        construct: function(config) {
    if(!config)config={};
    if(!config.appctx)config.appctx='';
    if(!config.containerid)config.containerid='';
    arguments.callee.$.construct.call(this,this.getDefaultCfg(config));
    this.regCodeLists(config);
    this.regUICounters(config);
    this.regUIActions(config);
    this.regUpdatePanels(config);
    this.regControllers(config);
}
,regCodeLists:function(config)
{
     /*时区*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_CodeList59',datas:[{text:'(UTC-12:00)GMT-12:00',value:'Etc/GMT+12',realtext:'(UTC-12:00)GMT-12:00'},{text:'(UTC-11:00)GMT-11:00',value:'Etc/GMT+11',realtext:'(UTC-11:00)GMT-11:00'},{text:'(UTC-11:00)West Samoa Time',value:'MIT',realtext:'(UTC-11:00)West Samoa Time'},{text:'(UTC-11:00)Samoa Standard Time',value:'Pacific/Midway',realtext:'(UTC-11:00)Samoa Standard Time'},{text:'(UTC-11:00)Niue Time',value:'Pacific/Niue',realtext:'(UTC-11:00)Niue Time'},{text:'(UTC-10:00)Hawaii-Aleutian Standard Time',value:'America/Adak',realtext:'(UTC-10:00)Hawaii-Aleutian Standard Time'},{text:'(UTC-10:00)GMT-10:00',value:'Etc/GMT+10',realtext:'(UTC-10:00)GMT-10:00'},{text:'(UTC-10:00)Hawaii Standard Time',value:'HST',realtext:'(UTC-10:00)Hawaii Standard Time'},{text:'(UTC-10:00)Tokelau Time',value:'Pacific/Fakaofo',realtext:'(UTC-10:00)Tokelau Time'},{text:'(UTC-10:00)Cook Is. Time',value:'Pacific/Rarotonga',realtext:'(UTC-10:00)Cook Is. Time'},{text:'(UTC-10:00)Tahiti Time',value:'Pacific/Tahiti',realtext:'(UTC-10:00)Tahiti Time'},{text:'(UTC-9:00)Marquesas Time',value:'Pacific/Marquesas',realtext:'(UTC-9:00)Marquesas Time'},{text:'(UTC-9:00)Alaska Standard Time',value:'AST',realtext:'(UTC-9:00)Alaska Standard Time'},{text:'(UTC-9:00)GMT-09:00',value:'Etc/GMT+9',realtext:'(UTC-9:00)GMT-09:00'},{text:'(UTC-9:00)Gambier Time',value:'Pacific/Gambier',realtext:'(UTC-9:00)Gambier Time'},{text:'(UTC-8:00)Pacific Standard Time',value:'America/Dawson',realtext:'(UTC-8:00)Pacific Standard Time'},{text:'(UTC-8:00)GMT-08:00',value:'Etc/GMT+8',realtext:'(UTC-8:00)GMT-08:00'},{text:'(UTC-8:00)Pitcairn Standard Time',value:'Pacific/Pitcairn',realtext:'(UTC-8:00)Pitcairn Standard Time'},{text:'(UTC-7:00)Mountain Standard Time',value:'America/Boise',realtext:'(UTC-7:00)Mountain Standard Time'},{text:'(UTC-7:00)GMT-07:00',value:'Etc/GMT+7',realtext:'(UTC-7:00)GMT-07:00'},{text:'(UTC-6:00)Central Standard Time',value:'America/Belize',realtext:'(UTC-6:00)Central Standard Time'},{text:'(UTC-6:00)Easter Is. Time',value:'Chile/EasterIsland',realtext:'(UTC-6:00)Easter Is. Time'},{text:'(UTC-6:00)GMT-06:00',value:'Etc/GMT+6',realtext:'(UTC-6:00)GMT-06:00'},{text:'(UTC-6:00)Galapagos Time',value:'Pacific/Galapagos',realtext:'(UTC-6:00)Galapagos Time'},{text:'(UTC-5:00)Eastern Standard Time',value:'America/Atikokan',realtext:'(UTC-5:00)Eastern Standard Time'},{text:'(UTC-5:00)Colombia Time',value:'America/Bogota',realtext:'(UTC-5:00)Colombia Time'},{text:'(UTC-5:00)Acre Time',value:'America/Eirunepe',realtext:'(UTC-5:00)Acre Time'},{text:'(UTC-5:00)Ecuador Time',value:'America/Guayaquil',realtext:'(UTC-5:00)Ecuador Time'},{text:'(UTC-5:00)Cuba Standard Time',value:'America/Havana',realtext:'(UTC-5:00)Cuba Standard Time'},{text:'(UTC-5:00)Peru Time',value:'America/Lima',realtext:'(UTC-5:00)Peru Time'},{text:'(UTC-5:00)GMT-05:00',value:'Etc/GMT+5',realtext:'(UTC-5:00)GMT-05:00'},{text:'(UTC-4:00)Venezuela Time',value:'America/Caracas',realtext:'(UTC-4:00)Venezuela Time'},{text:'(UTC-4:00)Atlantic Standard Time',value:'America/Anguilla',realtext:'(UTC-4:00)Atlantic Standard Time'},{text:'(UTC-4:00)Paraguay Time',value:'America/Asuncion',realtext:'(UTC-4:00)Paraguay Time'},{text:'(UTC-4:00)Amazon Time',value:'America/Boa_Vista',realtext:'(UTC-4:00)Amazon Time'},{text:'(UTC-4:00)Guyana Time',value:'America/Guyana',realtext:'(UTC-4:00)Guyana Time'},{text:'(UTC-4:00)Bolivia Time',value:'America/La_Paz',realtext:'(UTC-4:00)Bolivia Time'},{text:'(UTC-4:00)Chile Time',value:'America/Santiago',realtext:'(UTC-4:00)Chile Time'},{text:'(UTC-4:00)Falkland Is. Time',value:'Atlantic/Stanley',realtext:'(UTC-4:00)Falkland Is. Time'},{text:'(UTC-4:00)GMT-04:00',value:'Etc/GMT+4',realtext:'(UTC-4:00)GMT-04:00'},{text:'(UTC-3:00)Newfoundland Standard Time',value:'America/St_Johns',realtext:'(UTC-3:00)Newfoundland Standard Time'},{text:'(UTC-3:00)Argentine Time',value:'AGT',realtext:'(UTC-3:00)Argentine Time'},{text:'(UTC-3:00)Brasilia Time',value:'America/Araguaina',realtext:'(UTC-3:00)Brasilia Time'},{text:'(UTC-3:00)French Guiana Time',value:'America/Cayenne',realtext:'(UTC-3:00)French Guiana Time'},{text:'(UTC-3:00)Western Greenland Time',value:'America/Godthab',realtext:'(UTC-3:00)Western Greenland Time'},{text:'(UTC-3:00)Pierre & Miquelon Standard Time',value:'America/Miquelon',realtext:'(UTC-3:00)Pierre & Miquelon Standard Time'},{text:'(UTC-3:00)Uruguay Time',value:'America/Montevideo',realtext:'(UTC-3:00)Uruguay Time'},{text:'(UTC-3:00)Suriname Time',value:'America/Paramaribo',realtext:'(UTC-3:00)Suriname Time'},{text:'(UTC-3:00)Rothera Time',value:'Antarctica/Rothera',realtext:'(UTC-3:00)Rothera Time'},{text:'(UTC-3:00)GMT-03:00',value:'Etc/GMT+3',realtext:'(UTC-3:00)GMT-03:00'},{text:'(UTC-2:00)Fernando de Noronha Time',value:'America/Noronha',realtext:'(UTC-2:00)Fernando de Noronha Time'},{text:'(UTC-2:00)South Georgia Standard Time',value:'Atlantic/South_Georgia',realtext:'(UTC-2:00)South Georgia Standard Time'},{text:'(UTC-2:00)GMT-02:00',value:'Etc/GMT+2',realtext:'(UTC-2:00)GMT-02:00'},{text:'(UTC-1:00)Eastern Greenland Time',value:'America/Scoresbysund',realtext:'(UTC-1:00)Eastern Greenland Time'},{text:'(UTC-1:00)Azores Time',value:'Atlantic/Azores',realtext:'(UTC-1:00)Azores Time'},{text:'(UTC-1:00)Cape Verde Time',value:'Atlantic/Cape_Verde',realtext:'(UTC-1:00)Cape Verde Time'},{text:'(UTC-1:00)GMT-01:00',value:'Etc/GMT+1',realtext:'(UTC-1:00)GMT-01:00'},{text:'(UTC0:00)Greenwich Mean Time',value:'Africa/Abidjan',realtext:'(UTC0:00)Greenwich Mean Time'},{text:'(UTC0:00)Ghana Mean Time',value:'Africa/Accra',realtext:'(UTC0:00)Ghana Mean Time'},{text:'(UTC0:00)Western European Time',value:'Africa/Casablanca',realtext:'(UTC0:00)Western European Time'},{text:'(UTC0:00)GMT+00:00',value:'Etc/GMT',realtext:'(UTC0:00)GMT+00:00'},{text:'(UTC0:00)Coordinated Universal Time',value:'Etc/UCT',realtext:'(UTC0:00)Coordinated Universal Time'},{text:'(UTC+1:00)Central European Time',value:'Africa/Algiers',realtext:'(UTC+1:00)Central European Time'},{text:'(UTC+1:00)Western African Time',value:'Africa/Bangui',realtext:'(UTC+1:00)Western African Time'},{text:'(UTC+1:00)GMT+01:00',value:'Etc/GMT-1',realtext:'(UTC+1:00)GMT+01:00'},{text:'(UTC+1:00)Middle Europe Time',value:'MET',realtext:'(UTC+1:00)Middle Europe Time'},{text:'(UTC+2:00)Eastern European Time',value:'ART',realtext:'(UTC+2:00)Eastern European Time'},{text:'(UTC+2:00)Central African Time',value:'Africa/Blantyre',realtext:'(UTC+2:00)Central African Time'},{text:'(UTC+2:00)South Africa Standard Time',value:'Africa/Johannesburg',realtext:'(UTC+2:00)South Africa Standard Time'},{text:'(UTC+2:00)Israel Standard Time',value:'Asia/Jerusalem',realtext:'(UTC+2:00)Israel Standard Time'},{text:'(UTC+2:00)GMT+02:00',value:'Etc/GMT-2',realtext:'(UTC+2:00)GMT+02:00'},{text:'(UTC+3:00)Eastern African Time',value:'Africa/Addis_Ababa',realtext:'(UTC+3:00)Eastern African Time'},{text:'(UTC+3:00)Syowa Time',value:'Antarctica/Syowa',realtext:'(UTC+3:00)Syowa Time'},{text:'(UTC+3:00)Arabia Standard Time',value:'Asia/Aden',realtext:'(UTC+3:00)Arabia Standard Time'},{text:'(UTC+3:00)GMT+03:00',value:'Etc/GMT-3',realtext:'(UTC+3:00)GMT+03:00'},{text:'(UTC+3:00)Moscow Standard Time',value:'Europe/Moscow',realtext:'(UTC+3:00)Moscow Standard Time'},{text:'(UTC+3:00)Volgograd Time',value:'Europe/Volgograd',realtext:'(UTC+3:00)Volgograd Time'},{text:'(UTC+3:00)GMT+03:07',value:'Asia/Riyadh87',realtext:'(UTC+3:00)GMT+03:07'},{text:'(UTC+3:00)Iran Standard Time',value:'Asia/Tehran',realtext:'(UTC+3:00)Iran Standard Time'},{text:'(UTC+4:00)Azerbaijan Time',value:'Asia/Baku',realtext:'(UTC+4:00)Azerbaijan Time'},{text:'(UTC+4:00)Gulf Standard Time',value:'Asia/Dubai',realtext:'(UTC+4:00)Gulf Standard Time'},{text:'(UTC+4:00)Georgia Time',value:'Asia/Tbilisi',realtext:'(UTC+4:00)Georgia Time'},{text:'(UTC+4:00)Armenia Time',value:'Asia/Yerevan',realtext:'(UTC+4:00)Armenia Time'},{text:'(UTC+4:00)GMT+04:00',value:'Etc/GMT-4',realtext:'(UTC+4:00)GMT+04:00'},{text:'(UTC+4:00)Samara Time',value:'Europe/Samara',realtext:'(UTC+4:00)Samara Time'},{text:'(UTC+4:00)Seychelles Time',value:'Indian/Mahe',realtext:'(UTC+4:00)Seychelles Time'},{text:'(UTC+4:00)Mauritius Time',value:'Indian/Mauritius',realtext:'(UTC+4:00)Mauritius Time'},{text:'(UTC+4:00)Reunion Time',value:'Indian/Reunion',realtext:'(UTC+4:00)Reunion Time'},{text:'(UTC+4:00)Afghanistan Time',value:'Asia/Kabul',realtext:'(UTC+4:00)Afghanistan Time'},{text:'(UTC+5:00)Aqtau Time',value:'Asia/Aqtau',realtext:'(UTC+5:00)Aqtau Time'},{text:'(UTC+5:00)Aqtobe Time',value:'Asia/Aqtobe',realtext:'(UTC+5:00)Aqtobe Time'},{text:'(UTC+5:00)Turkmenistan Time',value:'Asia/Ashgabat',realtext:'(UTC+5:00)Turkmenistan Time'},{text:'(UTC+5:00)Tajikistan Time',value:'Asia/Dushanbe',realtext:'(UTC+5:00)Tajikistan Time'},{text:'(UTC+5:00)Pakistan Time',value:'Asia/Karachi',realtext:'(UTC+5:00)Pakistan Time'},{text:'(UTC+5:00)Oral Time',value:'Asia/Oral',realtext:'(UTC+5:00)Oral Time'},{text:'(UTC+5:00)Uzbekistan Time',value:'Asia/Samarkand',realtext:'(UTC+5:00)Uzbekistan Time'},{text:'(UTC+5:00)Yekaterinburg Time',value:'Asia/Yekaterinburg',realtext:'(UTC+5:00)Yekaterinburg Time'},{text:'(UTC+5:00)GMT+05:00',value:'Etc/GMT-5',realtext:'(UTC+5:00)GMT+05:00'},{text:'(UTC+5:00)French Southern & Antarctic Lands Time',value:'Indian/Kerguelen',realtext:'(UTC+5:00)French Southern & Antarctic Lands Time'},{text:'(UTC+5:00)Maldives Time',value:'Indian/Maldives',realtext:'(UTC+5:00)Maldives Time'},{text:'(UTC+5:00)India Standard Time',value:'Asia/Calcutta',realtext:'(UTC+5:00)India Standard Time'},{text:'(UTC+5:00)Nepal Time',value:'Asia/Katmandu',realtext:'(UTC+5:00)Nepal Time'},{text:'(UTC+6:00)Mawson Time',value:'Antarctica/Mawson',realtext:'(UTC+6:00)Mawson Time'},{text:'(UTC+6:00)Vostok Time',value:'Antarctica/Vostok',realtext:'(UTC+6:00)Vostok Time'},{text:'(UTC+6:00)Alma-Ata Time',value:'Asia/Almaty',realtext:'(UTC+6:00)Alma-Ata Time'},{text:'(UTC+6:00)Kirgizstan Time',value:'Asia/Bishkek',realtext:'(UTC+6:00)Kirgizstan Time'},{text:'(UTC+6:00)Bangladesh Time',value:'Asia/Dacca',realtext:'(UTC+6:00)Bangladesh Time'},{text:'(UTC+6:00)Novosibirsk Time',value:'Asia/Novosibirsk',realtext:'(UTC+6:00)Novosibirsk Time'},{text:'(UTC+6:00)Omsk Time',value:'Asia/Omsk',realtext:'(UTC+6:00)Omsk Time'},{text:'(UTC+6:00)Qyzylorda Time',value:'Asia/Qyzylorda',realtext:'(UTC+6:00)Qyzylorda Time'},{text:'(UTC+6:00)Bhutan Time',value:'Asia/Thimbu',realtext:'(UTC+6:00)Bhutan Time'},{text:'(UTC+6:00)GMT+06:00',value:'Etc/GMT-6',realtext:'(UTC+6:00)GMT+06:00'},{text:'(UTC+6:00)Indian Ocean Territory Time',value:'Indian/Chagos',realtext:'(UTC+6:00)Indian Ocean Territory Time'},{text:'(UTC+6:00)Myanmar Time',value:'Asia/Rangoon',realtext:'(UTC+6:00)Myanmar Time'},{text:'(UTC+6:00)Cocos Islands Time',value:'Indian/Cocos',realtext:'(UTC+6:00)Cocos Islands Time'},{text:'(UTC+7:00)Davis Time',value:'Antarctica/Davis',realtext:'(UTC+7:00)Davis Time'},{text:'(UTC+7:00)Indochina Time',value:'Asia/Bangkok',realtext:'(UTC+7:00)Indochina Time'},{text:'(UTC+7:00)Hovd Time',value:'Asia/Hovd',realtext:'(UTC+7:00)Hovd Time'},{text:'(UTC+7:00)West Indonesia Time',value:'Asia/Jakarta',realtext:'(UTC+7:00)West Indonesia Time'},{text:'(UTC+7:00)Krasnoyarsk Time',value:'Asia/Krasnoyarsk',realtext:'(UTC+7:00)Krasnoyarsk Time'},{text:'(UTC+7:00)GMT+07:00',value:'Etc/GMT-7',realtext:'(UTC+7:00)GMT+07:00'},{text:'(UTC+7:00)Christmas Island Time',value:'Indian/Christmas',realtext:'(UTC+7:00)Christmas Island Time'},{text:'(UTC+8:00)Western Standard Time (Australia)',value:'Antarctica/Casey',realtext:'(UTC+8:00)Western Standard Time (Australia)'},{text:'(UTC+8:00)Brunei Time',value:'Asia/Brunei',realtext:'(UTC+8:00)Brunei Time'},{text:'(UTC+8:00)Choibalsan Time',value:'Asia/Choibalsan',realtext:'(UTC+8:00)Choibalsan Time'},{text:'(UTC+8:00)China Standard Time',value:'Asia/Shanghai',realtext:'(UTC+8:00)China Standard Time'},{text:'(UTC+8:00)Hong Kong Time',value:'Asia/Hong_Kong',realtext:'(UTC+8:00)Hong Kong Time'},{text:'(UTC+8:00)Irkutsk Time',value:'Asia/Irkutsk',realtext:'(UTC+8:00)Irkutsk Time'},{text:'(UTC+8:00)Malaysia Time',value:'Asia/Kuala_Lumpur',realtext:'(UTC+8:00)Malaysia Time'},{text:'(UTC+8:00)Central Indonesia Time',value:'Asia/Makassar',realtext:'(UTC+8:00)Central Indonesia Time'},{text:'(UTC+8:00)Philippines Time',value:'Asia/Manila',realtext:'(UTC+8:00)Philippines Time'},{text:'(UTC+8:00)Singapore Time',value:'Asia/Singapore',realtext:'(UTC+8:00)Singapore Time'},{text:'(UTC+8:00)Ulaanbaatar Time',value:'Asia/Ulaanbaatar',realtext:'(UTC+8:00)Ulaanbaatar Time'},{text:'(UTC+8:00)GMT+08:00',value:'Etc/GMT-8',realtext:'(UTC+8:00)GMT+08:00'},{text:'(UTC+8:00)Central Western Standard Time (Australia)',value:'Australia/Eucla',realtext:'(UTC+8:00)Central Western Standard Time (Australia)'},{text:'(UTC+9:00)Timor-Leste Time',value:'Asia/Dili',realtext:'(UTC+9:00)Timor-Leste Time'},{text:'(UTC+9:00)East Indonesia Time',value:'Asia/Jayapura',realtext:'(UTC+9:00)East Indonesia Time'},{text:'(UTC+9:00)Korea Standard Time',value:'Asia/Pyongyang',realtext:'(UTC+9:00)Korea Standard Time'},{text:'(UTC+9:00)Japan Standard Time',value:'Asia/Tokyo',realtext:'(UTC+9:00)Japan Standard Time'},{text:'(UTC+9:00)Yakutsk Time',value:'Asia/Yakutsk',realtext:'(UTC+9:00)Yakutsk Time'},{text:'(UTC+9:00)GMT+09:00',value:'Etc/GMT-9',realtext:'(UTC+9:00)GMT+09:00'},{text:'(UTC+9:00)Palau Time',value:'Pacific/Palau',realtext:'(UTC+9:00)Palau Time'},{text:'(UTC+9:00)Central Standard Time (Northern Territory)',value:'ACT',realtext:'(UTC+9:00)Central Standard Time (Northern Territory)'},{text:'(UTC+9:00)Central Standard Time (South Australia)',value:'Australia/Adelaide',realtext:'(UTC+9:00)Central Standard Time (South Australia)'},{text:'(UTC+9:00)Central Standard Time (South Australia/New South Wales)',value:'Australia/Broken_Hill',realtext:'(UTC+9:00)Central Standard Time (South Australia/New South Wales)'},{text:'(UTC+10:00)Eastern Standard Time (New South Wales)',value:'AET',realtext:'(UTC+10:00)Eastern Standard Time (New South Wales)'},{text:'(UTC+10:00)Dumont-d|Urville Time',value:'Antarctica/DumontDUrville',realtext:'(UTC+10:00)Dumont-d|Urville Time'},{text:'(UTC+10:00)Sakhalin Time',value:'Asia/Sakhalin',realtext:'(UTC+10:00)Sakhalin Time'},{text:'(UTC+10:00)Vladivostok Time',value:'Asia/Vladivostok',realtext:'(UTC+10:00)Vladivostok Time'},{text:'(UTC+10:00)Eastern Standard Time (Queensland)',value:'Australia/Brisbane',realtext:'(UTC+10:00)Eastern Standard Time (Queensland)'},{text:'(UTC+10:00)Eastern Standard Time (Tasmania)',value:'Australia/Hobart',realtext:'(UTC+10:00)Eastern Standard Time (Tasmania)'},{text:'(UTC+10:00)Eastern Standard Time (Victoria)',value:'Australia/Melbourne',realtext:'(UTC+10:00)Eastern Standard Time (Victoria)'},{text:'(UTC+10:00)GMT+10:00',value:'Etc/GMT-10',realtext:'(UTC+10:00)GMT+10:00'},{text:'(UTC+10:00)Chamorro Standard Time',value:'Pacific/Guam',realtext:'(UTC+10:00)Chamorro Standard Time'},{text:'(UTC+10:00)Papua New Guinea Time',value:'Pacific/Port_Moresby',realtext:'(UTC+10:00)Papua New Guinea Time'},{text:'(UTC+10:00)Truk Time',value:'Pacific/Truk',realtext:'(UTC+10:00)Truk Time'},{text:'(UTC+10:00)Lord Howe Standard Time',value:'Australia/LHI',realtext:'(UTC+10:00)Lord Howe Standard Time'},{text:'(UTC+11:00)Magadan Time',value:'Asia/Magadan',realtext:'(UTC+11:00)Magadan Time'},{text:'(UTC+11:00)GMT+11:00',value:'Etc/GMT-11',realtext:'(UTC+11:00)GMT+11:00'},{text:'(UTC+11:00)Vanuatu Time',value:'Pacific/Efate',realtext:'(UTC+11:00)Vanuatu Time'},{text:'(UTC+11:00)Solomon Is. Time',value:'Pacific/Guadalcanal',realtext:'(UTC+11:00)Solomon Is. Time'},{text:'(UTC+11:00)Kosrae Time',value:'Pacific/Kosrae',realtext:'(UTC+11:00)Kosrae Time'},{text:'(UTC+11:00)New Caledonia Time',value:'Pacific/Noumea',realtext:'(UTC+11:00)New Caledonia Time'},{text:'(UTC+11:00)Ponape Time',value:'Pacific/Ponape',realtext:'(UTC+11:00)Ponape Time'},{text:'(UTC+11:00)Norfolk Time',value:'Pacific/Norfolk',realtext:'(UTC+11:00)Norfolk Time'},{text:'(UTC+12:00)New Zealand Standard Time',value:'Antarctica/McMurdo',realtext:'(UTC+12:00)New Zealand Standard Time'},{text:'(UTC+12:00)Anadyr Time',value:'Asia/Anadyr',realtext:'(UTC+12:00)Anadyr Time'},{text:'(UTC+12:00)Petropavlovsk-Kamchatski Time',value:'Asia/Kamchatka',realtext:'(UTC+12:00)Petropavlovsk-Kamchatski Time'},{text:'(UTC+12:00)GMT+12:00',value:'Etc/GMT-12',realtext:'(UTC+12:00)GMT+12:00'},{text:'(UTC+12:00)Marshall Islands Time',value:'Kwajalein',realtext:'(UTC+12:00)Marshall Islands Time'},{text:'(UTC+12:00)Fiji Time',value:'Pacific/Fiji',realtext:'(UTC+12:00)Fiji Time'},{text:'(UTC+12:00)Tuvalu Time',value:'Pacific/Funafuti',realtext:'(UTC+12:00)Tuvalu Time'},{text:'(UTC+12:00)Nauru Time',value:'Pacific/Nauru',realtext:'(UTC+12:00)Nauru Time'},{text:'(UTC+12:00)Gilbert Is. Time',value:'Pacific/Tarawa',realtext:'(UTC+12:00)Gilbert Is. Time'},{text:'(UTC+12:00)Wake Time',value:'Pacific/Wake',realtext:'(UTC+12:00)Wake Time'},{text:'(UTC+12:00)Wallis & Futuna Time',value:'Pacific/Wallis',realtext:'(UTC+12:00)Wallis & Futuna Time'},{text:'(UTC+12:00)Chatham Standard Time',value:'NZ-CHAT',realtext:'(UTC+12:00)Chatham Standard Time'},{text:'(UTC+13:00)GMT+13:00',value:'Etc/GMT-13',realtext:'(UTC+13:00)GMT+13:00'},{text:'(UTC+13:00)Phoenix Is. Time',value:'Pacific/Enderbury',realtext:'(UTC+13:00)Phoenix Is. Time'},{text:'(UTC+13:00)Tonga Time',value:'Pacific/Tongatapu',realtext:'(UTC+13:00)Tonga Time'},{text:'(UTC+14:00)GMT+14:00',value:'Etc/GMT-14',realtext:'(UTC+14:00)GMT+14:00'},{text:'(UTC+14:00)Line Is. Time',value:'Pacific/Kiritimati',realtext:'(UTC+14:00)Line Is. Time'}]}));
     /*是否*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_YesNo',datas:[{text:'是',value:'1',realtext:'是'},{text:'否',value:'0',realtext:'否'}]}));
}
,regUICounters:function(config)
{
}
,regUpdatePanels:function(config)
{
     var me=this;
}
,regControllers:function(config)
{
  var cid=config.containerid;
    if(cid!='')cid=cid+'_';
    this.regController(new LoginAccountGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C1'}));
}
,regUIActions:function(config)
{
  var uiaction_0 = {"type":"DEUIACTION","tag":"Save"
};
    this.regUIAction(uiaction_0);
  var uiaction_1 = {"type":"DEUIACTION","tag":"SaveAndNew"
};
    this.regUIAction(uiaction_1);
  var uiaction_2 = {"type":"DEUIACTION","tag":"SaveAndExit"
};
    this.regUIAction(uiaction_2);
  var uiaction_3 = {"type":"DEUIACTION","tag":"RemoveAndExit","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_3);
  var uiaction_4 = {"type":"DEUIACTION","tag":"SaveAndStart"
};
    this.regUIAction(uiaction_4);
  var uiaction_5 = {"type":"DEUIACTION","tag":"ViewWFStep","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_5);
  var uiaction_6 = {"type":"DEUIACTION","tag":"New"
};
    this.regUIAction(uiaction_6);
  var uiaction_7 = {"type":"DEUIACTION","tag":"Copy","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_7);
  var uiaction_8 = {"type":"DEUIACTION","tag":"Print","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_8);
  var uiaction_9 = {"type":"DEUIACTION","tag":"FirstRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_9);
  var uiaction_10 = {"type":"DEUIACTION","tag":"PrevRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_10);
  var uiaction_11 = {"type":"DEUIACTION","tag":"NextRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_11);
  var uiaction_12 = {"type":"DEUIACTION","tag":"LastRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_12);
  var uiaction_13 = {"type":"DEUIACTION","tag":"Help"
};
    this.regUIAction(uiaction_13);
}
,getDefaultCfg:function(cfg){
    var me=this;
    var config={backendurl:cfg.appctx+'/common/UserEditView2.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/common/usereditview2.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M18',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M17',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M16',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M15',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M14',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M13',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M12',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M11',name:'srfsourcekey'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M4',name:'grouppanel1',titleBarCloseMode:'0',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M5',name:'userid',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M6',name:'username',allowBlank:false,form:form}));
form.register(new IBizDropDownListField({id:this.getCId2()+'M7',name:'validflag',allowBlank:false,form:form,codelistid:'uniPSample_YesNo',width:100}));
form.register(new IBizTextField({id:this.getCId2()+'M8',name:'usermode',form:form}));
form.register(new IBizDropDownListField({id:this.getCId2()+'M9',name:'timezone',form:form,codelistid:'uniPSample_CodeList59'}));
form.register(new IBizTextAreaField({id:this.getCId2()+'Ma',name:'memo',form:form}));
form.register(new IBizFormGroup({id:this.getCId2()+'Mc',name:'grouppanel2',titleBarCloseMode:'0',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Md',name:'createman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Me',name:'createdate',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Mf',name:'updateman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M10',name:'updatedate',form:form}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
,getDRItemView:function(arg){
       if(!arg)arg={};
       var drmode=arg.viewid;
       if(!drmode)drmode='';
      if(drmode=='DRITEM1'){
          return {viewurl:'/common/loginaccountgridview.jsp',embedviewid:'C1'};
      	}
       return null;
 }
});
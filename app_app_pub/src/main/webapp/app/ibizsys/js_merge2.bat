"C:\Program Files\Java\jdk1.7.0_15\bin\java.exe" -cp e:\tools\saibz5.jar net.ibizsys.paas.builder.MergeCmd I:\share\demo.com\test5\app_DemoApp_usr\ibizsys\js_FileList.txt ibizsys_all.js
"C:\Program Files\Java\jdk1.7.0_15\bin\java.exe" -jar e:\tools\yuicompressor-2.4.8.jar --type js --charset utf-8 "I:\share\demo.com\test5\app_DemoApp_usr\ibizsys\ibizsys_all.js" -o ibizsys_all.min.js
copy ibizsys_all.min.js I:\share\demo.com\test5\app_DemoApp_usr\ibizsys\ibizsys_all.min.js

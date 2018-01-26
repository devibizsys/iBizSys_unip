
jQuery.extend({
	

    createUploadIframe: function(id, uri)
	{
			//create frame
            var frameId = 'jUploadFrame' + id;
            
            if(window.ActiveXObject) {
            	//if(jQuery.browser.version=="9.0" || jQuery.browser.version=="10.0"){
            	if ($.support.leadingWhitespace){
                    var io = document.createElement('iframe');  
                    io.id = frameId;  
                    io.name = frameId;  
               // }else if(jQuery.browser.version=="6.0" || jQuery.browser.version=="7.0" || jQuery.browser.version=="8.0"){  
            	}else{ 
                    var io = document.createElement('<iframe id="' + frameId + '" name="' + frameId + '" />');  
                    if(typeof uri== 'boolean'){  
                        io.src = 'javascript:false';  
                    }  
                    else if(typeof uri== 'string'){  
                        io.src = uri;  
                    }  
                }  
            	
               /* var io = document.createElement('<iframe id="' + frameId + '" name="' + frameId + '" />');
                if(typeof uri== 'boolean'){
                    io.src = 'javascript:false';
                }
                else if(typeof uri== 'string'){
                    io.src = uri;
                }*/
            }
            else {
                var io = document.createElement('iframe');
                io.id = frameId;
                io.name = frameId;
            }
            io.style.position = 'absolute';
            io.style.top = '-1000px';
            io.style.left = '-1000px';

            document.body.appendChild(io);

            return io			
    },
    createUploadForm: function(id, fileElement)
	{
		//create form	
		var formId = 'jUploadForm' + id;
		var fileId = 'jUploadFile' + id;
		var form = $('<form  action="" method="POST" name="' + formId + '" id="' + formId + '" enctype="multipart/form-data"></form>');	
//		if(window.ActiveXObject && !$.support.leadingWhitespace)
//		{
//			var oldElement = $(fileElement);
//			var newElement = $(oldElement).clone();
//			$(oldElement).attr('id', fileId);
//			$(oldElement).before(newElement);
//			$(oldElement).appendTo(form);
//		}
//		else
		{
			fileElement.appendTo(form);
			//fileElement.attr('id', fileId);

		}
		
		//set attributes
		$(form).css('position', 'absolute');
		$(form).css('top', '-1200px');
		$(form).css('left', '-1200px');
		$(form).appendTo('body');		
		return form;
    },

    ajaxFileUpload: function(s) {
        // TODO introduce global settings, allowing the client to modify them for all requests, not only timeout		
        s = jQuery.extend({}, jQuery.ajaxSettings, s);
        var id = new Date().getTime()        
		var form = jQuery.createUploadForm(id, s.fileElement);
        form.attr('action', s.url);
		var io = jQuery.createUploadIframe(id, s.secureuri);
		var frameId = 'jUploadFrame' + id;
		var formId = 'jUploadForm' + id;		
		
		form.attr('target', frameId);
		
        // Watch for a new set of requests
        if ( s.global && ! jQuery.active++ )
		{
			jQuery.event.trigger( "ajaxStart" );
		}            
        var requestDone = false;
        // Create the request object
        var xml = {}   
        if ( s.global )
            jQuery.event.trigger("ajaxSend", [xml, s]);
        // Wait for a response to come back
        var uploadCallback = function(isTimeout)
		{			
			var io = document.getElementById(frameId);
            try 
			{				
				if(io.contentWindow)
				{
					 xml.responseText = io.contentWindow.document.body?io.contentWindow.document.body.innerHTML:null;
                	 xml.responseXML = io.contentWindow.document.XMLDocument?io.contentWindow.document.XMLDocument:io.contentWindow.document;
					 
				}else if(io.contentDocument)
				{
					 xml.responseText = io.contentDocument.document.body?io.contentDocument.document.body.innerHTML:null;
                	xml.responseXML = io.contentDocument.document.XMLDocument?io.contentDocument.document.XMLDocument:io.contentDocument.document;
				}						
            }catch(e)
			{
				//jQuery.handleError(s, xml, null, e);
            	return;
			}
            if ( xml || isTimeout == "timeout") 
			{				
                requestDone = true;
                var status;
                try {
                    status = isTimeout != "timeout" ? "success" : "error";
                    // Make sure that the request was successful or notmodified
                    if ( status != "error" )
					{
                        // process the data (runs the xml through httpData regardless of callback)
                        var data = jQuery.uploadHttpData( xml, s.dataType );    
                        // If a local callback was specified, fire it and pass it the data
                        if ( s.success )
                            s.success( data, status );
    
                        // Fire the global callback
                        if( s.global )
                            jQuery.event.trigger( "ajaxSuccess", [xml, s] );
                    } else
                        //jQuery.handleError(s, xml, status);
                    	return;
                } catch(e) 
				{
                    status = "error";
                   // jQuery.handleError(s, xml, status, e);
                    return;
                }

                // The request was completed
                if( s.global )
                    jQuery.event.trigger( "ajaxComplete", [xml, s] );

                // Handle the global AJAX counter
                if ( s.global && ! --jQuery.active )
                    jQuery.event.trigger( "ajaxStop" );

                // Process result
                if ( s.complete )
                    s.complete(xml, status);

                jQuery(io).unbind()

                setTimeout(function()
									{	try 
										{
											$(io).remove();
											$(form).remove();	
											
										} catch(e) 
										{
											//jQuery.handleError(s, xml, null, e);
											return;
										}									

									}, 100)

                xml = null

            }
        }
        // Timeout checker
        if ( s.timeout > 0 ) 
		{
            setTimeout(function(){
                // Check to see if the request is still happening
                if( !requestDone ) uploadCallback( "timeout" );
            }, s.timeout);
        }
        try 
		{
           // var io = $('#' + frameId);
//			var form1 = $('#' + formId);
//			$(form1).attr('action', s.url);
//			$(form1).attr('method', 'POST');
//			$(form1).attr('target', frameId);
//            if(form1.encoding)
//			{
//            	form1.encoding = 'multipart/form-data';				
//            }
//            else
//			{				
//            	form1.enctype = 'multipart/form-data';
//            }			
//            $(form1).submit();
        	
        	form.submit(function(e){
        		var i=0;    
        		e.stopPropagation();
        	});//.submit();
        	
        	var myForm = document.getElementById(formId);
        	var ret =myForm.submit();
        	var i=1;

        } catch(e) 
		{			
            //jQuery.handleError(s, xml, null, e);
        	return;
        }
        if(window.attachEvent){
            document.getElementById(frameId).attachEvent('onload', uploadCallback);
        }
        else{
            document.getElementById(frameId).addEventListener('load', uploadCallback, false);
        } 		
        return {abort: function () {}};	

    },

    uploadHttpData: function( r, type ) {
        var data = !type;
        data = type == "xml" || data ? r.responseXML : r.responseText;
        // If the type is "script", eval it in global context
        if ( type == "script" )
            jQuery.globalEval( data );
        // Get the JavaScript object, if JSON is used.
        if ( type == "json" ) {
        	
        	//eval( "data = " + data );  
        	if(data.indexOf('<pre>') != -1) {
        		data = data.substring(5, data.length-6);
        	}         
        	data  = jQuery.parseJSON(data);
        }
        // evaluate scripts within html
        if ( type == "html" )
            jQuery("<div>").html(data).evalScripts();
			//alert($('param', data).each(function(){alert($(this).attr('value'));}));
        return data;
    }
})

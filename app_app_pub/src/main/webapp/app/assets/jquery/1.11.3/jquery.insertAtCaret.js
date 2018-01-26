// I found this somewhere on the intertubes, and optimized it
$.fn.insertAtCaret = function(myValue) {
	return this.each(function() {
		var me = this;
		if (document.selection) { // IE
			me.focus();
			sel = document.selection.createRange();
			sel.text = myValue;
			me.focus();
		} else if (me.selectionStart || me.selectionStart == '0') { // Real browsers
			var startPos = me.selectionStart, endPos = me.selectionEnd, scrollTop = me.scrollTop;
			me.value = me.value.substring(0, startPos) + myValue + me.value.substring(endPos, me.value.length);
			me.focus();
			me.selectionStart = startPos + myValue.length;
			me.selectionEnd = startPos + myValue.length;
			me.scrollTop = scrollTop;
		} else {
			me.value += myValue;
			me.focus();
		}
	});
};
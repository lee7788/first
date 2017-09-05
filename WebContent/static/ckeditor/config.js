/**
 * @license Copyright (c) 2003-2016, CKSource - Frederico Knabben. All rights
 *          reserved. For licensing, see LICENSE.md or
 *          http://ckeditor.com/license
 */

CKEDITOR.editorConfig = function(config) {
	// Define changes to default configuration here. For example:
	// config.language = 'fr';
	// config.uiColor = '#AADC6E';

	config.image_previewText = ' ';

	// 定义图片上传的action
	config.filebrowserImageUploadUrl = "/backIndex/upload_pic";

	config.removeDialogTabs = 'image:advanced;link:advanced';

	
	 // config.filebrowserWindowWidth = '500'; 
	  //config.filebrowserWindowHeight ='400';
	 
	
	
	// 定义浏览服务器图片的页面
	config.filebrowserImageBrowseUrl = '/backIndex/toShowupimg';

};

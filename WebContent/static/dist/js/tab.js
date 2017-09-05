// JavaScript Document

function $(id){
	return typeof id==='string'?document.getElementById(id):id;
}

window.onload=function(){
//获取鼠标滑过或点击的标签	
 var titles = $('notice-tit').getElementsByTagName('li'),
 divs = $('notice-con').getElementsByTagName('div');
 if(titles.length!=divs.length)
 return;
 for(var i=0;i<titles.length;i++){
	 titles[i].id=i;
	 titles[i].onmouseover=function(){
		 for(var j=0;j<titles.length;j++){
			 titles[j].className='';
			 divs[j].style.display='none';
		 }
		 this.className='select';
		 divs[this.id].style.display='block';
	 }
 }
 
}


/*window.onscroll=function(){*/

//变量t就是滚动条滚动时，到顶部的距离
/*var t = document.documentElement.scrollTop||document.body.scrollTop;

var notice = document.getElementById("notice");
var middle = document.getElementById("middle");

if( t >=0) {     

     notice.style.position="fixed"; 
	 notice.style.top="0";
	 middle.style.marginTop="98px";

}else{

        //恢复正常       
		 notice.style.position="absolute";        
		 notice.style.top="0px";
		 
		 }}*/

/*var handler=function(hash){
    var target = document.getElementById(hash.slice(1));
    if (!target) return;
    var targetOffset = $(target).offset().top-70;
    $('html,body').animate({scrollTop: targetOffset}, 400);
}

$('a[href^=#][href!=#]').click(function(){
    handler(this.hash)
});

if(location.hash){ handler(location.hash) }*/

/*$(function(){
  if(location.hash){
     var target = $(location.hash);
     if(target.length==1){
         var top = target.offset().top-98;
         if(top > 0){
             $('html,body').animate({scrollTop:top}, 1000);
         }
     }
  }
});*/
function replaceBr(str) 
{ 
str=str.replace(new RegExp(/(，)/g),'，<br/>'); 
str=str.replace(new RegExp(/(。)/g),'。<br/>'); 
return str; 
} 
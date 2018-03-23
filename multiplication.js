/* Firebug console required */
function xyz(){
	var myObj = [2, 1, 3, 3, 2, 1];
  console.log(myObj+' output: '+calculateIndexes(myObj));
  
  myObj = [2, 1, 3];
  console.log(myObj+' output: '+calculateIndexes(myObj));
  
  myObj = [0, 1, 0, 0 , 0 , 1];
  console.log(myObj+' output: '+calculateIndexes(myObj));
}
function calculateIndexes(myObj){
// simple array

var totalSum = 1;
// print array to console

if(myObj){
	if(myObj.length == 1){
  	console.log('invalid input');
    return;
  }
} else {
	console.log('invlid array')
  return;
}

// iterate myObj properites - (alert only non-function, i.e. array members)
for (var i=0; i< myObj.length;i++) {
		if(0 != myObj[i]){
    	totalSum *= myObj[i];
    }
    
}
console.log('totalSum: '+totalSum)

var leftSum = 1;
var rightSum = 1;
var indexes = [];

for(var i=1; i<myObj.length; i++){
	if(0 != myObj[i-1]){
  	leftSum *= myObj[i-1];
    rightSum = totalSum / leftSum;
    console.log('left: '+leftSum+', right: '+rightSum);
    if(rightSum == leftSum){
      indexes.push(i);
    }
  }

}
return indexes;
}

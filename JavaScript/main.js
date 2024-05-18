var word = 'Hello world';
var len = 1;
for(let i = 0; i < word.length; i++){
    var newWord = word.slice(i, len);
    console.log(newWord);
    len++;
}
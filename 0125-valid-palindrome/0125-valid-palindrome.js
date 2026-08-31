/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    s=s.toLowerCase().replace(/[^a-z0-9]/g,"");
    let n=s.length;
    for(let i=0;i<n/2;i++){
        if(s[i]!=s[n-1-i]){
            return false;
        }
    }
    return true;
};
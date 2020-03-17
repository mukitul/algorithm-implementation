
let max = (a,b) => {
    if(a>b) return a;return b;
};

function kadane(ar) {
    let max_curr=ar[0];
    let max_glo=ar[0];
    for (let index = 0; index < ar.length; index++) {
        max_curr = max(ar[index],ar[index]+max_curr);
        
        if(max_curr>max_glo) max_glo=max_curr;
    }

    return max_glo;
}

let ar=[-2,3,2,-1];
let res = kadane(ar);
console.log(res);
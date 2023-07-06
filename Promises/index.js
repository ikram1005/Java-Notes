const url="https://reqres.in/api/users";

// fetch(url).then(function(res){
//     return res.json();
// }).then(function(res){
//     console.log(res);
// }).catch(function(err){
//     console.log(err);
// })


async function getData(){
    try{
        let res=await fetch(url);
        let data=await res.json();
        append(data.data)
        console.log(data.data);
    }catch(err){
        console.log(err);
    }
}
getData();


function append(data){
    let container=document.getElementById("conatiner");
    data.forEach(e => {
        let img=document.createElement("img");
        img.src=e.avatar;

        let h2=document.createElement("h2");
        h2.innerText=e.first_name;

        let div=document.createElement("div");
        div.append(img,h2);

        container.append(div);
    });
}


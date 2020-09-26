function getOdam() {

    axios.get("/api/odam").then(function (response) {

        console.log(response);

    })

}

const button = document.getElementById('button');
let tekshir=0;
function getAtkin() {
    let n=document.getElementById("n").value;
    if (tekshir!==n){
        axios.get("/api/atkin",{params:{n:n}}).then(function (response) {
            button.disabled=true;
            button.hidden=true;
            console.clear();
            let out="";
            document.getElementById("error").innerHTML="";
            let array=JSON.parse(JSON.stringify(response.data));
            // console.log(response);
            for (let i = 0; i <array.length; i++) {
                out+='<div class="col-1 border">'+array[i]+'</div>';
            }
            document.getElementById("root").innerHTML=out;
            button.disabled=false;
            button.hidden=false
        }).catch(function (error) {
            document.getElementById("error").innerHTML=error.response.data;
            console.log(error);
            document.getElementById("root").innerHTML="";
        });
    }
    // else {
    //     console.log(tekshir);
    // }
    tekshir=n;


}
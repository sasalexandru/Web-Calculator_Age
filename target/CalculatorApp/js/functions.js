function evaluateAge(){
    const birthDate = document.getElementById("birthDate").value;
    const xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function (){
        if(this.readyState == 4 && this.status == 200){
            const resp = Json.parse(this.responseText);
            const result = document.getElementById("result");
            result.innerHTML = resp.result
        }
    };
    xhttp.open("POST","ageApp",true)
    let reqBody = {
         birthDate
    }
    xhttp.send(JSON.stringify(reqBody));

}

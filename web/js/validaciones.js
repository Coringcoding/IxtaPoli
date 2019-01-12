function validar(idForm){
    var form = document.getElementById(idForm);
    var inputs = form.getElementsByTagName('input');
    var band = true;
    for(i=0; i< inputs.length; i++){
    if (inputs[i].value === ""){
        band = false;
            alert("Llene todos los campos");
            break;
        }
    }
    return band;
}
function valcontra(){
    var bandera = false;
    var con1 = document.getElementById("contra").value;
    var con2 = document.getElementById("confcontra").value;
        if(con1 === con2){
            bandera = true;
        }else{
            alert("Las contraseñas no coinciden");
            $("#confcontral").text("Las contraseñas no coinciden");
        }
    return bandera;
}

function valReg(idForm){
    var bandera = false;
    var form = validar(idForm);
    var con = valcontra();
    if((form === true) && (con===true)){
        bandera = true;
    }
    return bandera;
}
